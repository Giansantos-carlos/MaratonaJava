package System.GFoce.br.AintroducaoClasses.teste;

import System.GFoce.br.AintroducaoClasses.dominio.Professor;

public class ProfessorTest {

    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Mestre Kann";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
