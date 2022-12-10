package System.GFoce.br.BintroducaoMetodos.Dominio;

public class Pessoa {
    private String nome;
    int idade;

    public void imprimePessoa(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    private String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("Idade Invalida");
            return;
        }
        this.idade = idade;
    }
}
