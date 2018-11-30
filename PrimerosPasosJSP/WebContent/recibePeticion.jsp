<%@ page import="java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	//	Leyendo datos del formulario
	String ciudadFavorita = request.getParameter("ciudadFavorita");
	
	//	Crear la cookie (el nombre de la instancia sera el nombre de la cookie, es decir
	//	el archivo de texto que se va a almacenar en el disco del usuario)
	
	//	Parametros constructor: nombre identificativo de la accion - valor
	//	nomenclatura: nombre sitio web/tematica - valor variable
// 	Cookie laCookie = new Cookie("agenciaViajes.ciudadFavorita", ciudadFavorita);
	Cookie laCookie = new Cookie("agenciaViajes.ciudadFavorita", URLEncoder.encode(ciudadFavorita, "UTF-8"));
	
	//	Vida de la cookie (en segundos)
	laCookie.setMaxAge(365 * 24 * 60 * 60);	// un año segun calculo del parametro
	
	//	Enviar al usuario (para que se guarde en su ordenador)
	response.addCookie(laCookie);
	
%>

Gracias por enviar tus preferencias!

<a href="agenciaViajes.jsp">Ir a la agencia de viajes.</a>

</body>
</html>