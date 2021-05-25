package com.cg.gsm.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {

	@Id
//	@Column(nullable = false, updatable = false)
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Id @GeneratedValue(generator="assigned")
//	@GenericGenerator(name="system-uuid", strategy = "uuid")

	private String loginId;
	private String password;
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String emailId;
	private long roleId;
	
	@OneToOne
	private BaseEntity base;
	
	@OneToOne
	private BookProductEntity bookproduct;

	public BookProductEntity getBookproduct() {
		return bookproduct;
	}

	public void setBookproduct(BookProductEntity bookproduct) {
		this.bookproduct = bookproduct;
	}

	public BaseEntity getBase() {
		return base;
	}

	public void setBase(BaseEntity base) {
		this.base = base;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	@Override
	public String toString() {
		return "UserEntity [loginId=" + loginId + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", mobileNo=" + mobileNo + ", emailId=" + emailId + ", roleId=" + roleId + "]";
	}
	
	
//	@Override
//	public String getKey() {
//		// TODO Auto-generated method stub
//		return String.valueOf(id);
//	}
//
//	@Override
//	public String getValue() {
//		// TODO Auto-generated method stub
//		return firstName+" "+lastName;
//	}

}
