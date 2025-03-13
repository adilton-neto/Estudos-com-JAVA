public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String cpf;

    //construtor padrão
    public Pessoa(){
        nome = "";
        idade = 0;
        cpf = "";
    }
    //contrutor que recebe parametros
    public Pessoa(String nome,int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    //metodo GET = permite que acesse o valor desta variavel determinada
    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    //metodo SET = é possivel alterar essa informação pelo class main
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void impressao(){
        System.out.println( nome + " "+idade+" "+cpf);
    }
}

