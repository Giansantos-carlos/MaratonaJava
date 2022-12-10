package System.GFoce.br.BintroducaoMetodos.Introducao;

public class Aula08ArraysMultidimencionaios {
    public static void main(String[] args) {

        int[][] dias = new int[3][3];

        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[0][2 ] = 29;


        dias[1][0] = 28;
        dias[1][1] = 27;
        dias[1][2] = 26;
//        System.out.println(dias[0][0]);
//        System.out.println(dias[0][1]);
//        System.out.println(dias[0][2]);

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-----------------------------------------------------");

        for(int[] arrBase: dias ){
            for(int num: arrBase)
                System.out.println(num);
        }
    }
}
