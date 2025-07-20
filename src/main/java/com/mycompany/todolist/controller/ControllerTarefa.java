/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.controller;

import com.mycompany.todolist.model.Tarefa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class ControllerTarefa {
    private ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        listaDeTarefas.add(tarefa);
    }

    public void editarTarefa(int index, Tarefa tarefa) {
        if (index >= 0 && index < listaDeTarefas.size()) {
            listaDeTarefas.set(index, tarefa);
        }
    }

    public void excluirTarefa(int index) {
        if (index >= 0 && index < listaDeTarefas.size()) {
            listaDeTarefas.remove(index);
        }else{
            JOptionPane.showMessageDialog(null, "Nenhuma tarefa selecionado para exclusão", "Erro ao excluir tarefa", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Tarefa> getListaDeTarefas() {
        return listaDeTarefas;
    }

    public Tarefa getTarefa(int index) {
        if (index >= 0 && index < listaDeTarefas.size()) {
            return listaDeTarefas.get(index);
        }
        return null;
    }
}
