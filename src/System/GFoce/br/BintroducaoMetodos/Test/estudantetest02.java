package System.GFoce.br.BintroducaoMetodos.Test;

import System.GFoce.br.BintroducaoMetodos.Dominio.Estudante;
import System.GFoce.br.BintroducaoMetodos.Dominio.ImpressoraEstudante;

public class estudantetest02 {

    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Gohan";
        estudante01.idade = 25;
        estudante01.sexo = 'M';

        estudante02.nome = "Videl";
        estudante02.idade = 24;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
