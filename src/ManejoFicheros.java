import java.nio.file.Path;
import java.nio.file.attribute.FileTime;


public class ManejoFicheros implements InterfazManejoFicheros {

	@Override//Metodo1
	public boolean existeFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override//Metodo2
	public boolean puedeEscribirFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override//Metodo3
	public boolean puedeEjecutarFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override//Metodo4
	public long tama�oFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return 0;
	}

	@Override//Metodo5
	public String rutaAbsoluta(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override//Metodo6
	public String[] listarDirectorio(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override//Metodo7
	public String[] listarDirectorio(Path ruta, String extension) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override//Metodo8
	public String[] listarModificads(Path patch, FileTime file) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override//Metodo9
	public boolean creaDirectorio(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override//Metodo10
	public boolean renombraFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override//Metodo11
	public boolean borrar(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override//Metodo12
	public boolean touch(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

}
