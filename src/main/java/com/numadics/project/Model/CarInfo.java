package com.numadics.project.Model;

import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="Car Info")
public class CarInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int carId;
	
	@Column(nullable = false)
	private String Owner;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(nullable = false)
	private long CellNo;
	
	@Column(nullable = false)
	private String Brand;
	
	@Column(nullable = false)
	private String CarModel;
	
	
	private Year MakeYear;
	public CarInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarInfo(int carId, String owner, String email, long cellNo, String brand, String carModel, Year makeYear) {
		super();
		this.carId = carId;
		this.Owner = owner;
		this.email = email;
		this.CellNo = cellNo;
		this.Brand = brand;
		this.CarModel = carModel;
		this.MakeYear = makeYear;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCellNo() {
		return CellNo;
	}
	public void setCellNo(long cellNo) {
		CellNo = cellNo;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getCarModel() {
		return CarModel;
	}
	public void setCarModel(String carModel) {
		CarModel = carModel;
	}
	public Year getMakeYear() {
		return MakeYear;
	}
	public void setMakeYear(Year makeYear) {
		MakeYear = makeYear;
	}
	@Override
	public String toString() {
		return "CarInfo [carId=" + carId + ", Owner=" + Owner + ", email=" + email + ", CellNo=" + CellNo + ", Brand="
				+ Brand + ", CarModel=" + CarModel + ", MakeYear=" + MakeYear + "]";
	}
	
	
	
	
	
	

}
