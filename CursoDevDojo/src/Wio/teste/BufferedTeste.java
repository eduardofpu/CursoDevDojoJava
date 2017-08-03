package Wio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTeste {

	public static void main(String[] args) {

		File file = new File("arquivo.txt");

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				BufferedReader br = new BufferedReader(new FileReader(file))){
			bw.write("Escrevendo uma mensagem no arquivo");
			bw.newLine();// Pula uma linha independentemente do SO
			bw.write("Pulando uma linha");
			bw.flush();// e so usado para escrita
			// o arquivo e retorna nullo
			String s;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		/*
		 * FileWriter fw = new FileWriter(file);
		FileReader fr = new FileReader(file);
		try {

			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Escrevendo uma mensagem no arquivo");
			bw.newLine();// Pula uma linha independentemente do SO
			bw.write("Pulando uma linha");
			bw.flush();// e so usado para escrita
			bw.close();

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			// o arquivo e retorna nullo
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		 */
	}

}
