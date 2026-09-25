package estudos.oop;

public class AtivoFinanceiro {
    private String ticker;
    private double precoUnitario;
    private int quantidade;

    public AtivoFinanceiro(String ticker, double precoUnitario, int quantidade) {
        this.ticker = ticker;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return this.precoUnitario * this.quantidade;
    }

    public double comprar(int quantidadeComprada) {
        if (quantidadeComprada == 0) {
            System.out.println("Quantidade comprada não pode ser zero.");
            return 0;
        } else if (quantidadeComprada < 0) {
            System.out.println("Quantidade comprada não pode ser negativa.");
            return 0;
        } else {
            this.quantidade += quantidadeComprada;
            double valorTotalCompra = quantidadeComprada * this.precoUnitario;
            System.out.println("Compra realizada: " + quantidadeComprada + " unidades de " + this.ticker + " por R$" + valorTotalCompra);
            return valorTotalCompra;
        }
    }
}
