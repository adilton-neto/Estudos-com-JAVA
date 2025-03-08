package projeto.inicial.marotona.java.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void soma(){      // void == significa que não retona nada que esta vazio, saida e diferente que retornar algo.
        System.out.println(10+10);

    }
    public void subtrai(){
        System.out.println(40-10);
    }
    public void multiplicaComParametros(float num1, float num2){
        System.out.println(num1*num2);
        float variavelTeste = (num2*num1)/10;
        System.out.println(variavelTeste);
    }
    public double testeComRetornoDouble(double num1, double num2){
        if (num1 > 0 && num2 > 0){
            return num1/num2;
        }else {
            return 0;
        }

    }
}
