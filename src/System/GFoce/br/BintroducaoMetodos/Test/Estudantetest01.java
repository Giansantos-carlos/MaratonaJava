package System.GFoce.br.BintroducaoMetodos.Test;

import System.GFoce.br.BintroducaoMetodos.Dominio.Estudante;
import System.GFoce.br.BintroducaoMetodos.Dominio.ImpressoraEstudante;

public class Estudantetest01 {

    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Gohan";
        estudante01.idade = 25;
        estudante01.sexo = 'M';

        estudante02.nome = "Videl";
        estudante02.idade = 24;
        estudante02.sexo = 'F';

        impressora.imprimiestudante(estudante01);
        impressora.imprimiestudante(estudante02);

//        System.out.println(estudante01.nome);
//        System.out.println(estudante01.idade);
//        System.out.println(estudante01.sexo);
//
//        System.out.println("---------------------------------------");
//        System.out.println(estudante02.nome);
//        System.out.println(estudante02.idade);
//        System.out.println(estudante02.sexo);
    }
}
