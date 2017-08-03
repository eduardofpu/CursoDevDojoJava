package Colecoes.teste;

import java.util.ArrayList;
import java.util.List;

public class ListTeste {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		List<String> nomes2= new ArrayList<>();

		nomes.add("Eduardo Pai");
		nomes.add("Eduardo Filho");
		nomes.add("Luciana");

		nomes.add("Eduardo Pai2");
		nomes.add("Eduardo Filho2");
		nomes.add("Luciana2");

		nomes.addAll(nomes2);// adiciona os nomes2

		nomes.remove(0);// remove o primeiro nome
		nomes.remove("Eduardo Pai");//remove o nome escolhido
		nomes.clear();// remove tudo


		int size = nomes.size();
		for (int i = 0; i < size; i++) {
			System.out.println(nomes.get(i));

		}
		for (String nome : nomes) {
			System.out.println(nomes);

		}
		System.out.println("Contador: "+nomes.size());
	}
}
