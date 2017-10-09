package com.niit.NIITBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
@Id
private int Cartid;
private int Orderid;
private int Pid;
private int quantity;
private int price;
private String status;
private String Username;
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public int getCartid() {
	return Cartid;
}
public void setCartid(int cartid) {
	Cartid = cartid;
}
public int getOrderid() {
	return Orderid;
}
public void setOrderid(int orderid) {
	Orderid = orderid;
}
public int getPid() {
	return Pid;
}
public void setPid(int pid) {
	Pid = pid;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
