package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Aula 17 - array - foreach</h1>
 */
public class Aula17 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][3];{
             numeros [0][0] = 31;
             numeros [0][1] = 39;
             numeros [0][2] = 36;
        }
        {
            numeros [1][0] = 23;
            numeros [1][1] = 29;
            numeros [1][2] = 26;

        }
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){  // estava rodando com "0" no lugar do "i"  ,
                System.out.println(numeros[i][j]);       // porque por sorte a quantidade de array na posição 0 era tres tambem.

            }
        } // fim do for
        System.out.println("---------------------------------");

        for (int [] arraybase : numeros){ // basicamnete imprimi o mesmo que o outro de froma resumida
            for (int num : arraybase){
                System.out.println(num);
            }
        }
        // arry multidimrncionais / caso os tamanhos forem diferentes e melhor optar por isso
        System.out.println("--------------------");
        int [][] multidimencionais = new int [3][];{

            multidimencionais[0] = new int[]{
                    1,
                    2
            };
            multidimencionais[1] = new int[]{1,
                    2,
                    3,
                    4
            };
            multidimencionais[2] = new int[6];

        }

        for (int [] arrayBase : multidimencionais){
            System.out.println("\n--------------------");
            for (int num : arrayBase){
                System.out.print(num + " ");
            }

        }


    }
}

