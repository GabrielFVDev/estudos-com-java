package estudos.ciencia;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lista (collection) resultado");

        List lista = new ArrayList();

        lista.add(1);
        lista.add("TEste");

        System.out.println(lista);

        System.out.println("----");

        System.out.println("Lista (baixo nivel, vulgo array) resultado");
        int[] array = new int[10];

        array[0] = 1;
//        array[1] = "Teste";

        System.out.println(array);


        // A diferença entre lista e array, é que array é baixo nivel, suportando apenas um tipo de dado
        // enquanto lista é "alto" nivel,  suportando qualquer tipo de dado, mas com um custo de performance maior.
    }
}
