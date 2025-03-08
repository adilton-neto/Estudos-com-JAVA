package projeto.inicial.marotona.java.introducao;

/**
 * <h1> Aula 15 - Contiuação dos array</h1>
 */
public class Aula15 {
    public static void main(String[] args){


        int numeros [] = {
           1,
           2,
           3,
           4,
           5,
           6,
           7,
           8,
           9,
           10,
           11,
           13,
           14,
           15,
           16,
           17,
           18,
           19,
           20,
           21,
           22,
           23,
           24,
           25,
           26

        }; // fim do array

        //for(int i = 0; i < numeros.length; i++){
          //  System.out.println(numeros[i]);

       // } //fim do for


        for(int num : numeros) {        // Isso é mesmo que o codigo de cima porem abrevidado.
            System.out.println(num);    // SEM TER que passar o tamnaho ou encrementar de um em um,
                                        // porque ele faz isso automaticamente.
                                        // cria uam variavem dois pontos e coloca a variavel do array
                                        // a  variavel tem que ser do mesmo tipo do array


        }










    } // fim do void main
} // fim da class Aula 15
