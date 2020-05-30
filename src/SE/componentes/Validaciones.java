/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.componentes;

import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinMatriculas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class Validaciones {
    
    Crud c = new Crud();

    public static boolean buscarCedulaEmpleados(ArrayList<JoinEmpleados> lista, String cedula) {
        boolean valor = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCedula().equals(cedula)) {
                valor = true;
                break;
            } else {
                valor = false;
            }
        }
        return valor;
    }

    public static boolean validarCedulaEmpedos(ArrayList<JoinEmpleados> lista, String cedula) {
        boolean valor = false;
        if (cedula.length() < 10) {
            valor = false;
        } else if (cedula.length() > 19) {
            valor = false;
        } else {
            boolean valor1 = buscarCedulaEmpleados(lista, cedula);
            if (valor1 == true) {
                JOptionPane.showMessageDialog(null, "Cedula ya existente");
                valor = false;
            } else {
                valor = true;
            }
        }
        return valor;
    }
    public static boolean buscarCedulaAlumnos(ArrayList<JoinMatriculas> lista, String cedula) {
        boolean valor = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getCedula().equals(cedula)) {
                valor = true;
                break;
            } else {
                valor = false;
            }
        }
        return valor;
    }

    public static boolean validarCedulaAlumnos(ArrayList<JoinMatriculas> lista, String cedula) {
        boolean valor = false;
        if (cedula.length() < 10) {
            valor = false;
        } else if (cedula.length() > 10) {
            valor = false;
        } else {
            boolean valor1 = buscarCedulaAlumnos(lista, cedula);
            if (valor1 == true) {
                JOptionPane.showMessageDialog(null, "CEDULA YA EXISTENTE");
                valor = false;
            } else {
                valor = true;
            }
        }
        return valor;
    }
}
