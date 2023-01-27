package loja_virtual_repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class TestaListagem {
	
	public static void main(String[] args) throws SQLException {
		
		   Connection conexao = DriverManager.getConnection(
				"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC",
				"root","123456");
			 
		   Statement stm = conexao.createStatement();
		   boolean resultado = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		   
		   System.out.println(resultado);
		  	conexao.close();   
		}
	}
 
