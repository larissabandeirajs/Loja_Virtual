package loja_virtual_repository;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conexao = connectionFactory.recuperarConexao();
		
		System.out.println("Fechando conexao");
	 
   conexao.close();   
}

}