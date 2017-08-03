package Wio.teste;

import java.io.File;
import java.io.IOException;

public class FeleDiretorioTeste {
	public static void main(String[] args) throws IOException{
		/*
		File diretorio = new File("folder");
		boolean mkdir = diretorio.mkdir();// Para criar diretorio

		System.out.println("Diretorio criado com sucesso!"+mkdir);

		//Criar um arquivo dentro do folder
		//File arquivo = new File("C:\\Users\\Eduardo\\workspace\\CursoDevDojo\\folder\\arquivo.txt");// ou passar o diretorio
		File arquivo = new File(diretorio,"arquivo.txt");
		boolean newFile = arquivo.createNewFile();
		System.out.println("Arquivo criado com sucesso! "+newFile);

		//Renomear arquivo
		File arquivoNovoNome = new File(diretorio,"arquivo renomedo.txt");
		boolean renamed = arquivo.renameTo(arquivoNovoNome);
		System.out.println("Renomeado "+renamed);

		//Renomear Diretorio
		File diretorioRenomeado = new File("folder2");
		boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
		System.out.println("Diretorio Renomeado "+diretorioRenamed);
		 */
		buscarArquivos();
	}

	public static void buscarArquivos(){
		//File file = new File("folder2");//Mostra os arquivos dentro do folder2
		File file = new File("C:\\Users\\Eduardo\\workspace\\CursoDevDojo");//Mostra todos arquivos
		String[] list = file.list();
		for(String arquivo : list){
			System.out.println(arquivo);
		}
	}
}
