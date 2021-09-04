
package arreglos;
import java.util.Scanner;

public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        
        String prod1 = "cocacola";
        String prod2 = "papa";
        String prod3 = "arroz";
        String prod4 = "cañon de cerdo";
        String prod5 = "pansitos";
        String prod6 = "piña";
        
        int [] numeros= new int[4];
    
       
            for(int i = 0; i<numeros.length; i++ ){

                System.out.println("digita el dato:" +i);
                numeros[i] = entrada.nextInt();
                
                 
                
             
            }
            
            System.out.println("*************");
            
            for(int i = 0; i<numeros.length; i++ ){

                System.out.println(numeros[i]);
                
             
            }

        }
        
    }
    

