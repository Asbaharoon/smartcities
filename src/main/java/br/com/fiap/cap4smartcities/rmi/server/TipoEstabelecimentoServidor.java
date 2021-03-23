package br.com.fiap.cap4smartcities.rmi.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class TipoEstabelecimentoServidor {

	public static void main(String[] args) {

		try {

			TipoEstabelecimentoService service = new TipoEstabelecimentoServiceImpl();

			TipoEstabelecimentoService skeleton = (TipoEstabelecimentoService) UnicastRemoteObject.exportObject(service, 0);

			Registry registry = LocateRegistry.createRegistry(7777);

			registry.bind("TipoEstabelecimentoService", skeleton);

			System.out.println("TipoEstabelecimentoService registrado e pronto para aceitar solicita��es.");

		} catch (RemoteException | AlreadyBoundException e) {

			System.out.println("N�o foi poss�vel iniciar o Servidor RMI!");
			e.printStackTrace();
		}

	}
}