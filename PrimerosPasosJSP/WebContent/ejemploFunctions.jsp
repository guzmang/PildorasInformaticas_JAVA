<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="datos" value="Ana, López, Directora, 75000"></c:set>
	<c:set var="datosArray" value="${fn:split(datos, ', ')}"></c:set>
	<input type="text" value="${datosArray[0]}"><br>
	<input type="text" value="${datosArray[1]}"><br>
	<input type="text" value="${datosArray[2]}"><br>
	<input type="text" value="${datosArray[3]}"><br>
</body>
</html>