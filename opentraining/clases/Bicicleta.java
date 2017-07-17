package opentraining.clases;
import java.awt.Color;
public class Bicicleta{
    Color color;   // un atributo
    // un metodo
    public String toString() {
        return "Bicicleta de color " +
	    this.color;
    }
    // un constructor
    public Bicicleta(Color c) {
        this.color = c;
    }
}
