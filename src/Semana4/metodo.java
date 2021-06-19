
package Semana4;

import java.util.Scanner;


public class metodo {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el numero de factor de riesgo");
        
        int FactordeRiesgo = sc.nextInt();
        if  (FactordeRiesgo == 1){
         System.out.println("Usted tiene cita dentro de una semana");
        }
        
        if (FactordeRiesgo ==2){
            System.out.println("usted tiene cita dentro de 3 dias");
        }
        
        if (FactordeRiesgo ==3){
            System.out.println("usted tiene cita el dia siguiente");
        }
                
        
        
    }
    
    
}
