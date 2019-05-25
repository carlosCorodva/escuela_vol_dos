/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.componentes;

import SE.entidades.ca_materia;
import SE.entidades.em_sucursal;
import SE.entidades.join.JoinEmpleados;
import SE.entidades.join.JoinMaterias;
import SE.entidades.join.JoinMatriculas;
import SE.entidades.ma_paralelo;
import SE.entidades.us_permiso_curso;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author carlos
 */
public class Combos {

    private static Object[] arregloEmpresa(ArrayList<JoinEmpleados> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "SELECCIONE EMPRESA...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombre_comercial_em();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboEmpresa(ArrayList<JoinEmpleados> lista) {
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
    
    private static Object[] arregloSucursalParaInactivos(ArrayList<em_sucursal> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "SELECCIONE SUSCURSAL...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getNombre_comercial_su();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboSucursalParaInactivos(ArrayList<em_sucursal> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arregloSucursalParaInactivos(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }
    private static Object[] arregloParalelos(ArrayList<JoinMatriculas> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "PARALELO...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getParalelo();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboParalelos(ArrayList<JoinMatriculas> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arregloParalelos(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }
    private static Object[] arregloParalelosRegistrar(ArrayList<ma_paralelo> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "PARALELO...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getParalelo();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboParalelosRegistrar(ArrayList<ma_paralelo> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arregloParalelosRegistrar(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for(int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }
    private static Object[] arregloParalelosActualizar(ArrayList<JoinMatriculas> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "PARALELO...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getParalelo();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboParalelosActualizar(ArrayList<JoinMatriculas> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arregloParalelosActualizar(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for(int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }
    private static Object[] arregloCursos(ArrayList<us_permiso_curso> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "CURSOS...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getCurso();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboCursos(ArrayList<us_permiso_curso> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arregloCursos(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }
    private static Object[] arregloMateria(ArrayList<JoinMaterias> lista) {
        Object[] arreglo = new Object[lista.size() + 1];
        arreglo[0] = "MATERIAS...";
        for (int i = 0; i < lista.size(); i++) {
            arreglo[(i + 1)] = lista.get(i).getMateria();
        }
        return arreglo;

    }

    public static DefaultComboBoxModel listarComboMateria(ArrayList<JoinMaterias> lista) {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        Object[] arreglo = arregloMateria(lista);
        System.out.println(lista.size() + " tam " + arreglo.length);
        for (int i = 0; i < arreglo.length; i++) {
            model.addElement(arreglo[i]);
        }
        return model;

    }
}
