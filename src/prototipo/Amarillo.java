/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

/**
 *
 * @author danie
 */
public class Amarillo implements Color {
    @Override
    public String aplicarColor() {
        return "Amarillo";
    }
    
    @Override
    public Color clonar() {
        return new Amarillo();  // Crear una nueva instancia
    }
}
