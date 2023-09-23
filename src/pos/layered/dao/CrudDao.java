/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layered.dao;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author wmara
 */
public interface CrudDao<T, ID> extends SuperDao{
	boolean add(T t);
	boolean update(T t);
	boolean delete(ID id);
	T get(ID id);
	ArrayList <T> gtAll() throws Exception;
}
