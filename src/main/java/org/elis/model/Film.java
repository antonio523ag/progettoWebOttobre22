package org.elis.model;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Film {
	private String titolo;
	private Genere genere;
	private int anno;
	private int durata;
	private String descrizione;
	private Timestamp dataAggiunta;
	private LocalDate dataModifica;
	private Utente autoreAggiunta;
	private Utente autoreModifica;
	
	public Film(String titolo, Genere genere, int anno, int durata, String descrizione, LocalDate dataModifica,
			Utente autoreAggiunta, Utente autoreModifica) {
		this.titolo = titolo;
		this.genere = genere;
		this.anno = anno;
		this.durata = durata;
		this.descrizione = descrizione;
		this.dataModifica = dataModifica;
		dataAggiunta=new Timestamp(System.currentTimeMillis());
		this.autoreAggiunta = autoreAggiunta;
		this.autoreModifica = autoreModifica;
	}
	
	public Film() {
	}

	public String getTitolo() {
		return titolo;
	}

	public Genere getGenere() {
		return genere;
	}

	public int getAnno() {
		return anno;
	}

	public int getDurata() {
		return durata;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public Timestamp getDataAggiunta() {
		return dataAggiunta;
	}

	public LocalDate getDataModifica() {
		return dataModifica;
	}

	public Utente getAutoreAggiunta() {
		return autoreAggiunta;
	}

	public Utente getAutoreModifica() {
		return autoreModifica;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setDataAggiunta(Timestamp dataAggiunta) {
		this.dataAggiunta = dataAggiunta;
	}

	public void setDataModifica(LocalDate dataModifica) {
		this.dataModifica = dataModifica;
	}

	public void setAutoreAggiunta(Utente autoreAggiunta) {
		this.autoreAggiunta = autoreAggiunta;
	}

	public void setAutoreModifica(Utente autoreModifica) {
		this.autoreModifica = autoreModifica;
	}
	
	
	
	
	
	
}
