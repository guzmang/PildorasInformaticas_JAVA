<%@ page import="java.sql.Statement" %>
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
	// Con esta linea se podran guardar vocales con tildes y la ñ
	request.setCharacterEncoding("UTF-8");

	String nombre = request.getParameter("nombre");
	String apellido = request.getParameter("apellido");
	String usuario = request.getParameter("usuario");
	String contra = request.getParameter("contra");
	String pais = request.getParameter("pais");
	String tecno = request.getParameter("tecnologias");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection miConexion = null;
	
	try {
		miConexion = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/proyecto_jsp?autoReconnect=true&useSSL=false", "root", "");
		Statement miStatement = miConexion.createStatement();
			
		String instruccionSql = "INSERT INTO USUARIOS(Nombre, Apellido, Usuario, Contrasena, "
			+ "Pais, Tecnologia) VALUES('" + nombre + "', '" + apellido + "', '" + usuario +
				"', '" + contra + "', '" + pais + "', '" + tecno + "')";
		miStatement.executeUpdate(instruccionSql);
		
		out.print("Registrado con exito.");
		
	} catch(SQLException e) {
		out.print("Ha habido un error.");
	} finally {
		miConexion.close();
	}
	
%>

</body>
</html>