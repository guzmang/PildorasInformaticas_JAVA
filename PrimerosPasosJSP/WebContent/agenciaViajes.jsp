<%@ page import="java.net.URLDecoder" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align:center">Agencia de viajes</h1>

<%
	//	Valor por defecto (si no hay cookies que leer por entrar la primera vez).
	String ciudadFavorita = "Madrid";

	//	Lee la cookie de la peticion del navegador.
	Cookie[] lasCookies = request.getCookies();
	
	//	Buscar las preferencias (en este caso la ciudad favorita).
	if(lasCookies != null) {
		for(Cookie cookieTemporal: lasCookies) {
			if("agenciaViajes.ciudadFavorita".equals(cookieTemporal.getName())){
// 				ciudadFavorita = cookieTemporal.getValue();
				ciudadFavorita = URLDecoder.decode(cookieTemporal.getValue(), "UTF-8");
				break;
			}
		}
	}
%>

<h3>Vuelos a <%= ciudadFavorita %></h3>

<p>Esto es un texto de ejemplo</p>
<p>Esto es un texto de ejemplo</p>
<p>Esto es un texto de ejemplo</p>

<h3>Hoteles en <%= ciudadFavorita %></h3>

<p>Esto es un texto de ejemplo</p>
<p>Esto es un texto de ejemplo</p>
<p>Esto es un texto de ejemplo</p>

<h3>Descuentos en restaurantes de <%= ciudadFavorita %></h3>

<p>Esto es un texto de ejemplo</p>
<p>Esto es un texto de ejemplo</p>
<p>Esto es un texto de ejemplo</p>

</body>
</html>