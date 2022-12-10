package System.GFoce.br.BintroducaoMetodos.Dominio;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void sutraidoisNumeros() {
        System.out.println(10 - 20);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num2 * num);
    }

    public double dividiDoisNumeros(double num1, double num2) {
        return num1 / num2;
    }

    public void imprimiDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("nao existe divisão por zero");
            return;
        } else {
            System.out.println(num1 / num2);
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("dentro do altera numeros");
        System.out.println("Num1 " +num1);
        System.out.println("Num2 " +num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println(soma);
    }





}
