/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;


/**
 *
 * @author Student
 */
public class Deportista extends Persona {
    private LocalDate FechaNacimiento;
    private String disciplina;
    private Categoria categoria;

    public Deportista(LocalDate FechaNacimiento, String disciplina, Categoria categoria, int id, String nombre) {
        super(id, nombre);
        this.FechaNacimiento = FechaNacimiento;
        this.disciplina = disciplina;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public String toString() {
        return "Deportista{" + "FechaNacimiento=" + FechaNacimiento + ", disciplina=" + disciplina + '}';
    }
    
}
