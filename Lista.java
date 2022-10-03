package com.mycompany.bernalpablojava03;

public class Lista {
    private Nodo nodo;
    
    public Lista(){
        this.nodo = null;
    }
    
    public Lista(Nodo inicio){
        this();
        this.nodo = inicio;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
    
    public void anterior(){
        if(nodo.getAnterior() == null){
            System.out.println("No se puede retroceder, se encuentra al inicio de la lista.");
            return;
        }
        nodo = nodo.getAnterior();
    }
    
    public void siguiente(){
        if(nodo.getSiguiente() == null){
            System.out.println("No se puede avanzar, se encuentra al final de la lista.");
            return;
        }
        nodo = nodo.getSiguiente();
    }
    
    public void inicio(){
        while(nodo.getAnterior() != null){
            nodo = nodo.getAnterior();
        }
    }
    
    public void ultimo(){
        while(nodo.getSiguiente() != null){
            nodo = nodo.getSiguiente();
        }
    }
    
    public void nuevoNodo(Nodo nuevo){
        if(nodo == null){
            nodo = nuevo;
        }
        else{
            this.ultimo();
            this.getNodo().setSiguiente(nuevo);
            nuevo.setAnterior(this.getNodo());
            siguiente();
        }
    }
    
    public void borrarNodo(){
        if(nodo.getAnterior() == null && nodo.getSiguiente() == null){
            nodo = null;
        }
        else{
            if(nodo.getAnterior() == null){
                siguiente();
                nodo.setAnterior(null);
            }
            else{
                Nodo aux = this.getNodo().getSiguiente();
                anterior();
                nodo.setSiguiente(aux);
                aux.setAnterior(nodo);
            }
        }
    }
    
    public void modificarCuenta(String numeroCuenta, String propietario, String fecha, String saldo){
            Cuenta actual = (Cuenta)this.getNodo().getContenido();
            actual.setNumeroCuenta(Integer.parseInt(numeroCuenta));
            actual.setPropietario(propietario);
            actual.setSaldo(Float.parseFloat(saldo));
            }
    
    public void mostrarLista(){
        inicio();
        while(nodo.getSiguiente()!= null){
            System.out.println(nodo);
            siguiente();
        }
        System.out.println(nodo);
    }
}
