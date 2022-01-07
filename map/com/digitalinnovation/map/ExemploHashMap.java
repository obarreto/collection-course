package com.digitalinnovation.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExemploHashMap {

	public static void main(String[] args) {
		
		//O segundo campo Map<K, List<> o segundo campo pode ser uma lista. Sendo possivel busca de um BD ou arquivo csv.
		Map<String, Integer> campeoesMundialFifa = new HashMap<>();
		
		//Adiciona os campeões mundias fifa no mapa
		campeoesMundialFifa.put("Brasil", 5);
		campeoesMundialFifa.put("Alemanha", 4);
		campeoesMundialFifa.put("Itália", 4);
		campeoesMundialFifa.put("Uruguai", 2);
		campeoesMundialFifa.put("Argentina", 2);
		campeoesMundialFifa.put("França", 2);
		campeoesMundialFifa.put("Inglaterra", 1);
		campeoesMundialFifa.put("Espanha", 1);
		
		System.out.println(campeoesMundialFifa);
		
		//Atualiza o valor para a chave Brasil, comportamento ao metodo add. 
		//O put pode receber uma chave e um valor
		campeoesMundialFifa.put("Brasil", 6);
		
		System.out.println(campeoesMundialFifa);
		
		//Retorna a Argentina -retorna o valor 
		System.out.println(campeoesMundialFifa.get("Argentina"));
		
		//Retorna se existe ou não um campeão Franca
		System.out.println(campeoesMundialFifa.containsKey("França"));
		
		//Remove o campeão França
		campeoesMundialFifa.remove("França");
		
		//Retorna se existe ou não alguma seleção hexa campeã
		//Retorna a chave
		System.out.println(campeoesMundialFifa.containsValue(6));
		
		//Retorna o tamanho do mapa
		System.out.println(campeoesMundialFifa.size());
		
		System.out.println(campeoesMundialFifa);
		
		//Navega nos registros do mapa
		for(Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		//Navega nos registros do mapa
		for (String key : campeoesMundialFifa.keySet()) {
			System.out.println(key + " -- " + campeoesMundialFifa.get(key));
		}
		
		System.out.println(campeoesMundialFifa);
		
		//Verifica se o mapa contem a chave Estados Unidos
		System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));
		
		//Verifica se o mapa contem o valor 5
		System.out.println(campeoesMundialFifa.containsValue(5));
		
		//Verifica o tamnho antes e depois de limpar o mapa
		System.out.println(campeoesMundialFifa.size());
		
		campeoesMundialFifa.clear();
		
		System.out.println(campeoesMundialFifa.size());
	}
}
