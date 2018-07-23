package com.nucleus;

import java.util.List;
import java.util.Properties;

public class Vendor 
{
private int vId;
private String vName;
private Properties prop;
Vendor()
{
	System.out.println("objectv created..");
}
public List<Address> getAdrs() {
	return adrs;
}
public void setAdrs(List<Address> adrs) {
	this.adrs = adrs;
}

private List<Address> adrs;
public int getvId() {
	return vId;
}
Vendor(int vId)
{
	this.vId=vId;
	System.out.println("object created...");
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

@Override
public String toString() {
	return "Vendor [vId=" + vId + ", vName=" + vName + ", adrs=" + adrs + "]";
}
public Properties getProp() {
	return prop;
}
public void setProp(Properties prop) {
	this.prop = prop;
}

}
