package academy.devqa.maratonajava.introducao;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Imprima o dia da semana, iniciando o domingo com 1
        // Em Java, a condicional switch aceita os tipos:
        // byte, short, char, int
        // suas classes wrapper (Byte, Short, Character, Integer)
        // enum (desde o Java 5)
        // String (desde o Java 7)

        byte dia = 4;
        switch (dia) {
            default:
                System.out.println("Opção Inválida");
                break;
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválida");
                break;
        }
    }
}
