/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author truji
 */
public class MaquinaModelo {
    private int dinero;
    private int limite = 50;
    private int Unidad1 = 10;
    private int Unidad2 = 30;
    private int Unidad3 = 50;
    private int Unidad4 = 30;
    
    public MaquinaModelo(){
    dinero = 0;
    }
    
    
    public boolean IngresarDinero(int cantidad){
    
      if(dinero + cantidad <= limite){
      dinero += cantidad ;
      return true;
      }
        return false;
    }
    
    
    public  int getDinero(){
      return dinero;
    }
    
    public void setDinero(int Dinero){
    this.dinero = Dinero;
    }
    
    public boolean RestarDinero (int cantidad){
    dinero = dinero - cantidad;
    return true;
    }
    

    public boolean restarUnidad (int unidad){
        
        switch (unidad){
           
            case 1:
                if(Unidad1 != 0){
                Unidad1 --;
                return true;
                }
            break;
                
            case 2:
                if(Unidad2 != 0){
                Unidad2 --;
                return true;
                }
            break;
                
            case 3:
                if(Unidad3 != 0){
                Unidad3 --;
                return true;
                }
            break;    
            
            case 4:
                if(Unidad4 != 0){
                Unidad4 --;
                return true;
                }
            break;
        }
          return false;
      }  
      
      
    public int getUnidad(int unidad){
    
        switch(unidad){
        
            case 1:
                return Unidad1;
                
            case 2:
                return Unidad2;
                
            case 3:
                return Unidad3;
                
            case 4:
                return Unidad4;
        }
          return 0;
    }
    
    
    
    
    }

    