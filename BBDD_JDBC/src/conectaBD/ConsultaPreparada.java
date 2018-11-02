package conectaBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultaPreparada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* VENTAJAS
		 * - PERMITEN PASAR PARAMETROS A LAS SENTENCIAS SQL
		 * - PREVIENEN DE ATAQUES DE INYECCION SQL
		 * - TIENEN UN MEJOR RENDIMIENTO (SON SENTENCIAS PRECOMPILADAS Y REUTILIZABLES)*/
		
		try {
			
		// 1. CREAR CONEXIÓN
			
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas?autoReconnect=true&useSSL=false", "root", "");
			
		// 2. PREPARAR CONSULTA
			
			PreparedStatement miSentencia = miConexion.prepareStatement("SELECT NOMBREARTÍCULO, "
					+ "SECCIÓN, PAÍSDEORIGEN FROM PRODUCTOS WHERE SECCIÓN=? AND PAÍSDEORIGEN=?");
		
		// 3. ESTABLECER PARÁMETROS DE CONSULTA
			
			miSentencia.setString(1, "deportes");
			miSentencia.setString(2, "USA");
		
		// 4. EJECUTAR Y RECORRER CONSULTA
			
			ResultSet rs = miSentencia.executeQuery();
			
			System.out.println("EJECUCIÓN PRIMERA CONSULTA\n");
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + " - " 
						+ rs.getString(3));
			}
			
			rs.close();
			
		// 5. REUTILIZACIÓN DE CONSULTA SQL
			
			miSentencia.setString(1, "cerámica");
			miSentencia.setString(2, "China");
			
			rs = miSentencia.executeQuery();
			
			System.out.println("\nEJECUCIÓN SEGUNDA CONSULTA\n");
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " - " 
						+ rs.getString(3));
			}
			
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("NO CONECTA!!");
			
			e.printStackTrace();
		}
		
	}

}
