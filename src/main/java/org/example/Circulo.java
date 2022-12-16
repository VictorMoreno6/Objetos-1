package org.example;

public class Circulo {
    private int radio;
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double perimetro(){
        double perimetraje=(2*Math.PI*radio);
        return perimetraje;
    }

    public double area(){
        double areas=(Math.PI*Math.pow(radio,2));
        return areas;
    }

}
