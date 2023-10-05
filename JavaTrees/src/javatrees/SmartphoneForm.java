package javatrees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SmartphoneForm extends javax.swing.JFrame {

    public SmartphoneForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNavegacao = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnCarregaCsv = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        txtProcessadorVelocidade = new javax.swing.JTextPane();
        lblProcessadorVelocidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlNavegacao.setBackground(new java.awt.Color(0, 102, 102));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Smartphone");

        btnCarregaCsv.setText("Carregar Arquivos");
        btnCarregaCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregaCsvActionPerformed(evt);
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
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlNavegacaoLayout.setVerticalGroup(
            pnlNavegacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavegacaoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblTitle)
                .addGap(106, 106, 106)
                .addComponent(btnCarregaCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
        );

        getContentPane().add(pnlNavegacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));

        lblSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSubTitle.setText("Inserir Smartphone");
        jPanel1.add(lblSubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 140, -1));

        jScrollPane1.setViewportView(txtModelo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 140, -1));

        lblModelo.setText("Modelo");
        jPanel1.add(lblModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jScrollPane2.setViewportView(txtMarca);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 140, -1));

        lblMarca.setText("Marca");
        jPanel1.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jScrollPane3.setViewportView(txtAvaliacao);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 130, -1));

        lblAvaliacao.setText("Avaliação");
        jPanel1.add(lblAvaliacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        btnInserir.setText("Inserir Smartphone");
        jPanel1.add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 140, -1));

        jScrollPane4.setViewportView(txtProcessadorVelocidade);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 130, -1));

        lblProcessadorVelocidade.setText("Processador (Velocidade)");
        jPanel1.add(lblProcessadorVelocidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 490, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarregaCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregaCsvActionPerformed
        
//        TODO 
        String csvFile = "";
        String line = "";
        String[] reader = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {

                Smartphone smp = new Smartphone();

                reader = line.split(",");

                smp.setBrandName(reader[0]);
                
                smp.setModel(reader[1]);

                if (!reader[2].isEmpty()) {
                    smp.setRating(Integer.parseInt(reader[2]));
                }

                System.out.println("Marca: " + smp.getBrandName());
                System.out.println("Modelo: " + smp.getModel());
                System.out.println("Avaliação: " + smp.getRating());
                
                //dataList.add(smp);
            }// fim percurso no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_btnCarregaCsvActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblAvaliacao;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblProcessadorVelocidade;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlNavegacao;
    private javax.swing.JTextPane txtAvaliacao;
    private javax.swing.JTextPane txtMarca;
    private javax.swing.JTextPane txtModelo;
    private javax.swing.JTextPane txtProcessadorVelocidade;
    // End of variables declaration//GEN-END:variables
}
