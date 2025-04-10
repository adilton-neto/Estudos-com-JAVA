package org.aplicacao;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // metodo<tipo> nome = new mwtodo<tipo>();
        ArrayList<String> pessoas = new ArrayList<String>();
        pessoas.add("neto");
        pessoas.add("Laisla");
        pessoas.add("Mirele");
        pessoas.add("Kelvin");
        System.out.println(pessoas);
        for (int i = 0; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i));
        }
    }
}