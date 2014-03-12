package Cola;

import NodoYPila.Nodo;

public class Cola<T> {
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
         Nodo dato = new Nodo(inicio.getDato());
            if(inicio == fin){
                inicio = null;
                fin = null;
            }else{
                inicio = inicio.getLiga();
            }
         return dato;

    }
    
    public Nodo peek(){ 
           return inicio; 
    }
    
    public String imprimir(){
        String aux = "";
        while(!vacia()){
            aux = aux + pop();
        }
        return aux;
    }
}
