package com.company;

public class Coche {
    // atributos
    String color;
    String fabricanta;
    String modelo;
    double peso;
    double largo;
    Integer velocidad = 0;

    // constructor
    public Coche(String color, String fabricanta, String modelo, double peso, double largo,Integer velocidad) {
        this.color=color;
        this.fabricanta=fabricanta;
        this.modelo = modelo;
        this.peso = peso;
        this.largo= largo;
        this.velocidad = velocidad;
    }
    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <= 120){
            this.velocidad += cantidad;
        }        
    }

    public String toString(){
        return "coche{"+
                "color = "+ this.color +
                " fabricanta = "+ this.fabricanta +
                " modelo = "+ this.modelo +
                " peso = "+ this.peso +
                " largo = "+ this.largo +
                " velocidad = "+ this.velocidad + "}";

    }
}
