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
        jMenu1 = new javax.swing.JMenu();
        MeIngresar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        Me_Clientes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

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

        jMenu1.setText("Usuario");

        MeIngresar.setText("Ingresar");
        MeIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeIngresarActionPerformed(evt);
            }
        });
        jMenu1.add(MeIngresar);

        jMenuItem2.setText("Cerrar Sesión");
        jMenuItem2.setEnabled(false);
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

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

        jMenu4.setText("Equipos");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem7.setText("Agregar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenu2.add(jMenu4);

        Me_Clientes.setText("Clientes");
        Me_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Me_ClientesActionPerformed(evt);
            }
        });
        jMenu2.add(Me_Clientes);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");
        jMenu3.setEnabled(false);
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
    
    
    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CrearEquipos creaEquipo = new CrearEquipos();
        EscritorioPanel.add(creaEquipo);
        creaEquipo.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void Me_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Me_ClientesActionPerformed
        MantenimientoClientes mantClie = new MantenimientoClientes();
        EscritorioPanel.add(mantClie);
        mantClie.show();
    }//GEN-LAST:event_Me_ClientesActionPerformed

    private void MeIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeIngresarActionPerformed
        LoginUsuario login = new LoginUsuario();
        EscritorioPanel.add(login);
        login.show();
    }//GEN-LAST:event_MeIngresarActionPerformed

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
    private javax.swing.JMenuItem MeIngresar;
    private javax.swing.JMenuItem Me_Clientes;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables

   
}
