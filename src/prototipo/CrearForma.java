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
public interface CrearForma {
    Forma crear(String forma,String color, int x, int y);
    Forma clonar(Forma forma);
}
