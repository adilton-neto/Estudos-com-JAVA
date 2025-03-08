package projeto.inicial.marotona.java.javacore.Bintroducaometodos.teste;

import projeto.inicial.marotona.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora varCalculadora = new Calculadora();
        varCalculadora.soma();
        System.out.println("-----");
        varCalculadora.subtrai();
    }
}
