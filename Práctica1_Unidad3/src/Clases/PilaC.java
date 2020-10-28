/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author HiYeaismin 8a
 */
public class PilaC {

    public int tamaño, tos, valorEliminado;
    Object pila[];

    public PilaC() {
        tos=-1;
        pila = new Object[tamaño];
    }

   
    
// <editor-fold defaultstate="collapsed" desc="Getters and Setters">    
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
        
    }
    
    public void inicializararreglo(){        
        pila = new Object[tamaño];
    }
// </editor-fold>      
    
// <editor-fold defaultstate="collapsed" desc="Métodos:">     
    
    public boolean ingresar(int valor) {
        
        if (tos == tamaño - 1) {
            return false;
        } else {
            tos++;
            pila[tos] = valor;
            JOptionPane.showMessageDialog(null, pila[tos]);
            return true;
        }
    }

    public boolean eliminar() {
        if (tos == -1) {
            return false;
        } else {
            valorEliminado = (int) pila[tos];
            tos=tos-1;
            return true;
        }
    }
    
// </editor-fold>       Ingresa, Eliminar.
}
