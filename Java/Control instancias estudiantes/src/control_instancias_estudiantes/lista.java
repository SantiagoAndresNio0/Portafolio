
package control_instancias_estudiantes;



public class lista {
    int size ; 
 nodo R ; 
    public lista() {
        this.size = 0;
        this.R = null;
    }
            public int listaSize(){
                return size ; 
            } 
            public boolean listaVacia(){
                if ( R == null){ 
                    return true ; 
                }else{
                    return false; 
                } 
            }
        
         public void addPrimero(alumno valor){
        if(R==null){
                R = new nodo(valor);                
            }else{
                nodo temp = R;
                nodo nuevo = new nodo(valor);
                nuevo.siguiente = temp;
                R = nuevo;
            }   
            size++;
    }
     
         
                    public void addFinal(alumno valor){
        if(R==null){
            R = new nodo(valor);                
        }else{                
            nodo check = R;     
            while(check.siguiente!=null){
                check = check.siguiente;
            } 
            check.siguiente = new nodo(valor);
        }   
        size++;        
    }
                    
            public void mostrarFor(){
        if(listaVacia()){
            System.out.println("La lista esta vacia");
        }else{        
            nodo temp = R;
            for(int i = 0; i<size;i++){
                System.out.println("nodo: "+i+" valor: "+temp.valor);
                temp = temp.siguiente;
            }
        }    
    }

      public void delPrimero(){
        if(listaVacia()){
            System.out.print("La lista esta vacia");
        }else{
            R = R.siguiente;
            size--;
        }    
    }

  public void del(int index){
        if(listaVacia()){
            System.out.print("La lista esta vacia");
        }else{
            if(index <= size ){
                 for(int i = 0; i<size;){
                      R = R.siguiente;
            size--;
               }
                   
                    }
           
        }    
    }
  }
     
         

