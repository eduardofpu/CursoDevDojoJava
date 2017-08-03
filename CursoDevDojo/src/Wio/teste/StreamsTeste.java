package Wio.teste;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamsTeste {

	public static void main(String[] args) {
		//gravador();
		//leitor();
		//gravadorTurnado();
		leitorTurnado();
	}

	private static void gravador() {

		byte[] dados = { 65, 66, 67, 68, 69, 70 };
		//Para escrever OutputStream
		try (FileOutputStream gravador = new FileOutputStream("pasta/stream.txt")) {
			gravador.write(dados);
			System.out.println("Dados gravados com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	//Coloca em memoria depois grava
	private static void gravadorTurnado() {

		byte[] dados = { 65, 66, 67, 68, 69, 70 };
		//Para escrever OutputStream
		try (BufferedOutputStream gravadorBuffer = new BufferedOutputStream (new FileOutputStream("pasta/stream.txt"),4098)){
			gravadorBuffer.write(dados);
			gravadorBuffer.flush();//Força tudo que tiver Bufferizadoa a sair
			System.out.println("Dados gravados com sucesso!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void leitor(){
		//Para ler FileInputStream  quando chegar do final do arquivo retorna -1
		try (FileInputStream leitor = new FileInputStream("pasta/stream.txt")) {

			int leitura;
			while((leitura = leitor.read())!=-1){
				byte b = (byte) leitura;
				System.out.println(""+b);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void leitorTurnado(){
		//Para ler FileInputStream  quando chegar do final do arquivo retorna -1
		try (BufferedInputStream leitorBuffer = new BufferedInputStream(new FileInputStream("pasta/stream.txt"))) {

			int leitura;
			while((leitura = leitorBuffer.read())!=-1){
				byte b = (byte) leitura;
				
				System.out.println(""+b);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
