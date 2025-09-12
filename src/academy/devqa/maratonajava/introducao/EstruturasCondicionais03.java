package academy.devqa.maratonajava.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Operador ternário - sintaxe: (condicao) ? verdadeiro : falso
        // Doar se salario > 5000

        double salario = 6000;

        String mensagemDoar = "Eu vou doar 500 para o Lenilson!";
        String mensagemNaoDoar = "Eu ainda não tenho condições!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
