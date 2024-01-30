package program;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Auto {

    //Atributos
    private String marca;
    private String modelo;
    private boolean estandar;
    private int litrosGasolina;
    private double precio;
    private Motor motor;
    private Asiento[] asientos;
    private boolean encendido = false;

    //Contructores
    public Auto(){}

    //public Auto(String ford, String s, boolean b, int i, int i1, Motor motor, Asiento[] asientos)
    public Auto(String marca, String modelo, boolean estandar, int litrosGasolina, double precio, Motor motor, Asiento[] asientos) {
        this.marca = marca;
        this.modelo = modelo;
        this.estandar = estandar;
        this.litrosGasolina = litrosGasolina;
        this.precio = precio;
        this.motor = motor;
        this.asientos = asientos;
    }



    //Mecanismos de Acceso

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEstandar() {
        return estandar;
    }

    public void setEstandar(boolean estandar) {
        this.estandar = estandar;
    }

    public int getLitrosGasolina() {
        return litrosGasolina;
    }

    public void setLitrosGasolina(int litrosGasolina) {
        this.litrosGasolina = litrosGasolina;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    //Metodos
    public void Encender(){
        if (encendido)
            println("El auto ya esta encendido");
        else{
            println("Encendiendo auto");
            encendido = true;
        }
    }

    public void Apagar(){
        if (!encendido){
           println("El auto esta apagado...");
        }else {
            println("Apagando el auto...");
            encendido = false;
        }
       /* if(!encendido)
            println("El auto esta apagado");
        else
            println("Apagando auto");*/
    }

    private void println(String msg){
        System.out.println(msg);
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[] asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estandar=" + estandar +
                ", litrosGasolina=" + litrosGasolina +
                ", precio=" + precio +
                ", motor=" + motor +
                ", asientos=" + Arrays.toString(asientos) +
                ", encendido=" + encendido +
                '}';
    }
}
