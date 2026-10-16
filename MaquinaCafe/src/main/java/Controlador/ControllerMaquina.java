/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.MaquinaModelo;
import Vista.Maquina;

public class ControllerMaquina {
    private Maquina vista;
    private MaquinaModelo modelo;
    

    public ControllerMaquina(Maquina vista, MaquinaModelo modelo) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.setControlador(this);
    }   
    
    public void IngresarDinero(int cantidad){
       
         if(modelo.IngresarDinero(cantidad)== true){
         vista.mostrarDinero(modelo.getDinero());
         }else{vista.mostrarMensaje("No puedes ingresar mas de $50"); }
    }
    
    public void ComprarCafe(int cantidad){
         
         if(modelo.getDinero() == 50){
             if(vista.Tazallena()){
               if(modelo.restarUnidad(cantidad)){
             modelo.RestarDinero(50);
             vista.mostrarGift();
             vista.mostrarDinero(modelo.getDinero());
             vista.MostrarUnidad(cantidad, modelo.getUnidad(cantidad));
             vista.cambiarIcon();
             }else{vista.mostrarU("Ya no quedan mas unidades disponibles");
             modelo.setDinero(50);
             vista.mostrarDinero(modelo.getDinero());
             }
             }else{vista.mostrarMess();}
         }else{vista.mostrarM("Dinero Insuficiente");
         
         }
    }
    
    
    
    
}
