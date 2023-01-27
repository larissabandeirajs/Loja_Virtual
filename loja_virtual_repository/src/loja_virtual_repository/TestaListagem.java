package loja_virtual_repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TestaListagem {
	
	public static void main(String[] args) throws SQLException {
		
		   Connection conexao = DriverManager.getConnection(
				"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC",
				"root","123456");
			 
		   Statement stm = conexao.createStatement();
		   stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		   
		  ResultSet rst = stm.getResultSet();
		  
		  while (rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println("ID: " + id);
			String nome = rst.getString("NOME");
			System.out.println("NOME: " +nome);
			String descricao = rst.getString("DESCRICAO");
			System.out.println("DESCRIÇÃO:" + descricao);
		}
		  
		  	conexao.close();   
		}
	}
 
