
package Examen2;

import java.util.Scanner;
     

public class Examen1 {
    //Que el personal del Ministerio de Economía pueda ingresar una empresa con los siguientes  datos básicos:nombrede  la empresa,provincia donde  se  ubica, cantidad   de 
    //trabajadores totales, cantidad de trabajadores que han tenido COVID-19, monto de ingreso promedio por mes y si la empresa tiene créditos o no actualmente
 
     public static void main(String[] args) {
          String nombredelaempresa = "";
          String provinciadondeseencuentra = "";
          int trabajadores = 0;
          int indCovid; //cantidad de personas con covid
          int ingresopormes = 0;
          int creditos = 0;
 
    Scanner escaner = new Scanner(System.in);
    
    while (true) {
            System.out.println("Menu \n1) Digitar datos de la empresa\n2) Imprimir información completa de la empresa" + "\n3) Monto permitido y tasa de interes \n4) Estado inicial");
                
            int opcion = escaner.nextInt();
            
            switch (opcion){

                case 1: {
                    System.out.println("Digite el nombre");
                    nombredelaempresa = escaner.next();
                    System.out.println("Digite la cantidad de trabajadores");
                    trabajadores = escaner.nextInt();
                    System.out.println("Digite los ingresos por mes");
                    ingresopormes = escaner.nextInt();
                    System.out.println("Digite los creditos actuales");
                    creditos = escaner.nextInt();
                    System.out.println("Digite la cantidad de trabajadores con covid");
                    indCovid = escaner.nextInt();
                     System.out.println("Digite la provincia");
                    provinciadondeseencuentra = escaner.next();
                    
            
            
            
            
            
                
            break;
    
}
}
}
     }
}