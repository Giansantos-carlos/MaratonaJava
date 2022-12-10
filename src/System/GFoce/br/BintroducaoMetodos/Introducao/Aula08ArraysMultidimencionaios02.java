package System.GFoce.br.BintroducaoMetodos.Introducao;

public class Aula08ArraysMultidimencionaios02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[3];
        arrayInt[1] = new int[]{1,2,3,4,5,6};
        arrayInt[2] = new int[]{1,2,3,4,5,6,7,8,9};

        int[][] arrayInt2 = {{1,2,3}, {1,2,3,5,6}, {1,2,3,4,5,6,7,8,9}};

        for (int[] arrayBase: arrayInt2){
            System.out.println("\n -------------");
            for (int num : arrayBase ){
                System.out.print(num + " ");
            }
        }
    }
}
