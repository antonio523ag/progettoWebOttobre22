package org.elis.dao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.elis.dao.DaoFactory;
import org.elis.dao.intefaces.FilmDAO;
import org.elis.dao.intefaces.GenereDAO;
import org.elis.dao.intefaces.UtenteDAO;

public class JdbcDAOFactory extends DaoFactory {

	@Override
	public UtenteDAO getUtenteDAO() {
		return UtenteDAOJdbc.getInstance();
	}

	@Override
	public FilmDAO getFilmDAO() {
		return FilmDAOJdbc.getInstance();
	}

	@Override
	public GenereDAO getGenereDAO() {
		return GenereDAOJdbc.getInstance();
	}
	
	protected static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/elisstreaming?serverTimezone=Europe/Rome", "root", "toor");
	}

}
