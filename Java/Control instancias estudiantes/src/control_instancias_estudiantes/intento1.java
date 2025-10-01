
package control_instancias_estudiantes;

import java.util.Scanner;


public class intento1 {

    public static void yuriko(){
         System.out.println("buenos dias, ¿que desea hacer ? ");
         System.out.println("");
         System.out.println("ingresar estudiante");
         System.out.println("op 1");
         System.out.println(" ");
         System.out.println(" mostrar estudiantes");
         System.out.println("op 2");
              System.out.println(" ");
          System.out.println(" salir ");
         System.out.println("op 3 ");
              System.out.println("  ");
         System.out.println("eliminar ");
              System.out.println(" op 4  ");
         
}
    public static void main(String[] args) {
     
            
                       
   lista A = new lista();
   Scanner P = new Scanner(System.in);
        boolean w = true;
        while (w == true) {
            yuriko();
            
            byte l = P.nextByte() ;
  switch(l){
      case 1 : 
          alumno E = new alumno(); 
          System.out.println("ingrese el nombre del estudiante");
           
                 E.setNombre(P.next()); 
      
     
          System.out.println("ingrese el apellido del estudiante");
        
         E.setApellido(P.next());
          System.out.println("ingrese el programa del estudiante");
        
     E.setPrograma(P.next());
   System.out.println("ingrese la edad del estudiante");
         
         E.setEdad(P.nextByte());
      
           System.out.println("ingrese la cedula del estudiante");
         
       E.setCC(P.nextInt());
       
        A.addPrimero(E);
       
      break ;
      case 2 :
         A.mostrarFor();
           break;
      case 3 :
          w = false ; 
           break;
      case 4 :
     System.out.println("¿estas seguro que quieres eliminar el primero? Y/1 N /2");
     byte hola ; 
     hola = P.nextByte();
     if(hola == 1){   
           A.delPrimero();
           break ;
     }else {
         break;
     }
      
      
          
  } 
    }
    }
    
}
