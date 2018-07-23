package com.nucleus;


public class Employee 
{
private int empId;
private String eName;
Employee()
{
	System.out.println("Object created");
}
public int getEmpId()
{
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", eName=" + eName + "]";
}
}
