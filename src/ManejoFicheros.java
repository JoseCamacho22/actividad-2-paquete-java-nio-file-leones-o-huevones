import java.nio.file.Path;
import java.nio.file.attribute.FileTime;


public class ManejoFicheros implements InterfazManejoFicheros {

	@Override
	public boolean existeFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public boolean puedeEscribirFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public boolean puedeEjecutarFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public long tamañoFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}

	@Override
	public String rutaAbsoluta(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public String[] listarDirectorio(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public String[] listarDirectorio(Path ruta, String extension) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public String[] listarModificads(Path patch, FileTime file) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public boolean creaDirectorio(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public boolean renombraFichero(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public boolean borrar(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

	@Override
	public boolean touch(Path patch) {
		// TODO Apéndice de método generado automáticamente
		return false;
	}

}
