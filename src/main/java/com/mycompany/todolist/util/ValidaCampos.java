/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist.util;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class ValidaCampos {
    public boolean validaTextField(JTextField campo, 
            String texto){
        if(campo.getText().equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }

    public boolean validarRadioButton(JRadioButton professor, 
                                      JRadioButton diretor, 
                                      JRadioButton secretario) {
        if (!professor.isSelected() && !diretor.isSelected() && !secretario.isSelected()) {
            professor.setBorder(new LineBorder(Color.RED, 2));
            diretor.setBorder(new LineBorder(Color.RED, 2));
            secretario.setBorder(new LineBorder(Color.RED, 2));

            professor.setBorderPainted(true);
            diretor.setBorderPainted(true);
            secretario.setBorderPainted(true);
            return true;
        } else {
            professor.setBorder(new LineBorder(Color.GRAY, 1));
            diretor.setBorder(new LineBorder(Color.GRAY, 1));
            secretario.setBorder(new LineBorder(Color.GRAY, 1));

            professor.setBorderPainted(false);
            diretor.setBorderPainted(false);
            secretario.setBorderPainted(false);
            return false;
        }
    }

     public boolean validaPasswordField(JPasswordField campo, 
            String texto){
        
        String valorCampo = String.valueOf(campo.getPassword());
        
        if(valorCampo.equals(texto)){   
            campo.setBorder(new LineBorder(Color.RED,2));
            return true;
        }else{
            campo.setBorder(new LineBorder(Color.GRAY,1));
            return false;
        }
    }
}
