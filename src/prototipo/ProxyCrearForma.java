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
public class ProxyCrearForma implements CrearForma{
    private CrearFormaReal c = new CrearFormaReal();
    
    public ProxyCrearForma(){
        
    }
    
    @Override
    public Forma crear(String forma,String color, int x, int y){
        if(verificar()){
            return c.crear(forma,color, x, y);
        }else{
            return null;
        }
    }
    
    @Override
    public Forma clonar(Forma forma){
        if(verificar()){
            return c.clonar(forma);
        }else{
            return null;
        }
    }
    
    private boolean verificar(){
        return c.getCantidad() > 0;
    }
}
