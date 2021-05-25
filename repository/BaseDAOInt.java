package com.cg.gsm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.gsm.entities.BaseEntity;

public interface BaseDAOInt extends JpaRepository<BaseEntity, Long> {

}
