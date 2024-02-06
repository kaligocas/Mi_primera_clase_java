package com.kata;

public class App {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Angel", "Riveros", "123456789", 1980, "Asturias", 'H');
        Persona persona2 = new Persona("Katherine", "Gomez", 987654321, 1990, "Colombia", 'F');
        
        System.out.println("Persona 1:");
        persona1.imprimir();

        System.out.println("Persona2:");
        persona2.imprimir();
        
       
    }
   

}


