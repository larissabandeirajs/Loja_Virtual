package loja_virtual_repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {
	 
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conexao = connectionFactory.recuperarConexao();
		
		Statement stm = conexao.createStatement();
		boolean resultado = 
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio' )");
		System.out.println(resultado);

	}

}
