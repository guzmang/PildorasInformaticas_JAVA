<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*, java.sql.*, pildorasinformaticas.com.jsptags.Empleado" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	ArrayList<Empleado> datos = new ArrayList<Empleado>();

	Class.forName("com.mysql.jdbc.Driver");

	try {
		Connection miConexion = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/proyecto_jsp?autoReconnect=true&useSSL=false", "root", "");
		Statement miStatement = miConexion.createStatement();
		String instruccionSql = "SELECT * FROM EMPLEADOS";
		ResultSet rs = miStatement.executeQuery(instruccionSql);
		
		while(rs.next()) {
			datos.add(new Empleado(rs.getString(1), rs.getString(2),
								   rs.getString(3), rs.getDouble(4)));
		}
		
		rs.close();
		miConexion.close();
		
	} catch(SQLException e) {
		out.print("Ha habido un error.");
	}
	
	pageContext.setAttribute("losEmpleados", datos);
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.cabecera{
	font-weight:bold;
}
</style>
</head>
<body>
<table border="1">
	<tr class="cabecera">
		<td>Nombre</td>
		<td>Apellido</td>
		<td>Puesto</td>
		<td>Salario</td>
	</tr>
	<c:forEach var="empTemp" items="${losEmpleados}">
		<tr>
			<td>${empTemp.nombre}</td>
			<td>${empTemp.apellido}</td>
			<td>${empTemp.puesto}</td>
			<td>
				<c:choose>
					<c:when test="${empTemp.salario < 40000}">
						${empTemp.salario + 5000}
					</c:when>
					<c:when test="${empTemp.salario >= 40000 && empTemp.salario < 50000}">
						${empTemp.salario + 2000}
					</c:when>
					<c:otherwise>
						${empTemp.salario}
					</c:otherwise>
				</c:choose>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>