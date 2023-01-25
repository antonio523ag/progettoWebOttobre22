package org.elis.util;

public interface UtilJSPPath {
	String PATH="/WEB-INF/jsp/";
	String GENERIC=PATH+"generic/";
	String HOME=GENERIC+"Home.jsp";
	String UTENTE=PATH+"utente/";
	String PROFILO=UTENTE+"Profilo.jsp";
	String HOME_UTENTE=UTENTE+"Home.jsp";
	String ADMIN=PATH+"admin/";
	String HOME_ADMIN="Home.jsp";
	String USER=ADMIN+"utente/";
	String MODIFICA_UTENTE=USER+"Modifica.jsp";
	String VISUALIZZA_UTENTI=USER+"Visualizza.jsp";
	String FILM=ADMIN+"film/";
	String MODIFICA_FILM=FILM+"Modifica.jsp";
	String VISUALIZZA_FILM=FILM+"Visualizza.jsp";
	
	String CSS="/css/style.css";
}
