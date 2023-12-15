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
public class Azul implements Color {
    @Override
    public String aplicarColor() {
        return "Azul";
    }
    
    @Override
    public Color clonar() {
        return new Azul();  // Crear una nueva instancia de Rojo
    }
}
