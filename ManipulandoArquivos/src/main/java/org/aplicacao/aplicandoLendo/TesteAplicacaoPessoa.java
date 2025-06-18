package org.aplicacao.aplicandoLendo;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TesteAplicacaoPessoa {
    public static void main(String[] args) {
        String caminhoArquivo = "C:/Users/Netto/IdeaProjects/ManipulandoArquivos/src/main/java/org/aplicacao/aplicandoLendo/arquivos/arquivo.txt";
        String[] palavraLinha = new String[7];
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa varPessoa ;

        try{
            InputStream receberArquivo = new FileInputStream(caminhoArquivo);
            InputStreamReader lerArquivo = new InputStreamReader(receberArquivo);
            BufferedReader fragmentaArquivo = new BufferedReader(lerArquivo);
            String linha = fragmentaArquivo.readLine();

//            System.out.println(linha);
            linha = fragmentaArquivo.readLine();

            String nome;
            String cargo;
            double salario;
            String dataNascimento;
            char gender;
            int idade;
            String cpf;

            while (linha != null){
                palavraLinha = linha.split(","); //´+para ultilizar splint so com array

                linha = fragmentaArquivo.readLine();

                nome = palavraLinha[0];
                cargo = palavraLinha[1];
                salario = Double.parseDouble(palavraLinha[2]);
                dataNascimento = palavraLinha[3];
                gender = palavraLinha[4].charAt(0);
                idade = Integer.parseInt(palavraLinha[5]);
                cpf = palavraLinha[6];

                varPessoa = new Pessoa(nome, cargo, salario, dataNascimento, gender, idade, cpf);
                    pessoas.add(varPessoa);
//                varPessoa.apresentar();

            }


                receberArquivo.close();
                lerArquivo.close();
                fragmentaArquivo.close();

        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, "Erro ao ler o arquivo.");
            System.out.println(e);
        }
        for (int i =0;i< pessoas.size(); i++){
            pessoas.get(i).apresentar();
            System.out.println("----------------------");
        }
        System.out.println(pessoas.size());
    }
}
