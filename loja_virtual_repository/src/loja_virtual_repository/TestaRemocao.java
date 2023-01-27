package loja_virtual_repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class TestaRemocao {
	
	public static void main(String[] args) throws SQLException {
		
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conexao = connectionFactory.recuperarConexao();
		
		Statement stm = conexao.createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE ID = 6");
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println("Quantidade de linhsa modificadas: " +linhasModificadas);
		
	}

}
