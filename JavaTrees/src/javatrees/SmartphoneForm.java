package javatrees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SmartphoneForm extends javax.swing.JFrame {
    
    BinarySearchTree dataTree = new BinarySearchTree();
    List<Smartphone> dataList = new ArrayList<>();
    
    public SmartphoneForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderGroup = new javax.swing.ButtonGroup();
        pnlNavegacao = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnCarregaCsv = new javax.swing.JButton();
        rbPreOrder = new javax.swing.JRadioButton();
        rbInOrder = new javax.swing.JRadioButton();
        rbPostOrder = new javax.swing.JRadioButton();
        btnOrder = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblSubTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtModelo = new javax.swing.JTextPane();
        lblModelo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMarca = new javax.swing.JTextPane();
        lblMarca = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAvaliacao = new javax.swing.JTextPane();
        lblAvaliacao = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtRamCapacity = new javax.swing.JTextPane();
        lblRamCapacity = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        lblAvaliacao1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtOS = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNavegacao.setBackground(new java.awt.Color(0, 102, 102));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Smartphone");

        btnCarregaCsv.setBackground(new java.awt.Color(204, 204, 204));
        btnCarregaCsv.setText("Carregar Arquivos");
        btnCarregaCsv.setBorderPainted(false);
        btnCarregaCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregaCsvActionPerformed(evt);
            }
        });

        orderGroup.add(rbPreOrder);
        rbPreOrder.setText("Pré Ordem");

        orderGroup.add(rbInOrder);
        rbInOrder.setText("Em Ordem");

        orderGroup.add(rbPostOrder);
        rbPostOrder.setText("Pós Ordem");

        btnOrder.setBackground(new java.awt.Color(204, 204, 204));
        btnOrder.setText("Ordenar");
        btnOrder.setOpaque(true);
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNavegacaoLayout = new javax.swing.GroupLayout(pnlNavegacao);
        pnlNavegacao.setLayout(pnlNavegacaoLayout);
        pnlNavegacaoLayout.setHorizontalGroup(
            pnlNavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavegacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCarregaCsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbPreOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbInOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbPostOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlNavegacaoLayout.setVerticalGroup(
            pnlNavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavegacaoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitle)
                .addGap(106, 106, 106)
                .addComponent(btnCarregaCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbPreOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbInOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPostOrder)
                .addGap(18, 18, 18)
                .addComponent(btnOrder)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        getContentPane().add(pnlNavegacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblSubTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSubTitle.setText("Inserir Smartphone");

        jScrollPane1.setViewportView(txtModelo);

        lblModelo.setText("Modelo");

        jScrollPane2.setViewportView(txtMarca);

        lblMarca.setText("Marca");

        jScrollPane3.setViewportView(txtAvaliacao);

        lblAvaliacao.setText("Avaliação");

        btnInserir.setBackground(new java.awt.Color(204, 204, 204));
        btnInserir.setText("Inserir Smartphone");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(txtRamCapacity);

        lblRamCapacity.setText("Capacidade - RAM");

        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaDados.setToolTipText("");
        jScrollPane5.setViewportView(tabelaDados);

        lblAvaliacao1.setText("Sistema Operacional");

        jScrollPane6.setViewportView(txtOS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(lblModelo)
                        .addGap(136, 136, 136)
                        .addComponent(lblRamCapacity))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMarca)
                        .addGap(141, 141, 141)
                        .addComponent(lblAvaliacao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvaliacao1)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblSubTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca)
                            .addComponent(lblAvaliacao))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAvaliacao1)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModelo)
                    .addComponent(lblRamCapacity))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnInserir)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 640, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limpaCampo() {
        txtMarca.setText("");
        txtModelo.setText("");
        txtAvaliacao.setText("");
        txtRamCapacity.setText("");
    }
    
    public void carregarArquivo() {
        String csvFile = "smartphone.csv";
        String line = "";
        String[] reader = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                
                Smartphone smp = new Smartphone();
                
                reader = line.split(",");
                
                if (!reader[0].equals("")) {
                    smp.setBrandName(reader[0]);
                } else {
                    smp.setBrandName("?");
                }
                
                if (!reader[1].isEmpty()) {
                    smp.setModel(reader[1]);
                } else {
                    smp.setModel("?");
                }
                if (!reader[2].isEmpty()) {
                    smp.setOperationalSystem(reader[2]);
                } else {
                    smp.setOperationalSystem("?");
                }
                
                if (!reader[3].isEmpty()) {
                    smp.setRating(Double.parseDouble(reader[3]));
                } else {
                    smp.setRating(0);
                }
                
                if (!reader[4].isEmpty()) {
                    smp.setRamCapacity(Double.parseDouble(reader[4]));
                } else {
                    smp.setRamCapacity(0);
                }
                
                dataTree.add(smp);
                dataList.add(smp);
            }// fim percurso no arquivo

            mostra(dataList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void btnCarregaCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregaCsvActionPerformed
        carregarArquivo();
    }//GEN-LAST:event_btnCarregaCsvActionPerformed
    
    void mostra(List<Smartphone> dataList) {
        tabelaDados.setModel(new DefaultTableModel(null, new String[]{"Marca", "Modelo", "O.S", "Avaliação", "RAM"}));
        
        DefaultTableModel model = (DefaultTableModel) tabelaDados.getModel();
        
        Object rowData[] = new Object[5];
        ;
        String[] reader = null;
        
        for (Smartphone s : dataList) {
            String line = s.toString();
            reader = line.split(",");
            rowData[0] = reader[0];
            rowData[1] = reader[1];
            rowData[2] = reader[2];
            rowData[3] = reader[3];
            rowData[4] = reader[4];
            
            model.addRow(rowData);
        }
        
    }

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        if (rbPreOrder.isSelected()) {
            dataTree.preOrder();
            mostra(dataTree.listaPreOrder);
        }
        
        if (rbInOrder.isSelected()) {
            dataTree.inOrder();
            mostra(dataTree.listaInOrder);
            
        }
        
        if (rbPostOrder.isSelected()) {
            dataTree.postOrder();
            mostra(dataTree.listaPostOrder);
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO - mostrar numero de comparações durante a inserção
        if (txtMarca.getText().equals("") || txtModelo.getText().equals("") || txtAvaliacao.getText().equals("") || txtOS.getText().equals("") || txtRamCapacity.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha Todos os Campos!");
        } else {
            Smartphone smp = new Smartphone(txtMarca.getText(), txtModelo.getText(), Double.parseDouble(txtAvaliacao.getText()),
                    Double.parseDouble(txtRamCapacity.getText()), txtOS.getText());
            dataTree.add(smp);
            dataList.add(smp);
            JOptionPane.showMessageDialog(null, dataTree.getComparacoes());
            mostra(dataList);
            limpaCampo();
        }
    }//GEN-LAST:event_btnInserirActionPerformed
    
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
            java.util.logging.Logger.getLogger(SmartphoneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmartphoneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmartphoneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmartphoneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmartphoneForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregaCsv;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnOrder;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblAvaliacao1;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblRamCapacity;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.ButtonGroup orderGroup;
    private javax.swing.JPanel pnlNavegacao;
    private javax.swing.JRadioButton rbInOrder;
    private javax.swing.JRadioButton rbPostOrder;
    private javax.swing.JRadioButton rbPreOrder;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextPane txtAvaliacao;
    private javax.swing.JTextPane txtMarca;
    private javax.swing.JTextPane txtModelo;
    private javax.swing.JTextPane txtOS;
    private javax.swing.JTextPane txtRamCapacity;
    // End of variables declaration//GEN-END:variables
}
