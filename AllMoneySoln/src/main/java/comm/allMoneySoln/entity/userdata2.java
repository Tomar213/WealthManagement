package comm.allMoneySoln.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="UserReg2")
public class userdata2 {
	@Column
	@Id
	private int accNo;
	@Column
	private long aadharNo;
	@Column
	private String otherid;
	@Column
	private String panNo;
	@Column
	private String address;
	@Column
	private int income;
	@Column
	private String password;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getOtherid() {
		return otherid;
	}
	public void setOtherid(String otherid) {
		this.otherid = otherid;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
