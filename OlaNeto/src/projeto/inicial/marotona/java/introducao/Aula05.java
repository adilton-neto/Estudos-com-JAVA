package projeto.inicial.marotona.java.introducao;

/**
 * <h1>Aula 05 - Operadores</h1>
 */

public class Aula05 {
    public static void main(String[] args) {
        // + (adição); - (subtração); / (divisão); * (multiplicação); % (resto);
        //  < (menor que); > (maior que); == (igual a ); != (diferente de);
        // && (and);  || (or);  ! (diferente);
        // = (recebe)  e os outros foram so para economisar codigo +=; -=; *=; /=; %=;


        int numer1 = 10;
        int numer2 = 20;
        System.out.println(numer2 - numer1);
        System.out.println(numer1 + numer2 + " valor:" + numer1 + numer2);
        //o segundo fica 1020 porque depois de uma string o
        // java cosidera que tudo depois é uma string não um int

        double bonus = 1000;
        bonus = bonus + 2000; // isso e o mesmo
        bonus += 3000; //disso

        System.out.println(bonus);

        //dai surgiu o ++
        int contador = 0;
        contador += 1;  // isso e o mesmo
        contador++;    // disso, porem so funciona com o 1 ou somando ou subtraindo.

        System.out.println(contador);

    }
}
