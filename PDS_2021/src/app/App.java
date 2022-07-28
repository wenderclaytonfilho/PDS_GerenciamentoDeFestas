package app;

import java.util.Calendar;

import model.BaseDeDados;
import model.CPFException;
import model.Cliente;
import model.ClienteException;
import model.Endereco;

public class App {
	public static void main(String[] args) {
		Endereco endereco = new Endereco("rua das flores", 1,"barroso", "Serra Talhada","PE","44456670");
		Cliente cliente1 = new Cliente("edu","10656660473",endereco, "edu@gmail", "88888888", Calendar.getInstance());
		
		BaseDeDados.inicializarBaseDeDados();
		
		try {
			BaseDeDados.adicionarCliente(cliente1);
		} catch (ClienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CPFException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BaseDeDados.getClientes();
	}

}