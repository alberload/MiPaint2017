/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author alber
 */
public class Ventana extends javax.swing.JFrame {

    BufferedImage buffer = null;
    BufferedImage buffer2 = null;
    
    Graphics2D bufferGraphics, buffer2Graphics, lienzoGraphics = null;
    
    Circulo miCirculo = null;
    Cuadrado miCuadrado = null;
    Triangulo miTriangulo = null;
    Color colorSelect = null;
    int formSelect = 0;

    public Ventana() {
        initComponents();
        initBuffers();
        jDialog1.setSize(690, 430);
        colorSelect = Color.BLACK;
        jButton1.setBackground(colorSelect);
    }

    private void initBuffers() {
        lienzoGraphics = (Graphics2D) lienzo.getGraphics();
        
        // Creo una imagen del mismo ancho y alto que el lienzo
        buffer = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
        // Creo una imagen modificable
        bufferGraphics = buffer.createGraphics();
        // Dibujamos un rectangulo blanco del tamaño del lienzo
        bufferGraphics.setColor(Color.white);
        bufferGraphics.fillRect(0, 0, lienzo.getWidth(), lienzo.getHeight());

        // Inicializo el segundo buffer
        // Creo una imagen del mismo ancho y alto que el lienzo
        buffer2 = (BufferedImage) lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
        // Creo una imagen modificable
        buffer2Graphics = buffer2.createGraphics();
        // Dibujamos un rectangulo blanco del tamaño del lienzo
        buffer2Graphics.setColor(Color.white);
        buffer2Graphics.fillRect(0, 0, lienzo.getWidth(), lienzo.getHeight());
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        lienzoGraphics.drawImage(buffer, 0, 0, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lienzo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        botonCuadrado = new javax.swing.JButton();
        botonCirculo = new javax.swing.JButton();
        botonTriangulo = new javax.swing.JButton();

        jButton2.setText("Cancelar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setText("Aceptar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lienzoMouseDragged(evt);
            }
        });
        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lienzoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        jButton1.setText("Color");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        botonCuadrado.setText("Cuadrado");
        botonCuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCuadradoMousePressed(evt);
            }
        });

        botonCirculo.setText("Circulo");
        botonCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCirculoMousePressed(evt);
            }
        });

        botonTriangulo.setText("Triangulo");
        botonTriangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonTrianguloMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCuadrado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCirculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonTriangulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCuadrado, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(botonCirculo, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(botonTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lienzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMousePressed
        switch (formSelect) {
            case 1: 
                miCirculo = new Circulo(evt.getX(), evt.getY(), 1, colorSelect, true); 
                miCirculo.dibujate(bufferGraphics, evt.getX());
                break;
            case 2: 
                miCuadrado = new Cuadrado(evt.getX(), evt.getY(), 1, colorSelect, true); 
                miCuadrado.dibujate(bufferGraphics, evt.getX());
                break;
            case 3: 
                miTriangulo = new Triangulo(evt.getX(), evt.getY(), 1, colorSelect, true); 
                miTriangulo.dibujate(bufferGraphics, evt.getX());
                break;
            default: return;
        }
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_lienzoMousePressed

    private void lienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseDragged
        //Borro lo que hubiera en el lienzo
        bufferGraphics.drawImage(buffer2, 0, 0, null);
        
        switch (formSelect) {
            case 1:
                miCirculo.dibujate(bufferGraphics, evt.getX());
                break;
            case 2: 
                miCuadrado.dibujate(bufferGraphics, evt.getX());
                break;
            case 3: 
                miTriangulo.dibujate(bufferGraphics, evt.getX());
                break;    
            default: return;
        }
        
        bufferGraphics.drawImage(buffer, 0, 0, null);
        repaint(0, 0, 1, 1);
    }//GEN-LAST:event_lienzoMouseDragged

    private void lienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseReleased
        switch (formSelect) {
            case 1: 
                miCirculo.dibujate(buffer2Graphics, evt.getX()); break;
            case 2: 
                miCuadrado.dibujate(buffer2Graphics, evt.getX()); break;
            case 3:
                miTriangulo.dibujate(buffer2Graphics, evt.getX()); break;
            default: return;
        }
    }//GEN-LAST:event_lienzoMouseReleased

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        colorSelect = jColorChooser1.getColor();
        jButton1.setBackground(jColorChooser1.getColor());
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonCuadradoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuadradoMousePressed
        formSelect = 2;
    }//GEN-LAST:event_botonCuadradoMousePressed

    private void botonCirculoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCirculoMousePressed
        formSelect = 1;
    }//GEN-LAST:event_botonCirculoMousePressed

    private void botonTrianguloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTrianguloMousePressed
        formSelect = 3;
    }//GEN-LAST:event_botonTrianguloMousePressed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCirculo;
    private javax.swing.JButton botonCuadrado;
    private javax.swing.JButton botonTriangulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel lienzo;
    // End of variables declaration//GEN-END:variables
}
