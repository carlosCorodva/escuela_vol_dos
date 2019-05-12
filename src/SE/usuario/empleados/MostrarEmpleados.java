/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.usuario.empleados;

import SE.componentes.Crud;
import SE.componentes.Tablas;
import SE.entidades.join.JoinEmpleados;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class MostrarEmpleados extends javax.swing.JDialog {

    /**
     * Creates new form MostrarUsuario
     */
    Crud crud = new Crud();
    ArrayList<JoinEmpleados> listar = null;
    ArrayList<JoinEmpleados> listar2 = null;
    JoinEmpleados objeto = null;
    JoinEmpleados em = null;

    public MostrarEmpleados(java.awt.Frame parent, boolean modal,JoinEmpleados empl) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        jToolBar1.setEnabled(false);
        listar = crud.listarEmpleadosActivosInicio();
        Tablas.cargarJoinUsuario(jtEmpleados, listar);
        btnBuscar.setEnabled(false);
        txtBuscar.setEnabled(false);
        lbId.setText(empl.getId_usuario().toString());
        em=empl;
        lbEmpresa.setText(em.getId_empresa().toString());
        lbSucursal.setText(em.getId_sucursal().toString());
    }
    public MostrarEmpleados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtEmpleados = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnBuscar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        cbFiltro = new javax.swing.JComboBox<>();
        lbId = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtEmpleados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtEmpleados.setRowHeight(25);
        jtEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtEmpleadosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtEmpleados);

        jToolBar1.setRollover(true);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/buscar32.png"))); // NOI18N
        btnBuscar.setText("  BUSCAR  ");
        btnBuscar.setFocusable(false);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBuscar);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dos_personas_32.png"))); // NOI18N
        jButton4.setText("  NUEVO  ");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/actualiza32.png"))); // NOI18N
        jButton2.setText("  ACTUALIZAR  ");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir_32.png"))); // NOI18N
        jButton1.setText("  SALIR  ");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USUARIOS");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setOpaque(true);

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        cbFiltro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE...", "ACTIVO", "INACTIVO", "CODIGO", "CEDULA", "APELLIDOS/NOMB" }));
        cbFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltroActionPerformed(evt);
            }
        });

        lbId.setText("jLabel2");

        lbEmpresa.setText("empresa");

        lbSucursal.setText("sucursal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbSucursal)
                        .addGap(53, 53, 53)
                        .addComponent(lbEmpresa)
                        .addGap(41, 41, 41)
                        .addComponent(lbId)
                        .addGap(86, 86, 86)))
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbId)
                            .addComponent(lbEmpresa)
                            .addComponent(lbSucursal))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "¿DESEA SALIR DEL MODULO USUARIO?", "", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            setVisible(false);
        } else {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        NuevoEmpleado ne = new NuevoEmpleado(new javax.swing.JFrame(), true,em);
        ne.setVisible(true);
        listar = crud.listarEmpleadosActivosInicio();
        Tablas.cargarJoinUsuario(jtEmpleados, listar);
    }//GEN-LAST:event_jButton4ActionPerformed

    public JoinEmpleados devuelveObjetoEmpleado(String datos, ArrayList<JoinEmpleados> listarobj) {
        JoinEmpleados objeto1 = null;
        for (int i = 0; i < listarobj.size(); i++) {
            if (datos.equals(listarobj.get(i).getId_usuario().toString())) {
                objeto1 = listarobj.get(i);
                break;
            }
        }
        return objeto1;
    }

    private void jtEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEmpleadosMousePressed
        int i = 0;
        try {
            if (evt.getClickCount() == 2) {
                i = jtEmpleados.getSelectedRow();
                objeto = devuelveObjetoEmpleado(jtEmpleados.getValueAt(i, 0).toString(), listar);
                if (objeto != null) {
                    System.out.println("holaaaaa");
                    ActualizarEmpleado acc = new ActualizarEmpleado(new javax.swing.JFrame(), true, objeto);
                    acc.setVisible(true);
                    listar.clear();
                    cbFiltro.setSelectedIndex(0);
                    listar = crud.listarEmpleadosActivosInicio();
                    Tablas.cargarJoinUsuario(jtEmpleados, listar);
                }

            }
        } catch (Exception e) {
            Logger.getLogger(MostrarEmpleados.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jtEmpleadosMousePressed
    public void filtro() {
        JoinEmpleados je = new JoinEmpleados();
        int pos = cbFiltro.getSelectedIndex();
        String f = txtBuscar.getText();
        try {
            if (pos == 0) {
                listar = crud.listarEmpleadosActivosInicio();
            }
            if (pos == 1) {
                listar = crud.listarEmpleadosActivosInicio();

            }
            if (pos == 2) {
                listar = crud.listarEmpleadosInactivos();
            }
            if (pos == 3) {
                je.setId_usuario(Long.valueOf(f));
                listar = crud.filtroEmpleadoId(je);
                txtBuscar.setText("");
            }
            if (pos == 4) {
                je.setCedula(f);
                listar = crud.filtroEmpleadoCedula(je);
                txtBuscar.setText("");
            }
            if (pos == 5) {
                je.setApellidos_nombres(f);
                listar = crud.filtroEmpleadoApeNomb(je);
                txtBuscar.setText("");
            }
            Tablas.cargarJoinUsuario(jtEmpleados, listar);
        } catch (Exception e) {
            Logger.getLogger(MostrarEmpleados.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void cbFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltroActionPerformed
        int pos = cbFiltro.getSelectedIndex();
        if (pos == 0) {
            txtBuscar.setText("");
            txtBuscar.setEnabled(false);
            btnBuscar.setEnabled(false);
            listar = crud.listarEmpleadosActivosInicio();
        }
        if (pos == 1) {
            txtBuscar.setText("");
            txtBuscar.setEnabled(false);
            btnBuscar.setEnabled(false);
            listar = crud.listarEmpleadosActivosInicio();

        }
        if (pos == 2) {
            txtBuscar.setText("");
            txtBuscar.setEnabled(false);
            btnBuscar.setEnabled(false);
            listar = crud.listarEmpleadosInactivos();
        }
        if (pos == 3) {
            txtBuscar.setText("");
            txtBuscar.setEnabled(true);
            btnBuscar.setEnabled(true);
            listar = crud.listarEmpleadosActivosInicio();
        }
        if (pos == 4) {
            txtBuscar.setText("");
            txtBuscar.setEnabled(true);
            btnBuscar.setEnabled(true);
            listar = crud.listarEmpleadosActivosInicio();
        }
        if (pos == 5) {
            txtBuscar.setText("");
            txtBuscar.setEnabled(true);
            btnBuscar.setEnabled(true);
            listar = crud.listarEmpleadosActivosInicio();
        }
        Tablas.cargarJoinUsuario(jtEmpleados, listar);
    }//GEN-LAST:event_cbFiltroActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        filtro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            filtro();
        }
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i = jtEmpleados.getSelectedRow();
        if (jtEmpleados.isRowSelected(i) == false) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro");
        }else{
            objeto = devuelveObjetoEmpleado(jtEmpleados.getValueAt(i, 0).toString(), listar);
        if (objeto != null) {
            System.out.println("holaaaaa");
            ActualizarEmpleado acc = new ActualizarEmpleado(new javax.swing.JFrame(), true, objeto);
            acc.setVisible(true);
            listar.clear();
            cbFiltro.setSelectedIndex(0);
            listar = crud.listarEmpleadosActivosInicio();
            Tablas.cargarJoinUsuario(jtEmpleados, listar);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MostrarEmpleados dialog = new MostrarEmpleados(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jtEmpleados;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
