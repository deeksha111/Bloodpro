package com.cognizant.bloodbank.model;

import java.sql.Time;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "slot_booking")
public class SlotBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sl_id")
	private int id;
	
	public SlotBooking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SlotBooking(int id, Date date, Time time, Hospitals hospitals) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.hospitals = hospitals;
	}

	@Override
	public String toString() {
		return "SlotBooking [id=" + id + ", date=" + date + ", time=" + time + ", hospitals=" + hospitals + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Hospitals getHospitals() {
		return hospitals;
	}

	public void setHospitals(Hospitals hospitals) {
		this.hospitals = hospitals;
	}

	@Column(name = "sl_date")
	private Date date;
	
	@Column(name = "sl_time")
	private Time time;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="sl_hp_id_fk", referencedColumnName="hp_id")
	private Hospitals hospitals; 
}
