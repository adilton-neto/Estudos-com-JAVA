package org.aplicacao.controller;

import org.aplicacao.model.Produto;
import java.util.ArrayList;

public class Produtos {
    private ArrayList<Produto> produto = new ArrayList<>();

    public void CadastrarProduto(String nome, float preco, int quantidadeEmEstoque) {
        Produto novoProduto = new Produto(nome, preco, quantidadeEmEstoque);
        produto.add(novoProduto);
    }

    public void listProdutosDisponiveis() {
        if (produto.size() == 0) {
            System.out.println("Nenhum produto disponoivel.");
            return;
        }
        System.out.println("Produtos disponíveis:");
        for (Produto p : produto) {
            if (p.getQuantidadeEmEstoque() > 0) {
                System.out.println("- " + p.getNome() + " | " + p.getPreco());
            }
        }
    }

    public void listProdutosCadastrados() {
        if (produto.size() == 0) {
            System.out.println("Nenhum Produto cadastrado.");
            return;
        }
        System.out.println("Produtos Cadastrados:");
        for (Produto p : produto) {
                System.out.println("- " + p.getId() + " | " + p.getNome() + " | " + p.getPreco()+ " | " + p.getQuantidadeEmEstoque());

        }
    }

    public ArrayList<Produto> getProduto() {
        return produto;
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto p : produto) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public Produto buscarProdutoPorId(int id) {
        for (Produto p : produto) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public int tamnahoListProduto() {
        return produto.size();
    }


}
