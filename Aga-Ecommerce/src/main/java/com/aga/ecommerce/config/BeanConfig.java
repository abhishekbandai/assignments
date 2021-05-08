package com.aga.ecommerce.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
//@Repository
public class BeanConfig {

	/*@PersistenceContext
	private EntityManager entityManager;*/

//	@PersistenceUnit
	@Autowired
	private EntityManagerFactory entityManagerFactory;


}
