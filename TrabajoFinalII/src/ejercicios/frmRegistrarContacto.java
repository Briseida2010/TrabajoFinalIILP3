/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author azteca
 */
public class frmRegistrarContacto extends javax.swing.JFrame {

  
    private ArrayList<clsPersona> lstPersonas;
    
    public frmRegistrarContacto(ArrayList<clsPersona> lstPersonas) {
        initComponents();
        setLocationRelativeTo(null); 
        this.lstPersonas = lstPersonas;
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefonoFijo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rbFemenina = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        cmbTipoPersona = new javax.swing.JComboBox();
        rbActivo = new javax.swing.JRadioButton();
        rbInactivo = new javax.swing.JRadioButton();
        spinnerAnio = new javax.swing.JSpinner();
        spinnerMes = new javax.swing.JSpinner();
        spinnerDia = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 29, -1, -1));

        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, -1, -1));

        jLabel3.setText("Celular");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 125, -1, -1));

        jLabel4.setText("Telefono Fijo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, -1, -1));

        jLabel5.setText("Sexo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, -1, -1));

        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, -1, -1));

        jLabel7.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel8.setText("Tipo de Persona");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 252, -1, -1));

        jLabel9.setText("Estado");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 284, -1, -1));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 180, -1));
        jPanel1.add(txtTelefonoFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, -1));
        jPanel1.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, -1));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 180, -1));

        rbFemenina.setText("Femenina");
        rbFemenina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemeninaActionPerformed(evt);
            }
        });
        jPanel1.add(rbFemenina, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });
        jPanel1.add(rbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        cmbTipoPersona.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Docente", "Estudiante" }));
        jPanel1.add(cmbTipoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 110, -1));

        rbActivo.setText("Activo");
        rbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbActivoActionPerformed(evt);
            }
        });
        jPanel1.add(rbActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        rbInactivo.setText("Inactivo");
        rbInactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInactivoActionPerformed(evt);
            }
        });
        jPanel1.add(rbInactivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        spinnerAnio.setModel(new javax.swing.SpinnerNumberModel(1950, 1950, 2014, 1));
        jPanel1.add(spinnerAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        spinnerMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jPanel1.add(spinnerMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        spinnerDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        jPanel1.add(spinnerDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 340, 320));

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, 30));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
       
       //clsPersona p = new clsPersona();
       int codigo = Integer.parseInt(txtCodigo.getText());
       String nombre = txtNombre.getText();
       String telefonoFijo = txtTelefonoFijo.getText();
       String celular = txtCelular.getText();
       String email = txtEmail.getText();
        char sexo = ' ';
        if(rbFemenina.isSelected())
        {
        sexo='F';
        }else{
        sexo='M';
        }
        /*contacto.getFechaNacimiento(spinnerDia.getValue().toString(),
                spinnerMes.getValue().toString(),
                spinnerAnio.getValue().toString());*/
        String dia = spinnerDia.getValue().toString();
        String mes = spinnerMes.getValue().toString();
        String anio = spinnerAnio.getValue().toString();
        
        String tipoPersona = cmbTipoPersona.getSelectedItem().toString();
        
        char estado=' ';
        if(rbActivo.isSelected())
        {
        estado='A';
        }else{
        estado='I';
        }
        lstPersonas.add(new clsPersona(codigo, nombre, telefonoFijo,celular,email,sexo,tipoPersona,estado,dia,
                mes,anio));
       
        JOptionPane.showMessageDialog(null, "SE REGISTRO CORRECTAMENTE!");   
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbFemeninaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemeninaActionPerformed
       if(rbFemenina.isSelected())
       {
       rbMasculino.setSelected(false);
       }
    }//GEN-LAST:event_rbFemeninaActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        if(rbMasculino.isSelected())
        {
        rbFemenina.setSelected(false);
        }
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void rbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbActivoActionPerformed
       if(rbActivo.isSelected())
       {
       rbInactivo.setSelected(false);
       }
    }//GEN-LAST:event_rbActivoActionPerformed

    private void rbInactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInactivoActionPerformed
       if(rbInactivo.isSelected())
       {
       rbActivo.setSelected(false);
       }
    }//GEN-LAST:event_rbInactivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbTipoPersona;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbActivo;
    private javax.swing.JRadioButton rbFemenina;
    private javax.swing.JRadioButton rbInactivo;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JSpinner spinnerAnio;
    private javax.swing.JSpinner spinnerDia;
    private javax.swing.JSpinner spinnerMes;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefonoFijo;
    // End of variables declaration//GEN-END:variables
}
