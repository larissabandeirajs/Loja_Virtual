package loja_virtual_repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		try (Connection conexao = connectionFactory.recuperarConexao()) {

			conexao.setAutoCommit(false); // controlando

			try (PreparedStatement stm = conexao.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
					Statement.RETURN_GENERATED_KEYS);) {
				adicionarVariavel("SmartTV", "45 polegadas", stm);
				adicionarVariavel("Radio", "Radio bluetooth", stm);

				conexao.commit();

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO");
				conexao.rollback();
			}
		}
	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);

//		if(nome.equals("Radio")) {
//			throw new RuntimeException("Nao foi possivel adicionar o produto");
//		}

		stm.execute();

		try (ResultSet rst = stm.getGeneratedKeys()) {
			while (rst.next()) {
				Integer id = rst.getInt(1);
				System.out.println("O ID criado foi: " + id);
			}
		}
	}

}
