/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciogitub;

import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Olga
 */
public class EjercicioGitub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        int num;
        char cont, cont2;
        
        Scanner lector = new Scanner (System.in);
        
        do{
            System.out.println("Introduzca un numero para mostrar la piramide correspondiente.");
            System.out.println("Cambio adicional para GitHub");
            num = lector.nextInt();
        }while(num<1);
        
        for (cont='A';cont<=(char)('A'+num);cont++){
            for (cont2='A';cont2<cont;cont2++){
                System.out.print(cont2);
            }
            System.out.println();
        }
        for (cont=(char)('A'+num);cont>'A';cont--){
            for (cont2='A';cont2<cont;cont2++){
                System.out.print(cont2);
            }
            System.out.println();
        }
    }
    
}
