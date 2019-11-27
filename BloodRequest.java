package com.cognizant.bloodbank.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "blood_request")
public class BloodRequest {

	

	@Override
	public String toString() {
		return "BloodRequest [id=" + id + ", bloodgroup=" + bloodgroup + ", name=" + name + ", contactnumber="
				+ contactnumber + ", address=" + address + "]";
	}

	public BloodRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BloodRequest(int id, String bloodgroup, String name, String contactnumber, Address address) {
		super();
		this.id = id;
		this.bloodgroup = bloodgroup;
		this.name = name;
		this.contactnumber = contactnumber;
		this.address = address;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "req_id")
	private int id;
	
	@Column(name = "req_bloodgroup")
	private String bloodgroup;
	
	@Column(name = "req_name")
	private String name;
	
	@Column(name = "req_contactnumber")
	private String contactnumber;
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="req_addr_id_fk", referencedColumnName="addr_id")
	private Address address; 
	
	

}
