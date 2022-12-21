package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco"); //add na posição desejada
		
		System.out.println(list.size()); //tamanho da lista
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------");
		//list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M'); //predicado (função lambda)
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");	//procurar
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // retorna -1 qnd nao encontra o elemento na lista
		
		System.out.println("----------------");// começa com A -- add
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("----------------"); // o primeiro com a letra A
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}
