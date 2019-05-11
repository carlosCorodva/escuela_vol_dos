/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.componentes;

import SE.entidades.em_empresa;
import SE.entidades.em_sucursal;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinEmpresaSucursal;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author carlos
 */
public class Combos {

    private static Object[] arregloEmpresa(ArrayList<em_empresa> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "SELECCIONE EMPRESA...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombre_comercial_em();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboEmpresa(ArrayList<em_empresa> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arregloEmpresa(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }
    
    private static Object[] arregloSucursal(ArrayList<JoinEmpleados> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "SELECCIONE SUSCURSAL...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombre_comercial_su();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboSucursal(ArrayList<JoinEmpleados> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arregloSucursal(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }
}
