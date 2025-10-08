package academy.devqa.maratonajava.introducao;

public class Arrays02 {
    public static void main(String[] args) {
        // Retorno de tipos primitivos não inicializados
        // byte, short, int, long, float e double = 0
        // char = '\u0000' -> ' '
        // boolean = false
        // String = null

        String[] nomes = new String[3];
        System.out.print(nomes[0]);
        System.out.print(nomes[1]);
        System.out.print(nomes[2]);
    }
}
