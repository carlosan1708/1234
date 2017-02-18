/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author TheShogun
 */
public class Lector {
    Cerebro cerebro;
    
    public Lector(Cerebro cerebro){
        this.cerebro = cerebro;
    }
    public void leer() throws FileNotFoundException, IOException{
         BufferedReader br = new BufferedReader(new FileReader("Logica.txt"));
	try {
	    StringBuilder sb = new StringBuilder();
	    String linea = br.readLine();
	    while (linea != null) {
                if(!detectorPensamientos(linea)){
                    cerebro.ListaP.get(cerebro.ListaP.size() -1).frases.add(linea);  
                }
                linea = br.readLine();
	        //System.out.println(linea);
	        
	    }
	} finally {
	    br.close();
	}
    } 
    private boolean detectorPensamientos(String linea){
        if(linea.startsWith("+")){
            Pensamiento pensamiento = new Pensamiento();
            pensamiento.setNombre(linea.substring(1));
            cerebro.ListaP.add(pensamiento);
            return true;
        }
        return false;
    }
}
