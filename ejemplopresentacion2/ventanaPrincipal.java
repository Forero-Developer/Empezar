
package ejemplopresentacion2;

import java.awt.Color;
import java.awt.event.KeyEvent;


public class ventanaPrincipal extends javax.swing.JFrame {

    int tempValor=0;
        
    int desplaVal=30;
    
    public ventanaPrincipal() {
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

        panelTitulo = new javax.swing.JPanel();
        tituloPrincipalInicio = new javax.swing.JLabel();
        botonPrue = new javax.swing.JButton();
        botonFun = new javax.swing.JButton();
        panelContenido = new javax.swing.JPanel();
        textoContenido = new javax.swing.JLabel();
        botonAceptarIndex = new javax.swing.JButton();
        cuadroTexNum1 = new javax.swing.JTextField();
        textoNum1 = new javax.swing.JLabel();
        textoNum2 = new javax.swing.JLabel();
        cuadroTexNum2 = new javax.swing.JTextField();
        textoResultado = new javax.swing.JLabel();
        botonPresentacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi primer Ventana");
        setBackground(new java.awt.Color(102, 102, 102));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(null);

        panelTitulo.setBackground(new java.awt.Color(204, 204, 255));
        panelTitulo.setLayout(null);

        tituloPrincipalInicio.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tituloPrincipalInicio.setForeground(new java.awt.Color(153, 0, 0));
        tituloPrincipalInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipalInicio.setText("MI PRIMERA VENTANA");
        panelTitulo.add(tituloPrincipalInicio);
        tituloPrincipalInicio.setBounds(110, 10, 330, 60);

        botonPrue.setText("Prueba");
        botonPrue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                botonPrueKeyReleased(evt);
            }
        });
        panelTitulo.add(botonPrue);
        botonPrue.setBounds(30, 60, 90, 23);

        botonFun.setBackground(new java.awt.Color(51, 51, 255));
        botonFun.setText("Funciona");
        botonFun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                botonFunKeyReleased(evt);
            }
        });
        panelTitulo.add(botonFun);
        botonFun.setBounds(440, 20, 100, 23);

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(20, 20, 550, 100);

        panelContenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelContenido.setLayout(null);

        textoContenido.setFont(new java.awt.Font("Microsoft New Tai Lue", 3, 18)); // NOI18N
        textoContenido.setForeground(new java.awt.Color(0, 0, 204));
        textoContenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoContenido.setText("Suma");
        panelContenido.add(textoContenido);
        textoContenido.setBounds(190, 10, 180, 30);

        botonAceptarIndex.setText("Cambiar");
        botonAceptarIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarIndexActionPerformed(evt);
            }
        });
        panelContenido.add(botonAceptarIndex);
        botonAceptarIndex.setBounds(140, 170, 110, 23);

        cuadroTexNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cuadroTexNum1KeyPressed(evt);
            }
        });
        panelContenido.add(cuadroTexNum1);
        cuadroTexNum1.setBounds(140, 60, 100, 30);

        textoNum1.setFont(new java.awt.Font("Microsoft New Tai Lue", 3, 18)); // NOI18N
        textoNum1.setForeground(new java.awt.Color(153, 0, 0));
        textoNum1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNum1.setText("Numero 1");
        panelContenido.add(textoNum1);
        textoNum1.setBounds(20, 60, 110, 30);

        textoNum2.setFont(new java.awt.Font("Microsoft New Tai Lue", 3, 18)); // NOI18N
        textoNum2.setForeground(new java.awt.Color(153, 0, 0));
        textoNum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNum2.setText("Numero 2");
        panelContenido.add(textoNum2);
        textoNum2.setBounds(260, 60, 110, 30);

        cuadroTexNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cuadroTexNum2KeyReleased(evt);
            }
        });
        panelContenido.add(cuadroTexNum2);
        cuadroTexNum2.setBounds(390, 60, 100, 30);

        textoResultado.setBackground(new java.awt.Color(204, 204, 255));
        textoResultado.setFont(new java.awt.Font("Microsoft New Tai Lue", 3, 18)); // NOI18N
        textoResultado.setForeground(new java.awt.Color(0, 102, 102));
        textoResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoResultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelContenido.add(textoResultado);
        textoResultado.setBounds(190, 120, 180, 30);

        botonPresentacion.setText("Presentación");
        botonPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPresentacionActionPerformed(evt);
            }
        });
        panelContenido.add(botonPresentacion);
        botonPresentacion.setBounds(300, 170, 110, 23);

        getContentPane().add(panelContenido);
        panelContenido.setBounds(20, 130, 550, 210);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarIndexActionPerformed
    
        int num1, num2, result=0;
        
        num1=Integer.parseInt( cuadroTexNum1.getText());
        num2=Integer.parseInt(cuadroTexNum2.getText());
        
        result=num1+num2;
        
        textoResultado.setText(String.valueOf(result));
        
        textoContenido.setText(result+"");
        
        
    }//GEN-LAST:event_botonAceptarIndexActionPerformed

    private void botonPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPresentacionActionPerformed
       
        presentacion presen = new presentacion();
        
              
        this.setVisible(false);
        presen.setSize(500, 400);
        presen.setLocation(400,200);
        presen.setVisible(true);
        
    }//GEN-LAST:event_botonPresentacionActionPerformed

    private void cuadroTexNum1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadroTexNum1KeyPressed
        
        if(evt.getKeyChar()== evt.VK_4)
        {
            System.out.print("funciona con el cuatro \n");
            cuadroTexNum1.setText("");
        }
        
        if(evt.getKeyChar()== evt.VK_ESCAPE)
        {
            System.exit(1);
        }
        
         if(evt.getKeyChar()== 'k')
         {
            if(cuadroTexNum1.getText().equals("ok"))
            {
                System.out.print("OK funciona \n");
                System.out.print(cuadroTexNum1.getText());
                //cuadroTexNum1.setText("");
            } 
            
            System.out.print(cuadroTexNum1.getText());
            
            
         }
       
        
    }//GEN-LAST:event_cuadroTexNum1KeyPressed

    private void cuadroTexNum2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadroTexNum2KeyReleased
       if(evt.getKeyChar()== 'k')
         {
            if(cuadroTexNum2.getText().equals("ok"))
            {
                System.out.print("OK funciona \n");
                System.out.print(cuadroTexNum2.getText());
                cuadroTexNum2.setText("");
            } 
                
            //System.out.print(cuadroTexNum2.getText());
            
            
         }
    }//GEN-LAST:event_cuadroTexNum2KeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
       
        int tempValor=0;
        
        System.out.print("OK funciona \n");
        
        if(tempValor==0)
        {        
            if(evt.getKeyChar()== KeyEvent.VK_4)
             {
                 botonFun.setBackground(Color.getHSBColor(51, 51, 255));
                 botonPrue.setBackground(Color.getHSBColor(47, 33, 51));
                 tempValor=1;

             }
        }
        
         if(tempValor==1)
        {        
            if(evt.getKeyChar()== KeyEvent.VK_4)
             {
                 botonPrue.setBackground(Color.getHSBColor(51, 51, 255));
                 botonFun.setBackground(Color.getHSBColor(47, 33, 51));
                 tempValor=0;

             }
        }
    }//GEN-LAST:event_formKeyReleased

    private void botonPrueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonPrueKeyReleased
        
       if(desplaVal >= 30)
       {
        if(evt.getKeyChar()== KeyEvent.VK_2)
             {
                 System.out.print("OK funciona \n "+evt.getKeyChar());
                 botonPrue.setBounds(desplaVal, 60, 90, 23);
                 botonPrue.requestFocus();
                 desplaVal+=100;

             }
        
         if(evt.getKeyChar()== KeyEvent.VK_1)
             {
                 System.out.print("OK funciona \n "+evt.getKeyChar());
                 botonPrue.setBounds(desplaVal, 60, 90, 23);
                 botonPrue.requestFocus();
                 desplaVal-=100;

             }
        
       }
        //System.out.print("OK funciona \n");
      /*  
        if(tempValor==0)
        { 
            
            if(evt.getKeyChar()== KeyEvent.VK_1)
             {
                 System.out.print("OK funciona \n "+evt.getKeyChar());
                 //System.out.print("OK funciona \n");
                 botonPrue.setBackground(Color.getHSBColor(51, 51, 255));
                 botonFun.setBackground(Color.getHSBColor(47, 33, 51));
                 //botonPrue.setNextFocusableComponent(botonFun);
                 botonFun.requestFocus();
                 tempValor=1;

             }
        }
        
         if(tempValor==1)
        {        
            if(evt.getKeyChar()== KeyEvent.VK_1)
             {
                 botonFun.setBackground(Color.getHSBColor(51, 51, 255));
                 botonPrue.setBackground(Color.getHSBColor(47, 33, 51));
                 //botonFun.setFocusPainted(true);
                 //botonPrue.setNextFocusableComponent(botonFun);
                 botonFun.requestFocus();
                 tempValor=0;

             }
        }*/
    }//GEN-LAST:event_botonPrueKeyReleased

    private void botonFunKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botonFunKeyReleased
        //System.out.print("OK funciona \n");
        
        if(tempValor==0)
        {   
             //System.out.print("OK funciona \n");
            if(evt.getKeyChar()== KeyEvent.VK_1)
             {
                 System.out.print("OK funciona 2\n");
                 botonFun.setBackground(Color.getHSBColor(51, 51, 255));
                 botonPrue.setBackground(Color.getHSBColor(47, 33, 51));
                 //botonPrue.setFocusPainted(true);
                 //botonFun.setNextFocusableComponent(botonPrue);
                 botonPrue.requestFocus();
                 tempValor=1;

             }
        }
        
         if(tempValor==1)
        {        
            if(evt.getKeyChar()== KeyEvent.VK_1)
             {
                 botonPrue.setBackground(Color.getHSBColor(51, 51, 255));
                 botonFun.setBackground(Color.getHSBColor(47, 33, 51));
                 //botonFun.setNextFocusableComponent(botonPrue);
                 botonPrue.requestFocus();
                 tempValor=0;

             }
        }
    }//GEN-LAST:event_botonFunKeyReleased

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarIndex;
    private javax.swing.JButton botonFun;
    private javax.swing.JButton botonPresentacion;
    private javax.swing.JButton botonPrue;
    private javax.swing.JTextField cuadroTexNum1;
    private javax.swing.JTextField cuadroTexNum2;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JLabel textoContenido;
    private javax.swing.JLabel textoNum1;
    private javax.swing.JLabel textoNum2;
    private javax.swing.JLabel textoResultado;
    private javax.swing.JLabel tituloPrincipalInicio;
    // End of variables declaration//GEN-END:variables
}
