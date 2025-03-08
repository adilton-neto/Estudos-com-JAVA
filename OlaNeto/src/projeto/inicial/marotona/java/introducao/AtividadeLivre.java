package projeto.inicial.marotona.java.introducao;

/**
 * <h2>Atividade livre - para testar conhecimento</h2>
 */

public class AtividadeLivre {
    public static void main(String[] args) {
        int numero = 79;
        String RespostaNumero ;
        if (numero >= 5){
            RespostaNumero = "numero grande";

        } else{
            RespostaNumero = "numero pequeno";

        }

        String numeroCondicao;
        switch (numero % 2){
            case 0:
                numeroCondicao = "Número Par";
                break;
            case 1:
                numeroCondicao = "Número Impar";
                break;
            default:
                numeroCondicao = "Número Inexistente";
                break;

        }


        System.out.println("Seu numero é " + RespostaNumero + " e " + numeroCondicao);
        System.out.println(numero % 2);
    }
}
