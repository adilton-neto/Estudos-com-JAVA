package org.aplicacao;

import org.aplicacao.modificadores.Jogador;
import org.aplicacao.modificadores.Pessoa;

public class Main extends Pessoa {
    public static void main(String[] args) {
        System.out.println("Modifcadores de Acesso");
        //- public =
        //- private =
        //- package-private =
        //- protecd =
        Pessoa varPesoa = new Pessoa();
        varPesoa.modificadorPublc();
        Jogador varJogador = new Jogador();
        //so é possivel acessar diretamente o metodo modificadorPublic
                                        // os metodos Private, protecde package-private não e visel aqui

    }
}