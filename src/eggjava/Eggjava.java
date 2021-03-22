/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggjava;
import javax.swing.JOptionPane;





/**
 *
 * @author Bargas
 */
public class Eggjava{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero,cuadrado;
        int i=1;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero;"));
        while(numero!=0){
            cuadrado = (int)Math.pow(numero,2);
            System.out.println(cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero;"));
            
        }
        
        
        // TODO code application logic here
    }
    
}
