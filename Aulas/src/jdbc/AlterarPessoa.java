package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarPessoa {
	
	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		System.out.println("Informe o Cod do usuario: ");
		int codigo = entrada.nextInt();
		
		String select = "SELECT * FROM pessoas WHERE cod = ?";
		String update = "UPDATE pessoas SET nome = ? WHERE cod = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println(pessoa.getName());
			entrada.nextLine();
			stmt.close();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();			
			
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			stmt.close();
			
			System.out.println("Pessoa Alterada com sucesso");
			
		} else {
			System.out.println("Pessoa não encontrada");
		}
		
		conexao.close();
		entrada.close();
		
	}

}
