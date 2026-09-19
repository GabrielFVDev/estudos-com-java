package estudos.tiposprimitivos;

/*
Pratica

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/

public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Paulin bacana";
        String endereco = "Rua da casa do diabo";
        int salario = 5000;
        String data = "10/09/2026";;

        System.out.print("Eu " + nome + ", morando no endereco " + endereco + ", confirmo que recebi o salario de R$" + salario + ", na data" + data);
    }
}
