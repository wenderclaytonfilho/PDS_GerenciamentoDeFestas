package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import util.SpringUtilities;

public class ClientePanel extends JPanel {
	private JLabel cadastroL, nomeL, cpfL, enderecoL, emailL, telefoneL;
	private JTextField nome, email;
	private JPanel logoPanel,mainPanel,buttonPanel;
	private JFormattedTextField telefoneF, cpf;
	private JButton cadastrarButton,enderecoButton;

	public ClientePanel() {
		setLayout(new BorderLayout());
		setBackground(Color.white);

		cadastroL = new JLabel("CADASTRAR CLIENTE");
		nomeL = new JLabel("Nome: ");
		nome = new JTextField();

		cpfL = new JLabel("CPF: ");
		try {
			cpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			cpf.setColumns(10);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		enderecoL = new JLabel("Endereco");
		enderecoButton = new JButton("Adicionar Endereço");
		emailL = new JLabel("Email: ");
		email = new JTextField();

		telefoneL = new JLabel("Telefone: ");
		try {
			telefoneF = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
			telefoneF.setColumns(10);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		logoPanel = new JPanel();
		logoPanel.add(cadastroL);
		//Panel Building
		
		mainPanel= new JPanel(new SpringLayout());
		mainPanel.add(nomeL);
		mainPanel.add(nome);
		mainPanel.add(cpfL);
		mainPanel.add(cpf);
		mainPanel.add(enderecoL);
		mainPanel.add(enderecoButton);
		mainPanel.add(emailL);
		mainPanel.add(email);
		mainPanel.add(telefoneL);
		mainPanel.add(telefoneF);
		SpringUtilities.makeCompactGrid(mainPanel,5,2,4,4,4,4);
		
		buttonPanel = new JPanel();
		cadastrarButton = new JButton("Cadastrar");
		buttonPanel.add(cadastrarButton);
		
		add(logoPanel,BorderLayout.NORTH);
		add(mainPanel,BorderLayout.CENTER);
		add(buttonPanel,BorderLayout.SOUTH);

	}
	
	
}
