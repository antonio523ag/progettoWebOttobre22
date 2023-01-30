package org.elis.servlet.generic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.elis.dao.DaoFactory;
import org.elis.model.Utente;
import org.elis.util.UtilKey;
import org.elis.util.UtilServletPath;


@WebServlet("/"+UtilServletPath.REGISTRAZIONE)
public class RegistrazioneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome=request.getParameter(UtilKey.NOME);
		String cognome=request.getParameter(UtilKey.COGNOME);
		String email=request.getParameter(UtilKey.EMAIL);
		String password=request.getParameter(UtilKey.PASSWORD);
		String passwordRipetuta=request.getParameter(UtilKey.PASSWORD_RIPETUTA);
		HttpSession session=request.getSession();
		if(nome!=null&&!nome.trim().isEmpty()&&
				cognome!=null&&!cognome.trim().isEmpty()&&
				email!=null&&!email.trim().isEmpty()&&
				password!=null&&!password.trim().isEmpty()
				&&password.equals(passwordRipetuta)) {
			Utente u=new Utente(nome, cognome, email, password, 0);
			if(DaoFactory.getDaoFactory().getUtenteDAO().inserisci(u)) {
				session.setAttribute(UtilKey.MESSAGGIO, "utente registrato con successo");
			}else {
				session.setAttribute(UtilKey.MESSAGGIO, "email già presente!");
			}
		}else {
			session.setAttribute(UtilKey.MESSAGGIO, "compila i campi per effettuare una registrazione");
		}
		response.sendRedirect(request.getContextPath()+"/"+UtilServletPath.HOME);
	}

}
