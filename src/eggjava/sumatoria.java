
package eggjava;

import java.util.Scanner;


public class sumatoria {

    public static void main(String[] args) {
      
        int num;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Ingrese un numero pos");
            num = leer.nextInt();
            if (num>1000) {
                System.out.println("El programa puede tardar ¿Seguro? s/n");
                String confirma = leer.next();
                if (confirma.equals("s")) {
                    break;
                }
            }
        } while (num<=0 || num>1000);
        
        int j, suma;
        for(int i=1; i<=num ; i++){
            if(i%2!=0)
                continue; //detiene la iteracion y salta a la sigueinte
            suma = 0;
            j=1;
            while (j<=i){
                suma +=j;
                j++;
            }
            System.out.println("La suma de "+i+"numeros naturales es:"+suma);
        }
    }
    
}
