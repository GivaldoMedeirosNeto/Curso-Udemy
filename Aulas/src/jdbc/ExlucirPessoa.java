package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExlucirPessoa {

public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		System.out.println("Informe o Cod do usuario: ");
		int codigo = entrada.nextInt();
		
		String select = "SELECT * FROM pessoas WHERE cod = ?";
		String delete = "DELETE FROM pessoas WHERE cod = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa pessoa = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println(pessoa.getName());
			entrada.nextLine();
			stmt.close();
			
			System.out.println("Deseja exluir?");
			String valor = entrada.nextLine();
			
			if(valor.toString().equalsIgnoreCase("S")) {
				stmt = conexao.prepareStatement(delete);
				stmt.setInt(1, codigo);
				if(stmt.executeUpdate() > 0) {
					stmt.execute();
					stmt.close();
					System.out.println("Pessoa Excluida com sucesso");
				}				
			} else {
				System.out.println("Pessoa não Excluida");
			}
		} else {
			System.out.println("Pessoa não encontrada");
		}
		
		conexao.close();
		entrada.close();
		
	}

}
