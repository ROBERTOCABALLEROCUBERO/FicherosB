/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog.roberto.ejerciciosb;

import java.io.File;

/**
 *
 * @author DAW
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] s;
        s = new char[26];

        File directorio;
        try {
            directorio = new File("C:\\Users\\DAW\\Desktop\\Documentos\\Diccionario");
            directorio.mkdir();
            for (int i = 0; i < 26; i++) {
                s[i] = (char) ('A' + i);
                
            }

        } catch (Exception e) {
        }

    }

}
