package com.example.algoritmica;

import java.util.Scanner;

import static java.sql.DriverManager.println;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero=0;

        System.out.println("Dame Un numero: ");

        numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println(numero + " es par" );
            for(int i=numero; i>=0; i-=2) {
                System.out.println(i);
            }
        }
        else{
            println(numero + " es impar");
            for(int i=numero; i>=1; i-=2) {
                System.out.println(i);
            }
        }
    }
}
