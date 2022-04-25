/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ej7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable <String, Integer> nuevo = new Hashtable<>();
        Scanner leer;
        File f = new File("C:\\Users\\DAW\\Desktop\\Documentos\\Libros");
        
        try {
            File[] lista = f.listFiles();
            for (File lista1 : lista) {
                BufferedReader br = new BufferedReader(new FileReader(lista1));
                String texto = null;
                while ((texto = br.readLine()) != null){
                nuevo.put(texto, );
                
                
                }
                
            }
           
            
        } catch (Exception e) {
        }
    }
    
}
