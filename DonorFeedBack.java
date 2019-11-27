package com.cognizant.bloodbank.model;

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
@Table(name = "donor_feedback")
public class DonorFeedBack {
	public DonorFeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DonorFeedBack(int id, String feedback, Hospitals hospitals) {
		super();
		this.id = id;
		this.feedback = feedback;
		this.hospitals = hospitals;
	}

	@Override
	public String toString() {
		return "DonorFeedBack [id=" + id + ", feedback=" + feedback + ", hospitals=" + hospitals + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Hospitals getHospitals() {
		return hospitals;
	}

	public void setHospitals(Hospitals hospitals) {
		this.hospitals = hospitals;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "df_id")
	private int id;
	
	@Column(name = "df_feedback")
	private String feedback;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="df_hp_id_fk", referencedColumnName="hp_id")
	private Hospitals hospitals; 
}
