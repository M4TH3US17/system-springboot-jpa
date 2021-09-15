package com.matheus.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), SHIPPED(2), PAID(3), DELIVERED(4), CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		for (OrderStatus o : OrderStatus.values()) {
			if (o.getCode() == code) {
				return o;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
}
