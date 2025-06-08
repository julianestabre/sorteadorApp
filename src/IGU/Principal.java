
package IGU;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

 int contSorteos = 1, minimo, maximo;
 
 Random numRandom;
 String mes;
 
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbMes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtCantidadGanadores = new javax.swing.JTextField();
        btnFinalizarSorteo = new javax.swing.JButton();
        btnSortear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGanadores = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("DATOS DEL SORTEO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("MES DEL SORTEO");

        cmbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cmbMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("CANTIDAD DE GANADORES");

        txtCantidadGanadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadGanadoresActionPerformed(evt);
            }
        });

        btnFinalizarSorteo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnFinalizarSorteo.setText("FINALIZAR SORTEO");
        btnFinalizarSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarSorteoActionPerformed(evt);
            }
        });

        btnSortear.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSortear.setText("SORTEAR");
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnSortear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnFinalizarSorteo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidadGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidadGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSortear)
                    .addComponent(btnFinalizarSorteo))
                .addGap(123, 123, 123))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("GANADORES");

        tableGanadores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableGanadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posicion", "Ganador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableGanadores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("SORTEADOR SUPERMERCADO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarSorteoActionPerformed
        
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente finalizar el sorteo?" , 
                "Finalización sorteo", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        
        
        txtCantidadGanadores.setText("");
        cmbMes.setSelectedIndex(0);
        
        DefaultTableModel modelo = (DefaultTableModel) tableGanadores.getModel();
        modelo.setRowCount(0);
        
        contSorteos = 1;
        
        }
        
    
        
    }//GEN-LAST:event_btnFinalizarSorteoActionPerformed

    private void cmbMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMesActionPerformed

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
        
        if (!txtCantidadGanadores.getText().equals("")) {
            // TRAEMOS CANTIDAD DE GANADORES
            int cantGan = Integer.parseInt(txtCantidadGanadores.getText());

            if (contSorteos <= cantGan) {
                
                String max;

                // RANGO DE VALORES
                mes = (String) cmbMes.getSelectedItem();

                String min = "01";

                if (mes.equals("02")) {
                    max = "28";
                } else {
                    if (mes.equals("11") || mes.equals( "06")
                            || mes.equals("04") || mes.equals("09")) {
                        max = "30";
                    } else {
                        max = "31";
                    }

                }
                // SORTEAR RANDOM

                numRandom = new Random();

                minimo = Integer.parseInt(min);
                maximo = Integer.parseInt(max);
                
                String numeroSorteado = sortear();
                
                boolean esta = buscarRepetido(numeroSorteado);
                
                if(esta == false){
                    
                    agregarValorATabla(contSorteos, numeroSorteado);
              
                contSorteos++;
                }
                
                else{
                    while(esta == true){
                    numeroSorteado = sortear();
                    esta = buscarRepetido(numeroSorteado);
                    }
                    if(esta == false){
                    agregarValorATabla(contSorteos, numeroSorteado);
                    contSorteos++;
                    }
                }
            } else {

                JOptionPane.showMessageDialog(rootPane, "Ya se alcanzó la cantidad de ganadores");
            }
        } // SI NO HAY GANADORES O HAY ESPACIO EN BLANCO, EJECUTA UN MENSAJE AL USUARIO EN PANTALLA
        else {
            JOptionPane.showMessageDialog(rootPane, "Es necesario completar la cantidad de ganadores");
        }


    }//GEN-LAST:event_btnSortearActionPerformed

    private void txtCantidadGanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadGanadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadGanadoresActionPerformed

    
    public String agregarCeros(int randomDia, String mes, int randomTicket){
    
         int largoString = (Integer.toString(randomDia)).length();
        
        // AGREGAR LOS 0 AL DÍA
        
        String numeroSorteado;
        
        if (largoString == 2) {

            numeroSorteado = randomDia + mes;
        } else {
            numeroSorteado = "0" + randomDia + mes;
        }
        
        // AGREGAR LOS 0 AL TICKET
        largoString = (Integer.toString(randomTicket)).length();

        if (largoString == 3) {

            numeroSorteado = numeroSorteado + "0" + randomTicket;

        } else {

            if (largoString == 2) {
                numeroSorteado = numeroSorteado + "00" + randomTicket;
            } else {
                if (largoString == 1) {
                    numeroSorteado = numeroSorteado + "000" + randomTicket;
                } else {
                    numeroSorteado = numeroSorteado + randomTicket;
                }
            }
        }
        
        return numeroSorteado;
    }
    
    private boolean buscarRepetido(String numeroSorteado) {
        
        boolean esta = false;
        DefaultTableModel modelo = (DefaultTableModel)tableGanadores.getModel();
        
        for(int f=0; f<modelo.getRowCount(); f++){
            for(int c=0; c<modelo.getColumnCount(); c++){
                
                if(modelo.getValueAt(f,c).equals(numeroSorteado)){
                    esta = true;
                    break;
            }
            }
        }
        
        return esta;
    }
    
    public String sortear(){
     // SORTEAMOS
                int randomDia = numRandom.nextInt(maximo - minimo + 1) + minimo;
                int randomTicket = numRandom.nextInt(9999 - 0001 + 1) + 1;

                String numeroSorteado = agregarCeros(randomDia, mes, randomTicket);
                
                return numeroSorteado;
    }
    
    public void agregarValorATabla (int contSorteos, String numeroSorteado){
        
         // CONTROLAR QUE NO HAYA SALIDO ANTES EL NUMERO
                DefaultTableModel modelo = (DefaultTableModel) tableGanadores.getModel();
                Object[] objeto = {contSorteos, numeroSorteado};
                modelo.addRow(objeto);
        
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarSorteo;
    private javax.swing.JButton btnSortear;
    private javax.swing.JComboBox<String> cmbMes;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableGanadores;
    private javax.swing.JTextField txtCantidadGanadores;
    // End of variables declaration//GEN-END:variables

}
