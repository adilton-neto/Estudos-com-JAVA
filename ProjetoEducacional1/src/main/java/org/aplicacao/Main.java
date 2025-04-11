package org.aplicacao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Jogador endo = new Jogador("endo", 15,'M', "japao", "reling", "goleiro", 1, "titulo A");
        Jogador goenji = new Jogador("goenji", 16,'M', "japao", "reling", "atacante", 10, "titulo A");
        Jogador sumioca = new Jogador("sumioca", 16, 'M',"japao", "reling", "atacante", 11, "titulo A");
        Jogador tarumaru = new Jogador("tarumaru", 15, 'M',"japao", "reling", "zagueiro", 8, "titulo A");
        Jogador sombra = new Jogador("sombra", 16, 'M',"japao", "reling", "zagueiro", 6, "reserva");
        Jogador viscosa = new Jogador("viscosa", 15,'F', "imperial", "imperial", "meio campo", 9, "titulo A");
        endo.adicionartecnica("mão fantasma");
        endo.adicionartecnica("mão de Deus");
        goenji.adicionartecnica("furacão de fogo");
        sumioca.adicionartecnica("impacto do dragão");
        tarumaru.adicionartecnica("100 folhas");
        sombra.adicionartecnica("desarme");
        viscosa.adicionartecnica("chute atravez de universos");

        Time zeus = new Time("imperial", "kabeiama",13);
        Time imperial = new Time("reiling","kibi",17);
        zeus.adicionarJogador(endo);
        zeus.adicionarJogador(goenji);
        zeus.adicionarJogador(sumioca);
        imperial.adicionarJogador(viscosa);
        zeus.todaylistJogador();
        imperial.todaylistJogador();
        endo.listTecnica();
        goenji.listTecnica();
        sumioca.listTecnica();
        tarumaru.listTecnica();
        sombra.listTecnica();
        viscosa.listTecnica();

    }
}