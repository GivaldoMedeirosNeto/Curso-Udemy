package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	public static Connection getConexao() {
		
		try {
			
			Properties prop = getProperties();
			
			String url = prop.getProperty("banco.url");
			String user = prop.getProperty("banco.usuario");
			String pass = prop.getProperty("banco.senha");
			
			return DriverManager.getConnection(url, user, pass);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";		
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
	
	
}
