package opentraining.streams;
import java.nio.file.*;
import java.util.stream.*;
public class ContarLlantas {
    static Stream<String> lineas(String p){
	try {
	    Path filepath = Paths.get(p);
	    return Files.lines(filepath);
	} catch (Exception e){
	    return Stream.empty();
	}
    }
    static int numeroDeLlantas(String linea){
	return Integer.parseInt(linea.split(",")[1].trim());
    }
    public static void main (String[] args) {
	//suma el numero de llantas
	System.out.println(lineas(args[0])
			   .skip(1)
			   .mapToInt(l -> numeroDeLlantas(l))
			   .sum()
			   + " llantas en total.");
	//cuenta el numero de transportes
	//con menos de 10 llantas	
	System.out.println(lineas(args[0])
			   .skip(1)
			   .mapToInt(l -> numeroDeLlantas(l))
			   .filter(n -> n < 10)
			   .count ()
			   + " transportes con menos de 10 llantas");
    }
}
