package br.com.sistemaEcommerce.main;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import br.com.sistemaEcommerce.model.dao.ClienteDao;
import br.com.sistemaEcommerce.model.dao.ClienteDaoImpl;

public class Principal {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Inicializando o serviço");
			
			LocateRegistry.createRegistry(1099);
			Naming.rebind(ClienteDao.NOME_SERVICO, new ClienteDaoImpl());
			
			System.out.println("Serviço ativo!");
			
		} catch(Exception e) {
			System.out.println("Erro ao tentar inicializar o serviço: "+ e.getMessage());
		}
		
	}
	
}
