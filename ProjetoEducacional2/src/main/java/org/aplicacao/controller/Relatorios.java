package org.aplicacao.controller;


import java.io.*;
import java.util.ArrayList;
import java.time.format.*;

public class Relatorios {
    private ArrayList<Vendas> relatorios;

    public Relatorios(){
        this.relatorios = new ArrayList<Vendas>();
    }


    public String criaCaminhoUrlArquivo(Vendas venda){
        String  url = "url_"+venda.getDateVenda();
        String caminhoUrl = "C:/Users/Netto/IdeaProjects/ProjetoEducaciocal2/src/main/java/org/aplicacao/arquivos/"+url+".txt";
        return caminhoUrl;

    }
    public void criaRelatorios(Vendas venda){
        String caminho = criaCaminhoUrlArquivo(venda);
        String caminhoteste = "C:/Users/Netto/IdeaProjects/ProjetoEducaciocal2/src/main/java/org/aplicacao/arquivoss/arquivoteste1.txt";
        System.out.println(caminho);
//        relatorios.add(venda);
        boolean condicaoAcrecescentar = true; // no false ela faz uma sobre escrita ou seja apenas sobre escreve os dados do arquivos os ignorando complem=tamente
        String linha;
        try {
            OutputStream salvarArquivoEscrever = new FileOutputStream(caminho,condicaoAcrecescentar);
            OutputStreamWriter escreveArquivo = new OutputStreamWriter(salvarArquivoEscrever);
            BufferedWriter escritorDeArquivo = new BufferedWriter(escreveArquivo);
            escritorDeArquivo.write("\n Neto");


            escritorDeArquivo.close();// bufferedWriter "escritorDeArquivo" tem que ser o primero a fechar
            salvarArquivoEscrever.close();
            escreveArquivo.close();
        }
        catch (Exception erro) {
            System.out.println("Arquivo não encontrado!");
            erro.printStackTrace();
        }


    }
}

