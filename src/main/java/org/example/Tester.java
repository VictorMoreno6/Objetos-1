package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        OperacionesArray op =new OperacionesArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres que tenga la array");
        int tamanyo = sc.nextInt();
        op.OperacionesArray(tamanyo);
        op.cargar();

        System.out.println(Arrays.toString(op.getNumeros()));
        System.out.println(op.ordenar());
        System.out.println("Media: " + op.media());
        System.out.println(op.invertir());
    }
}
