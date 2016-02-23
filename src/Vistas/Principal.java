/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import java.awt.Toolkit;


/**
 *
 * @author Max Ricardo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("recursos/icono.png"));


        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CD_UsuarioNoRegistrado = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        EscritorioPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MeUsuario = new javax.swing.JMenu();
        MeIngresar = new javax.swing.JMenuItem();
        MeCerrar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        MeEquipos = new javax.swing.JMenu();
        MeAgregar = new javax.swing.JMenuItem();
        Me_Clientes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MeReEquipos = new javax.swing.JMenuItem();

        CD_UsuarioNoRegistrado.setTitle("Mensaje de error");
        CD_UsuarioNoRegistrado.setResizable(false);
        CD_UsuarioNoRegistrado.setType(java.awt.Window.Type.POPUP);

        jLabel3.setText("El usuario no está registrado");

        javax.swing.GroupLayout CD_UsuarioNoRegistradoLayout = new javax.swing.GroupLayout(CD_UsuarioNoRegistrado.getContentPane());
        CD_UsuarioNoRegistrado.getContentPane().setLayout(CD_UsuarioNoRegistradoLayout);
        CD_UsuarioNoRegistradoLayout.setHorizontalGroup(
            CD_UsuarioNoRegistradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CD_UsuarioNoRegistradoLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        CD_UsuarioNoRegistradoLayout.setVerticalGroup(
            CD_UsuarioNoRegistradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CD_UsuarioNoRegistradoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        CD_UsuarioNoRegistrado.getAccessibleContext().setAccessibleParent(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Préstamo de Equipos");
        setIconImage(getIconImage());

        javax.swing.GroupLayout EscritorioPanelLayout = new javax.swing.GroupLayout(EscritorioPanel);
        EscritorioPanel.setLayout(EscritorioPanelLayout);
        EscritorioPanelLayout.setHorizontalGroup(
            EscritorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        EscritorioPanelLayout.setVerticalGroup(
            EscritorioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        MeUsuario.setText("Usuario");

        MeIngresar.setText("Ingresar");
        MeIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeIngresarActionPerformed(evt);
            }
        });
        MeUsuario.add(MeIngresar);

        MeCerrar.setText("Cerrar Sesión");
        MeCerrar.setEnabled(false);
        MeCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeCerrarActionPerformed(evt);
            }
        });
        MeUsuario.add(MeCerrar);

        jMenuBar1.add(MeUsuario);

        jMenu2.setText("Mantenimiento");

        jMenuItem4.setText("Usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Categorías");
        jMenu2.add(jMenuItem5);

        MeEquipos.setText("Equipos");
        MeEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeEquiposActionPerformed(evt);
            }
        });

        MeAgregar.setText("Agregar");
        MeAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeAgregarActionPerformed(evt);
            }
        });
        MeEquipos.add(MeAgregar);

        jMenu2.add(MeEquipos);

        Me_Clientes.setText("Clientes");
        Me_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Me_ClientesActionPerformed(evt);
            }
        });
        jMenu2.add(Me_Clientes);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Reservas");

        MeReEquipos.setText("Reserva de Equipos");
        MeReEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeReEquiposActionPerformed(evt);
            }
        });
        jMenu3.add(MeReEquipos);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void MeCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MeCerrarActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void MeEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeEquiposActionPerformed
        
    }//GEN-LAST:event_MeEquiposActionPerformed

    private void MeAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeAgregarActionPerformed
        MantenimientoEquipos creaEquipo = new MantenimientoEquipos();
        EscritorioPanel.add(creaEquipo);
        creaEquipo.show();
    }//GEN-LAST:event_MeAgregarActionPerformed

    private void Me_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Me_ClientesActionPerformed
        
    }//GEN-LAST:event_Me_ClientesActionPerformed

    private void MeIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeIngresarActionPerformed
        LoginUsuario login = new LoginUsuario();
        EscritorioPanel.add(login);
        login.show();
    }//GEN-LAST:event_MeIngresarActionPerformed

    private void MeReEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeReEquiposActionPerformed
        ReservaEquipo reEquipo = new ReservaEquipo();
        EscritorioPanel.add(reEquipo);
        reEquipo.show();
    }//GEN-LAST:event_MeReEquiposActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog CD_UsuarioNoRegistrado;
    private javax.swing.JDesktopPane EscritorioPanel;
    private javax.swing.JMenuItem MeAgregar;
    private javax.swing.JMenuItem MeCerrar;
    private javax.swing.JMenu MeEquipos;
    private javax.swing.JMenuItem MeIngresar;
    private javax.swing.JMenuItem MeReEquipos;
    private javax.swing.JMenu MeUsuario;
    private javax.swing.JMenuItem Me_Clientes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables

   
}
