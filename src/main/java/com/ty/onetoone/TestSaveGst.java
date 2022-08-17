package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveGst {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Gst gst = new Gst();
		gst.setGstno(123);
		gst.setStatus("Active");

		Company company = new Company();
		company.setName("Britania");
		company.setPhone(8217779514l);

		gst.setCompany(company);

		entityTransaction.begin();

		entityManager.persist(company);
		entityManager.persist(gst);

		entityTransaction.commit();

		System.out.println("Data stored");

	}

}
