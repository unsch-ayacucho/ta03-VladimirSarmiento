
package arreglos;

import java.util.Scanner;

public class Ejercicio001 {

    public static void main(String[] args) {
        
        int cantidadDatos = 100;
        int datoMenor;
        int datoMayor;
        int aleatorio;
        String rta;
        Scanner entrada = new Scanner(System.in);
   
        do{
           
            datoMenor = 0;
            datoMayor = 20;
        
            for (int i = 1; i<cantidadDatos; i++){
                aleatorio = (int)Math.floor(Math.random()*(datoMayor-datoMenor)+datoMenor);
                System.out.print(aleatorio+" ");
                
            }
            
   
            System.out.print("\ndesea continuar? si/no: ");
            rta = entrada.nextLine();
            if (rta.equals("si")){
                System.out.print("digite el menor :");
                datoMenor=entrada.nextInt();
                System.out.print("digite el mayor :");
                datoMayor=entrada.nextInt();
            
            }

        }
        while(rta.equals("si"));
        
    }   
    
}
        
    

    
        

