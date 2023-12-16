package admin_user.dto;

//import java.sql.Connection;

import jakarta.persistence.Column;

public class AppointmentDto {
	
	
	private String bName;
	private String bEmail;
	private String bContact;
	private String bAddress;
	private String bPassword;
	private String area;
	public AppointmentDto(String bName, String bEmail, String bContact, String bAddress, String bPassword, String area) {
		super();
		this.bName = bName;
		this.bEmail = bEmail;
		this.bContact = bContact;
		this.bAddress = bAddress;
		this.bPassword = bPassword;
		this.area = area;
	}
	public AppointmentDto() {
		// TODO Auto-generated constructor stub
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbEmail() {
		return bEmail;
	}
	public void setbEmail(String bEmail) {
		this.bEmail = bEmail;
	}
	public String getbContact() {
		return bContact;
	}
	public void setbContact(String bContact) {
		this.bContact = bContact;
	}
	public String getbAddress() {
		return bAddress;
	}
	public void setbAddress(String bAddress) {
		this.bAddress = bAddress;
	}
	public String getbPassword() {
		return bPassword;
	}
	public void setbPassword(String bPassword) {
		this.bPassword = bPassword;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	
}

