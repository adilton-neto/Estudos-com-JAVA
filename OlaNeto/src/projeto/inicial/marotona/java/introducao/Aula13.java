package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Atividade com break</h1>
 */

public class Aula13 {
    public static void main(String[] args) {
        double valorCarro = 75000;
        int quantidadeParcela = 5;
        double valorDeAprovacao = valorCarro / quantidadeParcela;
        if (valorDeAprovacao >= 1000) {
            System.out.println("O seu carro foi aprovado no valor de: " + valorCarro + "R$ Correspondendo a " + quantidadeParcela + " parcelas, saindo cada parcela por: " + valorDeAprovacao);

        } else {
            System.out.println("Tente menos numero de parcelas, o valor da suas parcelas são muito baixo!");
        }

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: "+ parcela + " R$ "+valorParcela);

        }

    }
}
