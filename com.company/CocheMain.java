package com.company;
public class CocheMain {
    public static void main(String[] args) {
        String coche = "toyota";
        Coche cocheObj = new Coche("String color", "String fabricanta", "String modelo", 100, 1.3, 0);
        cocheObj.acelerar(50);
        System.out.println(cocheObj);
    }
}
