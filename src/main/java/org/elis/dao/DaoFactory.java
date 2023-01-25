package org.elis.dao;

import org.elis.dao.intefaces.*;
import org.elis.dao.jdbc.JdbcDAOFactory;

public abstract class DaoFactory {
	public abstract UtenteDAO getUtenteDAO();
	public abstract FilmDAO getFilmDAO();
	public abstract GenereDAO getGenereDAO();
	
	public static DaoFactory getDaoFactory() {
		return new JdbcDAOFactory();
	}
}
