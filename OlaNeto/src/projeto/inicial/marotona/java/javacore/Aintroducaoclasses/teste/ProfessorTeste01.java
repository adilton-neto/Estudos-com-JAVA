package projeto.inicial.marotona.java.javacore.Aintroducaoclasses.teste;

import projeto.inicial.marotona.java.javacore.Aintroducaoclasses.dominio.Professor;
import projeto.inicial.marotona.java.javacore.Bintroducaometodos.dominio.Calculadora;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor varProfessor = new Professor();
        varProfessor.nome = "Radivas";

        System.out.println(varProfessor.nome);
        System.out.println("---Metodos Calculadora---");
        Calculadora varCalculadora = new Calculadora();
        varCalculadora.soma();
    }
}
