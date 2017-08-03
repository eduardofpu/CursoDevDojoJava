package Colecoes.teste;

import Colecoes.teste.classes.Celular;

public class EqualsTeste {
	public static void main(String[] args) {
		String nome1 = "Luciana";
		String nome2 = new String("Luciana");
		Celular c1 = new Celular("iphone", "1234");
		Celular c2 = new Celular("iphone", "1234");

		System.out.println(nome1.equals(nome2));
		System.out.println(c1.equals(c2));

	}
}
