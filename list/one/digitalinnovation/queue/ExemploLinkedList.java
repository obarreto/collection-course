package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

	public static void main(String[] args) {
		
		Queue<String> filaBanco = new LinkedList<>();
		
		filaBanco.add("Pamela");
		filaBanco.add("Patricia");
		filaBanco.add("Roberto");
		filaBanco.add("Herodoto");
		filaBanco.add("Romildo");
		
		System.out.println(filaBanco);
		
		String clienteAserAtendido = filaBanco.poll();
		
		System.out.println(clienteAserAtendido);
		
		System.out.println(filaBanco);
		
		// filaBanco.clear();
		
		String primeiroCliente = filaBanco.peek();
		
		System.out.println(primeiroCliente);
		
		System.out.println(filaBanco);
		
		
		String primeiroClienteOuErro = filaBanco.element();
		
		System.out.println(primeiroClienteOuErro);
		
		System.out.println(filaBanco);
		
		for (String client: filaBanco) {
			System.out.println(client);
		}
		
		Iterator<String> iteratorFilaBanco = filaBanco.iterator();
		while(iteratorFilaBanco.hasNext()) {
			System.out.println("---->" + iteratorFilaBanco.next());
		}
	}
}
