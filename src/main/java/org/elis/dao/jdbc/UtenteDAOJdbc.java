package org.elis.dao.jdbc;

import java.util.List;

import org.elis.dao.intefaces.UtenteDAO;
import org.elis.model.Utente;

import static org.elis.dao.jdbc.JdbcDAOFactory.getConnection;

class UtenteDAOJdbc implements UtenteDAO {

	private static final UtenteDAOJdbc instance=new UtenteDAOJdbc();
	
	private UtenteDAOJdbc() {}
	
	public static UtenteDAOJdbc getInstance() {
		return instance;
	}
	
	@Override
	public Utente login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean inserisci(Utente u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modifica(Utente u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Utente getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancella(Utente u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Utente> getOther(Utente u) {
		// TODO Auto-generated method stub
		return null;
	}

}
