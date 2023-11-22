/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actclase3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

    public static List<String> convertirAMayusculas(List<String> listaOriginal) {
        List<String> listaMayusculas = new ArrayList<>();

        for (String str : listaOriginal) {
            listaMayusculas.add(str.toUpperCase());
        }

        return listaMayusculas;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("educación");
        listaOriginal.add("pública");
        listaOriginal.add("gratuita");

        List<String> listaMayusculas = convertirAMayusculas(listaOriginal);

        System.out.println("Lista Original: " + listaOriginal);
        System.out.println("Lista en Mayúsculas: " + listaMayusculas);
    }
}
