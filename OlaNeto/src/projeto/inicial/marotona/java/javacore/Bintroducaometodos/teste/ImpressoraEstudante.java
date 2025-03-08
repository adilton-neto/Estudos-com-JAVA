package projeto.inicial.marotona.java.javacore.Bintroducaometodos.teste;

import projeto.inicial.marotona.java.javacore.Bintroducaometodos.dominio.Estudante;

public class ImpressoraEstudante {
    public void impressao(Estudante estudante){
        System.out.println("-------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante.cpf);

        estudante.nome="gohan";
        estudante.nome="gotkens";


    }
}
