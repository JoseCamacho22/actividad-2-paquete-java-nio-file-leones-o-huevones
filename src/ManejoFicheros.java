import java.nio.file.Path;
import java.nio.file.attribute.FileTime;


public class ManejoFicheros implements InterfazManejoFicheros {

	@Override
	public boolean existeFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public boolean puedeEscribirFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public boolean puedeEjecutarFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public long tama�oFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return 0;
	}

	@Override
	public String rutaAbsoluta(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public String[] listarDirectorio(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public String[] listarDirectorio(Path ruta, String extension) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public String[] listarModificads(Path patch, FileTime file) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public boolean creaDirectorio(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public boolean renombraFichero(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public boolean borrar(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public boolean touch(Path patch) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

}
