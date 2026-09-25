package estudos.collections;

import java.util.Queue;

public class FilaAtendimento {

    Queue<String> filaAtendimento;

    void offerAtendimento(String cliente) {
        filaAtendimento.add(cliente);
    }

    void pollAtendimento() {
        String cliente = filaAtendimento.poll();
        if (cliente != null) {
            System.out.println("Cliente atendido: " + cliente);
        } else {
            System.out.println("Não há clientes na fila.");
        }
    }

    void peekAtendimento() {
        String cliente = filaAtendimento.peek();
        if (cliente != null) {
            System.out.println("Próximo cliente na fila: " + cliente);
        } else {
            System.out.println("Não há clientes na fila.");
        }
    }

    void totalClientes() {
        System.out.println("Total de clientes na fila: " + filaAtendimento.size());
    }
}
