package org.example;

public class Triangulo {
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
    private int lado;
    private int lado2;
    private int lado3;

    public Triangulo() {

    }
    public Triangulo(int lado, int lado2, int lado3){
        this.lado=lado;
        this.lado2=lado2;
        this.lado3=lado3;
    }
    @Override
    public String toString() {
        return "Triangulo{" +
                "lado=" + lado +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }
    public int perimetro(){
        int perimetraje=lado+lado2+lado3;
        return perimetraje;
    }
    public double area(){
        double semi = (lado+lado2+lado3)/2;
        double areas= (Math.sqrt(semi*(semi-lado)*(semi-lado2)*(semi-lado3)));
        return areas;
    }
}
