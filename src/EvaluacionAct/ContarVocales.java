/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EvaluacionAct;

/**
 *
 * @author silva
 */
public class ContarVocales {
     public static void main(String[] args) {
        String texto = "Hola mundo";
        int vocales = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (esVocal(letra)) {
                vocales++;
            }
        }

        System.out.println("La cantidad de vocales en el texto es: " + vocales);
    }

    private static boolean esVocal(char letra) {
        return "aeiouAEIOU".contains(String.valueOf(letra));
    }
}

