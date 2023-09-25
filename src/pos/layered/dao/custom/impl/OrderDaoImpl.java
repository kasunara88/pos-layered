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
import pos.layered.dao.custom.OrderDao;
import pos.layered.entity.OrderEntity;

/**
 *
 * @author wmara
 */
public class OrderDaoImpl implements OrderDao{

	@Override
	public boolean add(OrderEntity t) {
		try {
			return CrudUtill.executeUpdate("INSERT INTO Orders VALUES(?,?,?)", t.getId(),t.getDate(),t.getCustId());
		} catch (SQLException ex) {
			Logger.getLogger(OrderDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	@Override
	public boolean update(OrderEntity t) {
		return false;
		
	}

	@Override
	public boolean delete(String id) {
		return false;
	}

	@Override
	public OrderEntity get(String id) {
		return null;
	}

	@Override
	public ArrayList<OrderEntity> getAll() throws Exception {
		return null;
	}
	
}
