import java.awt.List;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import javax.swing.JOptionPane;

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
		System.out.println("\nMetodo 2\n");	
		System.out.println(Files.isWritable(patch));
		return Files.isWritable(patch);
		
	}

	@Override
	// Metodo3
	public boolean puedeEjecutarFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	// Metodo4
	public long tamañoFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return 0;
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
		System.out.println("\nMetodo 7\n");
		System.out.println("Archivos encontrados con la extension");
		System.out.println();

		try (DirectoryStream<Path> stream = Files.newDirectoryStream(ruta)) {
			String ext = "";
			ArrayList<String> archivos = new ArrayList<String>();
			for (Path path : stream) {

				String s = path.getFileName().toString();

				int i = s.lastIndexOf(".");

				if (i >= 0) {

					ext = s.substring(i + 1);
					if (ext.equalsIgnoreCase(extension)) {

						System.out.println(s);
						archivos.add(s);
					}
				}

			}
			String[] a_archivos = new String[archivos.size()];
			archivos.toArray(a_archivos);
			return a_archivos;

		} catch (IOException | DirectoryIteratorException e) {

			System.err.println(e);

		}
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
		return false;
	}

	@Override
	// Metodo12
	public boolean touch(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}


}
