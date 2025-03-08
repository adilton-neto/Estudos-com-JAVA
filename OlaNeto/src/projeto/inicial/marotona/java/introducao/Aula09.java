package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Aula 09 - Switch </h1>
 */

public class Aula09 {
    public static void main(String[] args) {
     // switch e uma estrutura condicioal simples, seria como o if e else basico,
     // para simplificar um codigo ja simples, seria o exemplo de para olhar o sexo,, ou dias da semana
     // em vez de fazer vario if{}else if{} para algo simples, fazemos de uma manera mais facil.

        byte dia = 40;
     // os tipos que ele pode ultilizar são char, int, byte, short, enum, String

        switch (dia){
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Quin");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção invalida");
                break;


        }
    }

}

