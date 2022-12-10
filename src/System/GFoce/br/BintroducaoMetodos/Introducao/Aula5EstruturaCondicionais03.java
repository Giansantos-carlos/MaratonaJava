package System.GFoce.br.BintroducaoMetodos.Introducao;

public class Aula5EstruturaCondicionais03 {

    public static void main(String[] args) {
        // doar se condicação maior que 500
        double salario = 6000;
        String mensagemDoar = "eu vou doar 500  pro dev dojo";
        String mendagemNaoDoar =  "Ainda nao tenho condiçoes ";
        String retusatado = salario > 5000 ? mensagemDoar : mendagemNaoDoar;

//        if (salario > 5000) {
//            retusatado = mensagemDoar;
//        }else {
//            retusatado = mendagemNaoDoar;
//        }
        System.out.println(retusatado);
    }

}
