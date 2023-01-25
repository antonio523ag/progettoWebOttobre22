package org.elis.dao.intefaces;

import java.util.List;

import org.elis.model.Utente;

public interface UtenteDAO {
	public Utente login(String email,String password);
	public boolean inserisci(Utente u);
	public boolean modifica(Utente u);
	public Utente getById(long id);
	public boolean cancella(Utente u);
	public List<Utente> getOther(Utente u);
}
