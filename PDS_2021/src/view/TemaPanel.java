package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import util.SpringUtilities;

public class TemaPanel extends JPanel{
	private JLabel nome,valorAluguel,corToalha;
	private JTextField nomeF,valorF,corF;
	private JPanel dadosPanel;
	private JButton salvarButton;
	
	public TemaPanel() {
		setLayout(new BorderLayout());
		setBackground(Color.blue);
		
		nome = new JLabel("Nome:");
		nomeF = new JTextField();
		valorAluguel = new JLabel("Valor do Aluguel");
		valorF = new JTextField();
		corToalha = new JLabel("Cor da Toalha");
		corF = new JTextField();
		
		dadosPanel = new JPanel(new SpringLayout());
		dadosPanel.add(nome);
		dadosPanel.add(nomeF);
		dadosPanel.add(valorAluguel);
		dadosPanel.add(valorF);
		dadosPanel.add(corToalha);
		dadosPanel.add(corF);
		SpringUtilities.makeCompactGrid(dadosPanel,3,2,4,4,4,4);	
		add(BorderLayout.CENTER,dadosPanel);
		salvarButton = new JButton("Salvar");
		add(BorderLayout.SOUTH,salvarButton);
	}
	
	
	public JLabel getNome() {
		return nome;
	}
	public void setNome(JLabel nome) {
		this.nome = nome;
	}
	public JLabel getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(JLabel valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public JLabel getCorToalha() {
		return corToalha;
	}
	public void setCorToalha(JLabel corToalha) {
		this.corToalha = corToalha;
	}
	public JTextField getNomeF() {
		return nomeF;
	}
	public void setNomeF(JTextField nomeF) {
		this.nomeF = nomeF;
	}
	public JTextField getValorF() {
		return valorF;
	}
	public void setValorF(JTextField valorF) {
		this.valorF = valorF;
	}
	public JTextField getCorF() {
		return corF;
	}
	public void setCorF(JTextField corF) {
		this.corF = corF;
	}
	
	
}
