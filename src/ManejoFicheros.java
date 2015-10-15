import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;

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


	@Override
	// Metodo2
	public boolean puedeEscribirFichero(Path patch) {
		System.out.println("\nMetodo 2\n");	
		System.out.println(Files.isWritable(patch));
		return Files.isWritable(patch);
		
	}


	@Override//Metodo3
	public boolean puedeEjecutarFichero(Path patch) {
		//Directamente devuelve un booleano true si es ejecutable, false si no es ejecutable. 
		//Aunque el patch no fuese valido el resultado seria false pero no saltarian excepciones.
		System.out.println("\nMetodo 3\n");
		System.out.println(Files.isExecutable(patch));
		return  Files.isExecutable(patch);
	}

	@Override// Metodo4
	public long tamañoFichero(Path patch) {
		// TODO Apï¿½ndice de mï¿½todo generado automï¿½ticamente
		System.out.println("\nMï¿½todo 4 \n");
		long valor = 0;
		try {
			valor = Files.size(patch);
		} catch (IOException e) {
			// TODO Bloque catch generado automï¿½ticamente
			e.printStackTrace();
		}
		System.out.println("El tamaï¿½o del fichero es : "
				+ valor + " bytes");

		return valor;
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
	
	
	@Override
	// Metodo7
	public String[] listarDirectorio(Path ruta, String extension)  {
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
		}catch (IOException | DirectoryIteratorException e) {

				System.err.println(e);

			}
			return null;
		}

	@Override//Metodo8
	public String[] listarModificads(Path patch, FileTime file) {
		//Recorremos el directorio actual comparando cada fecha de ultima modificacion con la fecha dada.
		System.out.println("\nMetodo 8\n");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(patch)) {
            ArrayList<String> EncontradosAL = new ArrayList<String>();
     
            for (Path i : stream) {
                FileTime fileTime = Files.getLastModifiedTime(i);
                if(fileTime.compareTo(file)>=0){
                	System.out.println(i.getFileName().toString());
                    EncontradosAL.add(i.getFileName().toString());
                }
            }
            String []Encontrados = new String[EncontradosAL.size()];
            EncontradosAL.toArray(Encontrados);
            return Encontrados;
            
        } //En caso de que salte un excepción devolveria Null
        catch (IOException | DirectoryIteratorException e) {
            System.err.println(e);
            return null;
        }
	}

	@Override
	// Metodo9
	public boolean creaDirectorio(Path patch) {
		// TODO Apï¿½ndice de mï¿½todo generado automï¿½ticamente

		System.out.println("\nMï¿½todo 9\n");
		
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
		// TODO Apï¿½ndice de mï¿½todo generado automï¿½ticamente
		return false;
	}

	@Override
	// Metodo11
	public boolean borrar(Path patch) {
		// TODO Apï¿½ndice de mï¿½todo generado automï¿½ticamente

		System.out.println("\nMï¿½todo 11 \n");
		try {
			Files.delete(patch);
		} catch (IOException e) {
			// TODO Bloque catch generado automï¿½ticamente
			e.printStackTrace();
		}
		return false;
	}

	@Override
	// Metodo12
	public boolean touch(Path patch) {
		// TODO Apï¿½ndice de mï¿½todo generado automï¿½ticamente
		
		System.out.println("\nMï¿½todo 12\n");
		
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
			// TODO Bloque catch generado automï¿½ticamente
			e.printStackTrace();
		}
		
		return false;
	}

}
