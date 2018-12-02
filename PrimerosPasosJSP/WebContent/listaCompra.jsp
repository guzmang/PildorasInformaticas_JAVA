<%@ page import="java.util.*" %>
<html>
	<body>
		<form name="formularioCompra" action="listaCompra.jsp">
 			<p>Artículos a comprar:</p>
			<p>
			    <label><input type="checkbox" name="articulos" value="agua">
			    	Agua
			    </label><br>
			    <label><input type="checkbox" name="articulos" value="leche">
			    	Leche
			    </label><br>
			    <label><input type="checkbox" name="articulos" value="pan">
		      		Pan
		      	</label><br>
			    <label><input type="checkbox" name="articulos" value="manzanas">
 			    	Manzanas
 			    </label><br>
			    <label><input type="checkbox" name="articulos" value="carne">
 			    	Carne
 			    </label><br>
		        <label><input type="checkbox" name="articulos" value="pescado">
   					Pescado
   				</label>
			</p>
		  	<p>
    			<input type="submit" name="button" id="button" value="Enviar"><br>
		  	</p>
		</form>
		<h2>Carro de la compra:</h2>
		<ul>
			<%
				List<String> listaElementos = (List<String>) session.
					getAttribute("misElementos");
				
				if(listaElementos == null) {	// Creo la sesion
					listaElementos = new ArrayList<String>();
					// Nombre de la sesion y el objeto que quiero que se grabe en ella
					session.setAttribute("misElementos", listaElementos);
				}
				
				String[] elementos = request.getParameterValues("articulos");
				
				if(elementos != null) {
					for(String elemTemp: elementos) {
// 						out.print("<li>" + elemTemp + "</li>");
						listaElementos.add(elemTemp);
					}
				}
				
				for(String elemTemp: listaElementos) {
					out.print("<li>" + elemTemp + "</li>");
				}
				
				/* Otros metodos para sesiones:
					isNew(): si la sesion es nueva, es decir si se acaba de generar o no.
					getId(): id de la sesion con la que el servidor la almacena,
						ya que es unica para cada usuario.
					invalidate(): borra o resetea una sesion con la serie de datos que
						tenga en ese momento durante la navegacion.
					setMaxInactiveInterval(tiempo): da un tiempo de vigencia a la sesion.
					y muchos mas...
				*/
			%>
		</ul>
	</body>
</html>