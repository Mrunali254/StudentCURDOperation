package com.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Student {

	@Id
	int id;
	String name;
	String stream;
	int yop;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
		

}
