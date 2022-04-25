/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BusquedapI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose/ Angel
 */
public class EJ6 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        String num;
        Scanner pregunta;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\DAW\\Desktop\\Documentos\\pi-million.txt"));
            ArrayList<String> pi = new ArrayList();
            pregunta = new Scanner(System.in);
            System.out.println("Introduce los numeros a encontrar");
            num = pregunta.next();
            String texto;
            while ((texto = br.readLine()) != null) {
                pi.add(texto);
            }
            for (String string : pi) {
                if (string.contains(num)){
                    System.out.println("Se ha encontrado el numero en la linea: " + string.indexOf(string));
            } else {
                    System.out.println("No se ha encontrado");
                
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }catch (IOException e){
            System.out.println("Ha ocurrido un error");
        } finally {
        br.close();
        }
    }

}
