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
import pos.layered.dao.custom.ItemDao;
import pos.layered.entity.ItemEntity;
import java.sql.ResultSet;

/**
 *
 * @author wmara
 */
public class ItemDaoImpl implements ItemDao {

	@Override
	public boolean add(ItemEntity t) {
		try {
			return CrudUtill.executeUpdate("INSERT INTO Item VALUES (?,?,?,?,?)",
				t.getId(),
				t.getDescription(),
				t.getPackSize(),
				t.getUnitPrice(),
				t.getQoh());
		} catch (SQLException ex) {
			Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	@Override
	public boolean update(ItemEntity t) {
		try {
			return CrudUtill.executeUpdate("UPDATE Item SET Description = ?, PackSize=?, UnitPrice=?,QtyOnHand=? WHERE ItemCode=?",
				t.getDescription(),
				t.getPackSize(),
				t.getUnitPrice(),
				t.getQoh(),
				t.getId()
			);
		} catch (SQLException ex) {
			Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	@Override
	public boolean delete(String id) {
		try {
			return CrudUtill.executeUpdate("DELETE FROM item WHERE ItemCode =?", id);
		} catch (SQLException ex) {
			Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	@Override
	public ItemEntity get(String id) {
		try {
			ResultSet rst = CrudUtill.executeQuery("SELECT * FROM item WHERE ItemCode =?", id);
			while (rst.next()) {
				return new ItemEntity(
					rst.getString(1),
					rst.getString(2),
					rst.getString(3),
					rst.getDouble(4),
					rst.getInt(5));
			}
		} catch (SQLException ex) {
			Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}

	@Override
	public ArrayList<ItemEntity> getAll() throws Exception {
		ArrayList<ItemEntity> itemEntrys = new ArrayList<>();
		try {
			ResultSet rst = CrudUtill.executeQuery("SELECT * FROM item ");
			while (rst.next()) {
				ItemEntity entity = new ItemEntity(
					rst.getString(1),
					rst.getString(2),
					rst.getString(3),
					rst.getDouble(4),
					rst.getInt(5));
				itemEntrys.add(entity);
			}
		} catch (SQLException ex) {
			Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
		}
		return itemEntrys;
	}

}
