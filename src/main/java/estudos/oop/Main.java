package estudos.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println("---");

        AtivoFinanceiro itau = new AtivoFinanceiro("ITUB4", 32.50, 100);

        itau.calcularValorTotal();

        itau.comprar(50);

        AtivoFinanceiro ativoNulo = null;

        try {
            ativoNulo.calcularValorTotal();
        } catch (NullPointerException e) {
            System.out.println("Erro: Tentativa de acessar um objeto nulo.");
        }
    }
}
