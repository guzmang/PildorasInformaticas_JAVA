package procAlmacenado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

// Usamos stored procedures para dejarle el trabajo al servidor para que ejecute las consultas

public class ConsultaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?autoReconnect=true&useSSL=false", "root", "");
			
			// En prepareCall envio el nombre del sp en mi BBDD
			CallableStatement miSentencia = miConexion.prepareCall("{call MUESTRA_CLIENTES}");
			
			ResultSet rs = miSentencia.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
