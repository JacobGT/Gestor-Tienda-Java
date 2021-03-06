/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorTienda;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jacob
 */
public class VistaTrabajador extends javax.swing.JFrame {
    
    String email;

    /**
     * Creates new form VistaTrabajador
     * @param email
     */
    public VistaTrabajador(String email) {
        initComponents();
        UserId.setText(email);
    }

    private static final String USERNAME = "rootx";
    private static final String PASSWORD = "rootx";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/gestor_tienda?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private VistaTrabajador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eleccion = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        correoBusqueda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        confirmacion = new javax.swing.JCheckBox();
        editarSaldo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        saldoActual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nuevoSaldo = new javax.swing.JTextField();
        confirmacion2 = new javax.swing.JCheckBox();
        compu = new javax.swing.JRadioButton();
        tel = new javax.swing.JRadioButton();
        tv = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        info1L = new javax.swing.JLabel();
        info2L = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        info1 = new javax.swing.JTextField();
        info2 = new javax.swing.JTextField();
        precio = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UserId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenido");

        agregar.setText("Confirmar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Agregar Inventario");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Editar Saldo de Cliente");

        correoBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        correoBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        correoBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoBusquedaActionPerformed(evt);
            }
        });

        jLabel4.setText("Correo:");

        confirmacion.setText("¿Estas seguro?");
        confirmacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmacionActionPerformed(evt);
            }
        });

        editarSaldo.setText("Confirmar");
        editarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarSaldoActionPerformed(evt);
            }
        });

        jLabel5.setText("Nuevo Saldo: ");

        jLabel6.setText("Saldo Actual: ");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        saldoActual.setBackground(new java.awt.Color(255, 255, 255));
        saldoActual.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setText("===================================");

        nuevoSaldo.setBackground(new java.awt.Color(255, 255, 255));
        nuevoSaldo.setForeground(new java.awt.Color(0, 0, 0));
        nuevoSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoSaldoActionPerformed(evt);
            }
        });

        confirmacion2.setText("¿Estas seguro?");
        confirmacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmacion2ActionPerformed(evt);
            }
        });

        eleccion.add(compu);
        compu.setText("Computadora");
        compu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compuActionPerformed(evt);
            }
        });

        eleccion.add(tel);
        tel.setText("Telefono");
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });

        eleccion.add(tv);
        tv.setText("Televisor");
        tv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tvActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad: ");

        cantidad.setBackground(new java.awt.Color(255, 255, 255));
        cantidad.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setText("Marca: ");

        jLabel10.setText("Nombre: ");

        jLabel11.setText("Precio: ");

        info1L.setText("Info:");

        info2L.setText("Info:");

        marca.setBackground(new java.awt.Color(255, 255, 255));
        marca.setForeground(new java.awt.Color(0, 0, 0));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(0, 0, 0));

        info1.setBackground(new java.awt.Color(255, 255, 255));
        info1.setForeground(new java.awt.Color(0, 0, 0));

        info2.setBackground(new java.awt.Color(255, 255, 255));
        info2.setForeground(new java.awt.Color(0, 0, 0));

        precio.setBackground(new java.awt.Color(255, 255, 255));
        precio.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setText("Incluir precio solo como numero sin comas.");

        jLabel13.setText("ej. 10000");

        UserId.setText("User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(info1L)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cantidad)
                                        .addComponent(marca)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(info1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(info2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(compu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(agregar))
                            .addComponent(info2L)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addGap(12, 12, 12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmacion)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(buscar))
                                    .addComponent(saldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(confirmacion2)
                                        .addComponent(nuevoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(editarSaldo)
                                .addGap(53, 53, 53))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(correoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(UserId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(UserId))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(19, 19, 19)
                                .addComponent(compu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tv)
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel9)
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel10)
                                        .addGap(24, 24, 24)
                                        .addComponent(info1L)
                                        .addGap(18, 18, 18)
                                        .addComponent(info2L))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(info1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(info2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(15, 15, 15)
                                .addComponent(agregar))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(correoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(saldoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(nuevoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(confirmacion2)
                        .addGap(18, 18, 18)
                        .addComponent(editarSaldo)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        Welcome well = new Welcome();
        well.show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        
        String seleccion;
        
        if (compu.isSelected()){
            seleccion = "computadora";
            String cant = cantidad.getText();
            String brand = marca.getText();
            String name = nombre.getText();
            String infoA = info1.getText();
            String infoB = info2.getText();
            String price = precio.getText();
            Computadora pc = new Computadora(name, infoA, infoB, brand);
            pc.precio = Integer.parseInt(price);
            pc.cantidad = Integer.parseInt(cant); 
            
            Connection conn = null;

            try {
                conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                Statement stmt = (Statement) conn.createStatement();
                String insert = "INSERT INTO gestor_tienda.inventario(tipo, marca, nombre, cantidad, precio, info1, info2) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(insert);
                ps.setString(1, seleccion);
                ps.setString(2, pc.marca);
                ps.setString(3, pc.nombre);
                ps.setString(4, Integer.toString(pc.cantidad));
                ps.setString(5, Integer.toString(pc.precio));
                ps.setString(6, pc.cpu);
                ps.setString(7, pc.gpu);
                ps.execute();
                conn.close();
                JOptionPane.showMessageDialog(null, "Dispositivo agregado exitosamente");
                cantidad.setText("");
                marca.setText("");
                nombre.setText("");
                info1.setText("");
                info2.setText("");
                precio.setText("");
            } catch (SQLException e){
                System.err.println(e);
            }
            
        } else if (tv.isSelected()){
            seleccion = "TV";
            String cant = cantidad.getText();
            String brand = marca.getText();
            String name = nombre.getText();
            String infoA = info1.getText();
            String infoB = info2.getText();
            String price = precio.getText();
            Tv tv = new Tv(name, infoB, infoA, brand);
            tv.precio = Integer.parseInt(price);
            tv.cantidad = Integer.parseInt(cant); 
            
            Connection conn = null;

            try {
                conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                Statement stmt = (Statement) conn.createStatement();
                String insert = "INSERT INTO gestor_tienda.inventario(tipo, marca, nombre, cantidad, precio, info1, info2) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(insert);
                ps.setString(1, seleccion);
                ps.setString(2, tv.marca);
                ps.setString(3, tv.nombre);
                ps.setString(4, Integer.toString(tv.cantidad));
                ps.setString(5, Integer.toString(tv.precio));
                ps.setString(6, tv.refreshRate);
                ps.setString(7, tv.resolucion);
                ps.execute();
                conn.close();
                JOptionPane.showMessageDialog(null, "Dispositivo agregado exitosamente");
                cantidad.setText("");
                marca.setText("");
                nombre.setText("");
                info1.setText("");
                info2.setText("");
                precio.setText("");
            } catch (SQLException e){
                System.err.println(e);
            }
        } else {
            seleccion = "telefono";
            String cant = cantidad.getText();
            String brand = marca.getText();
            String name = nombre.getText();
            String infoA = info1.getText();
            String infoB = info2.getText();
            String price = precio.getText();
            Telefono tel = new Telefono(name, infoA, infoB, brand);
            tel.precio = Integer.parseInt(price);
            tel.cantidad = Integer.parseInt(cant); 
            
            Connection conn = null;

            try {
                conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                Statement stmt = (Statement) conn.createStatement();
                String insert = "INSERT INTO gestor_tienda.inventario(tipo, marca, nombre, cantidad, precio, info1, info2) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(insert);
                ps.setString(1, seleccion);
                ps.setString(2, tel.marca);
                ps.setString(3, tel.nombre);
                ps.setString(4, Integer.toString(tel.cantidad));
                ps.setString(5, Integer.toString(tel.precio));
                ps.setString(6, tel.os);
                ps.setString(7, tel.tamaño);
                ps.execute();
                conn.close();
                JOptionPane.showMessageDialog(null, "Dispositivo agregado exitosamente");
                cantidad.setText("");
                marca.setText("");
                nombre.setText("");
                info1.setText("");
                info2.setText("");
                precio.setText("");
            } catch (SQLException e){
                System.err.println(e);
            }
        }
        
        /*String cant = cantidad.getText();
        String brand = marca.getText();
        String name = nombre.getText();
        String infoA = info1.getText();
        String infoB = info2.getText();
        String price = precio.getText();*/
        
        /*Connection conn = null;

        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Statement stmt = (Statement) conn.createStatement();
            String insert = "INSERT INTO gestor_tienda.inventario(tipo, marca, nombre, cantidad, precio, info1, info2) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setString(1, seleccion);
            ps.setString(2, brand);
            ps.setString(3, name);
            ps.setString(4, cant);
            ps.setString(5, price);
            ps.setString(6, infoA);
            ps.setString(7, infoB);
            ps.execute();
            conn.close();
            JOptionPane.showMessageDialog(null, "Dispositivo agregado exitosamente");
            cantidad.setText("");
            marca.setText("");
            nombre.setText("");
            info1.setText("");
            info2.setText("");
            precio.setText("");
        } catch (SQLException e){
            System.err.println(e);
        }*/
    }//GEN-LAST:event_agregarActionPerformed

    private void correoBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoBusquedaActionPerformed

    private void confirmacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmacionActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        if (confirmacion.isSelected()){
            String email = correoBusqueda.getText();
            Cliente client = new Cliente(email);
            
            Connection conn = null;
            try {
                conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                String sql = "SELECT * FROM users WHERE correo = ?";
                int x = 0;
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, client.correo);
                ps.execute();
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    saldoActual.setText(Integer.toString(rs.getInt("saldo")));
                }
                ps.close();
                ps=null;
                conn.close();
            } catch(SQLException e){
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Confirmacion no ha sido marcada.");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void nuevoSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoSaldoActionPerformed

    private void confirmacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmacion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmacion2ActionPerformed

    private void compuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compuActionPerformed
        // TODO add your handling code here:
        if (compu.isSelected()){
            info1L.setText("CPU: ");
            info2L.setText("GPU: ");
        } else if (tv.isSelected()){
            info1L.setText("Refresh Rate: ");
            info2L.setText("Resolucion: ");
        } else {
            info1L.setText("OS: ");
            info2L.setText("Tamaño: ");
        }
    }//GEN-LAST:event_compuActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
        if (tel.isSelected()){
            info1L.setText("OS: ");
            info2L.setText("Tamaño: ");
        } else if (tv.isSelected()){
            info1L.setText("Refresh Rate: ");
            info2L.setText("Resolucion: ");
        } else {
            info1L.setText("CPU: ");
            info2L.setText("GPU: ");
        }
    }//GEN-LAST:event_telActionPerformed

    private void tvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tvActionPerformed
        // TODO add your handling code here:
        if (tv.isSelected()){
            info1L.setText("Refresh Rate: ");
            info2L.setText("Resolucion: ");
        } else if (tel.isSelected()){
            info1L.setText("OS: ");
            info2L.setText("Tamaño: ");
        } else {
            info1L.setText("CPU: ");
            info2L.setText("GPU: ");
        }
    }//GEN-LAST:event_tvActionPerformed

    private void editarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarSaldoActionPerformed
        // TODO add your handling code here:
        String email = correoBusqueda.getText();
        String saldoTemp = nuevoSaldo.getText();
        int newSaldo = Integer.parseInt(saldoTemp);
        
        Cliente client = new Cliente(email);
        client.saldo = newSaldo;
        
        
        Connection conn = null;
        if (confirmacion2.isSelected() && confirmacion.isSelected()){
            String sql = "UPDATE users SET saldo=? WHERE correo=?";
            try {
                conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setInt(1, client.saldo);
                ps.setString(2, client.correo);
                ps.execute();
                ps.close();
                ps=null;
                conn.close();
                JOptionPane.showMessageDialog(null, "Saldo cambiado exitosamente.");
            } catch (SQLException e) {
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Una o mas confirmaciones no han sido marcadas.");
        }
    }//GEN-LAST:event_editarSaldoActionPerformed

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
            java.util.logging.Logger.getLogger(VistaTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserId;
    private javax.swing.JButton agregar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JRadioButton compu;
    private javax.swing.JCheckBox confirmacion;
    private javax.swing.JCheckBox confirmacion2;
    private javax.swing.JTextField correoBusqueda;
    private javax.swing.JButton editarSaldo;
    private javax.swing.ButtonGroup eleccion;
    private javax.swing.JTextField info1;
    private javax.swing.JLabel info1L;
    private javax.swing.JTextField info2;
    private javax.swing.JLabel info2L;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nuevoSaldo;
    private javax.swing.JTextField precio;
    private javax.swing.JTextField saldoActual;
    private javax.swing.JRadioButton tel;
    private javax.swing.JRadioButton tv;
    // End of variables declaration//GEN-END:variables
}
