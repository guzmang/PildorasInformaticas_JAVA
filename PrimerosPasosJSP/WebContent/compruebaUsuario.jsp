<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.SQLException" %>
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
	request.setCharacterEncoding("UTF-8");

	String usuario = request.getParameter("usuario");
	String contra = request.getParameter("contra");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection miConexion = null;
	
	try {
		miConexion = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/proyecto_jsp?autoReconnect=true&useSSL=false", "root", "");
		PreparedStatement consultaPreparada = miConexion.prepareStatement("SELECT * FROM " +
				"USUARIOS WHERE USUARIO=? AND CONTRASENA=?");
		consultaPreparada.setString(1, usuario);
		consultaPreparada.setString(2, contra);
		
		ResultSet miResultSet = consultaPreparada.executeQuery();
		
		if(miResultSet.absolute(1)) {
			out.print("Usuario autorizado.");
		} else {
			out.print("No hay usuarios con esos datos.");
		}
		
	} catch(SQLException e) {
		out.print("Ha habido un error.");
	} finally {
		miConexion.close();
	}

%>
	
</body>
</html>