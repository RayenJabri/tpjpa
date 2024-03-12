package com.rayen.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import com.rayen.entities.Boisson;
import com.rayen.util.JPAutil;
public class BoissonDao {
	private EntityManager entityManager=JPAutil.getEntityManager("tpjp");
	public void ajouter(Boisson b)
	{
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.persist(b);
	tx.commit();
	}
	public void modifier(Boisson b)
	{
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	entityManager.merge(b);
	tx.commit();
	}
	public void supprimer(Boisson b)
	{
	EntityTransaction tx = entityManager.getTransaction();
	tx.begin();
	b=entityManager.merge(b); 
	entityManager.remove(b);
	tx.commit();
	}
	public Boisson consulter(Boisson b,Object id)
	{
	return entityManager.find(b.getClass(), id);
	}
	public List<Boisson> listerTous() {
		List<Boisson> boissons =entityManager.createQuery("select c from Boisson b").getResultList();
		return boissons;
	}
	public List<Boisson> listerParNom(String nom) {List<Boisson> boissons=entityManager.createQuery( "select c from Boisson b where b.nom like :pnom").setParameter("pnom","%"+nom+"%").getResultList();

		return boissons;}
}
