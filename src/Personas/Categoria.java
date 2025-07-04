/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Personas;

/**
 *
 * @author Student
 */
public enum Categoria {
    Juvenil("Juvenil"),
    Mayor("Mayor"),
    Master("Master");
    
    private String categoria;

    private Categoria(String categoria) {
        this.categoria = categoria;
    }
    
}
