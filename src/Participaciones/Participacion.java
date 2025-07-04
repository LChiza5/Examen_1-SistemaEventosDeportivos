/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Participaciones;

/**
 *
 * @author Luisk
 */
public class Participacion {
    private String codigo;
    private String deportista;
    private String evento;
    private String resultado;

    public String getCodigo() {
        return codigo;
    }

    public String getDeportista() {
        return deportista;
    }

    public String getEvento() {
        return evento;
    }

    public String getResultado() {
        return resultado;
    }

    public Participacion(String codigo, String deportista, String evento, String resultado) {
        this.codigo = codigo;
        this.deportista = deportista;
        this.evento = evento;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Participacion{" + "codigo=" + codigo + ", deportista=" + deportista + ", evento=" + evento + ", resultado=" + resultado + '}';
    }
    
}
