package pl.altkom.projekt.model;

import java.io.Serializable;

public class Odbiorca implements Serializable {

	private String imie;
	private String nazwisko;
	private String mail;

	public Odbiorca(String imie, String nazwisko, String mail) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.mail = mail;
	}

	public Odbiorca() {
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
