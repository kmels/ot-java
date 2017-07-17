package opentraining.jdbc;
import java.sql.*;
import org.relique.jdbc.csv.CsvDriver;
public class BuscarZona10
{
    static String query(String archivo){
	return "SELECT DISTINCT TITLE, BEDROOMS, PRICE FROM "+ archivo + 
	    " WHERE TITLE LIKE '%ZONA 10%' AND BEDROOMS='2'" +
	    " AND DATE>='2017' AND PRICE LIKE '%Q%'" +
	    " ORDER BY PRICE ASC "+
	    " LIMIT 5";
    }
    public static void main(String[] args) throws Exception
    {
	// Carga el driver CSV
	Class.forName("org.relique.jdbc.csv.CsvDriver");
	// Crea conexion
	Connection conexion = DriverManager
	    .getConnection("jdbc:relique:csv:" + args[0]);
	// El objeto con  cual se ejecutara el query
	Statement stmt = conexion.createStatement();
	// Ejecuta e imprime los resultados
	ResultSet resultados = stmt.executeQuery(query("enventa"));
	boolean append = false;
	CsvDriver.writeToCsv(resultados, System.out, append);
	// Cierra la conexion
	conexion.close();
    }
}
