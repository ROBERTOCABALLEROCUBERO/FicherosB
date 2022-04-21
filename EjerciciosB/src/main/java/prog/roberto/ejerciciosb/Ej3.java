/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog.roberto.ejerciciosb;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author DAW
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
BufferedReader br = null;
PrintWriter pw = null;
        try {
            ArrayList<String> ordenar = new ArrayList();
            br = new BufferedReader(new FileReader("C:/Users/DAW/Desktop/Documentos/usa_personas.txt"));
            pw = new PrintWriter(new FileWriter("C:/Users/DAW/Desktop/Documentos/usa_personas_sorted.txt"));
            String info = null;
            while ((info = br.readLine()) != null) {
                ordenar.add(info);
            }
            Collections.sort(ordenar);
            for (String ordeno : ordenar) {
                pw.println(ordeno);
                System.out.println(ordeno);
            }
            br.close();
            pw.close();

        } catch (FileNotFoundException a) {
            System.out.println("Archivo no encontrado");
        } catch (Exception e) {

            System.out.println("Ha ocurrido un error");
        } finally {
            br.close();
            pw.close();
            
        }

    }

}
