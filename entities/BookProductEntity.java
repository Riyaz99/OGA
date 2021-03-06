package com.cg.gsm.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_product")
public class BookProductEntity {

	@Id
//	@Column(nullable = false, updatable = false)
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	private String productName;
	private String name;
	private String emailId;
	private String mobileNo;
	private String country;
	private String state;
	private String district;
	private String pincode;
	private String address;
	private long userId;
	private String quantity;
	private String amount;
	private Date date;
	
	@OneToOne
	private BaseEntity base;
	
	@OneToOne(mappedBy="bookproduct" ,cascade=CascadeType.ALL)
	protected UserEntity userEntity;
	
	
	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public BaseEntity getBase() {
		return base;
	}

	public void setBase(BaseEntity base) {
		this.base = base;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BookProductEntity [productId=" + productId + ", productName=" + productName + ", name=" + name
				+ ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", country=" + country + ", state=" + state
				+ ", district=" + district + ", pincode=" + pincode + ", address=" + address + ", userId=" + userId
				+ ", quantity=" + quantity + ", amount=" + amount + ", date=" + date + "]";
	}
	

//	@Override
//	public String getKey() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getValue() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
