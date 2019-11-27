package com.cognizant.bloodbank.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "hospital")
public class Hospitals {


	public Hospitals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospitals(int id, String name, List<SlotBooking> slotbooking) {
		super();
		this.id = id;
		this.name = name;
		this.slotbooking = slotbooking;
	}

	@Override
	public String toString() {
		return "Hospitals [id=" + id + ", name=" + name + ", slotbooking=" + slotbooking + "]";
	}

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

	public List<SlotBooking> getSlotbooking() {
		return slotbooking;
	}

	public void setSlotbooking(List<SlotBooking> slotbooking) {
		this.slotbooking = slotbooking;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hp_id")
	private int id;
	
	@Column(name = "hp_name")
	private String name;
	
	@OneToMany(mappedBy="hospitals")
	private List<SlotBooking> slotbooking; 

}
