/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victico
 */
public class Electrodomesticos {
   
   
    protected final static String COLOR_DEF="blanco";
   
   
    protected final static char CONSUMO_ENERGETICO_DEF='F';
   
    
    protected final static double PRECIO_BASE_DEF=100;
   
   
    protected final static double PESO_DEF=5;
   

   
   
    protected double precioBase;
   
   
    protected String color;
   
    
    protected char consumoEnergetico;
   
  
    protected double peso;
   
   
   
    private void comprobarColor(String color){
  
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
              
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR_DEF;
        }
          
          
    }
  }
