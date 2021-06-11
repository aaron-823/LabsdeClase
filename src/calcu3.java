 import java.util.Scanner;
  public class calcu3{
      public static void main(String[] args) {
          
          Scanner leer = new Scanner(System.in);
          int seleccion_de_operacion = 0;
          int numero1 = 0;
          int numero2 = 0;
          int resultado = 0;
          
          do{
              System.out.println("\n");
              System.out.println("seleccione un numero de operacio a realizar: ");
              System.out.println(" 1. -suma:");
              System.out.println(" 2. -resta" );
              System.out.println(" 3. -multiplicacion");
              System.out.println(" 4. -dividir");
              System.out.println(" 5. -salir");
              
              seleccion_de_operacion = leer.nextInt ();
              
                     
                 //si escoge 5 no pide los numeros     
              if(seleccion_de_operacion !=5){
                System.out.print("Inserte un numero: ");
                numero1 = leer.nextInt();
                System.out.print("Inserte otro numero: ");
                numero2 = leer.nextInt();
                }
         
                  
              switch(seleccion_de_operacion){
                  case 1:     
                      seleccion_de_operacion= 1;
                      resultado = numero1 + numero2 ;
                      System.out.print("El resulatado de la suma es: + resultado");
                      break; 
                  case 2: 
                      seleccion_de_operacion= 2;
                      resultado = numero1 - numero2 ;
                      System.out.print("El resulatado de la resta es: + resultado");
                      break;
                  case 3: 
                      seleccion_de_operacion= 3;
                      resultado = numero1 * numero2 ;
                      System.out.print("El resulatado de la multiplicacion es: + resultado");
                      break;
                  case 4:   
                      seleccion_de_operacion= 4;
                      resultado = numero1 / numero2 ;
                      System.out.print("El resulatado de la divicion es: + resultado");
                      break;
              }
  
          }while(seleccion_de_operacion != 5);
          System.out.print("has elejido salir, hast la proxima");
 
      }
  }
      
     
              
  
  
  
  
  
  
  
  
  
  
  
  
  
        
        
