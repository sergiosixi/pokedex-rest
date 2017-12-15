package edu.cibertec.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pokemon implements Serializable {

	private int numero;
	private String name;
	private String photoUrl;
	
	
	public Pokemon() {}
	
	
	public Pokemon(int numero, String name, String photoUrl) {
		super();
		this.numero = numero;
		this.name = name;
		this.photoUrl = photoUrl;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	
	
}
