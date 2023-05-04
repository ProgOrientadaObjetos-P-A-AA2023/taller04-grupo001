package paquetedos;

/**
 *
 * @author Italo
 */
public class Profesores {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public Profesores() {
        nombre = "Luis ";
        apellido = "Morales";
        cedula = "1105756589";
        sueldoBasico = 400;

    }

    public Profesores(String nom, String apelli, String cI,
            double sueldoB) {

        nombre = nom;
        apellido = apelli;
        cedula = cI;
        sueldoBasico = sueldoB;

    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerSueldoBasico(double c) {
        sueldoBasico = c;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("El sueldo de:\n"
                + "Nombre : %s\n"
                + "Apellido : %s\n"
                + "Cedula : %s\n"
                + "Sueldo básico: %.2f\n"
                + "Sueldo total: %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal());
        return cadena;
    }

}
