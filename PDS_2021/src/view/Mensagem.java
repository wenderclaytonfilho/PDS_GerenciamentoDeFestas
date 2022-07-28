package view;

import javax.swing.JOptionPane;

public class Mensagem extends JOptionPane{
	
	public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
	}

}
