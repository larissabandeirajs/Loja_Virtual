package loja_virtual_repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import loja_virtual_repository_jdbc_factory.ConnectionFactory;



public class TestaRemocao {
	
	public static void main(String[] args) throws SQLException {
		
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conexao = connectionFactory.recuperarConexao();
		
		PreparedStatement stm = conexao.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");
		stm.setInt(1, 2);
		stm.execute();
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhsa modificadas: " +linhasModificadas);
		
	}

}
