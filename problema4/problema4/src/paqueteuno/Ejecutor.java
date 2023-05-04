
package paqueteuno;
import paquetedos.EntidadFinanciera;
/**
 *
 * @author Italo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntidadFinanciera entidad1 = new EntidadFinanciera ();
        
        entidad1.calcularComisionBanco();
        
        System.out.printf("%s\n", entidad1);
        
        
        EntidadFinanciera entidad2 = new EntidadFinanciera ("Italo López ","Banco de Guayaquil",2003);
        entidad2.calcularComisionBanco();
        System.out.printf("%s\n", entidad2);
    }
    
}
