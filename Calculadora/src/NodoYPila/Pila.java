package NodoYPila;

public class Pila<T> {
    Nodo inicio;
    Nodo fin;

    public boolean vacia(){
        if(inicio == null)
            return true;
        else
            return false;
    }
    
    public void push(T dato){
        Nodo nuevo = new Nodo(dato);
        if(vacia()){
            inicio = nuevo;                       
            fin = nuevo;
        }else{
            fin.setLiga(nuevo);
            fin = nuevo;
        }
    }
    
    public Nodo pop(){ 
        
        if(vacia())
            return null;
        else{
            if(inicio == fin){
                Nodo res = new Nodo(inicio.getDato());
                inicio = null;
                fin = null;
                return res;
            }else{
                Nodo p = inicio;
                while(p.getLiga()!=fin){
                    p=p.getLiga();
                }
                Nodo q = new Nodo(fin.getDato());
                fin = p;
                fin.setLiga(null);
                return q;
            }
        }
        
    }
    
    public Nodo peek(){ 
           return fin; 
    }
    
    public String imprimir(){
        String aux = "";
        while(!vacia()){
            aux = aux + pop().getDato();
        }
        return aux;
    }
}
