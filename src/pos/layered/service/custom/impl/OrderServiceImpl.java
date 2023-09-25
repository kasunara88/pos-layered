/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.service.custom.impl;

import pos.layered.dao.DaoFactory;
import pos.layered.dao.custom.ItemDao;
import pos.layered.dto.OrderDto;
import pos.layered.service.custom.OrderService;
import pos.layered.dao.custom.OrderDao;
import pos.layered.dao.custom.OrderDetailDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.layered.db.DBConnection;
import pos.layered.dto.OrderDetailDto;
import pos.layered.entity.ItemEntity;
import pos.layered.entity.OrderDetailEntity;
import pos.layered.entity.OrderEntity;

/**
 *
 * @author wmara
 */
public class OrderServiceImpl implements OrderService {

	private OrderDao orderDao = (OrderDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ORDER);
	private OrderDetailDao orderDetailDao = (OrderDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ORDER_DETAIL);
	private ItemDao itemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.ITEM);

	@Override
	public String placedOrder(OrderDto dto) {
		Connection connection = DBConnection.getInstance().getConnection();
		try {
			connection.setAutoCommit(false);
		} catch (SQLException ex) {
			Logger.getLogger(OrderServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
		}

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			if (orderDao.add(new OrderEntity(dto.getOrderId(), sdf.format(new Date()),
				dto.getCustomerId()))) {
				boolean isOrderSved = true;
				for (OrderDetailDto orderDetailDto : dto.getOrderDetailsDtos()) {
					if (!orderDetailDao.add(new OrderDetailEntity(dto.getOrderId(),
						orderDetailDto.getItemId(), orderDetailDto.getQty(),
						orderDetailDto.getDiscount()))) {
						isOrderSved = false;
					}
				}
				if (isOrderSved) {
					boolean isItemUpdated = true;
					for (OrderDetailDto orderDetailDto : dto.getOrderDetailsDtos()) {
						ItemEntity entity = itemDao.get(orderDetailDto.getItemId());
						entity.setQoh(entity.getQoh() - orderDetailDto.getQty());
						if (!itemDao.update(entity)) {
							isItemUpdated = false;
						}
					}
					if (isItemUpdated) {
						connection.commit();
						return "Success";
					} else {
						connection.rollback();
						return "Order Detail Save Error";
					}
				} else {
					connection.rollback();
					return "Item Update Error";
				}
			} else {
				connection.rollback();
				return "Order Save Error";
			}

		} catch (Exception e) {

			try {
				e.printStackTrace();
				connection.rollback();
				throw e;
			} catch (Exception ex) {
				Logger.getLogger(OrderServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
			}
		} finally {
			try {
				connection.setAutoCommit(true);
			} catch (Exception ex) {
				Logger.getLogger(OrderServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
			}

		}
		return null;
	}

}
