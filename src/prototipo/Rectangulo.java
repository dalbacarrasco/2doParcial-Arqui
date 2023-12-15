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
public class Rectangulo extends Forma {
    
    public Rectangulo(Color implementacionColor, int x, int y) {
        super(implementacionColor);
        this.x = x;
        this.y = y;
    }

    @Override
    public String color() {
        return implementacionColor.aplicarColor();
    }

    public Rectangulo(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public Rectangulo(Rectangulo target) {
        super(target);
    }

    @Override
    public Forma clonar() {
        return new Rectangulo(this);
    }   
}
