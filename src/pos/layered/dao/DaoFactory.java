/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dao;

import pos.layered.dao.custom.impl.CusomerDaoImpl;
import pos.layered.dao.custom.impl.ItemDaoImpl;

/**
 *
 * @author wmara
 */
public class DaoFactory {

	private static DaoFactory daoFactory;

	private DaoFactory() {
	}

	public static DaoFactory getInstance() {
		if (daoFactory == null) {
			daoFactory = new DaoFactory();
		}
		return daoFactory;

	}

	public SuperDao getDao(DaoType type) {
		switch (type) {
			case CUSTOMER:
				return new CusomerDaoImpl();

			case ITEM:
				return new ItemDaoImpl();

			default:
				return null;
		}

	}

	public enum DaoType {
		CUSTOMER, ITEM

	}
}
