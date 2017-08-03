package Xnio.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Array;

public class CriarDiretorio {

	public static void main(String[] args) {
		//Path path = Paths.get("C:\\Diretorio");// Pasta Diretorio criada
		// arquivo = Paths.get("C:\\Diretorio\\nomes.txt");// arquivo nomes.txt criado dentro da pasta Diretorio
		
		Path path = Paths.get("Diretorio");// Pasta Diretorio criada
		Path arquivo = Paths.get("Diretorio\\nomes.txt");// arquivo nomes.txt criado dentro da pasta Diretorio
		try{
		if(Files.notExists(path))
		Files.createDirectory(path);
		System.out.println("Diretorio Criado com sucesso");
		
		if(Files.notExists(arquivo))
			Files.createFile(arquivo);
			System.out.println("Arquivo Criado com sucesso");
			
			
			//File file = new File("C:\\Diretorio\\nomes.txt");// Buscar o arquivo nomes.txt para escrever nele
			File file = new File("Diretorio\\nomes.txt");// Buscar o arquivo nomes.txt para escrever nele
			
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));
			
			Scanner in = new Scanner(System.in);
			System.out.println("Digite uma mensagem: ");
			String msg = in.nextLine();
			
			bw.write(msg);
			bw.newLine();//Pula uma linha
			
			bw.flush();
		
			System.out.println("Uma mensagem foi escrita = "+msg);			
			
			FileReader fr = new FileReader(file);//Para ler os dados no arquivo nomes.txt
					
			char[] ler = new char[500];		
			
		    fr.read(ler);
		    System.out.println("Leitura de Dados: No arquivo nomes.txt");
		    for(char dados : ler){	
		    	 
		    		//Para não imprimir quadradinhos vazios
		    		if(dados!=0)
		    			System.out.print(dados);
		    		else
		    			break;
		    	
		    }
		
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}
}
