package projeto.inicial.marotona.java.javacore.Aintroducaoclasses.teste;

import projeto.inicial.marotona.java.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro varCarro01 = new Carro();
        varCarro01.nome = "Cross FOx";
        varCarro01.modelo = "SUV";
        varCarro01.ano = 2009;

        Carro varCarro02 = new Carro();
        Carro carros = new Carro();
        carros = varCarro02;


        varCarro02.nome = "Civic";
        varCarro02.modelo = "Sedan";
        varCarro02.ano = 1890;
        System.out.println("------ Carro 1 -----");
        System.out.println(varCarro01.nome);
        System.out.println(varCarro01.modelo);
        System.out.println(varCarro01.ano);

        System.out.println("\n------ Carro 2 -----");
        System.out.println(varCarro02.nome);
        System.out.println(varCarro02.modelo);
        System.out.println(varCarro02.ano);


    }
}
