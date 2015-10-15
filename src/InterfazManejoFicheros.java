import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

public interface InterfazManejoFicheros {
	
	public boolean existeFichero(Path path); // Indica si existe el fichero dado
	
	public boolean puedeEscribirFichero(Path path); // Indica si se puede escribir en el fichero dado
	
	public boolean puedeEjecutarFichero(Path path); // Indica si se puede ejecutar el fichero dado
	
	public long tamañoFichero(Path patch); // Devuelve el tamaï¿½o del fichero
	
	public String rutaAbsoluta(Path patch); // Devuelve la ruta absoluta de un fichero
	
	public String[] listarDirectorio(Path patch); // Devuelve un array de Strings con los contenidos de un directorio, si no  es un directorio devolverï¿½ un array con una cadena vacï¿½a "" 
	
	public String[] listarDirectorio(Path ruta, String extension); // Devuelve un array de Strings con los contenidos de un directorio con la extension dada de la ruta dada, si no es un directorio o no encuentra ningï¿½n fichero con esa extensiï¿½n devolverï¿½ un array con una cadena vacï¿½a ""
	
	public String[] listarModificads(Path patch, FileTime file); // Devuelve un array de Strings con ficheros de un directorio modificados con fecha igual o posterior a la dada
	
	public boolean creaDirectorio(Path patch); // Crea un directorio en la ruta dada, si se realiza correctamente devuelve true en caso contrario devuelve false
	
	public boolean renombraFichero(Path patch); // Renombra un fichero en la ruta dada, si se realiza correctamente devuelve true en caso contrario devuelve false
	
	public boolean borrar(Path patch); // Borra un fichero en la ruta dada, si se realiza correctamente devuelve true en caso contrario devuelve false
	
	public boolean touch(Path patch); // Crea un archivo vacï¿½o en la ruta indicada, si se realiza correctamente devuelve true en caso contrario devuelve false

}
