package loja_virtual_repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		
   Connection conexao = DriverManager.getConnection(
		"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC",
		"root","123456");
	 
   conexao.close();   
}

}