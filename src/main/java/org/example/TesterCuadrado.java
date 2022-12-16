package org.example;

import java.util.Scanner;

public class TesterCuadrado {
    public static void main(String[] args) {
        Cuadrado cua= new Cuadrado();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del lado");
        int lado=sc.nextInt();
        cua.setLado(lado);
        System.out.println(cua.perimetro());
        System.out.println(cua.area());
    }
}
