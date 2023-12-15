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
public class Circulo extends Forma {
    
    public Circulo(Color implementacionColor, int x, int y) {
        super(implementacionColor);
        this.x = x;
        this.y = y;
    }

    public Circulo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Circulo(Circulo target) {
        super(target);
    }
    
    @Override
    public String color() {
        return  implementacionColor.aplicarColor();
    }

    @Override
    public Forma clonar() {
        return new Circulo(this);
    }
   
}
