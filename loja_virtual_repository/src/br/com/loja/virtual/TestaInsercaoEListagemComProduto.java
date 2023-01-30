package br.com.loja.virtual;

import java.sql.Connection;

import java.sql.SQLException;

import java.util.List;

import br.com.loja.virtual.DAO.ProdutoDAO;
import br.com.loja.virtual.jdbc.factory.ConnectionFactory;
import br.com.loja.virtual.modelo.Produto;

public class TestaInsercaoEListagemComProduto {
/**
 * 
 * @param args
 * @throws SQLException
 * @author Larissa
 * @return class de inserção de produtos no banco de dados e listagem desses produtos
 */
	
	public static void main(String[] args) throws SQLException {

		Produto comoda = new Produto("Comoda", "Comoda Vertical");

		try (Connection conexao = new ConnectionFactory().recuperarConexao()) {
			ProdutoDAO ProdutoDao = new ProdutoDAO(conexao);
			ProdutoDao.salvar(comoda);
			List<Produto> listaDeProdutos = ProdutoDao.listar();
			listaDeProdutos.stream().forEach(lp -> System.out.println(lp));
		}
		System.out.println(comoda);
	}

}
