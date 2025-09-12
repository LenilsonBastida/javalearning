package academy.devqa.maratonajava.introducao;

public class EstruturasCondicionaisExercSwitch {
    public static void main(String[] args) {
        // Utilizando switch
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte diaDaSemana = 5;
        switch (diaDaSemana) {
            case 1:
                System.out.println("Final de Semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de Semana");
                break;
            default:
                System.out.println("Dia da semana inválida");
                break;
        }
    }
}
