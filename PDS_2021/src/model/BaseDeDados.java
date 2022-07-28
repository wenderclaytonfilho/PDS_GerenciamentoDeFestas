package model;

import java.util.ArrayList;

import methods.Validador;
import view.Mensagem;

public class BaseDeDados {
	
	private static ArrayList<Cliente> clientes;
	private static ArrayList<Festa> festas;
	
	public static void inicializarBaseDeDados() {
		clientes = new ArrayList<Cliente>();
		festas = new ArrayList<Festa>();
		System.out.println("Base iniciada!");
	}

	public static Cliente buscarCliente(String cpf) //throws ClienteException
	{
		for (Cliente cliente_1 : clientes) {
			if (cliente_1.getCpf().equals(cpf)) {
				return cliente_1;
			}
		}
		return null;//throw new ClienteException(TipoErro.NAO_EXISTE_CLIENTE);
	}
	public static Festa buscarFesta(Festa festa){
		for (Festa festa_1 : festas) {
			if (festa_1.equals(festa)) {
				return festa_1;
			}
		}
		return null;//throw new ClienteException(TipoErro.NAO_EXISTE_CLIENTE);
	}
	
	public static Cliente buscarCliente(Cliente cliente) throws ClienteException {
		for (Cliente cliente_1 : clientes) {
			if (cliente_1.equals(cliente)) {
				return cliente_1;
			}
		}
		throw new ClienteException(TipoErro.NAO_EXISTE_CLIENTE);
	}
	public static boolean isCliente(Cliente cliente) {
		return clientes.contains(buscarCliente(cliente.getCpf()));
			
	}
	public static boolean isFesta(Festa festa) {
		return festas.contains(buscarFesta(festa));
			
	}
	public static boolean adicionarCliente(Cliente cliente) throws ClienteException, CPFException {
		if (cliente == null) {
			throw new ClienteException(TipoErro.NULL_CLIENTE);
		} else if (!isCliente(cliente)) {
			if (Validador.validarCPF(cliente.getCpf())) {
				Mensagem.exibirMensagem("Cliente adicionado com sucesso");
				return clientes.add(cliente);
			}
		} else {
				throw new ClienteException(TipoErro.EXISTE_CLIENTE);
			}
			return false;
	}
	public static boolean adicionarFesta(Festa festa) throws FestaException {
		if (festa == null) {
			throw new FestaException(TipoErro.NULL_FESTA);
		} else if (!isFesta(festa)) {
				Mensagem.exibirMensagem("Festa adicionada com sucesso");
				return festas.add(festa);
			} else {
				throw new FestaException(TipoErro.EXISTE_FESTA);
			}
	}
		
	public static boolean atualizarFesta(Cliente ClienteOld, Cliente ClienteNew) throws ClienteException{
		if(ClienteOld!=null && ClienteNew!=null) {
			if (!isCliente(ClienteNew)) {
				clientes.set(clientes.indexOf(buscarCliente(ClienteOld.getCpf())), ClienteNew);
		        return true;
			}else {
				throw new ClienteException(TipoErro.EXISTE_CLIENTE);
			}	
		}else {
			throw new ClienteException(TipoErro.NULL_CLIENTE);
		}
	}
	public static boolean atualizarFesta(Festa festaOld, Festa festaNew) throws FestaException{
		if(festaOld!=null && festaNew!=null) {
			if (!isFesta(festaNew)) {
				festas.set(festas.indexOf(buscarFesta(festaOld)), festaNew);
				return true;
			}else {
				throw new FestaException(TipoErro.EXISTE_FESTA);
			}
		}else {
			throw new FestaException(TipoErro.NULL_FESTA);
		}
		//return false;
	}
	public static boolean removerCliente(Cliente cliente) throws ClienteException {
		if (cliente != null) {
			if(isCliente(cliente)) {
				return clientes.remove(cliente);
			}
		}
		throw new ClienteException(TipoErro.NAO_EXISTE_CLIENTE);
	}
	public static boolean removerFesta(Festa festa) throws FestaException {
		if (festa != null) {
			if(isFesta(festa)) {
				return festas.remove(festa);
			}
		}
		throw new FestaException(TipoErro.NAO_EXISTE_FESTA);
	}

	public static void getClientes() {
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

	public static void getFestas() {
		for (Festa festa : festas) {
			System.out.println(festa);
		}
	}
	
}
