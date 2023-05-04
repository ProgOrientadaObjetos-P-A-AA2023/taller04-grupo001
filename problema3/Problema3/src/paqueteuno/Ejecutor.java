package paqueteuno;
import paquetedos.Automotor;
/**
 *
 * @author Italo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automotor auto = new Automotor ();
        
        auto.calcularValorMatricula();
        
        System.out.printf("%s\n", auto);
        
        
        Automotor auto1 = new Automotor ("1104854060 ","Chevrolet",2003,7000);
        auto1.calcularValorMatricula();
        System.out.printf("%s\n", auto1);
    }
    
}
