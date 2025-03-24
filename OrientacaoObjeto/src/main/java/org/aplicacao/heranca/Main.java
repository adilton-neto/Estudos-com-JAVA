package org.aplicacao.heranca;

public class Main {
    public static void main(String[] args) {
        //apredendo Herança
//        herança so conseguimos reutilizar os mestodos nao e possivel reultiliazr os atributos e construtores.

        Pessoa varPessoa = new Pessoa("cleiton", (short) 18, "9999", 'M', "casado", (short) 0);
        System.out.println(varPessoa.getName());
        System.out.println(varPessoa.getSon());
        varPessoa.fazerFilho();
        varPessoa.fazerFilho();
        System.out.println(varPessoa.getSon());

        System.out.println("-------------------");

        Funcionario varfuncionario = new Funcionario(1000, "comercial", "banheiro cima");
        varfuncionario.fazerFilho();
        System.out.println(varfuncionario.getSon());
        varfuncionario.setName("vercelau");
        varfuncionario.setMarialStatus("casado");
        varfuncionario.fazerFilho();
        System.out.println("Olá "+varfuncionario.getName() +" voce virou pai de " + varfuncionario.getSon()+" filho");

        System.out.println("-----------------------");

        Frentista varFrentista = new Frentista();
        varFrentista.setName("mermão");
        System.out.println(varFrentista.getName());
        varFrentista.abastecer(50);
        System.out.println(varFrentista.cobrar());
        varFrentista.fazerFilho();
        System.out.println(varFrentista.getSon());
        System.out.println(varFrentista.haveClean("bannheiro e vitrine"));
        System.out.println(varFrentista.getClean());
        System.out.println("----------");
        Gerente vargerente = new Gerente();
        vargerente.pagarwage();

    }
}