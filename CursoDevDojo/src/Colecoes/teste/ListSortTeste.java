package Colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();

		nomes.add("Bruno");
		nomes.add("Carlos");
		nomes.add("Adriana");

		Collections.sort(nomes);
		int size = nomes.size();
		for(int i=0;i<size;i++){

			System.out.println(nomes.get(i));
		}
		for(String nome : nomes){
			System.out.println(nomes);
		}

	}
}
