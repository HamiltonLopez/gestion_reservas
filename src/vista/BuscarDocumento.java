package vista;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import controlador.Controlador;
import modelo.Reserva;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Asus
 */
public class BuscarDocumento extends javax.swing.JFrame {

    Controlador controlador;

    public BuscarDocumento(Controlador controlador) {
        initComponents();
        setLocationRelativeTo(this);
        this.controlador = controlador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        txtNoDocumento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DOCUMENTO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(txtNoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton2)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtNoDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el número de documento de la persona que desea consultar la reserva");
        } else {
            int documento = Integer.parseInt(txtNoDocumento.getText());
            leerLista(controlador.buscarReservarXDocumento(documento));
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    public void leerLista(ArrayList<Reserva> lista) {

        if (lista.size() < 1) {
            JOptionPane.showMessageDialog(null, "El número ingresado no cuenta con reservas");
        } else {
            int num = 1;
            String reservas = "";
            for (Reserva reserva : lista) {
                reservas += "\nNo." + num + "\nCodigo :" + reserva.getCodigo() + "\nCliente |" + " Nombre : "
                        + reserva.getNombreCliente() + " | CC : " + reserva.getNoDocumento() + "\nFecha : " + reserva.getFechaReserva() 
                        + "\nEstado : " + reserva.getEstado() +"\nPersonas :  " +reserva.getCantidadPersonas()
                        + "\n-------------------------------";
                num++;
            }
            JOptionPane.showMessageDialog(null, reservas);
        }

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNoDocumento;
    // End of variables declaration//GEN-END:variables
}
