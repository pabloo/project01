package pl.altkom.projekt.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Mail implements Serializable {
	private String nadawca;
	private List<Odbiorca> odbiorcy;
	private String temat;
	private String tekstWiadomosci;
	private Date dataNadania;

	public Mail(String nadawca, List<Odbiorca> odbiorcy, String temat,
			String tekstWiadomosci, Date dataNadania) {
		this.nadawca = nadawca;
		this.odbiorcy = odbiorcy;
		this.temat = temat;
		this.tekstWiadomosci = tekstWiadomosci;
		this.dataNadania = dataNadania;
	}

	public Mail() {
	}

	public String getNadawca() {
		return nadawca;
	}

	public void setNadawca(String nadawca) {
		this.nadawca = nadawca;
	}

	public List<Odbiorca> getOdbiorcy() {
		return odbiorcy;
	}

	public void setOdbiorcy(List<Odbiorca> odbiorcy) {
		this.odbiorcy = odbiorcy;
	}

	public String getTemat() {
		return temat;
	}

	public void setTemat(String temat) {
		this.temat = temat;
	}

	public String getTekstWiadomosci() {
		return tekstWiadomosci;
	}

	public void setTekstWiadomosci(String tekstWiadomosci) {
		this.tekstWiadomosci = tekstWiadomosci;
	}

	public Date getDataNadania() {
		return dataNadania;
	}

	public void setDataNadania(Date dataNadania) {
		this.dataNadania = dataNadania;
	}

}
