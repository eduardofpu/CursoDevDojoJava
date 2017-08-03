package Colecoes.teste;

import java.util.ArrayList;
import java.util.List;

import Colecoes.teste.classes.Celular;

public class ListCelularTeste {
	public static void main(String[] args) {
		Celular celular1 = new Celular("Galaxy1 s7","123456");
		Celular celular2 = new Celular("Galaxy2 s7","1234567");
		Celular celular3 = new Celular("Galaxy3 s7","1234568");

		List<Celular>celularList=new ArrayList<>();

		celularList.add(celular1);
		celularList.add(celular2);
		celularList.add(celular3);

		for(Celular celular:celularList){
			System.out.println(celular.getNome());
		}

		int size = celularList.size();
		for(int i=0;i<size;i++){
			System.out.println(celularList.get(2));
		}
	}
}
