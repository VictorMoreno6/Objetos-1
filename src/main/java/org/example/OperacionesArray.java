package org.example;

import java.util.Arrays;

public class OperacionesArray {
    public int[] getNumeros() {
        return numeros;
    }

    private int [] numeros;

    public OperacionesArray(){
        numeros = new int[5];
    }
    public void OperacionesArray(int tamanyo){
        numeros=new int[tamanyo];
    }

    public void cargar(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int) (Math.random() * 15);
        }
    }
    public double media(){
        double media =0;
        for (int i = 0; i < numeros.length; i++) {
            media= media+numeros[i];
        }
        media=media/numeros.length;
        return media;
    }

    public String ordenar(){
        int[]ordenado=new int[numeros.length];
        for (int i = 0; i < ordenado.length; i++) {
            ordenado[i]=numeros[i];
        }
        Arrays.sort(ordenado);
        return "Array ordenado: " + Arrays.toString(ordenado);
    }
    public String invertir(){
        int[]invertido=new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i]=numeros[numeros.length-1-i];
        }
        return "Array invertido: " + Arrays.toString(invertido);
    }

}


