package Serializacao.classe.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Serializacao.classe.Aluno;
import Serializacao.classe.Turma;

public class SerializacaoTeste {
	public static void main(String[] args) {
		gravadorObjeto();
		leitorObjeto();
	}

	public static void gravadorObjeto() {
		Turma t = new Turma("Maratona Java, so para os campeões");

		Aluno aluno = new Aluno(1L, "Eduardo", "1234");
		aluno.setTurma(t);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {

			oos.writeObject(aluno);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void leitorObjeto() {

		try (ObjectInputStream oes = new ObjectInputStream(new FileInputStream("aluno.ser"))) {

			Aluno aluno	= (Aluno)oes.readObject();
			System.out.println(aluno);

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
