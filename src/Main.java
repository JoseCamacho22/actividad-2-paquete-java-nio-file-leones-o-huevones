import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Apéndice de método generado automáticamente

		// Creacion Patch
        Path dir = Paths.get(".");

        //Creacion String Extension
        String extension = "exe";
        
        //Creacion FileTime
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateInString = "2015-10-05";
        Date fecha = sdf.parse(dateInString);
        long dateInTimeStamp = fecha.getTime();
        FileTime fileTimeComparacion = FileTime.fromMillis(dateInTimeStamp); 
        
        //Objeto para llamar a los metodos
        ManejoFicheros ejecutar = new ManejoFicheros();
        
        //Llamadas a los metodos
        ejecutar.existeFichero(dir);//Metodo1
        ejecutar.puedeEscribirFichero(dir);//Metodo2	
        ejecutar.puedeEjecutarFichero(dir);//Metodo3
        ejecutar.tamañoFichero(dir);//Metodo4
        ejecutar.rutaAbsoluta(dir);//Metodo5
        ejecutar.listarDirectorio(dir);//Metodo6
		ejecutar.listarDirectorio(dir, extension);//Metodo7
		ejecutar.listarModificads(dir, fileTimeComparacion);//Metodo8
        ejecutar.creaDirectorio(dir);//Metodo9
		ejecutar.renombraFichero(dir);//Metodo10
		ejecutar.borrar(dir);//Metodo11
		ejecutar.touch(dir);//Metodo12
		
	}

}
