import opentraining.interfases.*;
import opentraining.interfases.Transporte.*;
import java.awt.Color;
public class BicicletaDeTransporte
    implements TransporteTerrestre{
    int nLlantas = 0;
    Color color = Transporte.COLOR_POR_DEFECTO;
    public int getNumeroDeLlantas() { return nLlantas; }
    public void setNumeroDeLlantas(int n){ this.nLlantas = 0; }
    public Color getColor(){ return this.color; }
    public void setColor(Color c) { this.color = c;}
}

