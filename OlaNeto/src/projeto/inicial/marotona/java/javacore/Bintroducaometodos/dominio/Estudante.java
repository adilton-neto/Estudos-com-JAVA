package projeto.inicial.marotona.java.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome = "Nenhum nome cadastrado";
    public int idade;
    public char sexo;
    public int cpf;


    public void impressao(){
        System.out.println("-------------------------");
        System.out.println(this.nome);  //this = esse, ou seja esse nome, nome este que esta nesse objeto.
        System.out.println(this.idade);
        System.out.println(this.sexo);
        System.out.println(this.cpf);

    }

}


