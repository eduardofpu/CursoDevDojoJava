package Xnio.teste;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipandoTeste {
	public static void main(String[] args) {
		Path dirZip = Paths.get("pasta/subpasta");
		Path dirFiles = Paths.get("pasta/subpasta/subsubpasta");
		Path zipFile = dirZip.resolve("arquivo.zip"); // junta as duas pastas coloca o arquivo zip na subpasta
		try(ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFile.toFile()));// criar o arquivo zip nesta linha
				DirectoryStream<Path> stream = Files.newDirectoryStream(dirFiles)){ // Vai zipar a subsubpasta

			for(Path path : stream){
				//System.out.println(path);// para ver se criou o arauivo zip
				//Criar entradas para pasta zip

				// Entre dentro deste zip
				zip.putNextEntry(new ZipEntry(path.getFileName().toString()));// preparar a próxima entrada

				//Fazer a copia
				BufferedInputStream bf = new BufferedInputStream(new FileInputStream(path.toFile()));
				byte [] buff = new byte[2048];// pegar os bait escreve aqui dentro pra depois jogar no arquivo zip
				int bytesRead;

				//Escrever o zip
				//while((bytesRead = fileInputStream.read(buff))>0){
				while((bytesRead = bf.read(buff))>0){
					zip.write(buff,0,bytesRead);
				}// arquivo copiado

				zip.flush();
				zip.closeEntry();// Fechar
				bf.close();//Fechar

			}//Fim do for
			System.out.println("Zip criado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
