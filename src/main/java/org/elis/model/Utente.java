package org.elis.model;

public class Utente {
	private long id;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int ruolo;
	
	public Utente(String nome, String cognome, String email, String password, int ruolo) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.ruolo = ruolo;
	}

	public Utente() {
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public int getRuolo() {
		return ruolo;
	}
	
	public long getId() {
		return id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRuolo(int ruolo) {
		this.ruolo = ruolo;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
}
