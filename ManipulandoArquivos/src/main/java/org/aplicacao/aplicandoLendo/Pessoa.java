package org.aplicacao.aplicandoLendo;

public class Pessoa {
    String nome;
    String cargo;
    double salario;
    String dataNascimento;   //Date dataNascimento;
    char gender;
    int idade;
    String cpf;

    public Pessoa(String nome, String cargo, double salario, String dataNascimento, char gender, int idade, String cpf) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.gender = gender;
        this.idade = idade;
        this.cpf = cpf;
    }
    public void apresentar(){
        System.out.println("nome: "+nome);
        System.out.println("cargo: "+cargo);
        System.out.println("salario: "+salario);
        System.out.println("dataNascimento: "+dataNascimento);
        if (gender == 'M'||gender =='m'){
            System.out.println("gender: Masculino");
        }else {
            System.out.println("gender: Feminino");
        }
        System.out.println("idade: "+idade);
        System.out.println("cpf: "+cpf);
    }

}
