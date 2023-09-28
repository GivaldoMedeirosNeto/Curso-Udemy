package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas {
	
	private static String sql = "";
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome da pesquisa");
		String nome = entrada.nextLine();
		
		consultarPessoas(conexao);
		consultarPessoasWhere(conexao, nome);
		
		entrada.close();
		conexao.close();
		
	}

	private static void consultarPessoasWhere(Connection conexao, String nome) throws SQLException {
		sql = "SELECT * FROM PESSOAS WHERE nome like ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + nome + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int cod = resultado.getInt("cod");
			String nomeResult = resultado.getString("nome");
			
			pessoas.add(new Pessoa(cod, nomeResult));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCod() + " ==> " + p.getName());
		}
		
		stmt.close();
		
	}

	private static void consultarPessoas(Connection conexao) throws SQLException {
		sql = "SELECT * FROM PESSOAS";
		
		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(resultado.next()) {
			int cod = resultado.getInt("cod");
			String nome = resultado.getString("nome");
			
			pessoas.add(new Pessoa(cod, nome));
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCod() + " ==> " + p.getName());
		}
		
		stmt.close();
		
	}

}
