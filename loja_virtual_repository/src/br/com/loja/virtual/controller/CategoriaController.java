package br.com.loja.virtual.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Categoria;

public class CategoriaController {
	
	private CategoriaDAO categoriaDAO;
	
	public categoria controller() {
		new ConnectionFactory().recuperarConexao();
		this.categoriaDAO = new CategoriaDAO(conexao);
	}

	public List<Categoria> listar() {
	 
		return this.categoriaDAO.listar();
	}
}
