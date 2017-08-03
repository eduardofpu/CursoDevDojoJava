package Wio.teste;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLerEGravar {

	public static void main(String[] args) {
		fileGravar();
	}

	private static void fileGravar() {
		//Neste metodo a primeira linha do try ler o arquivo santosdomontjpe
		//e na segunda linha grava o arquivo lido no arquivo dados.jpeg
		try (BufferedInputStream fileGravar = new BufferedInputStream (new FileInputStream("PastaFiles/santosdomont.jpeg"));
				BufferedOutputStream fileGravar1 = new BufferedOutputStream(new FileOutputStream("GravarFiles/dados.jpeg"),4098)) {

			int leitura;
			while((leitura = fileGravar.read())!=-1){
				byte b = (byte) leitura;

				fileGravar1.write(b);
			}

			fileGravar1.flush();

			System.out.println("Dados gravados com sucesso!");
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("Não foi possivel gravar os dados");
		}

	}
}