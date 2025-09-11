package academy.devqa.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritméticos + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 * numero02;
        System.out.println(resultado);

        // Operador de resto da divisão %
        int resto = 21 % 2;
        System.out.println(resto);

        // Operadores relacionais < > <= >= == != (sempre retorna valores booleanos)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorIgualQueVinte = 10 >= 20;
        boolean isDezMenorIgualQueVinte = 10 <= 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;
        boolean isDezDiferenteQueDez = 10 != 10;

        System.out.println("Dez é Maior Que Vinte - " + isDezMaiorQueVinte);
        System.out.println("Dez é Menor Que Vinte - " + isDezMenorQueVinte);
        System.out.println("Dez é Maior ou Igual Que Vinte - " + isDezMaiorIgualQueVinte);
        System.out.println("Dez é Menor ou Igual Que Vinte - " + isDezMenorIgualQueVinte);
        System.out.println("Dez é Igual Que Vinte - " + isDezIgualQueVinte);
        System.out.println("Dez é Igual Que Dez - " + isDezIgualQueDez);
        System.out.println("Dez é Diferente Que Dez - " + isDezDiferenteQueDez);

        // Operadores lógicos && (E), || (OU), ! (NÃO), e o ^ (OU exclusivo)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroLeiMenorQueTrinta = idade <= 30 && salario >= 3381;

        System.out.println("Maior Que Trinta esta Dentro da Lei - " + isDentroLeiMaiorQueTrinta);
        System.out.println("Menor Que Trinta esta Dentro da Lei - " + isDentroLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;

        System.out.println("Valor que tenho em conta, posso comprar Playstation 5 - " + isPlaystationCincoCompravel);

        // Operadores de Atribuições += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // -> bonus = bonus + 1000;
        bonus -= 1000; // -> bonus = bonus - 1000;
        bonus *= 2; // -> bonus = bonus * 2;
        bonus /= 2; // -> bonus = bonus / 2;
        bonus %= 2; // -> bonus = bonus % 2;

        System.out.println("O valor do bonus calculado é - " + bonus);

        // Operadores de incremento/decremento ++ --
        int contador = 0;
        contador += 1; // contador = contador +1;
        contador++;
        contador--;
        System.out.println("O contador com incremento/decremento é - " + contador);
    }
}
