package com.cg.gsm.repository;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.gsm.entities.ProductEntity;



public interface ProductDAOInt extends JpaRepository<ProductEntity, String>{

//	public long add(ProductEntity bean);
//	
//	public void update(ProductEntity bean);
//	
//	public void delete(ProductEntity bean);
//	
//	public ProductEntity findByName(String name);
//	
//	public ProductEntity findByCode(String code);
//	
//	public ProductEntity findByPk(long id);
//	
//	public List<ProductEntity> search(ProductEntity bean, long pageNo, int pageSize);
//	
//	public List<ProductEntity> search(ProductEntity bean);
//	
//	public Blob getImageById(long id) throws SerialException, SQLException;
	
}
