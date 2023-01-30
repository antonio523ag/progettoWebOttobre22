<%@page import="org.elis.util.UtilKey"%>
<%@page import="org.elis.util.UtilServletPath"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="<%=request.getContextPath()%>/css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/script.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%	String msg=(String)session.getAttribute(UtilKey.MESSAGGIO);
	String[] msgSplit=null;	  
	if(msg!=null){
		  msgSplit=msg.split("-_-");
		  msg=msgSplit[1];
		  session.removeAttribute(UtilKey.MESSAGGIO);
		  %>
		  <body onload="myFunction2('<%=msgSplit[0]%>','<%=msg%>')">
		  <%
	  }else{
		  msg="";
	%>
<body>
<%} %>
	<div class="sidenav">
	
		<a href="<%=request.getContextPath()%>">
		<img alt="logo elis" src="<%=request.getContextPath()%>/img/GifElis.gif">
		</a>
		<br><br>
		<a onclick="myFunction('login')">Login</a>
		<a onclick="myFunction('registrati')">Registrati</a>
  		
	</div>
	
	
	<div class="main">
			<div>
		<h1 class="msg" id="msg"><%=msg%></h1>
	</div>
	<br><br><br>
		<div>
			<h1 id="title" style='text-align:center'>benvenuto nel sito di streaming dell'ELIS</h1>
		</div>
	
		<div style="display: none" id="registrati">
		
		<div class="form">
		
					<form action="<%=request.getContextPath()+"/"+UtilServletPath.REGISTRAZIONE%>" method="POST">
      <div class="input-container ic1">
        <input id="nome" name="<%=UtilKey.NOME %>" class="input" type="text" placeholder=" " />
        <div class="cut"></div>
        <label for="nome" class="placeholder">nome</label>
      </div>
      <div class="input-container ic1">
        <input id="cognome" name="<%=UtilKey.COGNOME %>" class="input" type="text" placeholder=" " />
        <div class="cut"></div>
        <label for="cognome" class="placeholder">cognome</label>
      </div>
      <div class="input-container ic1">
        <input id="email" name="<%=UtilKey.EMAIL %>" class="input" type="text" placeholder=" " />
        <div class="cut"></div>
        <label for="email" class="placeholder">Email</label>
      </div>
      <div class="input-container ic2">
        <input id="password" name="<%=UtilKey.PASSWORD %>" class="input" type="password" placeholder=" " />
        <div class="cut"></div>
        <label for="password" class="placeholder">password</label>
      </div>
      <div class="input-container ic2">
        <input id="passwordRipetuta" name="<%=UtilKey.PASSWORD_RIPETUTA %>" class="input" type="password" placeholder=" " />
        <div class="cut"></div>
        <label for="passwordRipetuta" class="placeholder">ripeti la Password</label>
      </div>
      <button type="text" class="submit">Registrati</button>
		</form>
    </div>

				
				
			<br>
		</div>
		<div style="display: none" id="login">
			<div class="form form-short">
				<form action="<%=request.getContextPath()+"/"+UtilServletPath.LOGIN%>" method="POST">
      				<div class="input-container ic1">
        				<input id="email" name="<%=UtilKey.EMAIL %>" class="input" type="text" placeholder=" " />
        				<div class="cut"></div>
        				<label for="email" class="placeholder">Email</label>
      				</div>
      				<div class="input-container ic2">
        				<input id="password" name="<%=UtilKey.PASSWORD %>" class="input" type="password" placeholder=" " />
        				<div class="cut"></div>
        				<label for="password" class="placeholder">password</label>
      				</div>
      				<button type="text" class="submit">Login</button>
				</form>
    		</div>
		</div>
	</div>
</body>
</html>