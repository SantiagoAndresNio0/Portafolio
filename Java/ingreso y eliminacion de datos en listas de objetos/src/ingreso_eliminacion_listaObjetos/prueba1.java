package ingreso_eliminacion_listaObjetos;

import java.util.Scanner;


public class prueba1 {
public static void Dhrystone(){
      System.out.println("Bienvenido, ¿Que desea hacer el dia de hoy ?");
            System.out.println("Insertar al inicio. OP:1");
            System.out.println("Insertar al final.  OP:2");
            System.out.println("Insertar despues. OP:3");
            System.out.println("Eliminar. OP:4");
             System.out.println("Mostrar. OP:5");
              System.out.println("Terminar . OP:6");
            System.out.println("");
            System.out.print("Esperando resupesta: ");
} 
    public static void main(String[] args) {
     Scanner L = new Scanner(System.in);
         lista C = new lista(); 
   boolean M = false  ; 
   while(M==false){
       Dhrystone();
       
       byte Ñ = L.nextByte();
       switch(Ñ){
           case 1 : 
                System.out.println("ingrese el nombre ");
                                    String O = L.next();
                                    C.insertarInicio(O);
                                   
                                    break;
               
           case 2 :
              
                System.out.println("inserte aqui un nombre o apellido");
               System.out.println("");
               String q = L.next();
              C.insertarFinal(q);
               break;
           case 3:
                   
                System.out.print("Ingrese el nombre: ");
                String K = L.next();
                System.out.print("inserte numero para guardar:");
                int W = L.nextInt();
                C.insertarDespues(K, W);
               break;
           case 4:
                System.out.print("Ingrese el valor de la lista que desea eliminar: ");
                int E = L.nextInt();
                 
                  C.eliminar(E);
               
                break ; 
                  default:System.out.println("Ingreso el valor equivocado");
           case 5 : 
                   System.out.println("¿mostrar lista?");
                 C.mostrarFor(); 
                 break;   
           case 6: 
               System.out.println("mostrando lista");
               C.mostrarFor();
               
                M=true;
               break;        
   }
        System.out.print("quiere continuar 1 si, 2 no: ");
             int HOLA = L.nextInt();
             if (HOLA==2) {
                 M=true;
    }
    
}
     System.out.println(C.listaSize());
        for(int io=0; io<C.listaSize();io++){
            System.out.println(C.obtener(io));
    }
    }
}
class nodo{
    Object Valor;
    nodo Siguiente;
   private nodo siguiente;
   private nodo anterior;
   private byte valor;
    public nodo(Object valor){
        this.Valor =  valor;
        Siguiente = null;
    }
   
    public void enlazar(nodo n){// enlazar el nodo
            Siguiente = n;
    }
    public Object obtenerValor(){//traer almacenado en el nodo
            return Valor;        
    }    
    public nodo obtenerSiguiente(){//cual es el siguiente
        return Siguiente;        
    }        
}



class lista{
    nodo Cabezera ;
    int size;
   nodo inicio ;
    public lista(){
            Cabezera = null;
            size = 0;
     }
   
    public void insertarInicio(Object libro){//insertar valores al inicio
        nodo inicial = new nodo(libro);
        inicial.Siguiente = Cabezera;
        Cabezera = inicial;
        size++;
    }
    public void insertarFinal(Object libro){//insertar valores al final
         if(listaVacia()==true ){
       nodo inicial = new nodo(libro);
        inicial.Siguiente = Cabezera;
        Cabezera = inicial;
        size++;
               } else{
        nodo nuevo = new nodo(libro);    
        nodo puntero = Cabezera;
        while(puntero.Siguiente !=null){
            puntero = puntero.Siguiente;
        }
        puntero.Siguiente = nuevo;
        size++;        
    }
    }
    public int listaSize(){//tamaño lista
        return size;
    }

    public boolean listaVacia(){//lista esta vacia?
        if(Cabezera==null){
            return true;
        }else{
            return false;
        }
    }    
   
    public Object obtener(int index){
        int contador = 0;
        nodo temporal = Cabezera;
        while(contador<index){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
       
    }
   
   
   
    public void insertarDespues(Object libro,int index){
        if(listaVacia()==true ){
            nodo inicial = new nodo(libro);
        inicial.Siguiente = Cabezera;
        Cabezera = inicial;
        size++;
               } else{
        nodo nuevo = new nodo(libro);
        nodo puntero = Cabezera;
        int cont = 0;
        while(cont<index && puntero.Siguiente !=null){
            puntero = puntero.Siguiente;
            cont++;
        }
        nuevo.Siguiente = puntero.Siguiente;
        puntero.Siguiente = nuevo;
        size++;
    }}
   
    public void eliminarPrimero(){
        Cabezera = Cabezera.obtenerSiguiente();
        size--;
    }
   
    public void eliminar(int index){
        if(listaVacia()==false){
            int contador = 0;
            nodo temporal = Cabezera;
            while(contador < (index -1)){
                temporal = temporal.obtenerSiguiente();              
                
                contador ++;
            }
        temporal.enlazar(temporal.obtenerSiguiente().obtenerSiguiente());
            size--;
        }
    }
    public void mostrarFor(){
        nodo temp= Cabezera; 
        for(int i = 0 ; i<size;i++){
            System.out.println(" nodo " +i+ " dato "+temp.obtenerValor());
            temp= temp.obtenerSiguiente();
        }
    }
    public void mostrarAd(){
        nodo temp= inicio;
        while(temp !=null){
            System.out.println(temp.obtenerValor());
            temp = temp.obtenerSiguiente();
        }
    }

}




