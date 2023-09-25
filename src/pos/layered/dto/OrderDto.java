/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layered.dto;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author wmara
 */
public class OrderDto {

	private String orderId;
	private String customerId;

	private ArrayList<OrderDetailDto> orderDetailsDtos;

	public OrderDto() {
	}

	public OrderDto(String orderId, String customerId, ArrayList<OrderDetailDto> orderDetailsDtos) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderDetailsDtos = orderDetailsDtos;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the orderDetailsDtos
	 */
	public ArrayList<OrderDetailDto> getOrderDetailsDtos() {
		return orderDetailsDtos;
	}

	/**
	 * @param orderDetailsDtos the orderDetailsDtos to set
	 */
	public void setOrderDetailsDtos(ArrayList<OrderDetailDto> orderDetailsDtos) {
		this.orderDetailsDtos = orderDetailsDtos;
	}

	@Override
	public String toString() {
		return "OrderDto{" + "orderId=" + orderId + ", customerId=" + customerId + ", orderDetailsDtos=" + orderDetailsDtos + '}';
	}

}
