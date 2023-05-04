package paqueteuno;
import paquetedos.Profesores;
/**
 *
 * @author Italo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesores profesores = new Profesores ();
        
        profesores.calcularSueldoTotal();
        
        System.out.printf("%s\n", profesores);
        
        
        Profesores profesores1 = new Profesores ("Italo ","López","110485406",400);
        profesores1.calcularSueldoTotal();
        System.out.printf("%s\n", profesores1);
    }
    
}

