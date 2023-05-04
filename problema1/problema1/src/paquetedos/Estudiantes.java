/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author Italo
 */
public class Estudiantes {
    private String nombreEstudiante;
    private double calificacionM1;
    private double calificacionM2;
    private double calificacionM3;
    private double promedioCalificaciones;

    public Estudiantes() {
        nombreEstudiante = "Luis Morales";
        calificacionM1 = 9.5;
        calificacionM2 = 8.5;
        calificacionM3 = 8.8;

    }

    public Estudiantes(String nom, double cali1, double cali2, double cali3) {

        nombreEstudiante = nom;
        calificacionM1 = cali1;
        calificacionM2 = cali2;
        calificacionM3 = cali3;
        
    }

    public void establecerNombreEstudiante(String c) {
        nombreEstudiante = c;
    }

    public void establecerCalificacionM1(double c) {
        calificacionM1 = c;
    }

    public void establecerCalificacionM2(double c) {
        calificacionM2 = c;
    }

    public void establecerCalificacionM3(double c) {
        calificacionM3 = c;
    }

    public void calcularPromedioCalificaciones() {
        promedioCalificaciones = (calificacionM1 + calificacionM2
                + calificacionM3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacionM1() {
        return calificacionM1;
    }

    public double obtenerCalificacionM2() {
        return calificacionM2;
    }

    public double obtenerCalificacionM3() {
        return calificacionM3;
    }

    public double obtenerPromedioCalificaciones() {
        return promedioCalificaciones;
    }

    @Override
    public String toString() {
        String cadena = String.format("Las calificaciones del estudiantes son:\n"
                + "Nombre del estudiante: %s\n"
                + "Calificación 1: %.2f\n"
                + "Calificación 2: %.2f\n"
                + "Caficación 3: %.2f\n"
                + "El promedio es: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerCalificacionM1(),
                obtenerCalificacionM2(),
                obtenerCalificacionM3(),
                obtenerPromedioCalificaciones());
        return cadena;
    }
}
