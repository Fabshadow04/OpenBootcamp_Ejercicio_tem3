package com.mycompany.openbootcamp_ejercicio_tema3;

import java.util.Scanner;
//Ejercicio hecho por Fabrizio Martinez Tapia 
public class OpenBootcamp_Ejercicio_tema3 {
    //funcion para realizar suma 
    public static int sumar(int a, int b, int c) {
        //se realiza la suma
        int suma = a + b + c;
        //retorna la suma
        return suma;
    }

    //clase principal del programa
    public static void main(String[] args) {
        //creando un objeto de la clase coche
        Coche miCoche = new Coche();
        //para poder capturar los datos del usuario
        Scanner sc = new Scanner(System.in);
        //capturando datos
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = sc.nextInt();
                    //asignando valor a la funcion y mandando los tres parametros a sumar
        int resultado = sumar(num1, num2, num3);
        //Imprimiendo el resultado
        System.out.println("La suma de los tres números es: " + resultado);
        System.out.println("Ejercicio de crear una clase en java");
        sc.close();
        
       //se creo un objeto llamado mi coche del objeto se llama al metodo incrementarPuertas() 
        miCoche.incrementarPuertas();
        //se imprime 
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puerta.");
        
    }
    
}
//clase coche
class Coche {
    //variable privada que solo se puede acceder dentro de la misma clase (Coche)
    private int numPuertas;
    
    //constructor que estable el numero de puertas al crear un objeto
    public Coche() {
        numPuertas = 0;
    }
    //metodo que incrementa el numero de puertas
    public void incrementarPuertas() {
        numPuertas++;
    }
    //metodo que devuelve el numero actual de puertas en el coche
    public int getNumPuertas() {
        return numPuertas;
    }
}
