package projeto.inicial.marotona.java.javacore.Bintroducaometodos.teste;


import projeto.inicial.marotona.java.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante varEstudande01 = new Estudante();
        Estudante varEstudande02 = new Estudante();
        Estudante varEstudande03 = new Estudante();

        varEstudande01.nome = "Luffy";
        varEstudande01.idade = 19;
        varEstudande01.sexo = 'M';
        varEstudande01.cpf = 1239788497;


        varEstudande02.idade = 20;
        varEstudande02.sexo = 'F';
        varEstudande02.cpf = 975788097;

        varEstudande03.nome = "Zoro";
        varEstudande03.idade = 22;
        varEstudande03.sexo = 'M';
        varEstudande03.cpf = 1001800094;

        varEstudande01.impressao();
        varEstudande02.impressao();
        varEstudande03.impressao();

    }
}
