package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Aula 06 - Estrutura Condicional</h1>
 */

public class Aula06 {
    public static void main(String[] args) {
        int idade = 17;
        boolean isIdadeMaiorCompra = idade >= 18;
        if (isIdadeMaiorCompra) {
            System.out.println("pode comprar bebida");
        }
        if (idade >= 18){
            System.out.println("pode comprar 2 bebidas");
        }else {
            System.out.println("não pode comprar bebida");
        }



    }
}
