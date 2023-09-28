package br.com.cod3r.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{
	
	public static void main(String[] args) {
		new Calculadora();
	}

	public Calculadora() {
		
		organizarLayout();
		
		setTitle("Calculadora - Givaldo");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("Calc 48x48.png")));
		setSize(300, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}

	private void organizarLayout() {
		setLayout(new BorderLayout());
		Display display = new Display();
		display.setPreferredSize(new Dimension(300, 60));
		display.setBorder(BorderFactory.createBevelBorder(0));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();	
		add(teclado, BorderLayout.CENTER);
	}
	
}
