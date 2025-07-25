/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.controller;

import com.mycompany.todolist.model.Usuario;
import java.util.ArrayList;



public class ControllerUsuario {
    private ArrayList<Usuario> usuarios;

    public ControllerUsuario() {
        this.usuarios = new ArrayList<>();
    }

    public boolean addUsuario(Usuario usuario) {
        // Verifica se o email já está cadastrado
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(usuario.getEmail())) {
                return false;
            }
        }
        return usuarios.add(usuario);
    }

    public Usuario autenticar(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return usuario;
            }
        }
        return null;
    }

    // Método para obter todos os usuários (pode ser útil para testes)
    public ArrayList<Usuario> getUsuarios() {
        return new ArrayList<>(usuarios); // Retorna uma cópia para evitar modificações externas
    }
}