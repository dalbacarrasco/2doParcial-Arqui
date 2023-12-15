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
public class CrearFormaReal implements CrearForma {
    public int cantidad = 3;
    Forma f;

    @Override
    public Forma crear(String forma, String color, int x, int y) {
        if (forma.equals("Circulo")) {
            if (color.equals("Rojo")) {
                f = new Circulo(new Rojo(), x, y);
            } else if (color.equals("Azul")) {
                f = new Circulo(new Azul(), x, y);
            }else if (color.equals("Amarillo")) {
                f = new Circulo(new Amarillo(), x, y);
            }
        } else if (forma.equals("Rectangulo")) {
            if (color.equals("Rojo")) {
                f = new Rectangulo(new Rojo(), x, y);
            } else if (color.equals("Azul")) {
                f = new Rectangulo(new Azul(), x, y);
            }else if (color.equals("Amarillo")) {
                f = new Rectangulo(new Amarillo(), x, y);
            }
        }else if (forma.equals("Triangulo")) {
            if (color.equals("Rojo")) {
                f = new Triangulo(new Rojo(), x, y);
            } else if (color.equals("Azul")) {
                f = new Triangulo(new Azul(), x, y);
            }else if (color.equals("Amarillo")) {
                f = new Triangulo(new Amarillo(), x, y);
            }
        }
        decrementarCantidad();
        System.out.println("cantidad: "+cantidad);
        return f;
    }
    
    @Override
    public Forma clonar(Forma forma){
        f = forma.clonar();
        decrementarCantidad();
        System.out.println("cantidad: "+cantidad);
        return f;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void decrementarCantidad(){
        cantidad--;
    }

}
