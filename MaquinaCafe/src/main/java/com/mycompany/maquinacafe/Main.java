/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maquinacafe;
import Vista.Maquina;
import Modelo.MaquinaModelo;
import Controlador.ControllerMaquina;

/**
 *
 * @author truji
 */
public class Main {
    public static void main(String[] args){
        
    Maquina vista = new Maquina();
    MaquinaModelo modelo = new MaquinaModelo();
    ControllerMaquina controlador = new ControllerMaquina(vista, modelo);
    vista.setVisible(true);
    
    
    }
}
