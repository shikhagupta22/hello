package com.nucleus.day4;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vendor2
{
@Id
private int vId;
private String vName;
@OneToMany(cascade=CascadeType.ALL,mappedBy="vendor",fetch=FetchType.LAZY)
private List<Address2> adrs=new ArrayList<Address2>();
public int getvId() {
	return vId;
}
public void setvId(int vId) {
	this.vId = vId;
}
public String getvName() {
	return vName;
}
public void setvName(String vName) {
	this.vName = vName;
}
public List<Address2> getAdrs() {
	return adrs;
}
public void setAdrs(List<Address2> adrs) {
	this.adrs = adrs;
}
}
