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
public class Cerebro {
    String respuesta ="";
    public ArrayList<Pensamiento> ListaP = new ArrayList<>();

    public ArrayList<Pensamiento> getListaP() {
        return ListaP;
    }

    public void setListaP(ArrayList<Pensamiento> ListaP) {
        this.ListaP = ListaP;
    }
    
    public String frasePE(int pensamientoUsuario){ 
        if(pensamientoUsuario != 404){
        respuesta = ListaP.get(pensamientoUsuario).frases.get(ListaP.get(pensamientoUsuario).contador);
        //AGREGAR MAS RESTRICCIONES
            if(ListaP.get(pensamientoUsuario).contador < ListaP.get(pensamientoUsuario).frases.size()-1){
                 ListaP.get(pensamientoUsuario).contador++;
            }else{
                ListaP.get(pensamientoUsuario).setContador(0);
            }
       
        }else{
            respuesta="Vagos rellenen el txt con respuesta para esto";
        }
        
        //poner que si no encuentra devuelva basica
        return "Respuesta:" + respuesta;
    }
    
}

