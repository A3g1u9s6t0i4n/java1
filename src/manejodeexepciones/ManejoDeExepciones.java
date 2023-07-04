
package manejodeexepciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ManejoDeExepciones {

    
    public static void main(String[] args) {
    
     
    try{
        
        int resultado = 3/0 ;
        
    }
    catch(Exception e){
            System.out.println("no se puede dividir por cero");
}
/* 
try{
  int edades [] = {15,23,49,18};
  
        System.out.println("la edad de la posicion 4 es: "+ edades[4]);
}
catch (Exception a){
    System.out.println("estas intentando acceder a una posicion que no existe");
}
*/

try{
    System.out.println(ManejoDeExepciones.Dividir());
    
}
catch(Exception exception){
    System.out.println(exception.getMessage());
    System.out.println("Error: "+ exception);
    System.out.println(exception.fillInStackTrace());
    System.out.println("----------");
    System.out.println(exception.toString());
}
 finally{
     
  
}
    
}
    public static int Dividir(){
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("ingrese el numero a dividir ");
        int num1 = leer.nextInt();
       
        System.out.println("ingrese el divisor");
        int num2 = leer.nextInt();
        
        return num1 / num2;
    }

    
 }

