package br.com.loja.virtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.loja.virtual.jdbc.CategoriaDAO;
import br.com.loja.virtual.jdbc.factory.ConnectionFactory;
import br.com.loja.virtual.modelo.Categoria;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {
		 
		try(Connection conexao = new ConnectionFactory().recuperarConexao()){
			CategoriaDAO categoriaDAO = new CategoriaDAO(conexao); 
			List<Categoria> listaDeCategorias = categoriaDAO.listar();
			listaDeCategorias.stream().forEach(ct -> System.out.println(ct.getNome()));
		}
		
		
	}

}
