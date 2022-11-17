package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="ename")
private String ename;
	@Column(name="contactno")
private long contactno;
public Employee() { //Default Constructor
	
}
public Employee(int id,String ename,long contactno) {
	this.id=id;
	this.ename=ename;
	this.contactno=contactno;
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public long getContactno() {
	return contactno;
}
public void setContactno(long contactno) {
	this.contactno = contactno;
}
}
