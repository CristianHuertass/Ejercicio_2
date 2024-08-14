/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
        
       System.out.println("Digite su año de nacimiento(ingrese 0 para salir del programa): ");
       
       while(true){
           
           int año= entrada.nextInt();
           
           if(año==0){
               System.out.println("Fin del ingreso de datos.");             
               break;
           }
           if(año>2006){
               System.out.println("Menor de edad, no apto para votar.");
           }else{
               System.out.println("Mayor de edad, apto para votar.");
           }
       }
    } 
}
