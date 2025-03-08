package projeto.inicial.marotona.java.javacore.Bintroducaometodos.teste;

import projeto.inicial.marotona.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora varcalculadora = new Calculadora();
        System.out.println(varcalculadora.testeComRetornoDouble(9,0));
        double result = varcalculadora.testeComRetornoDouble(5,10);
        System.out.println("----\n"+result);

    }
}
