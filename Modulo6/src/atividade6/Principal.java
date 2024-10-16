package atividade6;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void imprimirAreas(List<Forma> formas) {
        for (Forma forma : formas) {
            System.out.println("A área é: " + forma.calcularArea());
        }
    }

    public static void main(String[] args) {

        Forma circulo1 = new Circulo(5.0);
        Forma retangulo1 = new Retangulo(4.0, 6.0);
        Forma circulo2 = new Circulo(3.0);
        Forma retangulo2 = new Retangulo(3.0, 5.0);


        List<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo1);
        listaFormas.add(retangulo1);
        listaFormas.add(circulo2);
        listaFormas.add(retangulo2);


        imprimirAreas(listaFormas);
    }
}

