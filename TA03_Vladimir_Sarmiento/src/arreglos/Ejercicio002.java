
package arreglos;

import java.util.Scanner;

public class Ejercicio002 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int CantidadDatos = 10;
        int[] Datos = new int[CantidadDatos];
        
        System.out.println("por favor digite los datos:  ");
        for (int m=0; m<CantidadDatos; m++){
            System.out.print((m+1)+". dato :");
            Datos[m] = entrada.nextInt();
            
        }
        System.out.println("\nARRAY INICIAL: ");
        System.out.print("indice: ");
        
        for(int n =0; n<CantidadDatos; n++){
            System.out.print(n+" ");
    
        }
 
        System.out.print("\nvalor : ");
        for(int p = 0; p<CantidadDatos; p++){
            System.out.print(Datos[p]+" ");
            
        }
        
        for(int A = 0;A<CantidadDatos;A++){ //buscar los numeros primos
            int contD = A+1;
            int contPrimos1 = 0;
            for (int a=1;a<=Datos[A];a++){
                if(Datos[A]%a==0){
                    contPrimos1 = contPrimos1 +1;                   
                }               
            }
           
            if(contPrimos1 ==2){
                
                for (int B = A-1; B>=0; B--){ 
                    int contadorPrimos2 = 0;
                    for(int b = 1;b<=Datos[B];b++){
                        if(Datos[B]%b==0){
                            contadorPrimos2 = contadorPrimos2+1;                        
                        }
                        
                    }
                    if(contadorPrimos2!=2){
                        contD = contD-1;
                        int Auxilio = Datos[contD];
                        Datos[contD] = Datos[B];
                        Datos[B] = Auxilio;
                        
                        
                    }
    
                }
                
            }
            
            
        }
        System.out.println("\n");
        System.out.println("NUEVA ARRAY: ");
       
        System.out.print("indice: ");   
        
        for(int n =0; n<CantidadDatos; n++){
            System.out.print(n+" ");
    
        }
 
        System.out.print("\nvalor : ");
        for(int p = 0; p<CantidadDatos; p++){
            System.out.print(Datos[p]+" ");
            
            
        }
        System.out.println("\n");
    }
    
}
