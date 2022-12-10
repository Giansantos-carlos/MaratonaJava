package System.GFoce.br.BintroducaoMetodos.Test;

import System.GFoce.br.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividiDoisNumeros(10,50);
        System.out.println(result);
        calculadora.imprimiDivisaoDeDoisNumeros(10,0);
    }
}
