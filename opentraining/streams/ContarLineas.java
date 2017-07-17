package opentraining.streams;
import java.nio.file.*;
import java.util.stream.*;
public class ContarLineas {
    static Stream<String> lineas(String p){
	try {
	    Path filepath = Paths.get(p);
	    return Files.lines(filepath);
	} catch (Exception e){
	    return Stream.empty();
	}
    }
       
    public static void main (String[] args) {
	//evalua todas las lineas al contarlas
	System.out.println(lineas(args[0]).count()
			   + " lineas");

	//vuelve a leer y cuenta todas menos la primera
	System.out.println(lineas(args[0])
			   .skip(1)
			   .count() +
			   " transportes");
    }
}
