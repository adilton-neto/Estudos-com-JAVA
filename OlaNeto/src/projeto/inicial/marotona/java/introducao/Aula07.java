package projeto.inicial.marotona.java.introducao;

/**
 *<h1>Aula 06 - Estrutura Condicional - Questão</h1>
 */

public class Aula07 {
    public static void main(String[] args) {
        // Questão :

        int idadeJogador = 115;

        if (idadeJogador < 15){
            System.out.println("joga na categoria infantil");
        } else if (idadeJogador >= 15 && idadeJogador <= 18) {
            System.out.println("joga na categoria intermedaria");

        }else{
            System.out.println("jogador aposentado ");
        }
        // outra forma mais limpa e melhor.
        String categoria = "sem categoria";
        if (idadeJogador < 15){
            categoria = "joga na categoria infantil";
        } else if (idadeJogador >= 15 && idadeJogador <= 18) {
            categoria = "joga na categoria intermedaria";

        }else{
            categoria = "jogador aposentado ";
        }
        System.out.println(categoria);

        double salario = 7000;

        // operador ternario uma forma de substituir o if, else; simples
        // (codição) ? verdadeiro : falso
        // onde em verdadeiro seria o if e o falso seria o else, condiçao seria oque vem dentro do parentese

        String mensagemDoar = "Doar dinherio";
        String mensagemNaoDoar = "Não tem condições para doar dinheiro";
        String resultado = salario >= 6000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);


    }
}
