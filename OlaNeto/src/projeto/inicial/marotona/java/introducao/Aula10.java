package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Aula 10 - Atividade switch</h1>
 */

public class Aula10 {
    public static void main(String[] args) {
        byte dia = 7 ;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIa ultil");
                break;
            default:
                System.out.println("opçao invalida");





        }
    }
}
