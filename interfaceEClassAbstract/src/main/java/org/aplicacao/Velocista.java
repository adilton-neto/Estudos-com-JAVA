package org.aplicacao;

public class Velocista extends Pessoa implements Habilidades {
    private int nivel;
    private String corDeNome;

    public Velocista(){
        this.nivel = 0;

    }

    @Override
    public void apresentar() {
        System.out.println("helo, I´m the velocista scarlat");

    }

    public Velocista(int nivel, String corDeNome){
        this.nivel = nivel;
        this.corDeNome = corDeNome;
    }
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getCorDeNome(){
        return corDeNome;
    }

    public void setCorDeNome(String corDeNome) {
        this.corDeNome = corDeNome;
    }

    @Override
    public void correr() {

            if(nivel == 1){
                System.out.println("Velocista iniciante");
            } else if (nivel == 2) {
                System.out.println("Velocista intermediario");
            } else if (nivel >= 3) {
                System.out.println("Velocista avançado");
            }else{
                System.out.println("Não se enquadra como Velocista");

            }

    }

    @Override
    public void atravessar() {
        String condicacao;
        nivel = this.nivel;
        if ( nivel >= 2){
            condicacao = "liberado";
            System.out.println(condicacao);
        } else{
            condicacao = "Bloqueado";
            System.out.println( condicacao + " Velocista " + getNome() + " precisa treinar mais");
        }
    }

    @Override
    public void CriarClone() {
        String condicacao;
        nivel = this.nivel;
        if (nivel >= 3){
            condicacao = "liberado";
            System.out.println("Liberado");
        }
        else {
            condicacao = "bloqueado";
            System.out.println(condicacao + " Requer nivel mais avançado");
        }

    }
}
