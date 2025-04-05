package org.aplicacao.modificadores;

public class Jogador extends Pessoa {
    public static void main(String[] args) {
        Pessoa varPessoa = new Pessoa();
        // sp não se tem acesso ao metodo private
        varPessoa.modificadorPackagePrivate();
        varPessoa.modificadorProteced();
        varPessoa.modificadorPublc();

    }

}
