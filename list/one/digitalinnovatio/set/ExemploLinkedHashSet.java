package one.digitalinnovatio.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();
		//Adiciona as notas no set
		sequenciaNumerica.add(5);
		sequenciaNumerica.add(9);
		sequenciaNumerica.add(7);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(4);
		sequenciaNumerica.add(3);
		sequenciaNumerica.add(6);

		System.out.println(sequenciaNumerica);

		//Remove a nota do set
		sequenciaNumerica.remove(3);

		System.out.println(sequenciaNumerica);

		//Retorna a quantidade de itens do set
		System.out.println(sequenciaNumerica.size());

		//Navega em todos os itens do iterator
		Iterator<Integer> iterator = sequenciaNumerica.iterator();

		while (iterator.hasNext()) {
			System.out.println("--->" + iterator.next());
		}

		for(Integer numero: sequenciaNumerica) {
			System.out.println(numero);
		}

		sequenciaNumerica.clear();

		System.out.println(sequenciaNumerica.isEmpty());
	}
}