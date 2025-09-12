package academy.devqa.maratonajava.introducao;

public class EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        // Resultado tem que ser booleano
        int count = 0;
        while (count < 10) {
            System.out.println("Dentro do while " + count);
            count += 1;
        }

        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        for (count = 0; count < 10; count++) {
            System.out.println("Dentro do for " + count);
        }
    }
}
