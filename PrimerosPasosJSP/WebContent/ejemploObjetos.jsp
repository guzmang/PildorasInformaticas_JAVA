<html>
	<body>
		<h2>Objetos predefinidos JSP</h2>
		Peticion datos del navegador: <%= request.getHeader("User-Agent") %>
		<br/><br/>
		Peticion idioma utilizado: <%= request.getLocale() %>
	</body>
</html>