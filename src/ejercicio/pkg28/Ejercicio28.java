/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg28;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        String frase;
        System.out.println("Digite una frase: ");
        frase = Teclado.nextLine();

        char[] lista = new char[frase.length()];

        for (int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);
            lista[i] = letra;
        }

        //*********************************
        char[] listaNueva = new char[lista.length];

        for (int i = 0; i < frase.length(); i++) {
            if (lista[i] != ' ') {
                listaNueva[i] = lista[i];
            }
        }
        //*********************************
        System.out.println("La frase sin los espacios es:");
        for (int i = 0; i < listaNueva.length; i++) {

            System.out.print(listaNueva[i]);
        }
        System.out.println(" ");
    }
}
