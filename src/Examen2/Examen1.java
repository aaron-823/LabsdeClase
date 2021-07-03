
package Examen2;

import java.util.Scanner;
     

public class Examen1 {
    //Que el personal del Ministerio de Economía pueda ingresar una empresa con los siguientes  datos básicos:nombrede  la empresa,provincia donde  se  ubica, cantidad   de 
    //trabajadores totales, cantidad de trabajadores que han tenido COVID-19, monto de ingreso promedio por mes y si la empresa tiene créditos o no actualmente
 
     public static void main(String[] args) {
          String nombredelaempresa = "";
          String provinciadondeseencuentra = "";
          int trabajadores = 0;
          int indCovid = 0; //cantidad de personas con covid
          int ingresopormes = 0;
          int creditos = 0;
          
          
          
          //Provincias
          
           int Sanjose = 1404242;
           int Alajuela = 848146;
           int Cartago = 490903;
           int Heredia = 433677;
           int Guanacaste = 326953;
           int Puntarenas = 410926;
           int Limon = 386862;
        
          
 
    Scanner escaner = new Scanner(System.in);
    
    while (true) {
            System.out.println("Menu\n" + "1) Digitar datos de la empresa\n" + "2) Imprimir informaci\u00f3n completa de la empresa\n" + "3) Monto permitido y tasa de interes\n" + "4) Estado inicial\n" + "5) prestamo" );
                
            int opcion = escaner.nextInt();
            
            switch (opcion){

                case 1 ->  {
                    System.out.println("Digite el nombre de la empresa");
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
            
                }
                
                 case 2 ->  {
                      if (!nombredelaempresa.equals("")) {
                        System.out.println("Datos de la empresa: "
                                + "\n " + nombredelaempresa
                                + "\n " + provinciadondeseencuentra
                                + "\n " + trabajadores
                                + "\n " + indCovid
                                + "\n " + ingresopormes
                                + "\n " + creditos
                             ); 
                             if (indCovid <= 20) {
                            System.out.println("ALERTA!");
                        }   
                        } else {
                        System.out.println("Debe ingresar los datos de la empresa.");
                        }
                      
                      double tcovid =0.0d;
                       double poprovincia=0.0d;
                       double prestamo=0.0d;
                      if(trabajadores==10){
                          tcovid = poprovincia + (prestamo*0.5);
         
                    }      
                }    
            }
        }
    }
}
    


        


    
                
                 
                 
                 



     

