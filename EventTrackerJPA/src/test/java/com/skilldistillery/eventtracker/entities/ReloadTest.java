package com.skilldistillery.eventtracker.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReloadTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Reload reload;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 emf = Persistence.createEntityManagerFactory("EventTrackerJPA");
		}
		

		@AfterAll
		static void tearDownAfterClass() throws Exception {
		emf.close();
		}

		@BeforeEach
		void setUp() throws Exception {
			em = emf.createEntityManager();	
			reload = em.find(Reload.class, 1);
			}

		@AfterEach
		void tearDown() throws Exception {
			em.close();
			reload = null;
		}

		@Test
		void test_Reload_entity_mapping() {
			assertNotNull(reload);
			assertEquals("9mm", reload.getCaliber());
			assertEquals("RMR", reload.getBulletBrand());
			assertEquals("FMJ", reload.getBulletType());
			assertEquals("124", reload.getBulletWeight());
			assertEquals("Hodgdon", reload.getPowderBrand());
			assertEquals("7", reload.getPowderWeight());
			assertEquals("CCI", reload.getPowderBrand());
			assertEquals("500", reload.getPowderType());
		
		}
}
