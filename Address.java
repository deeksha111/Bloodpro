package com.cognizant.bloodbank.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "address")
public class Address {
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String state, String area, int pincode, Set<User> userlist) {
		super();
		this.id = id;
		this.state = state;
		this.area = area;
		this.pincode = pincode;
		this.userlist = userlist;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", state=" + state + ", area=" + area + ", pincode=" + pincode + ", userlist="
				+ userlist + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Set<User> getUserlist() {
		return userlist;
	}

	public void setUserlist(Set<User> userlist) {
		this.userlist = userlist;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addr_id")
	private int id;
	
	@Column(name = "addr_state")
	private String state;
	
	@Column(name = "addr_area")
	private String area;
	
	@Column(name = "addr_pincode")
	private int pincode;
	
	@ManyToMany(mappedBy="addressList")
	@JsonIgnore
	private Set<User> userlist;

	

}
