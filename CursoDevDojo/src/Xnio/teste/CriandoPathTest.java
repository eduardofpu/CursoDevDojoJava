package Xnio.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
//Utilizar os mesmos metodos para criar diretorio porem com a classe Path,Paths e Files
public class CriandoPathTest {
	public static void main(String[] args) {
		Path p1 = Paths.get("C:\\Users\\Eduardo\\workspace\\CursoDevDojo\\arquivo.txt");
		Path p2 = Paths.get("C:\\Users\\Eduardo\\workspace\\CursoDevDojo","arquivo.txt");
		Path p3 = Paths.get("C:","\\Users\\Eduardo\\workspace\\CursoDevDojo","arquivo.txt");
		Path p4 = Paths.get("C:","Users","Eduardo","workspace","CursoDevDojo","arquivo.txt");

		System.out.println(p4.toAbsolutePath());
		File file = p4.toFile();
		Path path = file.toPath();

		//Criar diretorio
		Path path1 = Paths.get("pasta1");
		Path path2 = Paths.get("pasta1\\subpasta1\\subsubpasta1\\");
		//Path path2 = Paths.get("pasta1\\subpasta1\\susubpasta1");
		Path arquivo = Paths.get("pasta1\\subpasta1\\subsubpasta1\\file.txt");

		try {
			//if(Files.notExists(path2));
			//Files.createDirectories(path1);
			if(Files.notExists(path2.getParent()));
			Files.createDirectories(path2.getParent());// cria diretorio

			if(Files.notExists(arquivo))
				Files.createFile(arquivo); // cria arquivo
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Path source = Paths.get("folder2\\arquivo.txt");
		Path target = Paths.get(path2.toString()+"\\arquivoCopiado.txt");
		try {
			Files.copy(source,target,StandardCopyOption.REPLACE_EXISTING);//Para sobrescrever o arquivo
			Files.deleteIfExists(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}









	}
}
