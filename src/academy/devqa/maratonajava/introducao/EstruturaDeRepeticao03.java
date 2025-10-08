package academy.devqa.maratonajava.introducao;

public class EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // O valor da parcela deve ser >= 1000
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + String.format("%.2f", valorParcela));
        }
    }
}
