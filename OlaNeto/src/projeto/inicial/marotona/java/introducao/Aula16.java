package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Aula 16 - array multidimrncionais</h1>
 */

public class Aula16 {
    public static void main(String[] args) {
        int[][] mutiplicos = new int[3][3];
        {
            mutiplicos[0][0] = 31;
            mutiplicos[0][1] = 28;
            mutiplicos[0][2] = 10;
        }
        {
            mutiplicos[1][0] = 31;
            mutiplicos[1][1] = 29;
            mutiplicos[1][2] = 30;

        }
        //System.out.println(mutiplicos[1][1]);

        for (int i = 0; i < mutiplicos.length; i++) {
            for (int j = 0; j < mutiplicos[i].length; j++) {//enquanto a variavel j for menor que  variavel multiplos do
                System.out.println(mutiplicos[i][j]);    //segundo array encrementar mais uma possiçao ao segundo array,
                                                         //ou seja  [0][0],,[0][1] ...



            }// for do segundo array varialvel j
        }// for do primeiro array varialvel i
    }
}
