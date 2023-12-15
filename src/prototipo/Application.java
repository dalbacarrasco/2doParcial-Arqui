/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Application {

    public static void main(String[] args) {
        List<Forma> shapes = new ArrayList<>();
        List<Forma> shapesCopy = new ArrayList<>();

        Circulo circle = new Circulo(new Rojo(), 10, 20);
        System.out.println(circle.x + " ," + circle.y);
        System.out.println(circle.color());

        Circulo copia = (Circulo) circle.clonar();
        System.out.println(copia.x + " ," + copia.y);
        System.out.println(copia.color());

        ProxyCrearForma proxy = new ProxyCrearForma();
        Forma f = proxy.crear("Circulo","Rojo", 10, 20);
        if (f != null) {
            if (f instanceof Circulo) {
                System.out.println("Circulo " + f.x + " ," + f.y + ","+ f.color());
            } else if (f instanceof Rectangulo) {
                System.out.println("Rectangulo " + f.x + " ," + f.y);
            }
        }else{
            System.out.println("No se pueden crear figuras");
        }

        //shapes.add(circle);
        //Circulo anotherCircle = (Circulo) circle.clonar();
        //shapes.add(anotherCircle);
        Rectangulo rectangle = new Rectangulo(20, 10);
        //shapes.add(rectangle);

        //cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Forma> shapes, List<Forma> shapesCopy) {
        for (Forma shape : shapes) {
            shapesCopy.add(shape.clonar());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes son diferentes objectos ");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": y son identicos ");
                } else {
                    System.out.println(i + ": pero no son identicos ");
                }
            } else {
                System.out.println(i + ": Shape son objetos iguales");
            }
        }
    }
}
