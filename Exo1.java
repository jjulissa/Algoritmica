package com.example.algoritmica;

import java.util.Scanner;

import static java.sql.DriverManager.println;

public class Exo1 {

    Scanner entrada = new Scanner(System.in);
    int numero;

        System.out.println("Leer número: ");
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
