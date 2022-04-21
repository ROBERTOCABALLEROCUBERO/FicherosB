/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog.roberto.ejerciciosb;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAW
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, nummayor=0, nummenor;

        try {
            File f = new File("C:/Users/DAW/Desktop/Documentos/numeros.txt");
            Scanner leer = new Scanner(f);
            ArrayList<Integer> nuevo = new ArrayList();
            while (leer.hasNextInt()) {
                numero = leer.nextInt();
                nuevo.add(numero);
                
            }
            for (Integer dato : nuevo) {
                
                if (dato>nummayor){
                
                nummayor = dato;
                
                }
Integer.min(dato, dato);
            }
            System.out.println("El numero mayor es: "+ nummayor);

        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }

    }

}
