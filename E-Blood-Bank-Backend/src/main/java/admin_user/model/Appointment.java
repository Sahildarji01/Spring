package admin_user.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "app", uniqueConstraints = @UniqueConstraint(columnNames = "bemail"))
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="bname")
	private String bName;
	@Column(name="bemail")
	private String bEmail;
	@Column(name="bcontact")
	private String bContact;
	@Column(name="baddress")
	private String bAddress;
	@Column(name="bpassword")
	private String bPassword;
	@Column(name="area")
	private String area;
	public Appointment(String bName, String bEmail, String bContact, String bAddress, String bPassword, String area) {
		super();
		this.bName = bName;
		this.bEmail = bEmail;
		this.bContact = bContact;
		this.bAddress = bAddress;
		this.bPassword = bPassword;
		this.area = area;
	}
	public Appointment() {
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

