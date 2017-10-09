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
@Table(name="Category")
public class Category {
	@Id
	private int Cid;
	private String Cname;
	@OneToMany(targetEntity=Product.class, fetch=FetchType.EAGER,mappedBy="Category")
	private Set<Product> products=new HashSet<Product>(0);

	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
}
