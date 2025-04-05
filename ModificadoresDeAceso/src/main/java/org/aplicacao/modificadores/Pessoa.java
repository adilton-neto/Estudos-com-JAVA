package org.aplicacao.modificadores;

public class Pessoa {
    public void modificadorPublc(){
        System.out.println("Tem acesso de todo quais quer lugar");
    }
    private void modificdorPrivate(){
        System.out.println("Tem aceso somente na class criada");
    }
     void modificadorPackagePrivate(){
        System.out.println("Tem acesso em toda o package controler");
    }
    protected void modificadorProteced(){
        System.out.println("Tem acesso em todo pacote e em sub-class(class de herança)");
    }
}
