package estudos.collections;

import java.util.List;

public class ListaTarefas {
    List<String> listaTarefas;

    public ListaTarefas(List<String> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    void addTarefa(String tarefa) {
        listaTarefas.add(tarefa);
    }

    void removerTarefa(String tarefa) {
        listaTarefas.remove(tarefa);
    }

    void totalTarefas() {
        System.out.println("Total de tarefas: " + listaTarefas.size());
    }

    void tarefaExists(String tarefa) {
        if (listaTarefas.contains(tarefa)) {
            System.out.println("A tarefa existe na lista.");
        } else {
            System.out.println("A tarefa não existe na lista.");
        }
    }
}
