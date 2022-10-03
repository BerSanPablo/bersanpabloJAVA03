package com.mycompany.bernalpablojava03;

public class Nodo<Generico>{
    private Generico contenido;
    private Nodo anterior;
    private Nodo siguiente;
    
    public Nodo(){
        this.contenido = null;
        this.anterior = null;
        this.siguiente = null;
    }
    
    public Nodo(Generico contenido){
        this();
        this.contenido = contenido;
    }
    
    public Nodo(Generico contenido, Nodo anterior, Nodo siguiente){
        this();
        this.contenido = contenido;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Generico getContenido() {
        return contenido;
    }

    public void setContenido(Generico contenido) {
        this.contenido = contenido;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public String toString(){
        return this.contenido.toString();
    }
}
