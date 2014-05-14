/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordena;

/**
 *
 * @author Tamara
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Ordena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              String cadena[]=new String [3];
        String palabra[]=new String [3];
        String matriz[][] = new String[6][6];
        long numeroLineas = 0;
        int fechaActual = 2014;

        try {
            FileWriter fichero = null;
            PrintWriter pw = null;

            FileInputStream fstream = new FileInputStream("/Users/Tamara/Desktop/padrones-beneficiarios-financiamiento-a-bosques.csv");
            DataInputStream entrada = new DataInputStream(fstream);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            fichero = new FileWriter("/Users/Tamara/Desktop/Salida");
            String strLinea;
             pw=new PrintWriter(fichero);
            System.out.println("Leyendo informacion....\n");
            while ((strLinea = buffer.readLine()) != null){
                numeroLineas++;
                 strLinea=strLinea.toUpperCase();
                cadena=strLinea.split(",");
              
             // pw=new PrintWriter(fichero);
                for(int i=cadena.length-1;i>=0;i--){
                    
                    System.out.print(cadena[i]+" ");
                  pw.print(cadena[i]+" ");
                    }
              

            }
            entrada.close();
            fichero.close();
            
             
             
             
            System.out.println("\nFinalizando.... " + numeroLineas + " renglones leidos");

        } catch (Exception e) {
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
    }
    }

