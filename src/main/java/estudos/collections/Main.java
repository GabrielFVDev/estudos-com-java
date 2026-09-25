package estudos.collections;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas(new ArrayList<>());
        listaTarefas.addTarefa("Estudar Java");
        listaTarefas.addTarefa("Fazer exercícios");
        listaTarefas.totalTarefas();
        listaTarefas.tarefaExists("Estudar Java");

    }
}
