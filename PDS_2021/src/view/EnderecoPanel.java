package view;

import java.awt.BorderLayout;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import util.SpringUtilities;

public class EnderecoPanel extends JPanel {
	private JLabel rua, numero, bairro, cidade, estado, cep;
	private JTextField ruaF, numeroF, bairroF, cidadeF, estadoF;
	private JFormattedTextField cepF;
	private JButton addEndereco;
	private JPanel mainPanel, buttonPanel;

	public EnderecoPanel() {
		setLayout(new BorderLayout());

		rua = new JLabel("Rua:");
		ruaF = new JTextField();
		numero = new JLabel("Número:");
		numeroF = new JTextField();
		bairro = new JLabel("Bairro:");
		bairroF = new JTextField();
		cidade = new JLabel("Cidade:");
		cidadeF = new JTextField();
		estado = new JLabel("Estado:");
		estadoF = new JTextField();
		cep = new JLabel("CEP:");
		try {
			cepF = new JFormattedTextField(new MaskFormatter("#####-###"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		addEndereco = new JButton("Adicionar Endereço");
		mainPanel = new JPanel(new SpringLayout());
		mainPanel.add(rua);
		mainPanel.add(ruaF);
		mainPanel.add(numero);
		mainPanel.add(numeroF);
		mainPanel.add(bairro);
		mainPanel.add(bairroF);
		mainPanel.add(cidade);
		mainPanel.add(cidadeF);
		mainPanel.add(estado);
		mainPanel.add(estadoF);
		mainPanel.add(cep);
		mainPanel.add(cepF);
		SpringUtilities.makeCompactGrid(mainPanel,6,2,1,1,1,1);
		add(mainPanel, BorderLayout.CENTER);
		add(addEndereco,BorderLayout.SOUTH);
	}

}
