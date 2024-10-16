package atividade6;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double calcularArea() {
    	return 3.14 * raio * raio;
    }

}
