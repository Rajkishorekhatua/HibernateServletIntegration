package com.xworkz.thor.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "mstsport")
public class SportsDTO {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "sp_id")
	private int spId;
	@Column(name = "sports_name")
	private String sportsName;
	@Column(name = "sports_type")
	private String sportsType;
	@Column(name = "noofplayers")
	private int noOfplayers;
	@Column(name = "location")
	private String location;
	@Column(name = "national")
	private boolean international;

	public SportsDTO() {

	}

	
	public int getSpId() {
		return spId;
	}

	public void setSpId(int spId) {
		this.spId = spId;
	}
	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}

	public String getSportsType() {
		return sportsType;
	}

	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}

	public int getNoOfplayers() {
		return noOfplayers;
	}

	public void setNoOfplayers(int noOfplayers) {
		this.noOfplayers = noOfplayers;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isInternational() {
		return international;
	}

	public void setInternational(boolean international) {
		this.international = international;
	}

	@Override
	public String toString() {
		return "SportsDTO [spId=" + spId + ", sportsName=" + sportsName + ", sportsType=" + sportsType
				+ ", noOfplayers=" + noOfplayers + ", location=" + location + ", international=" + international + "]";
	}


}
