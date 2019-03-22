package com.cg.hr.core.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil 
{
private static EntityManagerFactory emf=null;
private static EntityManager em=null;//in JPA EntityManager act like connection

public static EntityManager getEntityManager()//getting connection using factory
{
	emf=Persistence.createEntityManagerFactory("Oracle-JPA-PU");
	em=emf.createEntityManager();//for performing all the CRUD operations 
	return em;
}
}
