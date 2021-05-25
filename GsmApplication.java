package com.cg.gsm;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.gsm.entities.BaseEntity;
import com.cg.gsm.entities.BookProductEntity;
import com.cg.gsm.entities.DerivedEntity;
import com.cg.gsm.entities.ProductEntity;
import com.cg.gsm.entities.UserEntity;
import com.cg.gsm.repository.BaseDAOInt;
import com.cg.gsm.repository.BookProductDAOInt;
import com.cg.gsm.repository.ProductDAOInt;
import com.cg.gsm.repository.UserDAOInt;

@SpringBootApplication
public class GsmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GsmApplication.class, args);
	}
	
	@Autowired
	private BaseDAOInt baseRep;
	@Autowired
	private BookProductDAOInt bookProductRep;
	@Autowired
	private ProductDAOInt productRep;
	@Autowired
	private UserDAOInt userRep;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Date d = new Date();
		
		BaseEntity b1 = new DerivedEntity();
		b1.setId(10000001);
		b1.setModifiedBy("admin");
		b1.setModifiedDateTime(new Timestamp(new Date().getTime()));
		b1.setCreatedBy("admin");
		b1.setCreatedDateTime(new Timestamp(new Date().getTime()));
		
		BaseEntity b2 = new DerivedEntity();
		b2.setId(10000002);
		b2.setModifiedBy("admin2");
		b2.setModifiedDateTime(new Timestamp(new Date().getTime()));
		b2.setCreatedBy("admin2");
		b2.setCreatedDateTime(new Timestamp(new Date().getTime()));
		
		BookProductEntity bp1 = new BookProductEntity();
		bp1.setProductId(156156);
		bp1.setProductName("product1");
		bp1.setName("abc");
		bp1.setEmailId("abc@gmail.com");
		bp1.setMobileNo("1234567890");
		bp1.setCountry("India");
		bp1.setState("Telangana");
		bp1.setDistrict("Medchal");
		bp1.setPincode("500062");
		bp1.setAddress("ECIL,Hyderabad");
		bp1.setUserId(17911);
		bp1.setQuantity("2");
		bp1.setAmount("200");
		bp1.setDate(d);
		bp1.setBase(b1);
		b1.setBookProductEntity(bp1);
		
		BookProductEntity bp2 = new BookProductEntity();
		bp2.setProductId(156157);
		bp2.setProductName("product2");
		bp2.setName("abc");
		bp2.setEmailId("abc@gmail.com");
		bp2.setMobileNo("1234567890");
		bp2.setCountry("India");
		bp2.setState("Telangana");
		bp2.setDistrict("Medchal");
		bp2.setPincode("500062");
		bp2.setAddress("ECIL,Hyderabad");
		bp2.setUserId(17911);
		bp2.setQuantity("2");
		bp2.setAmount("200");
		bp2.setDate(d);
		bp2.setBase(b2);
		b2.setBookProductEntity(bp2);
		
		ProductEntity p1 = new ProductEntity();
		p1.setCode("1010000011550");
		p1.setDescription("sample");
		p1.setName("sample product");
		p1.setPrice("1000");
		p1.setQuantity("10");
		p1.setBase(b1);
		b1.setProductEntity(p1);
		
		ProductEntity p2 = new ProductEntity();
		p2.setCode("1214745484");
		p2.setDescription("sample2");
		p2.setName("sample product 2");
		p2.setPrice("100092");
		p2.setQuantity("10");
		p2.setBase(b2);
		b2.setProductEntity(p2);
		
		UserEntity u1 = new UserEntity();
		u1.setLoginId("abc_123");
		u1.setPassword("abc");
		u1.setFirstName("abc");
		u1.setLastName("xyz");
		u1.setMobileNo("1234567890");
		u1.setEmailId("abc123@gmail.com");
		u1.setRoleId(13564);
		u1.setBookproduct(bp1);
		u1.setBase(b1);
		
		UserEntity u2 = new UserEntity();
		u2.setLoginId("abc@123");
		u2.setPassword("abc");
		u2.setFirstName("ABC");
		u2.setLastName("XYZ");
		u2.setMobileNo("1234567890");
		u2.setEmailId("ABC@gmail.com");
		u2.setRoleId(13565);
		u2.setBookproduct(bp2);
		u2.setBase(b2);
		
		bp1.setUserEntity(u1);
		bp2.setUserEntity(u2);
		
		List<BaseEntity> baselist = new ArrayList<>();
		List<BookProductEntity> bookproductlist = new ArrayList<>();
		List<ProductEntity> productlist = new ArrayList<>();
		List<UserEntity> userlist = new ArrayList<>();
		
		baselist.add(b1);
		baselist.add(b2);
		
		bookproductlist.add(bp1);
		bookproductlist.add(bp2);
		
		productlist.add(p1);
		productlist.add(p2);
		
		userlist.add(u1);
		userlist.add(u2);
		
		baseRep.saveAll(baselist);
		bookProductRep.saveAll(bookproductlist);
		productRep.saveAll(productlist);
		userRep.saveAll(userlist);
		
//		baseRep.save(b1);
//		baseRep.save(b2);
//		
//		bookProductRep.save(bp1);
//		bookProductRep.save(bp2);
//		
//		productRep.save(p1);
//		productRep.save(p2);
//		
//		userRep.save(u1);
//		userRep.save(u2);
//		
		BaseEntity b = baseRep.findById((long) 10000002).get();
		System.out.println(b);
		
		BookProductEntity bp = bookProductRep.findById((long) 156156).get();
		System.out.println(bp);
		
		ProductEntity p = productRep.findById("1214745484").get();
		System.out.println(p);
		
		UserEntity u = userRep.findById("abc_123").get();
		System.out.println(u);
		
		u.setBase(null);
		u.setBookproduct(null);
		userRep.save(u);
		userRep.deleteById("abc_123");
		
		p.setBase(null);
		productRep.save(p);
		productRep.deleteById("1214745484");
		
		bp.setBase(null);
		bp.setUserEntity(null);
		bookProductRep.save(bp);
		bookProductRep.deleteById(156156L);

//		System.out.println(b.getId());
//		b.setId(101);
//		System.out.println(b.getId());
//		baseRep.saveAndFlush(b);
//		b.getBookProductEntity().setAddress("Hyd");
//		System.out.println(b.getBookProductEntity().getAddress());
//		baseRep.save(b);
//		
//		System.out.println(baseRep.findAll());
		
		baseRep.deleteById((long) 10000001);
		//baseRep.delete(b1);
		//bookProductRep.deleteById(156156L);
//		BaseEntity b3 = baseRep.findById(10000001L).get();
		//getBookProductEntity().;
		//baseRep.delete(b3);
//		bookProductRep.delete(b3.getBookProductEntity());
		
	}

}
