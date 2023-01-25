package org.elis.dao.intefaces;

import java.util.List;

import org.elis.model.Genere;

public interface GenereDAO {
	public boolean inserisci(Genere g);
	public Genere getById(long id);
	public List<Genere> getAll();
}
