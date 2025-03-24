package org.aplicacao.heranca;

public class Funcionario extends Pessoa {
    private int wage;  //salario
    private String time;
    private String clean;

    public Funcionario(){
        wage = 0;
        time = "";
        clean = "";
    }
    public Funcionario(int wage, String time, String clean){
        this.wage = wage;
        this.time = time;
        this.clean = clean;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String getTime() {
        return time;
    }
    public void setTime(String time){
        this.time = time;

    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }
}
