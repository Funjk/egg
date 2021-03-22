
package eggjava;

import java.util.Scanner;


public class vector {
  
    

    public static void main(String[] args) {
        int[] vector;
        vector = new int[2];
        int[] producto = new int[3];
        int[][] matriz = {{4,8,6},{2,1,7}};
        
        System.out.println("Ingrese los valores del vector de tamaño"+vector.length+":");
        Scanner leer = new Scanner(System.in);
        for (int i = 0;i<vector.length; i++){
            System.out.print("v["+i+"]=");
            vector[i]=leer.nextInt();
        }
   
    }
    
}
