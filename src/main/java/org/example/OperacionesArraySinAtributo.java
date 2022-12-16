package org.example;

import java.util.Arrays;

public class OperacionesArraySinAtributo {
    public static void cargar(int numeros[]){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= (int) (Math.random()*10);
        }
    }
    public static String listar(int numeros[]){
        return Arrays.toString(numeros);
    }

    public static String ordenar(int numeros[]){
        int ordenado[]= new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            ordenado[i]=numeros[i];
        }
        Arrays.sort(ordenado);
        return "Ordenado " + Arrays.toString(ordenado);
    }

    public static double media(int numeros[]){
        double suma=0;
        for (int i = 0; i < numeros.length; i++) {
            suma = suma+numeros[i];
        }
        return suma/numeros.length;
    }

    public static String invertir(int numeros[]){
        int invertido[]=new int [numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i]=numeros[numeros.length-i-1];
        }
        return "Invertido: " + Arrays.toString(invertido);
    }
}
