package System.GFoce.br.BintroducaoMetodos.Test;

import System.GFoce.br.BintroducaoMetodos.Dominio.Calculadora;

public class Calculadoratest {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.sutraidoisNumeros();
        System.out.println("finalizando a calculadora");
    }
}
