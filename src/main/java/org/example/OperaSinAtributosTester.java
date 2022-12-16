package org.example;

import java.util.Scanner;

public class OperaSinAtributosTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros quieres que tenga tu array");
        int tamanyo=sc.nextInt();
        int numeros[]=new int[tamanyo];
        OperacionesArraySinAtributo.cargar(numeros);
        System.out.println(OperacionesArraySinAtributo.listar(numeros));
        System.out.println(OperacionesArraySinAtributo.ordenar(numeros));
        System.out.println("Media: " + OperacionesArraySinAtributo.media(numeros));
        System.out.println(OperacionesArraySinAtributo.invertir(numeros));
    }


}
