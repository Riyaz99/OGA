package com.cg.gsm.entities;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product_entity")
public class ProductEntity {

	@Id
//	@Column(nullable = false, updatable = false)
	//@Column(nullable = true)
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Id @GeneratedValue(generator="assigned")
//	@GenericGenerator(name="system-uuid", strategy = "uuid")
//	@Id
//	@Column(nullable = false)
	private String code;
	private String name;
	private String price;
	private String description;
	private String quantity;
	private byte[] image;

	@OneToOne
	private BaseEntity base;
	
	
	public BaseEntity getBase() {
		return base;
	}

	public void setBase(BaseEntity base) {
		this.base = base;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ProductEntity [code=" + code + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", quantity=" + quantity + ", image=" + Arrays.toString(image) +  "]";
	}
	

//	@Override
//	public String getKey() {
//		return String.valueOf(id);
//	}
//
//	@Override
//	public String getValue() {
//		return name;
//	}

}
