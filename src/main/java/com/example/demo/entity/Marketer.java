package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marketanalysis")
public class Marketer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Column(name="name",length=45,nullable=false)	
private String name;
@Column(name="course",length=45,nullable=false,unique=true)
private String course;
@Column(name="fee",length=45,nullable=false)
private int fee;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}

}
