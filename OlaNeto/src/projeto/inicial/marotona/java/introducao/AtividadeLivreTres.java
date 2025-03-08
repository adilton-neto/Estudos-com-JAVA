package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Atividade Livre tres</h1>
 */

//Uma loja tem uma lista de preços de produtos. O programa deve:
//
//Classificar os produtos em categorias de preços usando switch.
//Calcular o valor total dos produtos.
//Aplicar um desconto de 10% no total se a compra for maior que R$ 200.
//Exibir uma mensagem indicando o valor total e se houve desconto ou não.

public class AtividadeLivreTres {
    public static void main(String[] args) {
        double[] precos = {
                40, 50, 70, 150
        };
        double total = 0;
        for (int i = 0; i < precos.length; i++) {
            double valores = precos[i];
            String categoria;
            if (valores < 50) {
                categoria = " ------- valor Baixo";

            } else if (50 >= valores && valores < 100) {
                categoria = " ------- valor Mediano";

            } else {
                categoria = " ------- valor Alto";
            }

            System.out.println(valores + categoria);

            total += valores;


        }
        double valorDescontado = 0;
        String evidenciaFInal;
        if (total >= 100 && total < 200) {
            valorDescontado = total * 0.95;
            evidenciaFInal = "Valor com desconto de 5%";

        } else if (total >= 200) {
            valorDescontado = total * 0.90;
            evidenciaFInal = "Valor com desconto de 10%";
        } else {
            valorDescontado = total;
            evidenciaFInal = " Não houve Desconto";
        }
        int somar = 40 + 50 + 70 + 150;
//        System.out.println(somar);
        System.out.println("Valor total: " + valorDescontado + " \n" + evidenciaFInal);
    }
}
