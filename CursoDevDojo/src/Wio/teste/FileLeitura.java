package Wio.teste;

import java.io.FileInputStream;

public class FileLeitura {

	public static void main(String[] args) {
		lerFile();

	}

	private static void lerFile(){

		try(FileInputStream lerFile = new FileInputStream("PastaFiles/santosdomont.jpeg")){

			int leitura;
			while((leitura = lerFile.read())!=-1){
				byte b = (byte)leitura;
				System.out.println(b);
			}
			System.out.println("Leitura de File com sucesso!");


		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
