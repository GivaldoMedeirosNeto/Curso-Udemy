package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("aluno@cod3r.com.br");
		boolean senhaValido = campoSenha.getText().equals("123456789");
		
		if(emailValido && senhaValido){
			Notifications.create()
				.position(Pos.TOP_CENTER)
				.title("Login FXML")
				.text("Login efetuado com Sucesso")
				.showConfirm();
		} else {
			Notifications.create()
				.position(Pos.TOP_CENTER)
				.title("Login FXML")
				.text("Login ou Senha Inválida")
				.showWarning();
		}
	}
	
	public void sair() {
		System.exit(0);
	}

}
