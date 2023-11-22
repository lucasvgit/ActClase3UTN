/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actclase3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static String concatenarPalabras(List<String> listaPalabras, int longitudMinima) {
        return listaPalabras.stream()
            .filter(palabra -> palabra.length() > longitudMinima)
            .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        List<String> listaPalabras;
        listaPalabras = Arrays.asList("java", "actividad", "programación", "código", "flattening", "lambdas");
        int longitudMinima = 5;

        String resultadoConcatenacion = concatenarPalabras(listaPalabras, longitudMinima);

        System.out.println("Lista de Palabras: " + listaPalabras);
        System.out.println("Palabras con más de " + longitudMinima + " caracteres: " + resultadoConcatenacion);
    }
}


