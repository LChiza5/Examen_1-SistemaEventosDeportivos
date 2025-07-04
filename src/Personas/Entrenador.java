/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

/**
 *
 * @author Student
 */
public class Entrenador extends Persona{
    private String Equipo;

    public Entrenador(String Equipo, int id, String nombre) {
        super(id, nombre);
        this.Equipo = Equipo;
    }

    public String getEquipo() {
        return Equipo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "Equipo=" + Equipo + '}';
    }
    
}
