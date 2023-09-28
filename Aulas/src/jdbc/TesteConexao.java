package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException{
		
		String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		String user = "root";
		String pass = "Db4G1v4ld0@85";
		
		Connection conexao = DriverManager.getConnection(url, user, pass);
		
		System.out.println("Conexao efetuada com sucesso!!!");
		criarBanco(conexao);		
		fecharConexao(conexao);
		
	}
	
	private static void criarBanco(Connection conexao) throws SQLException {
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java;");
		//stmt.execute("DROP DATABASE IF EXISTS curso_java;");
		System.out.println("Banco criando com sucesso");
	}
	
	private static void fecharConexao(Connection conexao) throws SQLException {
		conexao.close();
	}

}
