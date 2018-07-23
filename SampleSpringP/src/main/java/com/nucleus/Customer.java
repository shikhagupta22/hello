package com.nucleus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer 
{
private String cName;
/*@Autowired
@Qualifier("c1")*/
private List <Contact> contact;
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public List <Contact> getContact() {
	return contact;
}
public void setContact(List <Contact> contact) {
	this.contact = contact;
}


}
