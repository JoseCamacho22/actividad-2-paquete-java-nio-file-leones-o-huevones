import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Scanner;
import java.util.Scanner;

public class ManejoFicheros implements InterfazManejoFicheros {

	@Override
	// Metodo1
	public boolean existeFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	// Metodo2
	public boolean puedeEscribirFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	// Metodo3
	public boolean puedeEjecutarFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
		//Directamente devuelve un booleano true si es ejecutable, false si no es ejecutable. 
		//Aunque el patch no fuese valido el resultado seria false pero no saltarian excepciones.
		System.out.println("\nMetodo 3\n");
		System.out.println(Files.isExecutable(patch));
		return  Files.isExecutable(patch);
	}

	@Override
	// Metodo4
	public long tamañoFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		System.out.println("\nM�todo 4 \n");
		long valor = 0;
		try {
			valor = Files.size(patch);
		} catch (IOException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
		System.out.println("El tama�o del fichero es : "
				+ valor + " bytes");

		return valor;
	}

	@Override
	// Metodo5
	public String rutaAbsoluta(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	// Metodo6
	public String[] listarDirectorio(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	// Metodo7
	public String[] listarDirectorio(Path ruta, String extension) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	// Metodo8
	public String[] listarModificads(Path patch, FileTime file) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	// Metodo9
	public boolean creaDirectorio(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		System.out.println("\nM�todo 9\n");
		
		System.out.println("Escribe el nombre para el nuevo directorio: \n");
		Scanner n = new Scanner(System.in);
		String nombre = n.nextLine();
		patch = Paths.get("C://prueba\\" + nombre);
		File original = patch.toFile();

		while (original.exists()) {
			System.err.println("Ya existe un directorio llamado " + original
					+ "\n");
			nombre = n.nextLine();
			patch = Paths.get("C://prueba\\" + nombre);
			original = patch.toFile();
		}

		original.mkdirs();
		System.out.println("Directorio creado");
		
		return false;
	}

	@Override
	// Metodo10
	public boolean renombraFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	// Metodo11
	public boolean borrar(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		System.out.println("\nM�todo 11 \n");
		try {
			Files.delete(patch);
		} catch (IOException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
		return false;
	}

	@Override
	// Metodo12
	public boolean touch(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		System.out.println("\nM�todo 12\n");
		
		System.out.println("Escribe el nombre para el nuevo fichero: \n");
		Scanner n = new Scanner(System.in);
		String nombre = n.nextLine();
		patch = Paths.get("C://prueba\\" + nombre);
		File original = patch.toFile();

		while (original.exists()) {
			System.err.println("Ya existe un fichero llamado " + original
					+ "\n");
			nombre = n.nextLine();
			patch = Paths.get("C://prueba\\" + nombre);
			original = patch.toFile();
		}

		try {
			original.createNewFile();
		} catch (IOException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}
		
		return false;
	}

}
