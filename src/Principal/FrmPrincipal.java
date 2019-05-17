/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import SE.componentes.Fondo;
import SE.componentes.Variables;
import SE.views.cursos.MostrarCursosForm;
import SE.entidades.em_empresa;
import SE.entidades.em_sucursal;
import SE.entidades.join.JoinEmpleados;
import SE.views.empresa.MostrarEmpresaUnoForm;
import SE.views.empresa.MostrarEmpresaForm;
import SE.views.empresa.MostrarSucursalesForm;
import SE.views.empresa.inactivos.MostrarInactivosForm;
import SE.views.materias.MostrarMateriasForm;
import SE.views.periodo.MostrarPeriodoForm;
import SE.views.usuario.clave.ConfirmacionClaveForm;
import SE.views.usuario.empleados.MostrarEmpleadosForm;
import SE.views.usuario.empleados.NuevoEmpleadoDosForm;
import java.awt.BorderLayout;
import java.awt.Toolkit;

/**
 *
 * @author carlos
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    Variables fondo = new Variables();
    private static final String TITLE = "NOMBRE";
    JoinEmpleados us = null;

    public FrmPrincipal(JoinEmpleados usuario) {
        initComponents();
        us = usuario;
        this.setTitle(fondo.getTitle() + TITLE + "---USUARIO" + " ---" + us.getNombre_comercial_em() + "---");
        this.add(new Fondo(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height), BorderLayout.CENTER);
        jToolBar1.setEnabled(false);
        this.setLocationRelativeTo(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setIconImage(fondo.getIconoVentana());
        System.out.println("usuario: " + usuario.getUsuario()+"   "+usuario.getId_usuario() + usuario.getId_empresa()+usuario.getId_sucursal());
        lbEmpresa.setText(us.getId_empresa().toString());
        lbSucursal.setText(us.getId_sucursal().toString());
        lbIdUsuario.setText(us.getId_usuario().toString());
    }

    public FrmPrincipal() {
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

        jToolBar1 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbNum = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();
        lbSucursal = new javax.swing.JLabel();
        lbIdUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/carpeta add 32.png"))); // NOI18N
        jButton2.setText("  MATRICULA  ");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/calificar 32.png"))); // NOI18N
        jButton1.setText("  EMPRESA  ");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton1);

        btnEmpleados.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dos_personas_32.png"))); // NOI18N
        btnEmpleados.setText("  USUARIO  ");
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmpleados.setFocusable(false);
        btnEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpleados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEmpleados);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesDos/lista 32.png"))); // NOI18N
        jButton3.setText("  CALIFICACION  ");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("USUARIO: ");

        lbUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbUsuario.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("IDENTIFICADOR:");

        lbNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbNum.setText("   ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNum, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbNum)
                    .addComponent(jLabel1)
                    .addComponent(lbUsuario)))
        );

        lbEmpresa.setText("empresa");

        lbSucursal.setText("sucursal");

        lbIdUsuario.setText("usuario");

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("EMPRESA");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenu7.setText("EMPRESA");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem9.setText("CREAR EMPRESAS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem12.setText("ACTUALIZAR EMPRESA");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem12);

        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem10.setText("SUCURSALES");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem11.setText("INACTIVOS");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenu1.add(jMenu7);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem2.setText("USUARIOS");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem7.setText("CAMBIAR CLAVE");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("MATRICULA");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem8.setText("PERIODO LECTIVO");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem3.setText("ALUMNOS");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("CALIFICACION");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem6.setText("CALIFICACION");
        jMenu6.add(jMenuItem6);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("CURSOS");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem4.setText("CURSOS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("MATERIAS");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem5.setText("MATERIAS");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        jMenu8.setText("REPORTES");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu8);

        jMenu3.setText("AYUDA");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem1.setText("SALIR");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIdUsuario)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbEmpresa)
                        .addComponent(lbSucursal)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(lbIdUsuario)
                .addGap(59, 59, 59)
                .addComponent(lbEmpresa)
                .addGap(61, 61, 61)
                .addComponent(lbSucursal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        NuevoEmpleadoDosForm ne = new NuevoEmpleadoDosForm(new javax.swing.JFrame(), true, us);
        ne.setVisible(true);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        MostrarEmpleadosForm me = new MostrarEmpleadosForm(new javax.swing.JFrame(), true, us);
        me.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ConfirmacionClaveForm cc = new ConfirmacionClaveForm(new javax.swing.JFrame(), true, us);
        cc.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        MostrarMateriasForm mm = new MostrarMateriasForm(new javax.swing.JFrame(), true,us);
        mm.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        MostrarCursosForm mc = new MostrarCursosForm(new javax.swing.JFrame(), true,us);
        mc.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        MostrarPeriodoForm mp = new MostrarPeriodoForm(new javax.swing.JFrame(), true,us);
        mp.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        MostrarEmpresaForm me = new MostrarEmpresaForm(new javax.swing.JFrame(), true,us);
        me.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        MostrarEmpresaUnoForm ae = new MostrarEmpresaUnoForm(new javax.swing.JFrame(), true,us);
        ae.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        MostrarSucursalesForm ms = new MostrarSucursalesForm(new javax.swing.JFrame(), true,us);
        ms.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        MostrarInactivosForm mi = new MostrarInactivosForm(new javax.swing.JFrame(), true,us);
        mi.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbNum;
    private javax.swing.JLabel lbSucursal;
    private javax.swing.JLabel lbUsuario;
    // End of variables declaration//GEN-END:variables
}
