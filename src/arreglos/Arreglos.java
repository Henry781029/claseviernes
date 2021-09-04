
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
        
        persona [ ] personas= new persona[4];
    
       
            for(int i = 0; i<personas.length; i++ ){

                personas [i ] = new persona();
                
                System.out.println("digita el nombre de la persona:" +i);
                
                personas[i].setNombre(entrada.next());
                
                 
            }
            
                System.out.println("*************");
            
          for(int i = 0; i<personas.length; i++ ){

              System.out.println(personas[i].getNombre());
             
   
             
            }

        }
        
    }
    

