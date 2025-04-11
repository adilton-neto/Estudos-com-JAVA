package org.aplicacao;

import java.util.ArrayList;

public class Time {
    private String instituto;
    private String treinador;
    private int trofeus;
    private ArrayList<Jogador> time;

    public Time(String instituto, String treinador, int trofeus){
        this.instituto = instituto;
        this.treinador = treinador;
        this.trofeus = trofeus;
        this.time = new ArrayList<>();

    }
    public Time() {
        this.instituto = " ";
        this.treinador = " ";
        this.trofeus = 0;
        this.time = new ArrayList<>();
    }
    public void adicionarJogador(Jogador jogador){
        time.add(jogador);
    }
    public void todaylistJogador(){
        if (time.size() == 0) {
            System.out.println("Nenhum jogador adicionado ao time.");
            return;
        }
        else {
            System.out.println("Jogadores do time:");
            for (int i = 0; i < time.size(); i++) {
                Jogador jogador = time.get(i);
                System.out.println("- " + jogador.getNome());
            }
        }
    }

    public String getNome(){
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }
    public String getInstituto(){
        return instituto;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }
    public String getTreinador(){
        return treinador;
    }

    public void setTrofeus(int trofeus) {
        this.trofeus = trofeus;
    }
    public int getTrofeus(){
        return trofeus;
    }
}
