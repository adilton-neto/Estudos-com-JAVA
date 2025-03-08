package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Aula 08 - Estrutura Condicionais - Exercicio </h1>
 */

public class Aula08 {
    public static void main(String[] args) {
        /*
        imposto por salario netherlands 2020
        £ o   á  £ 34712   imposto de 9.70%
        £ 34713   á  £ 68507   imposto de 37.35%
        £ 68508   imposto de 49.50%
         */

        double salario = 70000;
        double salarioDescontado ;

        if (salario <= 34712){
             salarioDescontado = salario * 0.970;

        } else if (salario >= 34713 && salario <= 68507) {
             salarioDescontado = salario * 0.3735;

        } else  {  //if (salario >= 68508  )
            salarioDescontado = salario * 0.4950;

        }
        System.out.println("Seu salario com o desconto é: " + salarioDescontado);

    }
}
