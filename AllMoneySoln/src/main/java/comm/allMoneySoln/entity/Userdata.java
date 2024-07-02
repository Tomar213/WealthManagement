package comm.allMoneySoln.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="IndividualReg1")
public class Userdata {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	@Column
	private String fathername;
	@Column
	private String mothername;
	@Column
	private int age;
	@Column
	private int dob;
	@Column
	private String occupation;
	@Column
	private String city;
	@Column
	private int pincode;
	@Column
	private String email;
	
	 
	
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
	@Override
	public String toString() {
		return "Userdata [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", fathername="
				+ fathername + ", mothername=" + mothername + ", age=" + age + ", dob=" + dob + ", occupation="
				+ occupation + ", city=" + city + ", pincode=" + pincode + ", email=" + email + "]";
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	
	@OneToOne
	private userdata2 user2;

}
