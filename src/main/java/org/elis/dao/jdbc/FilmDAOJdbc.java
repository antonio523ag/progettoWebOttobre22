package org.elis.dao.jdbc;

import java.util.List;

import org.elis.dao.intefaces.FilmDAO;
import org.elis.model.Film;

import static org.elis.dao.jdbc.JdbcDAOFactory.getConnection;

class FilmDAOJdbc implements FilmDAO {
	
	private static final FilmDAOJdbc instance=new FilmDAOJdbc();
	
	private FilmDAOJdbc() {}
	
	public static FilmDAOJdbc getInstance() {
		return instance;
	}

	@Override
	public boolean inserisci(Film f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifica(Film f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancella(Film f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Film getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
