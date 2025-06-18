package org.aplicacao;

import org.aplicacao.controller.Produtos;
import org.aplicacao.controller.Relatorios;
import org.aplicacao.controller.Vendas;
import org.aplicacao.model.Venda;
import java.io.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Produtos controller = new Produtos();
        Vendas venda1 = new Vendas();
        Vendas venda2 = new Vendas();
        Venda venda = new Venda();
        Relatorios relatorio = new Relatorios();

        controller.CadastrarProduto("Camiseta", 59.90f, 100);
        controller.CadastrarProduto("Pelicula", 9.90f, 50);
        controller.CadastrarProduto("Boneca", 7.00f, 0);

        System.out.println("=== Lista de Produtos Cadastrados ===");
        controller.listProdutosCadastrados();

        venda1.CadastrarProdutosDisponiveis(controller.buscarProdutoPorNome("Camiseta"));
        venda1.CadastrarProdutosDisponiveis(controller.buscarProdutoPorNome("Pelicula"));
        venda1.CadastrarProdutosDisponiveis(controller.buscarProdutoPorNome("Boneca"));


        System.out.println("\n=== Produtos Disponíveis para Venda ===");
        venda1.listProdutosDisponiveis();
        venda1.efetuarVenda("Pelicula", 10);

        System.out.println("--------------------------------");

        //agora vamos acrecentar o criar relatoruio e concertar a passagem da url e começar a escrever o arquivo assim criando o arquivo, e deoppis o proximo e ultimo passo sera fazelo passar os dadops do objeto venda1 ou venda2 assim por diante para o relatorio
        //problema encontrado aqrquivo sendo criado mas não esta visivel prara o intelijei

//        veja este projeto , esta acontecendo o seguinte problema ao char o metodo criar relatorio, esta criando,
//        porem o relatorio"documento.txt" não esta aparecendo no intelijei,

        relatorio.criaRelatorios(venda2);
    }
}
