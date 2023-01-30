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

@WebServlet("/"+UtilServletPath.LOGIN)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter(UtilKey.EMAIL);
		String password=request.getParameter(UtilKey.PASSWORD);
		String path=request.getContextPath();
		HttpSession session=request.getSession();
		if(email==null||email.trim().isEmpty()||password==null||password.trim().isEmpty()) {
			session.setAttribute(UtilKey.MESSAGGIO, "campi non compilati");
		}else {
			Utente u=DaoFactory.getDaoFactory().getUtenteDAO().login(email, password);
			if(u==null) session.setAttribute(UtilKey.MESSAGGIO, "email e/o password errate");
			else {
				session.setAttribute(UtilKey.UTENTE, u);
				if(u.getRuolo()==0)path+="/"+UtilServletPath.HOME_UTENTE;
				else path+="/"+UtilServletPath.HOME_ADMIN;
			}
		}
		response.sendRedirect(path);
	}

}
