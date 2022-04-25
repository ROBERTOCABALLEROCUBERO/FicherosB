/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog.roberto.ejerciciosb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAW
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nombres_mezclados;
        String ruta;
        try {
            System.out.println("Introduce el numero de nombres a generar");
            nombres_mezclados = leer.nextInt();
            System.out.println("Introduce el nombre del archivo");
            ruta=leer.next();
            BufferedReader brnom = new BufferedReader(new FileReader("C:/Users/DAW/Desktop/Documentos/usa_nombres.txt"));
            BufferedReader brape = new BufferedReader(new FileReader("C:/Users/DAW/Desktop/Documentos/usa_apellidos.txt"));
            PrintWriter pw = new PrintWriter(new FileWriter("C:/Users/DAW/Desktop/Documentos/" + ruta));
            ArrayList<String> nombres = new ArrayList();
            ArrayList<String> apellidos = new ArrayList();
            String texto = null;
            while ((texto = brnom.readLine()) != null) {
                nombres.add(texto);
            }
            while ((texto = brape.readLine()) != null) {
                apellidos.add(texto);
            }
            
            for (int i = 0; i < nombres_mezclados; i++) {
                int numero1 = (int)(Math.random()*nombres.size());
                int numero2 = (int)(Math.random()*apellidos.size());
                String nombreyapellido = nombres.get(numero1).concat(" ").concat(apellidos.get(numero2));
                pw.println(nombreyapellido);
            }
            brnom.close();
            brape.close();
            pw.close();
            

        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error");

        } catch (Exception ex) {
            System.out.println("Ha ocurrido un error");
        }

    }

}
