package System.GFoce.br.BintroducaoMetodos.Test;

import System.GFoce.br.BintroducaoMetodos.Dominio.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome =  "gian";
        funcionario.idade = 29;
        funcionario.salarios = new double[]{25.550 , 28.998, 29.557};

        funcionario.imprimeFuncionarios();
    }
}
