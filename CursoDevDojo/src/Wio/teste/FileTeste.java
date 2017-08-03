package Wio.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;
//Como pegar um arquivo e suas informações básicas
public class FileTeste {
	public static void main(String[] args) {
		File file = new File("Arquivo.txt");
		try {
			//boolean newFile = file.createNewFile();// Se criar imprimira true se não false
			//System.out.println(newFile);

			System.out.println(file.createNewFile());
			System.out.println(file.exists());
			boolean exists = file.exists();
			System.out.println("Permissão de leitura? "+file.canRead());
			System.out.println("Path? "+file.getPath());
			System.out.println("AbsolutePath? "+file.getAbsolutePath());
			System.out.println("Diretorio: "+file.isDirectory());
			System.out.println("Oculto: "+file.isHidden());
			System.out.println("Modificado pela ultima vez: "+file.lastModified());//Não mostra a data
			System.out.println("Modificado pela ultima vez: "+new Date(file.lastModified()));//Mostra a data
			if(exists){
				System.out.println("Deletado? "+file.delete());
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
