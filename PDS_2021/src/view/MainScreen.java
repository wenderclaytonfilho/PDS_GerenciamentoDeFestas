package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainScreen extends JFrame{
	ClientePanel clientePanel;
	TemaPanel temaPanel;
	EnderecoPanel enderecoPanel;
	
	public MainScreen() {
		super("Cadastro");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		 clientePanel = new ClientePanel();
		temaPanel = new TemaPanel();
		enderecoPanel = new EnderecoPanel();
		add(clientePanel, BorderLayout.CENTER);
		setVisible(true);
	}
}
