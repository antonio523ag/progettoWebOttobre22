package org.elis.util;

public interface UtilServletPath {
	
	String GENERIC="";
	
	String HOME=GENERIC+"home";
	String REGISTRAZIONE=GENERIC+"registrazione";
	String LOGIN=GENERIC+"login";
	String LOGOUT=GENERIC+"logout";
	
	String UTENTE=GENERIC+"user/";
	String HOME_UTENTE=UTENTE+"home";
	String PROFILO=UTENTE+"profilo";
	
	String ADMIN=GENERIC+"admin/";
	String HOME_ADMIN=ADMIN+"home";
	
	String FILM_ADMIN=ADMIN+"film/";
	String VISUALIZZA_FILM=FILM_ADMIN+"visualizza";
	String AGGIUNGI_FILM=FILM_ADMIN+"aggiungi";
	String MODIFICA_FILM=FILM_ADMIN+"modifica";
	String RIMUOVI_FILM=FILM_ADMIN+"rimuovi";
	
	String UTENTE_ADMIN=ADMIN+"utente/";
	String VISUALIZZA_UTENTI=UTENTE_ADMIN+"visualizza";
	String AGGIUNGI_UTENTI=UTENTE_ADMIN+"aggiungi";
	String MODIFICA_UTENTI=UTENTE_ADMIN+"modifica";
	String RIMUOVI_UTENTI=UTENTE_ADMIN+"rimuovi";
	

}
