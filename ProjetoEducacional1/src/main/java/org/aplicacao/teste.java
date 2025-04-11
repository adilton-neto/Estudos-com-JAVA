package org.aplicacao;

public class teste {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Jogador endo = new Jogador();
        Jogador goenji = new Jogador();
        Jogador sumioca = new Jogador();
        endo.setNome("endo");
        goenji.setNome("goenji");
        sumioca.setNome("sumioca");
        Time zeus = new Time();
        zeus.adicionarJogador(endo);
        zeus.adicionarJogador(goenji);
        zeus.adicionarJogador(sumioca);
        System.out.println("-----");
        zeus.todaylistJogador();
        endo.adicionartecnica("Mão fantasma");
        endo.adicionartecnica("Mão Demoniaca");//esta sobre escrevendo, fazer da forma
        // de time vai ter que considerar
        // habilidade como class e adicionala como um objeto
        endo.adicionartecnica("Soco destruidor");
        endo.listTecnica();
        endo.deleteTecnica("Mão Demoniaca");
        endo.listTecnica();
        System.out.println("teste condicional criar");
        endo.adicionartecnica("  ");
        endo.adicionartecnica("Mão fantasma");
        endo.listTecnica();

    }
}
