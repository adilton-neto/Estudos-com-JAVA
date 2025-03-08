package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Atividade livre Dois</h1>
 */

public class AtividadeLivreDois {
    public static void main(String[] args) {
//        O programa tem um array de notas de alunos em uma disciplina e precisa classificar cada nota em
//        conceitos (A, B, C, D, ou F). Depois, ele verifica se a média das notas é suficiente para que a
//        turma tenha sido aprovada ou reprovada, considerando que a média mínima para aprovação é 60.
        int notas[] = {
                6,
                9,
                0,
                5,
                10,
                7,
                3,
                7,
                8,
                6
        };

        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            int notaIndividual = notas[i];
//            System.out.println(notaFinal);
            String situacao;
            switch (notaIndividual) {
                case 10:
                case 9:
                    situacao = "A";
                    break;
                case 8:
                    situacao = "B";
                    break;
                case 7:
                    situacao = "C";
                    break;
                case 6:
                    situacao = "D";
                    break;
                default:
                    situacao = "F";
            } // fimdo switch

            System.out.println("Nota: " + notaIndividual + " -- situação: " + situacao);
            soma += notaIndividual;


        }
            double apuracao = soma/notas.length;
            //System.out.println(apuracao);
            if(apuracao >= 6.0){
                System.out.println("Parabens sua turma foi aprovada com media : "+apuracao);
            } else if (apuracao >= 4) {
                System.out.println("Infelismente sua turma não foi aprovada, mas pode tentar uma recuperção. com media : "+apuracao);

            }else {
                System.out.println("Infelismente sua turma não foi aprovada tente novamente na proxima com media : " +apuracao);
            }

        String palavra = "exemplo";

        // Percorrendo cada caractere da palavra
//        for (int i = 0; i < palavra.length(); i++) {
//            char letra = palavra.charAt(i);  // Acessa cada letra pelo índice
//            System.out.println("Letra na posição " + i + ": " + letra);
//        }
    }
}
