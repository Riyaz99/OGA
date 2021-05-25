package com.cg.gsm.entities;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "base")
public abstract class BaseEntity implements DropdownList {

	@Id
//	@Column(nullable = false, updatable = false)
//	@GeneratedValue(strategy = GenerationType.AUTO)
	protected long id;
	protected String createdBy;

	protected String modifiedBy;

	protected Timestamp createdDateTime;

	protected Timestamp modifiedDateTime;
	
	@OneToOne(mappedBy="base",cascade = CascadeType.ALL)
	protected BookProductEntity bookProductEntity;
	
	@OneToOne(mappedBy="base",cascade=CascadeType.ALL)
	protected ProductEntity productEntity;
	
	@OneToOne(mappedBy="base",cascade=CascadeType.ALL)
	protected UserEntity userEntity;
	
	
	public BookProductEntity getBookProductEntity() {
		return bookProductEntity;
	}

	public void setBookProductEntity(BookProductEntity bookProductEntity) {
		this.bookProductEntity = bookProductEntity;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy + ", createdDateTime="
				+ createdDateTime + ", modifiedDateTime=" + modifiedDateTime + "]";
	}
	
}
