/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjava;

import java.util.Scanner;

/**
 *
 * @author Bargas
 */
public class encuesta {
    private String atrib1;
   public static void main(String[] args) {
    int opinion;
    
    Scanner leer = new Scanner (System.in); 
    System.out.println("Clasifique de 1 a 5");
    opinion=leer.nextInt();
    if (opinion>=1 && opinion <=5) {
        switch(opinion){
            case 1:
            case 2:
                System.out.println("F");
                break;
            case 3:
                System.out.println("reg");
                break;
                
            case 4:
                System.out.println("b");
                break;
            case 5:
                System.out.println("mb");
                break;    
        }      
    }else if (opinion<0){
        System.out.println("error debe ser mayor a 0");
    }else if (opinion>5){
        System.out.println("error debe ser menor o igual a 5");
    }else {
        System.out.println("Error cualquiera tm");
    }
   }
         
    
}
