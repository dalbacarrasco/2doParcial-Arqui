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
public class Triangulo extends Forma{
    public Triangulo(Color implementacionColor, int x, int y) {
        super(implementacionColor);
        this.x = x;
        this.y = y;
    }

    public Triangulo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Triangulo(Triangulo target) {
        super(target);
    }
    
    @Override
    public String color() {
        return  implementacionColor.aplicarColor();
    }

    @Override
    public Forma clonar() {
        return new Triangulo(this);
    }
}
