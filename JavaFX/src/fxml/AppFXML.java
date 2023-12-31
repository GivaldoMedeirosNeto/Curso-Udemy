package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm();		
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(raiz, 280, 230);
		cena.getStylesheets().add(arquivoCSS);
		
		primaryStage.setTitle("Login");
		primaryStage.setResizable(false);
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
