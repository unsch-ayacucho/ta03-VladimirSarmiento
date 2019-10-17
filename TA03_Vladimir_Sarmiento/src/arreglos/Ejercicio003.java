
package arreglos;

import java.util.Scanner;

public class Ejercicio003 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      int CantidadElementos = 100;
      int ElementoMayor = 500;
      int ElementoMenor = 0;
      
      int[] Datos = new int[CantidadElementos];
      int mayor,menor;
      for (int i = 0; i<CantidadElementos; i++ ){
          int aleatorio = (int)Math.floor(Math.random()*(ElementoMayor - ElementoMenor)+ElementoMenor);
          Datos[i]=aleatorio;
          System.out.print(Datos[i]+" ");                  
      }
      
      System.out.println("\n");
      System.out.print("desea saber que le muestre el mayor y el menor? :");
      String rta = entrada.nextLine();
      
      if(rta.equals("si")){
          mayor = menor = Datos[0];
          int contA=0;
          int contB=0;
          for (int i = 0; i<CantidadElementos;i++){
              if(Datos[i]>mayor){
                  mayor=Datos[i];
                  contA = contA+1;
              }
              if(Datos[i]<menor){
                  menor = Datos[i];
                  contB = contB+1;
              }
              
          }
          
          System.out.println("el mayor es: "+mayor);
          System.out.println("el menor es: "+menor);
          
          
      }
     
    
      
    }
    
}
