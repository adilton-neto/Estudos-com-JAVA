//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa varPessoa1 = new Pessoa();
        Pessoa varPessoa2 = new Pessoa("Neto", 18,"999.999.999-00");
        Pessoa varPessoa3 = new Pessoa();
        varPessoa2.impressao();
        System.out.println("-------------");

        varPessoa1.setNome("Laisla");
        varPessoa2.setNome("Adilton Neto");
        varPessoa3.setNome("BILLY");
        System.out.println(varPessoa1.getNome());
        System.out.println(varPessoa2.getNome());
        System.out.println(varPessoa3.getNome());
    }
}