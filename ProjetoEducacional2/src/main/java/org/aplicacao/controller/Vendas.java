package org.aplicacao.controller;

import org.aplicacao.model.Produto;
import org.aplicacao.model.Venda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Vendas {
    private ArrayList<Produto> produto;
    private Venda venda;


    public Vendas() {

        this.produto = new ArrayList<>();
        this.venda = new Venda();
    }

    public Vendas(Venda venda) {
        this.venda = venda;
    }

    public void listProdutosDisponiveis() {
        if (produto.size() == 0) {
            System.out.println("Nenhum Produto adicionado a lista de vendas.");
            return;
        }

        System.out.println("Produtos Disponíveis para Venda:");
        for (Produto p : produto) {
            if (p.getQuantidadeEmEstoque() > 0) {
                System.out.println("- " + p.getNome() + " | " + p.getPreco());
            }
        }
    }
    public void efetuarVenda(Object... nomesEQuantidade) { //com os 3 posntos (...) dizemos ao codigo que não se sabe a quantidade exata de parametros fazendo asssim, cria-lo de maneira automatica um array para mim onde rebera seja qlqr tipo primivo, neste caso uma String e um int

        try {
            if (nomesEQuantidade.length % 2 != 0) {
                System.out.println("Erro: Você deve passar pares de nome e quantidade.");
                return;
            }

            for (int i = 0; i < nomesEQuantidade.length; i += 2) {
                String nomeProduto = (String) nomesEQuantidade[i];
                int quantidadeDesejada = (int) nomesEQuantidade[i + 1];
                boolean encontrado = false;
                int quantidadeEmEstoque;

                for (Produto Estoque : produto) {
                    if (Estoque.getNome().equalsIgnoreCase(nomeProduto)) {
                        encontrado = true;

                        if (Estoque.getQuantidadeEmEstoque() >= quantidadeDesejada) {
                            Estoque.setQuantidadeEmEstoque(Estoque.getQuantidadeEmEstoque() - quantidadeDesejada);
//                            System.out.println("Venda realizada: " + quantidadeDesejada + "x " + Estoque.getNome());
                            Venda vendaRealizada = new Venda(nomeProduto, quantidadeDesejada);
                            vendaRealizada.vendaSucedida();
                        } else if (Estoque.getQuantidadeEmEstoque() > 0) {
                            System.out.println("Estoque insuficiente para " + Estoque.getNome() +
                                    ", Vendendo apenas " + Estoque.getQuantidadeEmEstoque());

                            Venda vendaRealizada = new Venda(nomeProduto, quantidadeDesejada);
                            Estoque.setQuantidadeEmEstoque(0);
                        } else {
                            System.out.println(Estoque.getNome()+ " fora de estoque. ");
                        }

                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Produto não encontrado na lista de produtos disponíveis: " + nomeProduto);
                }
            }
       } catch (Exception e) {
            System.out.println("Insira o nome do intem Depois a Quantidade, OBS: Você deve inserir a quantidade seguido do nome!! ");
       }
    }


    public ArrayList<Produto> getProduto() {
        return produto;


    }


    public void setProduto(ArrayList<Produto> produto) {

        this.produto = produto;
    }

    public void CadastrarProdutosDisponiveis(Produto cadproduto) {

        produto.add(cadproduto);
    }

    public int tamnahoListProduto() {

        return produto.size();
    }
    public LocalDate getDateVenda() {
        return venda.getDateVenda();
    }





}
