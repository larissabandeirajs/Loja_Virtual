package br.com.loja.virtual.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.loja.virtual.modelo.Categoria;

public class CategoriaDAO {
	
	private Connection conexao;

	public CategoriaDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public List<Categoria> listar() throws SQLException{
		List<Categoria> categorias = new ArrayList<>();
		
		System.out.println("Executando a query de listar categoria");
		
		String sql = "SELECT ID, NOME FROM CATEGORIA";
		
		try(PreparedStatement pstm = conexao.prepareStatement(sql)){
			pstm.execute();
			
			try(ResultSet rst = pstm.getResultSet()){
				while(rst.next()) {
					Categoria categoria =
							new Categoria(rst.getInt(1), rst.getString(2));
					
					categorias.add(categoria);
				}
			}
		}
		return categorias;
	}

}
