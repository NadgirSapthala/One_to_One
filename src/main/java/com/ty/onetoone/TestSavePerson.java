package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePerson {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person = new Person();
		person.setName("sapthala");
		person.setAge(22);

		Pan pan = new Pan();
		pan.setPannumber("CGIL0078");
		pan.setFathername("RS Nadgir");
		
		person.setPan(pan);  //Insering the pan object into the person object

		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);

		entityTransaction.commit();
		
		System.out.println("Data stored");
	}

}
