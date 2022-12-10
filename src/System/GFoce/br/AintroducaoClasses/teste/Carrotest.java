package System.GFoce.br.AintroducaoClasses.teste;

import System.GFoce.br.AintroducaoClasses.dominio.Carro;

public class Carrotest {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 =  new Carro();

        carro1 =  carro2;
        carro1.nome = "Ferrai";
        carro1.modelo = "LaFerrai";
        carro1.ano = 2015;

        carro2.nome = "Lamborgini";
        carro2.modelo = "Aventador";
        carro2.ano = 2022;

    System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
    System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }
}
