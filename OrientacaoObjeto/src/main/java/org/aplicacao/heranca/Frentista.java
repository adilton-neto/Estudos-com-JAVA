package org.aplicacao.heranca;

public class Frentista extends Funcionario{
    private int valor;

    public void abastecer(int valor){
        this.valor = valor;
        System.out.println("Abastecendo " + valor);
    }

    public String haveClean (String clean){
        this.setClean(clean);
        return "Fazendo limpeza do " + clean;
    }

    public String cobrar(){
        this.valor = valor;
        System.out.println("dinheiro ou cartão ?");
        return " Pagamento recebido no valor de " + valor + " reais";
    }
}
