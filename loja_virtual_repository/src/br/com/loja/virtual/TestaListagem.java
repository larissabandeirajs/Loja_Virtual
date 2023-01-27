package br.com.loja.virtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.loja.virtual.jdbc.factory.ConnectionFactory;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conexao = connectionFactory.recuperarConexao();

		PreparedStatement stm = conexao.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO ");
		stm.execute();

		ResultSet rst = stm.getResultSet();

		while (rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println("ID: " + id);
			String nome = rst.getString("NOME");
			System.out.println("NOME: " + nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println("DESCRICAO:" + descricao);
		}

		conexao.close();
	}
}
