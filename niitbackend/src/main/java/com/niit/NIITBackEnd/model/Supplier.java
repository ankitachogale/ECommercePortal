package com.niit.NIITBackEnd.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@SuppressWarnings("unuesd")
@Entity
@Component
@Table(name="Supplier")
public class Supplier {
	@Id
	private int Sid;
	private String Sname;
	@OneToMany(targetEntity=Product.class, fetch=FetchType.EAGER,mappedBy="Supplier")
	private Set<Product> products=new HashSet<Product>(0);
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
