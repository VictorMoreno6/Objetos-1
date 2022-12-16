package org.example;

public class Cuadrado {
    private int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int perimetro(){
        int perimetraje=lado*4;
        return perimetraje;
    }

    public double area(){
        double areas=lado*lado;
        return areas;
    }
}
