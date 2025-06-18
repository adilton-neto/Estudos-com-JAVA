package org.aplicacao.escrevendoArquivo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscreverArquivo {
    public static void main(String[] args) {
//        System.out.println("Hello word");/
        String caminho = "C:/Users/Netto/IdeaProjects/ManipulandoArquivos/src/main/java/org/aplicacao/aplicandoLendo/arquivos/arquivoTeste16-06-2025.txt";
        String linha;
        boolean condicaoAcrecescentar = true; // no false ela faz uma sobre escrita ou seja apenas sobre escreve os dados do arquivos os ignorando complem=tamente
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