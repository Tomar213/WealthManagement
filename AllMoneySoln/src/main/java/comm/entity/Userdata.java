package comm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="trialtable")
public class Userdata {
	
	@Id
	private String firstname;
	
	
	private String lastname;
	private String fathername;
	private String mothername;
	private int age;
	private int dob;
	private String occupation;
	private String city;
	private int pincode;
	private String email;
	private String password;
	
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
	public String getFathertname() {
		return fathername;
	}
	public void setFathertname(String fathertname) {
		this.fathername = fathertname;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Userdata [firstname=" + firstname + ", lastname=" + lastname + ", fathername=" + fathername
				+ ", mothername=" + mothername + ", age=" + age + ", dob=" + dob + ", occupation=" + occupation
				+ ", city=" + city + ", pincode=" + pincode + ", email=" + email + ", password=" + password + "]";
	}
	

}
