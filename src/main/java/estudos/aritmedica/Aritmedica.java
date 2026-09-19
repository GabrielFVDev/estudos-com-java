package estudos.aritmedica;

import java.util.ArrayList;

public class Aritmedica {
    public static void main(String[] args) {
        // aritmedico
        // + - / *


        boolean teste = 20 > 9;
        System.out.println(teste);


        // teste

        double salario = 1000;
        salario += 1000;

        System.out.println(salario);

        int contador = 0;
        System.out.println(++contador);


        boolean outroteste = false;

        if (outroteste == true) {
            System.out.println("teste");
        } else {
            System.out.println("fodase");
        }

        ArrayList<Integer> listaDinamica = new ArrayList<Integer>();
        listaDinamica.add(1);
        listaDinamica.add(2);

        System.out.println(listaDinamica.get(1));
        System.out.println(listaDinamica.size());

        System.out.println(listaDinamica);

        listaDinamica.removeLast();

        System.out.println(listaDinamica.size());
        System.out.println(listaDinamica);

        if (listaDinamica.contains(2)) {
            System.out.println("tem o 2");
        } else {
            System.out.println("nao tem o 2");
        }

        listaDinamica.add(2);
        listaDinamica.add(2);
        listaDinamica.add(2);
        listaDinamica.add(2);


        System.out.println("bloco fora de execução");

        if (listaDinamica.isEmpty()) {
            for (Integer integer : listaDinamica) {
                System.out.print(integer);
            }
        }

        int i = 0;
        do {
            System.out.println("execução" + i);
            i++;
        } while ( i <= 10);
    }
}
