package org.elis.dao.jdbc;

import java.util.List;

import org.elis.dao.intefaces.GenereDAO;
import org.elis.model.Genere;

import static org.elis.dao.jdbc.JdbcDAOFactory.getConnection;

class GenereDAOJdbc implements GenereDAO {

	private static final GenereDAOJdbc instance=new GenereDAOJdbc();
	
	private GenereDAOJdbc() {}
	
	public static GenereDAOJdbc getInstance() {
		return instance;
	}
	
	@Override
	public boolean inserisci(Genere g) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Genere getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Genere> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
