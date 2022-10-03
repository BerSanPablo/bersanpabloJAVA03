package com.mycompany.bernalpablojava03;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Cuenta {
    private int numeroCuenta;
    private String propietario;
    private GregorianCalendar fechaApertura;
    private float saldo;
    
    public Cuenta(){
        this.numeroCuenta = 0;
        this.propietario = "";
        this.fechaApertura = new GregorianCalendar();
        this.saldo = 0;
    }
    
    public Cuenta(String numeroCuenta, String propietario, String saldo){
        this();
        //Numero de cuenta a int
        if(numeroCuenta.equals("")){
            this.numeroCuenta = 0;
        }
        else{
            this.numeroCuenta = Integer.parseInt(numeroCuenta);
        }
        //Saldo a float
        if(saldo.equals("")){
            this.saldo = 0;
        }
        else{
            this.saldo = Float.parseFloat(saldo);
        }
        //El resto
        this.propietario = propietario;
        this.fechaApertura = new GregorianCalendar();
    }
    
    public Cuenta(String numeroCuenta, String propietario, GregorianCalendar fecha, String saldo){
        this();
        //Numero de cuenta a int
        if(numeroCuenta.equals("")){
            this.numeroCuenta = 0;
        }
        else{
            this.numeroCuenta = Integer.parseInt(numeroCuenta);
        }
        //Saldo a float
        if(saldo.equals("")){
            this.saldo = 0;
        }
        else{
            this.saldo = Float.parseFloat(saldo);
        }
        //El resto
        this.propietario = propietario;
        this.fechaApertura = fecha;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public GregorianCalendar getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(GregorianCalendar fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public String gregorianTexto(){
        return this.fechaApertura.get(Calendar.DAY_OF_MONTH) + "/" + (this.fechaApertura.get(Calendar.MONTH)+1) + "/" + this.fechaApertura.get(Calendar.YEAR);
    }
    
    @Override
    public String toString(){
        return "Numero de cuenta: " + this.numeroCuenta + "\n" +
        "Propietario: " + this.propietario + "\n" +
        "Fecha de apertura: " + gregorianTexto() + "\n" +
        "Saldo: " + this.saldo;
    }
    
}
