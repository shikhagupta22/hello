package com.nucleus.day4;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="VendorAddress")
public class Address2
{
@Id
private int aId;
private String city;
private String state;
@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="vendorID")
private Vendor2 vendor;
public int getaId() {
	return aId;
}
public void setaId(int aId) {
	this.aId = aId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Vendor2 getVendor() {
	return vendor;
}
public void setVendor(Vendor2 vendor) {
	this.vendor = vendor;
}
}
