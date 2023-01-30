package br.com.loja.virtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.loja.virtual.jdbc.ProdutoDAO;
import br.com.loja.virtual.jdbc.factory.ConnectionFactory;
import br.com.loja.virtual.modelo.Produto;

public class TestaInsercaoComProduto {

	public static void main(String[] args) throws SQLException {

		Produto comoda = new Produto("Comoda", "Comoda Vertical");

		try (Connection conexao = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO ProdutoDao = new ProdutoDAO(conexao);
			ProdutoDao.salvar(comoda);
			// Lista = persistenciaProduto.listar();
		}
		System.out.println(comoda);
	}

}
