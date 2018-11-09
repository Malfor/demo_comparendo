/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democomparendo.vista;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANIBAL
 */
public class Comparendo extends javax.swing.JFrame {

    private static final String URL = "jdbc:mysql://localhost:3306/demo_comparendo";
    private static final String USUARIO = "root";
    private static final String CONTRA = "94081813145As@";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public static Connection getConnection(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USUARIO, CONTRA);
        } catch (ClassNotFoundException | SQLException e){
            System.err.println(e);
        }
        
        return con;
    }
    
    public Comparendo() {
        initComponents();
        cargarTabla();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titledBorder1 = javax.swing.BorderFactory.createTitledBorder("");
        jLabel1 = new javax.swing.JLabel();
        txtIdComparendo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDateChose = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        comboEstado = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("ID COMPARENDO:");

        txtIdComparendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdComparendoActionPerformed(evt);
            }
        });

        jLabel2.setText("FECHA:");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("ID USUARIO:");

        jLabel5.setText("ESTADO:");

        jLabel6.setText("VALOR:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("REGISTRO DE COMPARENDOS");

        btnRegistrar.setBackground(new java.awt.Color(92, 184, 92));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegistrar.setMaximumSize(new java.awt.Dimension(90, 23));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 187, 51));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEditar.setMaximumSize(new java.awt.Dimension(90, 23));
        btnEditar.setMinimumSize(new java.awt.Dimension(90, 23));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(66, 139, 202));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscar.setMaximumSize(new java.awt.Dimension(90, 23));
        btnBuscar.setMinimumSize(new java.awt.Dimension(90, 23));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 68, 68));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "Pendiente", "Pagado", " " }));

        btnLimpiar.setBackground(new java.awt.Color(51, 181, 229));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChose, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdComparendo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                            .addComponent(comboEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdComparendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jDateChose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdComparendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdComparendoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdComparendoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        Connection con = null;
        
        
        try {
            
            con = getConnection();
            ps = con.prepareStatement("INSERT INTO comparendo VALUES (?,?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(txtIdComparendo.getText()));
            ps.setString(2, new SimpleDateFormat("dd/MM/yyyy").format(jDateChose.getDate()));
            ps.setInt(3, Integer.parseInt(txtIdUsuario.getText()));
            ps.setString(4, txtNombreUsuario.getText());
            ps.setString(5, comboEstado.getSelectedItem().toString());
            ps.setDouble(6, Double.parseDouble(txtValor.getText()));
            
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se ha guardado el registro Exitosamente");
                clear();
                cargarTabla();
            }else {
                JOptionPane.showMessageDialog(null, "Error al registrar los datos");
                clear();
            }
            
            con.close();
            
        } catch (Exception e) {
            System.err.println("No se ha podido registrar datos:   "+e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        clear();
        btnRegistrar.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        Connection con = null;
        
        try {
            con = getConnection();
            
            Date fecha;
            
            ps = con.prepareStatement("SELECT * FROM comparendo WHERE id_usuario = ?");
            
            ps.setString(1, txtIdUsuario.getText());
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                txtIdComparendo.setText(String.valueOf(rs.getInt("id_comparendo")));
                SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
                String strFecha = rs.getString("fecha");
                fecha = null;
                try {
                    fecha = sdf.parse(strFecha);
                    jDateChose.setDate(fecha);
                } catch (ParseException e) {
                    System.err.println("Problemas al parsear fecha: "+e);
                }
                
                txtNombreUsuario.setText(rs.getString("nombre_usuario"));
                if (rs.getString("estado").equals("Pendiente")) {
                    comboEstado.setSelectedIndex(1);
                } else {
                    comboEstado.setSelectedIndex(2);
                }
                txtValor.setText(String.valueOf(rs.getString("valor")));
                
                btnRegistrar.setEnabled(false);
                
            }else{
                JOptionPane.showMessageDialog(null, "No se ha encontrado registro con id: "+txtIdUsuario.getText());
                clear();
            }
            
        } catch (HeadlessException | SQLException e) {
            System.err.println("Error en la respuesta de la base de datos   "+e);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        Connection con = null;
                
        try {
            
            con = getConnection();
            ps = con.prepareStatement("UPDATE comparendo SET id_comparendo=?, fecha=?, "
                    + "nombre_usuario=?, estado=?, valor=? WHERE id_usuario=?");
            
            ps.setInt(1, Integer.parseInt(txtIdComparendo.getText()));
            ps.setString(2, new SimpleDateFormat("dd/MM/yyyy").format(jDateChose.getDate()));
            ps.setString(3, txtNombreUsuario.getText());
            ps.setString(4, comboEstado.getSelectedItem().toString());
            ps.setDouble(5, Double.parseDouble(txtValor.getText()));
            ps.setInt(6, Integer.parseInt(txtIdUsuario.getText()));
            
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Se ha modificado el registro Exitosamente");
                clear();
                cargarTabla();
                btnRegistrar.setEnabled(true);
            }else {
                JOptionPane.showMessageDialog(null, "Error al modificar los datos");
                clear();
            }
            
            con.close();
            
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.err.println("No se ha podido modificar los datos:   "+e);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        Connection con = null;
        
        try {
            
            con = getConnection();
            
            ps = con.prepareStatement("DELETE FROM comparendo WHERE id_usuario=?");
            
            ps.setString(1, txtIdUsuario.getText());
            
            int res = ps.executeUpdate();
            
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Comparendo borrado del sistema");
                clear();
                cargarTabla();
                btnRegistrar.setEnabled(true);
            }else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado registros");
                clear();
            }
            
        } catch (HeadlessException | SQLException e) {
            System.err.println("No se ha podido eliminar los datos:   "+e);
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void clear() {
        txtIdUsuario.setText(null);
        txtIdComparendo.setText(null);
        jDateChose.setDate(null);
        txtNombreUsuario.setText(null);
        comboEstado.setSelectedIndex(0);
        txtValor.setText(null);
    }
    
    private void cargarTabla(){
        
        DefaultTableModel modelo = new DefaultTableModel();
        Connection con = null;
        
        try {
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM comparendo");
            rs = ps.executeQuery();
            
            modelo.setColumnIdentifiers(new Object[]{"N° Comparendo","Fecha","Usuario","Nombres","Estado","Valor"});
            while (rs.next()) {                
                modelo.addRow(new Object[]{
                    rs.getString("id_comparendo"),
                    rs.getString("fecha"),
                    rs.getString("id_usuario"),
                    rs.getString("nombre_usuario"),
                    rs.getString("estado"),
                    rs.getString("valor")
                });
            }
            
            tabla.setModel(modelo);
        } catch (SQLException e) {
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboEstado;
    private com.toedter.calendar.JDateChooser jDateChose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.border.TitledBorder titledBorder1;
    private javax.swing.JTextField txtIdComparendo;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
