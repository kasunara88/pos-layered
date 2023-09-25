/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao.custom.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.layered.dao.CrudUtill;
import pos.layered.dao.custom.OrderDetailDao;
import pos.layered.entity.OrderDetailEntity;

/**
 *
 * @author wmara
 */
public class OrderDetailDaoImpl implements OrderDetailDao{

	@Override
	public boolean add(OrderDetailEntity t) {
		try {
			return CrudUtill.executeUpdate("INSERT INTO orderdetail VALUES (?, ?, ?, ?)", t.getOrderId(), t.getItemId(),t.getQty(),t.getDiscount());
		} catch (SQLException ex) {
			Logger.getLogger(OrderDetailDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	@Override
	public boolean update(OrderDetailEntity t) {
		return false;
	}

	@Override
	public boolean delete(Object id) {
		return false;
	}

	@Override
	public OrderDetailEntity get(Object id) {
		return null;
	}

	@Override
	public ArrayList<OrderDetailEntity> getAll() throws Exception {
		return null;
	}
	
}
