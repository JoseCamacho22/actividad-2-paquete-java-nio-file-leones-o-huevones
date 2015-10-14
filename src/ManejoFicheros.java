import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;



public class ManejoFicheros implements InterfazManejoFicheros {

	@Override // Metodo1
	public boolean existeFichero(Path path) {
		System.out.println("Metodo1\n");
		//	Files.exists and Files.notExists
			//Files f = new Files(path);

				if (Files.exists(path)) {
					System.out.println("El fichero existe");
				} else {
					System.out.println("El fichero no existe");
				}
		return false;
	}

	@Override//Metodo2
	public boolean puedeEscribirFichero(Path path) {
					
		return false;
	}

	
	
	@Override//Metodo3
	public boolean puedeEjecutarFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override//Metodo4
	public long tamañoFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override//Metodo5
	public String rutaAbsoluta(Path patch){
		System.out.println("\nMetodo5\n");
		System.out.format("toString: %s%n", patch.toString()); 
		return null;
	}

	@Override//Metodo6
	
	public String[] listarDirectorio(Path path) {
		System.out.println("\nMetodo6\n");
		
		String[] filesList = path.toFile().list();//añado esto porque si no me devuelve un String[] no sabía realizar la prueba de comparacion de metodos
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
			System.out.println("Utilizando NIO > Archvivos encontrados:");
			for (Path i : stream) {
				System.out.println(i.getFileName());
			
			}
			return filesList;
		} //En caso de que salte un excepción devolveria NULL
		catch (IOException | DirectoryIteratorException e) {
			System.err.println(e);
			
			return null;
		}
				

			

		}
	
	
	@Override//Metodo7
	public String[] listarDirectorio(Path ruta, String extension) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override//Metodo8
	public String[] listarModificads(Path patch, FileTime file) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override//Metodo9
	public boolean creaDirectorio(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override//Metodo10
	public boolean renombraFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override//Metodo11
	public boolean borrar(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override//Metodo12
	public boolean touch(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

}
