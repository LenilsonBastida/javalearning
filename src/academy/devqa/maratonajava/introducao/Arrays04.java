package academy.devqa.maratonajava.introducao;

public class Arrays04 {
    public static void main(String[] args) {
        // Formas de inicializar arrays
        int[] numeros1 = new int[4];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        System.out.println("--------------------------------");
        // foreach forma simplificada do for acima
        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
