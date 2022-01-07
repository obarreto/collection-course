package com.digitalinnovation.map;

import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> estudante = new Hashtable<>();
		
		estudante.put("Ozeias", 33);
		estudante.put("Mariana", 28);
		estudante.put("Rafaela", 18);
		estudante.put("Diego", 44);
		
		System.out.println(estudante);
		
		estudante.put("Ozeias", 42);
		
		//Remove um estudante no indice 0
		System.out.println("Ozeias");
		
		System.out.println(estudante);
		
		//Recupera um estudante no indice 2;
		int idadeEstudante = estudante.get("Mariana");
		
		System.out.println(idadeEstudante);
		
		System.out.println(estudante.size());
		
		//Navega nos registros do mapa
		for(Map.Entry<String, Integer> entry : estudante.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		//Navega nos registros do mapa
		for (String key : estudante.keySet()) {
			System.out.println(key + " --- " + estudante.get(key));
		}
		
		System.out.println(estudante);
	}

}
