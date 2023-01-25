package org.elis.model;

public class Genere {
	private long id;
	private String genere;
	
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

	public void setId(long id) {
		this.id = id;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	
}
