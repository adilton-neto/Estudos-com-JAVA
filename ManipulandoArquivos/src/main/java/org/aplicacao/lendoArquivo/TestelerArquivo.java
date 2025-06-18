package org.aplicacao.lendoArquivo;

import java.io.*;

public class TestelerArquivo {
    public static void main(String[] args) {
        //ler arquivo
        String arquivo = "C:/Users/Netto/IdeaProjects/ManipulandoArquivos/src/main/java/org/aplicacao/lendoArquivo/arquivos/arquivo.txt"; //caminho do arquivo
        try {
            InputStream receberArquivo = new FileInputStream(arquivo);
            InputStreamReader learquivo = new InputStreamReader(receberArquivo);
            BufferedReader fragmentaArquivo = new BufferedReader(learquivo);
            String linha =  fragmentaArquivo.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = fragmentaArquivo.readLine();
            }
            receberArquivo.close();
            learquivo.close();
            fragmentaArquivo.close();
        }catch (FileNotFoundException erroachararquivo){
            System.out.println("arquivo não encontrado");
            System.out.println(erroachararquivo.getMessage());
        } catch (IOException erroNull) {
            throw new RuntimeException(erroNull);
        }

    }
}
