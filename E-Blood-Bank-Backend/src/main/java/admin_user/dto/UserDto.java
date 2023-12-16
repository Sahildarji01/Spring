package admin_user.dto;

public class UserDto {
	
	private String name;
	private String email;
	private String contact;
	private String address;
	private String bloodType;
	private String password;
	private String role;
	private String area;
	
	
	public UserDto(String name, String email, String contact, String address, String bloodType, String password,
			String role,String area) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.address = address;
		this.bloodType = bloodType;
		this.password = password;
		this.role = role;
		this.area=area;
	}
	
	
	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
	
	

}
