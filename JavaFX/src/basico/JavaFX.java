package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFX extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Button btA = new Button("A");
		btA.setOnAction(e -> System.out.println("Letra A"));
		Button btB = new Button("B");
		btB.setOnAction(e -> System.out.println("Letra B"));
		Button btC = new Button("S");
		btC.setOnAction(e -> System.exit(0));
		
		HBox box = new HBox();
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(btA);
		box.getChildren().add(btB);
		box.getChildren().add(btC);
		
		Scene principal = new Scene(box, 150, 100);
		
		primaryStage.setScene(principal);
		
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
