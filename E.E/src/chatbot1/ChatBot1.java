/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatbot1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author TheShogun
 */
public class ChatBot1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Cerebro cerebro = new Cerebro();
        Lector lector = new Lector(cerebro);
        lector.leer();
        ProcesadorEntrada procesador = new ProcesadorEntrada(cerebro);
       /* for (Pensamiento pensamiento : cerebro.ListaP){
            for (String a : pensamiento.frases){
                System.out.println(a);
            }
        }   
        }*/
        //System.out.println(cerebro.frasePE("computadora"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        String text = "";  
        do
        {
            System.out.println("Please enter a string: ");
            text= br.readLine(); 
            System.out.println(cerebro.frasePE(procesador.buscarPalabras(text)));
        }
        while (!text.equals("stop"));
        }    
        
        
    }  

