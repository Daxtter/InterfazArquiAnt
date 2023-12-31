/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazarquiant;

import java.awt.Font;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

/**
 *
 * @author nunez
 */
public class Encriptar extends javax.swing.JFrame {

    /**
     * Creates new form Encriptar
     */
    public Encriptar() {
        initComponents();
        jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER); //Evita que en eltext area se pueda hacer scroll hacia arriba
        this.setResizable(false); //Evita que se pueda maximizar la ventana
        this.setTitle("Encriptador de archivos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        botonDeArchivo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaDeTextoDeDireccion = new javax.swing.JTextArea();
        botonEncriptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        casita = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonDeArchivo.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\build\\classes\\interfazarquiant\\imagenArchivo.png"));
        botonDeArchivo.setBorderPainted(false);
        botonDeArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeArchivoActionPerformed(evt);
            }
        });
        jPanel3.add(botonDeArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 45, 45));

        areaDeTextoDeDireccion.setEditable(false);
        areaDeTextoDeDireccion.setColumns(20);
        areaDeTextoDeDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        areaDeTextoDeDireccion.setRows(5);
        jScrollPane3.setViewportView(areaDeTextoDeDireccion);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 250, 60));

        botonEncriptar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        botonEncriptar.setText("Encriptar");
        botonEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEncriptarActionPerformed(evt);
            }
        });
        jPanel3.add(botonEncriptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Direccion del archivo");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Encripar archivo");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 10, 360, -1));

        casita.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\build\\classes\\interfazarquiant\\Casa.png"));
        casita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casitaActionPerformed(evt);
            }
        });
        jPanel3.add(casita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 30, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDeArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeArchivoActionPerformed
        JFileChooser escogerArchivo =  new JFileChooser();
        int seleccion = escogerArchivo.showOpenDialog(null);
        if(seleccion == JFileChooser.APPROVE_OPTION) //Significa  que el usuario selecciono acceptar
        {
            File archivo = escogerArchivo.getSelectedFile(); //Con este archivo se puede usar un .toString para obtener la cadena de la direccion del archivo

            areaDeTextoDeDireccion.setText(archivo.toString());
        }
    }//GEN-LAST:event_botonDeArchivoActionPerformed

    private void botonEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEncriptarActionPerformed

        Icon icono =  new ImageIcon(System.getProperty("user.dir")+"\\build\\classes\\interfazarquiant\\candado.png");
        UIManager.put("OptionPane.messageFont", new Font("Segoe UI Semibold", Font.PLAIN, 18));
        //Strign mensajeError = "Este archivo ya esta encriptado";
        //JOptionPane.showConfirmDialog(null, mensajeError, "Contraseña para desencriptar", JOptionPane.CLOSED_OPTION,JOptionPane.ERROR_MESSAGE);
        //Aqui deberia haber un if para ver si el archivo se puede encriptar, en caso que no se pueda se usara la linea de codigo que esta arriba
        JOptionPane.showConfirmDialog(null, "Su contraseña es ", "Contraseña para desencriptar", JOptionPane.CLOSED_OPTION,JOptionPane.INFORMATION_MESSAGE,icono);

        
    }//GEN-LAST:event_botonEncriptarActionPerformed

    private void casitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casitaActionPerformed
        Menu menu =  new Menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_casitaActionPerformed

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
            java.util.logging.Logger.getLogger(Encriptar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encriptar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encriptar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encriptar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Encriptar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDeTextoDeDireccion;
    private javax.swing.JButton botonDeArchivo;
    private javax.swing.JButton botonEncriptar;
    private javax.swing.JButton casita;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
