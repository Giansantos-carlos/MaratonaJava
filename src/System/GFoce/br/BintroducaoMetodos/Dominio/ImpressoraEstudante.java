package System.GFoce.br.BintroducaoMetodos.Dominio;

public class ImpressoraEstudante {

    public void imprimiestudante(Estudante estudante){
        System.out.println("---------------------------------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
