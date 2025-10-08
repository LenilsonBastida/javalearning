package academy.devqa.maratonajava.introducao;

public class Arrays03 {
    public static void main(String[] args) {

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) { // length retorna o tamanho do array
            System.out.println(nomes[i]);
        }
    }
}
