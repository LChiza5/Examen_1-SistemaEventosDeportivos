/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eventos;

import java.time.LocalDate;

/**
 *
 * @author Luisk
 */
public class Evento {
    private String codigo;
    private String nombre;
    private String sede;
    private LocalDate fecha;
    private String tipo;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSede() {
        return sede;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Evento(String codigo, String nombre, String sede, LocalDate fecha, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sede = sede;
        this.fecha = fecha;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", nombre=" + nombre + ", sede=" + sede + ", fecha=" + fecha + ", tipo=" + tipo + '}';
    }
    
    
}
