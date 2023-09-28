package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application{

	private Stage janela;
	private Scene passo1, passo2, passo3; 
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();
		
	}
	
	private void criarPasso1() {
		Button proximoPasso = new Button("Ir para o Passo 2 >>");
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard :: Passo 02");
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
		
		passo1 = new Scene(box, 400, 400);
	}
	
	private void criarPasso2() {
		Button passoAnterior = new Button("<< Voltar para o Passo 1");
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo1);
			janela.setTitle("Wizard :: Passo 01");
		});
		Button proximoPasso = new Button("Ir para o Passo 3 >>");
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo3);
			janela.setTitle("Wizard :: Passo 03");
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);		
		box.getChildren().add(proximoPasso);
		
		passo2 = new Scene(box, 400, 400);
	}
	
	private void criarPasso3() {
		Button proximoPasso = new Button("<< Voltar para o Passo 2");
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard :: Passo 02");
		});
		
		Button finalizar = new Button("Finalizar");
		finalizar.setOnAction(e -> {
			System.exit(0);
			//janela.close();
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
		box.getChildren().add(finalizar);
		
		passo3 = new Scene(box, 400, 400);
	}
	
}
