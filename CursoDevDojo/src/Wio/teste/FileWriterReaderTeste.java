package Wio.teste;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


//Ler e escrever arquivos
public class FileWriterReaderTeste {
	public static void main(String[] args) {
		File file = new File("arquivo.txt");

		try(FileWriter fw = new FileWriter(file);
				FileReader fr = new FileReader(file)){

			fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha 3");
			fw.flush();// Para garantir que tudo foi para o arquivo

			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("Size: "+size);

			for(char c : in){
				System.out.print(c);
			}

		}catch(IOException e){
			e.printStackTrace();
		}

		/*
		try {
			//FileWriter fw = new FileWriter(file,true);//Para sobresquever o arquivo
			FileWriter fw = new FileWriter(file,true);//Somente vai escreve o arquivo
			fw.write("Escrevendo uma mensagem no arquivo\nE pulando uma linha 3");
			fw.flush();// Para garantir que tudo foi para o arquivo
			fw.close();//Fechar

			FileReader fr = new FileReader(file);
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println("Size: "+size);

			for(char c : in){
				System.out.print(c);
			}
			fr.close();//Fechar
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 */
	}
}
