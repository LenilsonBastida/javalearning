package academy.devqa.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritivos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Lenilson";
        String endereco = "Rua Maratona, 123 Marialva-PR";
        double salario = 7555.00;
        String dataRecebimento = "08/09/2025";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimento;

        System.out.println(relatorio);
    }
}
