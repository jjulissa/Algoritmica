package com.example.algoritmica;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int horas;
        System.out.println("Ingresa la cantidad de Hora trabajado ");
        horas = entrada.nextInt();

        float tarifa;
        System.out.println("Ingresa la cantidad de tarifa: ");
        tarifa = entrada.nextFloat();

        double sueldo;

        if(horas > 40){
            int horasExtra = horas - 40;
            double nuevaTarifa;
            nuevaTarifa = tarifa + (tarifa * 0.5);
            sueldo = horas * tarifa + horasExtra * nuevaTarifa;
            System.out.println("El Sueldo: " + sueldo);

        }

        else {
            sueldo = horas * tarifa;
            System.out.println("El Sueldo: " + sueldo);
        }
    }
}
