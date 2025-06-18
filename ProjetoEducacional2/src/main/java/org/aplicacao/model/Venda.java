package org.aplicacao.model;
import java.time.LocalDate;


public class Venda {
    private String nomeProduto;
    private int quantidade;
    private LocalDate dateVenda;  // - aa/mm/dd

    public Venda(String nomeProduto, int quantidade){
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.dateVenda = LocalDate.now();
    }

    public Venda(){
        this.nomeProduto = "";
        this.quantidade = 0;
        this.dateVenda = LocalDate.now();
    }

    public String getNomeProduto() {return nomeProduto;}
    public void setNomeProduto(String nomeProduto) {this.nomeProduto = nomeProduto;}
    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}
    public LocalDate getDateVenda() {return dateVenda;}

    public void vendaSucedida(){
        System.out.println("Venda sucedida de " +quantidade+ "x "+ nomeProduto +
                           "\n na data: " + dateVenda);

    }
}
