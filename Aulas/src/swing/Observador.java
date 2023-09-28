package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null);
		
		JButton botao = new JButton("Cadastro");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cadastrado");
			}
		});
		
		JButton botao1 = new JButton("Pesquisa");
		botao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Pesquisado");
			}
		});
		
		JButton botao2= new JButton("Exames");
		botao2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Examinado");
			}
		});
		
		JButton botao3 = new JButton("e-mail");
		botao3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Enviando");
			}
		});
		JButton botao4 = new JButton("teste");
		botao4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Testando");
			}
		});
		
		JButton botao5 = new JButton("sair");
		botao5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Saindo");
			}
		});
		
		janela.add(botao);		
		janela.add(botao1);		
		janela.add(botao2);		
		janela.add(botao3);		
		janela.add(botao4);		
		janela.add(botao5);
		
		janela.setVisible(true);
		
	}

}
