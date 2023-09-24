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
import pos.layered.dao.custom.CustomDao;
import pos.layered.entity.CustomerEntity;

import java.sql.ResultSet;

/**
 *
 * @author wmara
 */
public class CusomerDaoImpl implements CustomDao {

	@Override
	public boolean add(CustomerEntity t) {
		try {
			return CrudUtill.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)", t.getId(), t.getTitle(), t.getName(),
				t.getDob(), t.getSalary(), t.getAddress(),
				t.getCity(), t.getProvince(), t.getZip());
		} catch (SQLException ex) {
			Logger.getLogger(CusomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	@Override
	public boolean update(CustomerEntity t) {
		try {
			return CrudUtill.executeUpdate("UPDATE  Customer SET CustTitle =?, CustName =?, DOB=?, salary =?, CustAddress = ?, City =?, Province =?, PostalCode =? WHERE CustID = ?", t.getTitle(), t.getName(), t.getDob(), t.getSalary(), t.getAddress(),
				t.getCity(), t.getProvince(), t.getZip(), t.getId());
		} catch (SQLException ex) {
			Logger.getLogger(CusomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	@Override
	public boolean delete(String id) {
		try {
			return CrudUtill.executeUpdate("DELETE FROM  Customer WHERE CustID =?", id);
		} catch (SQLException ex) {
			Logger.getLogger(CusomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	@Override
	public CustomerEntity get(String id) {
		try {
			ResultSet rst = CrudUtill.executeQuery("SELECT * FROM Customer WHERE CustID = ?", id);
			
			while(rst.next()) {
				CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
					rst.getString(2),
					rst.getString(3),
					rst.getString(4),
					rst.getDouble(5),
					rst.getString(6),
					rst.getString(7),
					rst.getString(8),
					rst.getString(9));
				
				return customerEntity;
			}
		
		} catch (SQLException ex) {
			Logger.getLogger(CusomerDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	@Override
	public ArrayList<CustomerEntity> getAll() throws Exception {
	ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();
	
	ResultSet rst = CrudUtill.executeQuery("SELECT * FROM Customer");
	
	while (rst.next()) {
		CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
				rst.getString(2),
				rst.getString(3),
				rst.getString(4),
				rst.getDouble(5),
				rst.getString(6),
				rst.getString(7),
				rst.getString(8),
				rst.getString(9));
		
		customerEntitys.add(customerEntity);
	}
		return customerEntitys;
	}

}
