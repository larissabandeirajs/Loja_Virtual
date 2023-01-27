package br.com.loja.virtual;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.loja.virtual.jdbc.factory.ConnectionFactory;

public class TestaConexao {
	
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conexao = connectionFactory.recuperarConexao();
		
		System.out.println("Fechando conexao");
	 
   conexao.close();   
}

}