/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author azteca
 */
public class frmListarContacto extends javax.swing.JFrame {

    /**
     * Creates new form frmListarContacto
     */
    private ArrayList<clsPersona> lstPersonas;

    public frmListarContacto(ArrayList<clsPersona> lstPersonas) {
        initComponents();
        setLocationRelativeTo(null);
        this.lstPersonas = lstPersonas;
        cargarDatos();
        
    }

    public void cargarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("telefonoFijo");
        modelo.addColumn("celular");
        modelo.addColumn("email");
        modelo.addColumn("sexo");
        modelo.addColumn("tipoPersona");
        modelo.addColumn("estado");
        modelo.addColumn("fechaNacimiento");

        for (clsPersona p : lstPersonas) {

            modelo.addRow(new Object[]{p.getCodigo(), p.getNombre(), p.getTelefonoFijo(),
                p.getCelular(), p.getEmail(), p.getSexo(), p.getTipoPersona(), p.getEstado(),
                p.getDia() + "/" + p.getMes() + "/" + p.getAnio()
            });
        }
        tablaRegistrar.setModel(modelo);

    }

    public void buscarPorCodigo(String codigo) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("telefonoFijo");
        modelo.addColumn("celular");
        modelo.addColumn("email");
        modelo.addColumn("sexo");
        modelo.addColumn("tipoPersona");
        modelo.addColumn("estado");
        modelo.addColumn("fechaNacimiento");

        for (clsPersona p : lstPersonas) {
            if (p.getCodigo() == Integer.parseInt(codigo)) {
                modelo.addRow(new Object[]{p.getCodigo(), p.getNombre(), p.getTelefonoFijo(),
                    p.getCelular(), p.getEmail(), p.getSexo(), p.getTipoPersona(), p.getEstado(),
                    p.getDia() + "/" + p.getMes() + "/" + p.getAnio()
                });
            }
        }
        tablaRegistrar.setModel(modelo); 

    }

    public void buscarPorNombre(String nombre) {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("telefonoFijo");
        modelo.addColumn("celular");
        modelo.addColumn("email");
        modelo.addColumn("sexo");
        modelo.addColumn("tipoPersona");
        modelo.addColumn("estado");
        modelo.addColumn("fechaNacimiento");

        for (clsPersona p : lstPersonas) {
            if (p.getNombre().equals(nombre)) {
                modelo.addRow(new Object[]{p.getCodigo(), p.getNombre(), p.getTelefonoFijo(),
                    p.getCelular(), p.getEmail(), p.getSexo(), p.getTipoPersona(), p.getEstado(),
                    p.getDia() + "/" + p.getMes() + "/" + p.getAnio()
                });
                
            }
        }
      tablaRegistrar.setModel(modelo);

    }
    public void mostrarPorMes(String mes)
    {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("codigo");
        modelo.addColumn("nombre");
        modelo.addColumn("telefonoFijo");
        modelo.addColumn("celular");
        modelo.addColumn("email");
        modelo.addColumn("sexo");
        modelo.addColumn("tipoPersona");
        modelo.addColumn("estado");
        modelo.addColumn("fechaNacimiento");

        for (clsPersona p : lstPersonas) {
            if (p.getMes().equals(mes)) {
                modelo.addRow(new Object[]{p.getCodigo(), p.getNombre(), p.getTelefonoFijo(),
                    p.getCelular(), p.getEmail(), p.getSexo(), p.getTipoPersona(), p.getEstado(),
                    p.getDia() + "/" + p.getMes() + "/" + p.getAnio()
                });
                
            }
        }
      tablaRegistrar.setModel(modelo);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistrar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        rbNombre = new javax.swing.JRadioButton();
        rbCodigo = new javax.swing.JRadioButton();
        txtBuscar = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnMostrarCumpleañosMes = new javax.swing.JButton();
        txtMostrar = new javax.swing.JTextField();
        rbMes = new javax.swing.JRadioButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tablaRegistrar);

        jLabel1.setText("Buscar por:");

        rbNombre.setText("Nombre");
        rbNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNombreActionPerformed(evt);
            }
        });

        rbCodigo.setText("Codigo");
        rbCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCodigoActionPerformed(evt);
            }
        });
        rbCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rbCodigoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(rbCodigo)
                .addGap(34, 34, 34)
                .addComponent(rbNombre)
                .addGap(18, 18, 18)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rbNombre)
                    .addComponent(rbCodigo)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 340));

        btnNuevo.setText("Insertar");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 90, 40));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 90, 40));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 90, 40));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 90, 40));

        btnMostrarCumpleañosMes.setText("Mostrar Cumpleaños por Mes");
        btnMostrarCumpleañosMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCumpleañosMesActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarCumpleañosMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 190, 30));
        getContentPane().add(txtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 130, 30));

        rbMes.setText("Mes");
        getContentPane().add(rbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        frmRegistrarContacto ventana = new frmRegistrarContacto(lstPersonas);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        cargarDatos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void rbCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rbCodigoKeyPressed

    }//GEN-LAST:event_rbCodigoKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (rbCodigo.isSelected()) {
            buscarPorCodigo(txtBuscar.getText());
            
        } else if (rbNombre.isSelected()) {
            buscarPorNombre(txtBuscar.getText());
        } else {
           
            cargarDatos();
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCodigoActionPerformed
        if(rbCodigo.isSelected()){
        rbNombre.setSelected(false); 
        }else{
        cargarDatos();
        }
            
    }//GEN-LAST:event_rbCodigoActionPerformed

    private void rbNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNombreActionPerformed
        if(rbNombre.isSelected()){
        rbCodigo.setSelected(false);
         }
    }//GEN-LAST:event_rbNombreActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     
        int filaseleccionada = tablaRegistrar.getSelectedRow();
        if(filaseleccionada>=0)
        {
        filaseleccionada=JOptionPane.showConfirmDialog(null, "Esa seguro de eliminar");
        lstPersonas.remove(filaseleccionada);
        }else{
        JOptionPane.showMessageDialog(null, "seleccione la fila");
        }
               
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarCumpleañosMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCumpleañosMesActionPerformed
        if(rbMes.isSelected())
        {
        mostrarPorMes(txtMostrar.getText());
        cargarDatos();
        }
                
    }//GEN-LAST:event_btnMostrarCumpleañosMesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrarCumpleañosMes;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbCodigo;
    private javax.swing.JRadioButton rbMes;
    private javax.swing.JRadioButton rbNombre;
    private javax.swing.JTable tablaRegistrar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtMostrar;
    // End of variables declaration//GEN-END:variables
}
