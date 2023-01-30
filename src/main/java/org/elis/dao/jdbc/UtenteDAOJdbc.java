package org.elis.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
		return null;
	}

	@Override
	public boolean inserisci(Utente u) {
		String query="insert into utente(nome,cognome,email,password,ruolo) values (?,?,?,?,?)";
		try(Connection c=getConnection();PreparedStatement ps=c.prepareStatement(query)){
			ps.setString(1, u.getNome());
			ps.setString(2, u.getCognome());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPassword());
			ps.setInt(5, u.getRuolo());
			return ps.executeUpdate()==1;
		}catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
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
