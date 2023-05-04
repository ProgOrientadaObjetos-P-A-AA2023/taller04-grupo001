package paquetedos;

/**
 *
 * @author Italo
 */
public class Automotor {

    private String ciDueno;
    private String marca;
    private int anioVehiculo;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor() {
        ciDueno = "1102526754 ";
        marca = "Toyota";
        anioVehiculo = 2012;
        valorVehiculo = 12000;

    }

    public Automotor(String cI, String marc, int anio,
            double valorV) {

        ciDueno = cI;
        marca = marc;
        anioVehiculo = anio;
        valorVehiculo = valorV;

    }

    public void establecerCiDueno(String c) {
        ciDueno = c;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerAnioVehiculo(int s) {
        anioVehiculo = s;
    }

    public void establecerValorVehiculo(double c) {
        valorVehiculo = c;
    }

    public void calcularValorMatricula() {
        valorMatricula = (valorVehiculo * 0.0002) * (2023 - anioVehiculo);
    }

    public String obtenerCiDueno() {
        return ciDueno;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerAnioVehiculo() {
        return anioVehiculo;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("El calculo del valor de la matricula de:\n"
                + "Cedula : %s\n"
                + "Marca del vehiculo : %s\n"
                + "Año del Vehiculo : %d\n"
                + "Valor del vehiculo: %.2f\n"
                + "Valor de la matricula: %.2f\n",
                obtenerCiDueno(),
                obtenerMarca(),
                obtenerAnioVehiculo(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }

}
