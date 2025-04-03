package org.aplicacao;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Interface");
        Velocista berry = new Velocista();
            berry.setNome("flash");
            berry.setNivel(1);
            berry.correr();
            berry.atravessar();
            berry.CriarClone();

            Velocista zoom = new Velocista();
            zoom.setNome("zoom");
            zoom.setNivel(3);
            System.out.println(zoom.getNome());
            zoom.correr();


    }
}