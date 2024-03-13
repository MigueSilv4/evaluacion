/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EvaluacionAct;

/**
 *
 * @author silva
 */
public class SumaMultiplos {
    
    public static void main(String[] args) {
       int suma = 0;
       for (int i = 1; i <= 1000; i++ ){ 
       if (i % 3 == 0 || i % 5 ==0 || i % 4 == 0){
       suma += i;
       }       
       }
       System.out.println("La suma de los multiplos de 3 a 5 entre 1 y 1000 es: " + suma);
    }
}
