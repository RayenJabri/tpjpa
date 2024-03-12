package com.rayen.entities;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Boisson implements Serializable{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long idBoisson ;
	private  String nomBoisson;
	private double prix;
	

public long getIdBoisson() {
	return idBoisson;
}
public void setIdBoisson (Long idBoisson) {
	this.idBoisson=idBoisson;
}	
public String getNomBoisson() {
	return nomBoisson;
}
public void setNomBoisson(String nomBoisson) {
	this.nomBoisson=nomBoisson;
}
public double getPrix() {
return prix;
}
public void setPrix(double prix) {
this.prix = prix;
}


}
