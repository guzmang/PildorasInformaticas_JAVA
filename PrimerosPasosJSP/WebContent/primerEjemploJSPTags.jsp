<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	String alumnos[] = {"Antonio", "Sandra", "Maria", "Paco"};
	
	pageContext.setAttribute("losAlumnos", alumnos);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- Sin JSP TAGS -->

<%
//  	for(String alumnoTemp: alumnos) {
//  		out.print(alumnoTemp + "<br>");
//  	}
%>

<!-- Con JSP TAGS -->

<c:forEach var="alumnoTemp" items="${losAlumnos}">
	${alumnoTemp} <br>
</c:forEach>

</body>
</html>