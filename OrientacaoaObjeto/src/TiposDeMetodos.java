import java.util.Scanner;

public class TiposDeMetodos {
    public static void main(String[] args) {
        TiposDeMetodos varreferece = new TiposDeMetodos();
            varreferece.metodos();
            varreferece.apresentar();
            varreferece.apresentar("Raposel", 2);
            System.out.println(varreferece.retonar());

            Scanner sc = new Scanner(System.in);
                System.out.println("digite um ID:");
                int num1 = sc.nextInt();
            System.out.println(varreferece.retonar(num1));


    }
    public void metodos(){
        System.out.println("    4 - tipos de metodos:");
        System.out.println("1. metodo sem retorno e sem parametro, \n" +
                "2. metodo sem retorno e com parametro, \n" +
                "3. metodo com retorno e sem parametro, \n" +
                "4. metodo com retorno e com parametro; ");

    }
    //metodo sem retorno e sem parametro:
    public void apresentar(){
        System.out.println("   1. metodo sem retorno sem parametro");
    }
    //metodo sem retorno e com parametro:
    public void apresentar(String titulo, int edicao){
        System.out.println("   2. metodo sem retorno e comm parametro");
        System.out.println("titulo: "+titulo);
        System.out.println("Editora: "+edicao);

    }
    //metodo com retorno e sem parametro:
    public String retonar(){
       return "   3. metodo com retorno e sem parametro ";
    }
    //metodo com retorno e com parametro:
    public String retonar(int id){
        System.out.println("   4. metodo com retorno e com parametro ");

        if (id == 1){
            return "id 1";
        } else if (id == 0) {
            return "sem id";

        }else {
            return "";
        }
    }
}
