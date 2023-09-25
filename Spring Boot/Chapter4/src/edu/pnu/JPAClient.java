package edu.pnu;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.pnu.domain.Board;

public class JPAClient {

	public static void main(String[] args) {
//		DB에 테이블 만들기
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Chapter4");
		EntityManager em = emf.createEntityManager();

		insertData(em);
		updateData(em);
		deleteData(em);

		em.close();
		emf.close();

	}

	private static void insertData(EntityManager em) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();

			for (int i = 1; i <= 10; i++) {
				Board b = new Board();
				b.setTitle("Title " + i);
				b.setContent("Content " + i);
				b.setWriter("Writer " + i);
				b.setCreateDate(new Date());
				b.setCnt((long) i);
				em.persist(b);
			}
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}

	private static void updateData(EntityManager em) {
		// 조건에 맞는 primary key를 찾음
		Board b = em.find(Board.class, 5L);
		b.setTitle("나는 새로운 Title이다!!");
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(b);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}
	
	private static void deleteData(EntityManager em) {
		Board b = em.find(Board.class, 8L);
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.remove(b);
			tx.commit();
		} catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}

}
