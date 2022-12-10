package System.GFoce.br.BintroducaoMetodos.Test;

import System.GFoce.br.BintroducaoMetodos.Dominio.Pessoa;

public class Pessoatest01 {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("goten");
        pessoa.setIdade(-5);

        pessoa.imprimePessoa();

    }
}
