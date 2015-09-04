package com.talentica.Spring.AutoWire;

public class Customer {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address1) {
		this.address= address1;
	}

	@Override
	public String toString() {
		return "Customer [address=" + address + "]";
	}


}
