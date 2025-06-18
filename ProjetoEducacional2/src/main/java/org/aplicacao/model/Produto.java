package org.aplicacao.model;

public class Produto {
    private static int count = 0;
    private int id;
    private String nome;
    private float preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, float preco, int quantidadeEmEstoque) {
        this.id = ++count;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public float getPreco() { return preco; }
    public int getQuantidadeEmEstoque() { return quantidadeEmEstoque; }

    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(float preco) { this.preco = preco; }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) { this.quantidadeEmEstoque = quantidadeEmEstoque; }

    public void detailProdutos() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Estoque: " + quantidadeEmEstoque);
    }
    @Override
    public String toString() {
        return "Produto {" +
                "nome: " + nome +" " +
                "preco: " + preco +" "+
                "estoque: " + quantidadeEmEstoque +" "+
                "}\n";
    }

}
