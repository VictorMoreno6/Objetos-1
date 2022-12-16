package org.example;

import java.util.Scanner;

public class PuntoTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Punto pt=new Punto();

        System.out.println("Introduce el punto x e y");
        Punto pt2 = new Punto(sc.nextDouble(),sc.nextDouble());
    }
}
