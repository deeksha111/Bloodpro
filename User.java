package com.cognizant.bloodbank.model;

import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "user")

public class User {
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String firstname, String lastname, String password, int age, int weight, String email,
			String contactnumber, String bloodgroup, String gender, Set<Address> addressList, Set<Role> userroleList) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.age = age;
		this.weight = weight;
		this.email = email;
		this.contactnumber = contactnumber;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
		this.addressList = addressList;
		this.userroleList = userroleList;
	}

	public User(int id, String firstname, String password, Set<Role> userroleList) {
		this.id = id;
		this.firstname = firstname;
		this.password = password;
		this.userroleList = userroleList;

	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ ", age=" + age + ", weight=" + weight + ", email=" + email + ", contactnumber=" + contactnumber
				+ ", bloodgroup=" + bloodgroup + ", gender=" + gender + ", addressList=" + addressList + ", slotList="
				+ slotList + ", userroleList=" + userroleList +  "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<Address> addressList) {
		this.addressList = addressList;
	}

	public Set<Role> getUserroleList() {
		return userroleList;
	}

	public void setUserroleList(Set<Role> userroleList) {
		this.userroleList = userroleList;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "us_id")
	private int id;
	
	@Column(name = "us_firstname")
	private String firstname;
	
	@Column(name = "us_lastname")
	private String lastname;
	
	@Column(name="us_password")
	private String password;
	
	@Column(name = "us_age")
	private int age;
	
	@Column(name = "us_weight")
	private int weight;
	
	@Column(name = "us_email")
	private String email;
	
	@Column(name = "us_contactnumber")
	private String contactnumber;
	
	@Column(name = "us_bloodgroup")
	private String bloodgroup;
	
	@Column(name = "us_gender")
	private String gender;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_address", joinColumns = @JoinColumn(name = "ua_us_id_fk"), inverseJoinColumns = @JoinColumn(name = "ua_addr_id_fk"))
	private Set<Address> addressList;
	
	

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "donor_slot", joinColumns = @JoinColumn(name = "ds_us_id_fk"), inverseJoinColumns = @JoinColumn(name = "ds_sl_id_fk"))
	private Set<SlotBooking> slotList;
	
	@ManyToMany(fetch = FetchType.EAGER)	
	@JsonIgnore
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "ur_us_id_fk"), inverseJoinColumns = @JoinColumn(name = "ur_ro_id_fk"))
	private Set<Role> userroleList;

	
	
}
