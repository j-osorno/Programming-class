/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author truji
 */
public class Cafe {
 
    private int precio;
    private String nombre;

    public Cafe(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public int getPrecio(){
    return precio;
    }
    
}
