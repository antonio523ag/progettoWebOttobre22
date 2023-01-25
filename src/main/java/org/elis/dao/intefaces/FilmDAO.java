package org.elis.dao.intefaces;

import java.util.List;

import org.elis.model.Film;

public interface FilmDAO {
	public boolean inserisci(Film f);
	public boolean modifica(Film f);
	public boolean cancella(Film f);
	public Film getById(long id);
	public List<Film> getAll();
}
