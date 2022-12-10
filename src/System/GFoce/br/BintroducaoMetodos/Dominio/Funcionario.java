package System.GFoce.br.BintroducaoMetodos.Dominio;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;
    private double media = 0;

    public void imprimeFuncionarios() {
        System.out.println(nome);
        System.out.println(idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media Salarial e :" + media);
    }

    public double getMedia() {
        return media;
    }
}
