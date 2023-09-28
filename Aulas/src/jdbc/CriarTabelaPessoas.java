package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		Statement stmt = conexao.createStatement();
		
		String sql = """
				
				CREATE TABLE IF NOT EXISTS pessoas (
					cod INT AUTO_INCREMENT PRIMARY KEY,
					nome VARCHAR(80) NOT NULL
				);
				
				""";		
		
		stmt.execute(sql);
		
		System.out.println("Tabela Criada com sucesso");
		conexao.close();
		
	}

}
