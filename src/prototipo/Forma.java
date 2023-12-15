/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;
import java.util.Objects;
/**
 *
 * @author danie
 */
public abstract class Forma {
    public int x;
    public int y;
    protected Color implementacionColor;

    public Forma(Color implementacionColor) {
        this.implementacionColor = implementacionColor;
    }

    public abstract String color();
    

    public Forma() {
    }

    public Forma(Forma target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            // Clonar la implementación de color
            this.implementacionColor = (Color) target.implementacionColor.clonar();
        }
    }

    public abstract Forma clonar();
    
}
