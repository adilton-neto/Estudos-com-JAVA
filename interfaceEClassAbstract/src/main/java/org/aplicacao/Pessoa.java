package org.aplicacao;
// CLasse abstrata, so é usada de modelo pra as outras como no exemplo para a velocista. onde nao
//se pode criar um objeto Pessoa, pois ela é apenas o modelo, pode se criar um objeto Velocista
// na qual herda os metodos de Pessoa.
public abstract class Pessoa{
    private String nome;
    private int idade;
    private String identify;

    public Pessoa(){
        this.nome = " ";
        this.idade= 0;
        this.identify= " ";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }

    public abstract void apresentar();

}
