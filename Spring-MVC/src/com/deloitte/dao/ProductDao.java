package com.deloitte.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.pojos.Product;

public class ProductDao implements Dao<Product>{


	private SessionFactory factory;

	public void getConnection() {

		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

	}
	@Override
	public Product get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		Session session = null;
		Transaction tx = null;

		try {
			session = factory.openSession();
			tx = session.beginTransaction();
			List product = session.createQuery("FROM Product").list();
			for (Iterator iterator = product.iterator(); iterator.hasNext();) {
				Product product1 = (Product) iterator.next();
				System.out.println("  ID: " + product1.getId());
				System.out.print("Product Name: " + product1.getProductName());
				System.out.print("  price: " + product1.getPrice());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public void save(Product t) {
		Session session = factory.openSession();
		Transaction tx = null;
		Integer productID = null;

		try {
			tx = session.beginTransaction();
			Product product = new Product(t.getProductName(),t.getPrice());
			productID = (Integer) session.save(product);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
		
	}

	@Override
	public void update(Product t, String[] params) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Product product = (Product) session.get(Product.class, t.getId());
			product.setPrice(t.getPrice());
			session.update(product);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}

	@Override
	public void delete(Product t) {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Product product = (Product) session.get(Product.class, t.getId());
			session.delete(product);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}

}
