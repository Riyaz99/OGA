package com.cg.gsm.service;

import java.util.List;

import com.cg.gsm.entities.BookProductEntity;


public interface BookProductServiceInt {

	public long add(BookProductEntity bean);
	
	public void update(BookProductEntity bean);
	
	public void delete(BookProductEntity bean);
	
	public BookProductEntity findByName(String name);
	
	public BookProductEntity findByPk(long id);
	
	public List<BookProductEntity> search(BookProductEntity bean, long pageNo, int pageSize);
	
	public List<BookProductEntity> search(BookProductEntity bean);
	
}
