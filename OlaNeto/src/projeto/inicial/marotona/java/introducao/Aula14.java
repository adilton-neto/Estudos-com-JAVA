package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Aula 14 - Array</h1>
 */
public class Aula14 {
    public static void main(String[] args) {

        boolean [] booleans = new boolean[5];
        String [] nomes = new String [3];

        // System.out.println(idades[1]);
        //System.out.println(booleans[2]);
        //System.out.println(nomes[1]);



        int [] idades = new int[5];{
            idades[0] = 71;
            idades[1] = 91;
            idades[2] = 42;
            idades[3] = 61;

        }

        String [] pessoas = new String [11];{
            pessoas[0] = "cláudio" ;
            pessoas[1] = "Neto";
            pessoas[2] = "Neto";
            pessoas[3] = "Luffy";
            pessoas[4] = "ACE";
            pessoas[5] = "Sabo";
            pessoas[6] = "Dragon";
            pessoas[7] = "Zoro";
            pessoas[8] = "Nami";
            pessoas[9] = "Choopp";
            pessoas[10] = "Yuri";

        }

        for(int i = 0; i < pessoas.length; i++){
            System.out.println(pessoas[i]);
        }


        for(int i = 0; i < idades.length; i++){      // se substituir o 5"qauntidade do array por "nomes.length"" ,
                                        // ele puxa automaticamente a quantidde desse espaços do array.
            System.out.println(idades[i]);
        }


        //Tamanho do Array calculado de forma automatia. seguindo a mesma logica porem de forma mais simples

        int[] numeros = {
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                10,

        };

        for (int n = 0;n < numeros.length;n++){
            System.out.println(numeros[n]);
        }


        String entidades [] ={
                "",
               "aqui começa String",
                "laisla",
                "0",
                "neto",
                "curso"


        };

        for (int i = 0; i < entidades.length; i++){

            System.out.println(entidades[i]);
        }






    }
}
