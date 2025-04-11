package org.aplicacao;

import java.util.ArrayList;

public class Jogador extends Pessoa implements Habilidade {
    private String time;
    private String instituto;
    private String posicao;
    private int numerocamisa;
    private String atuacao;
    private  ArrayList<String> supertecnica;

    public Jogador(String nome, int idade, char sexo, String time, String instituto, String posicao, int numerocamisa, String atuacao){
        super(nome,idade, sexo);
        this.time = time;
        this.instituto = instituto;
        this.posicao = posicao;
        this.numerocamisa = numerocamisa;
        this.atuacao = atuacao;
        this.supertecnica = new ArrayList<>();


    }

    public Jogador(){
        this.time = " ";
        this.instituto = " ";
        this.posicao = " ";
        this.numerocamisa = 0;
        this.atuacao = " ";
        this.supertecnica = new ArrayList<>();


    }
    @Override
    public void adicionartecnica(String tecnica) {
        boolean existe = false;
        if (tecnica.isBlank()){
            System.out.println("Não é uma tecnica");
        }else{
            for (int i = 0; i < supertecnica.size(); i++) {
                if (supertecnica.get(i).equalsIgnoreCase(tecnica)) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                supertecnica.add(tecnica);
                System.out.println("Tecnica " + tecnica + " adicionado!");
            } else {
                System.out.println("Tecnica '" + tecnica + "' já existe na lista. Não foi adicionado.");
            }
        }
    }

    @Override
    public void listTecnica() {
        System.out.println("tecnicas do jogador: " + getNome());
            for (int i = 0; i<supertecnica.size(); i++){
                System.out.println(" -" + supertecnica.get(i));
            }


    }

    @Override
    public void deleteTecnica(String tecnica) {
        supertecnica.remove(tecnica);
    }



    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumerocamisa() {
        return numerocamisa;
    }

    public void setNumerocamisa(int numerocamisa) {
        this.numerocamisa = numerocamisa;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
