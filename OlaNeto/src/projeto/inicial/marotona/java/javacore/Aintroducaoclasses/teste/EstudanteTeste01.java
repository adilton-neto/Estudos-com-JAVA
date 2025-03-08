package projeto.inicial.marotona.java.javacore.Aintroducaoclasses.teste;

import projeto.inicial.marotona.java.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante varrefenceEstudante = new Estudante();
            varrefenceEstudante.nome = "josé";
            varrefenceEstudante.idade = 20;
            varrefenceEstudante.sexo = 'M';
            varrefenceEstudante.cpf = 01234567;
        Estudante varrefenceEstudante02 = new Estudante();
            varrefenceEstudante02.nome = "neto";

        System.out.println("Quantidades de atributos de indentificão: " + varrefenceEstudante.nome.length());
        System.out.println("Nome: "+varrefenceEstudante.nome + "\n"+ "indentificado como(CPF): " + varrefenceEstudante.cpf+"\nidade: "+varrefenceEstudante.idade + "\nsexo:"+varrefenceEstudante.sexo);
        System.out.println("\n--------------------- \n");
        System.out.println(varrefenceEstudante02.nome);
//        System.out.println(varrefenceEstudante.cpf);
    }
}
