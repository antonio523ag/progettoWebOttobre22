package org.elis.model;

import java.util.List;

public class Genere {
	private long id;
	private String genere;
	private List<Film> film;
	
	public Genere(long id, String genere) {
		this.id = id;
		this.genere = genere;
	}

	public Genere() {
	}

	public long getId() {
		return id;
	}

	public String getGenere() {
		return genere;
	}
	
	public List<Film> getFilm() {
		return film;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public void setFilm(List<Film> film) {
		this.film = film;
	}
	
	
}
