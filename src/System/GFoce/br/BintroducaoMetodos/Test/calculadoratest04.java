package System.GFoce.br.BintroducaoMetodos.Test;

import System.GFoce.br.BintroducaoMetodos.Dominio.Calculadora;

public class calculadoratest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 100;
        int num2 = 150;

        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println("----------------------------");

        System.out.println(num1);
        System.out.println(num2);
    }
}
