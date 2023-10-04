/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplopresentacion;

/**
 *
 * @author ASUS
 */
public class presentacion extends javax.swing.JFrame {

    /**
     * Creates new form presentacion
     */
    public presentacion() {
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

        panelTituloPre = new javax.swing.JPanel();
        textoPresentacion = new javax.swing.JLabel();
        panelContenidoPre = new javax.swing.JPanel();
        cuadroFoto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botonInicio = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelTituloPre.setBackground(new java.awt.Color(204, 204, 255));
        panelTituloPre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelTituloPre.setLayout(null);

        textoPresentacion.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        textoPresentacion.setForeground(new java.awt.Color(255, 153, 0));
        textoPresentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPresentacion.setText("Ejemplo Ventana");
        panelTituloPre.add(textoPresentacion);
        textoPresentacion.setBounds(150, 20, 230, 30);

        getContentPane().add(panelTituloPre);
        panelTituloPre.setBounds(30, 20, 510, 70);

        panelContenidoPre.setBackground(new java.awt.Color(255, 255, 255));
        panelContenidoPre.setLayout(null);

        cuadroFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuadroFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/imagenPru1.jpg"))); // NOI18N
        cuadroFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cuadroFotoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cuadroFotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cuadroFotoMouseExited(evt);
            }
        });
        panelContenidoPre.add(cuadroFoto);
        cuadroFoto.setBounds(140, 0, 230, 170);

        getContentPane().add(panelContenidoPre);
        panelContenidoPre.setBounds(20, 120, 520, 180);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        botonInicio.setText("Inicio");
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });
        jPanel1.add(botonInicio);
        botonInicio.setBounds(70, 30, 72, 23);

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir);
        botonSalir.setBounds(330, 30, 72, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 320, 510, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuadroFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadroFotoMouseClicked
    cuadroFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/imagenPru3.jpg")));

    }//GEN-LAST:event_cuadroFotoMouseClicked

    private void cuadroFotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadroFotoMouseEntered
       cuadroFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/imagenPru2.jpg")));
    }//GEN-LAST:event_cuadroFotoMouseEntered

    private void cuadroFotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadroFotoMouseExited
     cuadroFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/imagenPru4.jpg")));
    }//GEN-LAST:event_cuadroFotoMouseExited

    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed
       ventanaPrincipal ventanaMenu = new ventanaPrincipal();
       
       this.setVisible(false);
       ventanaMenu.setSize(600, 400);
        ventanaMenu.setLocation(400,200);
        ventanaMenu.setVisible(true);
    }//GEN-LAST:event_botonInicioActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
       System.exit(1);
    }//GEN-LAST:event_botonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new presentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel cuadroFoto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelContenidoPre;
    private javax.swing.JPanel panelTituloPre;
    private javax.swing.JLabel textoPresentacion;
    // End of variables declaration//GEN-END:variables
}
