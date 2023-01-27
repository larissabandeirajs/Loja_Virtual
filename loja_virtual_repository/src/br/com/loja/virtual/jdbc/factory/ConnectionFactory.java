package br.com.loja.virtual.jdbc.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource; 
 

public class ConnectionFactory {
	
	public Connection recuperarConexao() throws SQLException {		
		 return DriverManager.getConnection(
					"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC",
					"root","123456");
	}
 
}
