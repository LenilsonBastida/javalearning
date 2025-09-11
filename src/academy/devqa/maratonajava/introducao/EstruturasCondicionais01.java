package academy.devqa.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("ELSE - Não Autorizado a comprar bebida alcoolica");
        }

        // Se não é autorizado, podemos utilizar o operador de negação "!"
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não Autorizado a comprar bebida alcoolica");
        }

        System.out.println("Fora do if");
    }
}
