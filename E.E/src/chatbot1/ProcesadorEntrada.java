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
public class ProcesadorEntrada { 
    Cerebro cerebro;
    
    public ProcesadorEntrada(Cerebro cerebro){
        this.cerebro = cerebro;
    }
     public ArrayList<String> palabrasValidas = new ArrayList<>();
     //Se deberia optimizar
     public int buscarPalabras(String datosUsuario){
          for (int x =0; x < cerebro.ListaP.size(); x++){
              for(String parte : separarFrase(datosUsuario)){
                  if(parte.equals(cerebro.ListaP.get(x).nombre)){
                      return x;
                  }
              }
          }
          return 404;
     }
     //Lo agarre de internet
     public static String[] separarFrase(String s) {
        int cp = 0; // Cantidad de palabras
         
        // Recorremos en busca de espacios
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // Si es un espacio
                cp++; // Aumentamos en uno la cantidad de palabras
            }
        }
         
        // "Este blog es genial" tiene 3 espacios y 3 + 1 palabras
        String[] partes = new String[cp + 1];
        for (int i = 0; i < partes.length; i++) {
            partes[i] = ""; // Se inicializa en "" en lugar de null (defecto)
        }
         
        int ind = 0; // Creamos un índice para las palabras
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // Si hay un espacio
                ind++; // Pasamos a la siguiente palabra
                continue; // Próximo i
            }
            partes[ind] += s.charAt(i); // Sino, agregamos el carácter a la palabra actual
        }
        return partes; // Devolvemos las partes
    }
    
}
