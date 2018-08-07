package com.nucleus.day4;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CustomerTable")
public class Customer extends User123
{
private String address;

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
}
