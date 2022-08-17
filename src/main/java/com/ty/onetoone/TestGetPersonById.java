package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPersonById {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entitymanager = factory.createEntityManager();
		Person person = entitymanager.find(Person.class, 1);
		System.out.println(person.getId());
		System.out.println(person.getAge());
		System.out.println(person.getName());
		System.out.println(person.getPan());

	}

}
