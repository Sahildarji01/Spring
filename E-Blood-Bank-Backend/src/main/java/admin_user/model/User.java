package admin_user.model;

import org.springframework.security.core.userdetails.UserDetailsService;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="contact")
	private String contact;
	@Column(name="address")
	private String address;
	@Column(name="bloodType")
	private String bloodType;
	@Column(name="password")
	private String password;
	@Column(name="role")
	private String role;
	@Column(name="area")
	private String area;
	public User(String name, String email, String contact, String address, String bloodType, String password,
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
	
	public User() {
		// TODO Auto-generated constructor stub
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

	public String getFullname() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	

}
