package com.rayen.test;
import com.rayen.dao.BoissonDao;
import com.rayen.entities.Boisson;
public class BoissonTest {

	public static void main(String[] args) {
		Boisson c = new Boisson ();
		c.setNomBoisson("caffee");
		c.setPrix(1.2);
		
		BoissonDao boiDao = new BoissonDao();
		boiDao.ajouter(c);
		System.out.println("Appel de la méthode listerTous");
		for (Boisson b : boiDao.listerTous())
		System.out.println(b.getIdBoisson()+" "+b.getNomBoisson());
		System.out.println("Appel de la méthode listerParNom");
		for (Boisson b : boiDao.listerParNom("caf"))

		System.out.println(b.getIdBoisson()+" "+b.getNomBoisson());
	}

}
