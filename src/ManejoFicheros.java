import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;


import javax.sound.midi.Patch;


public class ManejoFicheros implements InterfazManejoFicheros {

	@Override//Metodo1
	public boolean existeFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override//Metodo2
	public boolean puedeEscribirFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override//Metodo3
	public boolean puedeEjecutarFichero(Path patch) {
		//Directamente devuelve un booleano true si es ejecutable, false si no es ejecutable. 
		//Aunque el patch no fuese valido el resultado seria false pero no saltarian excepciones.
		System.out.println("\nMetodo 3\n");
		System.out.println(Files.isExecutable(patch));
		return  Files.isExecutable(patch);
	}

	@Override//Metodo4
	public long tamañoFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override//Metodo5
	public String rutaAbsoluta(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override//Metodo6
	public String[] listarDirectorio(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override//Metodo7
	public String[] listarDirectorio(Path ruta, String extension) {
		// TODO Apéndice de método generado automáticamente
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
