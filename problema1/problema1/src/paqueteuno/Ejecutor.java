
package paqueteuno;
import paquetedos.Estudiantes;
/**
 *
 * @author Italo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiantes estudiante = new Estudiantes ();
        
        estudiante.calcularPromedioCalificaciones();
        
        System.out.printf("%s\n", estudiante);
        
        
        Estudiantes estudiante1 = new Estudiantes ("Italo López", 9.86,
                8.47,8.59);
        estudiante1.calcularPromedioCalificaciones();
        System.out.printf("%s\n", estudiante1);
    }
    
}
