package org.example;

import java.util.Scanner;

public class testCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo circle=new Circulo();
        System.out.println("Dime el radio");
        int radio=sc.nextInt();
        circle.setRadio(radio);
        System.out.println(circle.perimetro());
        System.out.println(circle.area());
    }
}
