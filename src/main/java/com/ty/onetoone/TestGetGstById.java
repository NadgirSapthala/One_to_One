package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetGstById {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entitymanager = factory.createEntityManager();
		Gst gst = entitymanager.find(Gst.class, 1);
		System.out.println(gst.getId());
		System.out.println(gst.getGstno());
		System.out.println(gst.getStatus());
		System.out.println(gst.getCompany());

	}

}
