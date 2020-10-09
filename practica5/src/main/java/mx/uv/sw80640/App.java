package mx.uv.sw80640;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        get("/", (req, res) -> "Hola desde Spark");
        get("/hola", (req, res) -> "Hola hola");
        get("/adios", (req, res) -> "Adios desde Spark");
    }
}
