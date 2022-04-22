/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BusquedapI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String usuario, num;
        Scanner leer, pregunta;
        File f;
        try {
            ArrayList<String> pi = new ArrayList();
            f = new File("C:\\Users\\Jose Angel\\Desktop\\Documentos\\pi-million.txt");
            leer = new Scanner(f);
            pregunta = new Scanner(System.in);
            System.out.println("Introduce los numeros a encontrar");
            num = pregunta.next();
            while (leer.hasNextLine()) {
                usuario = leer.nextLine();
                pi.add(usuario);
            }
            for (String string : pi) {
                if (num.contains(string)){
                    System.out.println("Se ha encontrado el numero en la linea: " + string.indexOf(string));
            }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        }catch (Exception e){
            System.out.println("Ha ocurrido un error");
        }
    }

}
