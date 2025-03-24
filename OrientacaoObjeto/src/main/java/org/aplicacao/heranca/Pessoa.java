package org.aplicacao.heranca;

public class Pessoa {
    private String name;
    private short year;
    private String cpf;
    private char gender;
    private String marialStatus;
    private short son;


    public Pessoa(){
        name = "";
        year = 0;
        cpf = " ";
        gender =' ';
        marialStatus = "";
        son = 0;


    }
    public Pessoa(String name, short year, String cpf, char gender, String marialStatus, short son){
        this.name = name;
        this.year = year;
        this.cpf = cpf;
        this.gender = gender;
        this.marialStatus = marialStatus;
        this.son = son;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public short getYear(){
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getMarialStatus(){
        return marialStatus;
    }

    public void setMarialStatus(String marialStatus) {
        this.marialStatus = marialStatus;
    }
    public short getSon(){
        return son;
    }
    public void setSon(short son){
        this.son = son;
    }

    public short fazerFilho(){
        if (marialStatus.equals("casado")){
            if (son == 0){
                System.out.println("fazendo filho... ");
                System.out.println("Parabéns você virara Papai");
            }else{
                System.out.println("fazendo filho... ");
            }
            return son++;
        }else {
            System.out.println("Não é possivel fazer filho! \n" +
                               "Estabeleça uma união primeiro.");
            return 0;
        }
    }
}
