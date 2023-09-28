package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		String caminhoCSS = getClass().getResource("/basico/Contador.css").toExternalForm();
		
		VBox boxConteudo = new VBox();
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getStyleClass().add("conteudo");
		
		Label lbTitulo = new Label("Contador");
		lbTitulo.getStyleClass().add("titulo");
		
		Label lbNumero = new Label("0");
		lbNumero.getStyleClass().add("numero");
		
		Button btIncremento = new Button("+");
		btIncremento.getStyleClass().add("botao");
		btIncremento.setOnAction(
			e -> {
				contador ++;
				atualizarLabel(lbNumero);
			}
		);
		
		Button btDecremento = new Button("-");
		btDecremento.getStyleClass().add("botao");
		btDecremento.setOnAction(
			e -> {
				contador --;
				atualizarLabel(lbNumero);
			}
		);
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.BASELINE_CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(btDecremento);
		boxBotoes.getChildren().add(btIncremento);		
		
		boxConteudo.getChildren().add(lbTitulo);
		boxConteudo.getChildren().add(lbNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		Scene principal = new Scene(boxConteudo, 400, 400);
		principal.getStylesheets().add(caminhoCSS);
		principal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		primaryStage.setScene(principal);		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private void atualizarLabel(Label label) {
		label.setText(Integer.toString(contador));
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		label.getStyleClass().remove("branco");
		
		if(contador > 0) {
			label.getStyleClass().add("verde");
		} else if (contador < 0) {
			label.getStyleClass().add("vermelho");
		} else {
			label.getStyleClass().add("branco");
		}
	}
	
}
