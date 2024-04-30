package com.Customer.enums;

public enum ServicePlan {

	SILVER(1000), G0LD(2000), DIAMOND(5000), PLATINUM0(10000);

	private int charges;

	ServicePlan(int charges) {
		this.charges = charges;

	}

	public int getCharges() {
		return charges;
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}	
}
