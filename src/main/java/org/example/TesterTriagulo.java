package org.example;

import java.util.Scanner;

public class TesterTriagulo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Triangulo test=new Triangulo();
        System.out.println(test);
        System.out.println("Introduce la longitud que quieres que tenga el lado 1 de tu triangulo");
        int lado=sc.nextInt();
        test.setLado(lado);
        System.out.println("Introduce la longitud que quieres que tenga el lado 2 de tu triangulo");
        int lado2=sc.nextInt();
        test.setLado2(lado2);
        System.out.println("Introduce la longitud que quieres que tenga el lado 3 de tu triangulo");
        int lado3=sc.nextInt();
        test.setLado3(lado3);
        System.out.println("Introduce los lados del triangulo");
        Triangulo test1 = new Triangulo(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(test);
        System.out.println(test1);
        System.out.println(test1.perimetro());
        System.out.println(test1.area());

    }
}
