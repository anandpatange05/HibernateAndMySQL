package com.anand.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="alien")
public class Alien {
@Id
private int aid;
private String aname;
private String colour;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}

}
