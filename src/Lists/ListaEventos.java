/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lists;

import Eventos.Evento;

/**
 *
 * @author Luisk
 */
public class ListaEventos implements List {
    private static Evento evento[];
    private int codigo;
    private int capacidad;
    private int cantidad;

    public static Evento[] getEvento() {
        return evento;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public void mostrarEventos(String eventos) {
       for (int i = 0; i < cantidad; i++) {
           if(eventos[i].getCapacidad().equalsIgnoreCase(eventos)) {
               System.out.println(eventos[i]);
            }
        }
    }

    @Override
    public void agregar(Object evento) {
        for (int i = 0; i < capacidad; i++){
            int[] eventos = null;
            if(eventos[i]==0){
                eventos[i]=codigo;
                break;
            }
        } 
    }

    @Override
    public void eliminar(Object t) {

    }
        
}
