package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		//Adcina a lista metodo add
		nomes.add("Elaine");
		nomes.add("Tia Beli");
		nomes.add("Tico");
		nomes.add("Grabriele");
		nomes.add("Eu");
		nomes.add("Bebe");
		
		nomes.set(1, "Vovó Mari");// alteração
		System.out.println(nomes);
		
		Collections.sort(nomes); // ordena por ordem alfabética
		
		System.out.println(nomes);
		
		nomes.remove(4);//remove o indice
		
		int posicao = nomes.indexOf("Eu");// verfica o indice do elemento
		
		System.out.println(posicao);
		
		nomes.remove("Tia Beli");//remove o elemento
		
		System.out.println(nomes);
		
		String nome = nomes.get(1);
		
		System.out.println(nome);
		
		int tamanho = nomes.size();//conta o tamanho da lista
		
		System.out.println(tamanho);
		
		nomes.remove(3);
		
		int tamanho2 = nomes.size();
		System.out.println(tamanho2);
		
		System.out.println(nomes);
		
		boolean temOzeias = nomes.contains("Ozeias");
		System.out.println(temOzeias);
		
		boolean temEU =nomes.contains("Eu");
		System.out.println(temEU);
		
		nomes.clear(); // limpa a lista
		
		boolean listaEstaVazia = nomes.isEmpty();//verifica se está vazia
		
		System.out.println(listaEstaVazia);
		
		//Iteração for each, nativo da linguagem
		for(String nomeDoItem: nomes) {
			System.out.println("--->" + nomeDoItem);
		}
		
		//Iteração com while através do objeto Iterator
		Iterator<String> iterator = nomes.iterator();
		while (iterator.hasNext()) {
			System.out.println("---->" + iterator.next());
		}
	}

}
