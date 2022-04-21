/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ej2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Jose Angel
 */
public class Ej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] notas;
        Integer suma = 0;
        try {
            File f = new File("C:\\Users\\Jose Angel\\Desktop\\Documentos\\alumnos_notas.txt");
            Scanner leer = new Scanner(f);
            while (leer.hasNextLine()) {
                suma = 0;
                notas = leer.nextLine().split(" ");
                for (int i = 2; i < notas.length; i++) {

                    suma = suma + Integer.parseInt(notas[i]);

                }
                System.out.println("Nombre: " + notas[0] + " Apellido: " + notas[1] + "\nNota media: " + (suma / (notas.length - 2)));
            }
        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }

    }

}
