package System.GFoce.br.AintroducaoClasses.teste;

import System.GFoce.br.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 28;
        estudante.sexo = 'F';

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
    }
}
