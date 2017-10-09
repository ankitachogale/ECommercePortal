package com.niit.NIITBackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
@Id
@GeneratedValue
@Column(name="Uid")
private int Uid;
private static String Uname;
private String Uaddress;
private int Uphoneno;
private static String Username;
private static String Password;
public static String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public static String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public int getUid() {
	return Uid;
}
public void setUid(int uid) {
	Uid = uid;
}
public static String getUname() {
	return Uname;
}
public void setUname(String uname) {
	Uname = uname;
}
public String getUaddress() {
	return Uaddress;
}
public void setUaddress(String uaddress) {
	Uaddress = uaddress;
}
public int getUphoneno() {
	return Uphoneno;
}
public void setUphoneno(int uphoneno) {
	Uphoneno = uphoneno;
}
}
