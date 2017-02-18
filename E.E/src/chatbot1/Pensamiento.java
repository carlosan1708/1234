/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot1;

import java.util.ArrayList;

/**
 *
 * @author TheShogun
 */
public class Pensamiento {
    public String nombre;
    public ArrayList<String> frases = new ArrayList<>();

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    public int contador =0;
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getFrases() {
        return frases;
    }

    public void setFrases(ArrayList<String> frases) {
        this.frases = frases;
    }
   
    
}
