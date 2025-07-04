/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Eventos;

/**
 *
 * @author Luisk
 */
public enum EnumTipo {
    LOCAL("Local"),
    NACIONAL("Nacional"),
    INTERNACIONAL("Internacional");
    
    private String tipo;

    private EnumTipo(String tipo) {
        this.tipo = tipo;
    }

}
