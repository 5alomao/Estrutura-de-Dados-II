package carsort;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainForm extends javax.swing.JFrame {

    ArrayList<Data> dataList = new ArrayList<>();
//    TODO - DEFINIR COMPARADORES
    Comparator<Data> compareName = (Data d1, Data d2) -> (int) (d1.getName().compareTo(d2.getName()));
    Comparator<Data> compareHp = (Data d1, Data d2) -> (int) (d1.getHorsePower() - d2.getHorsePower());
    Comparator<Data> compareWeigth = (Data d1, Data d2) -> (int) (d1.getWeigth() - d2.getWeigth());
    Comparator<Data> compareModelYear = (Data d1, Data d2) -> (int) (d1.getModelYear() - d2.getModelYear());
    Comparator<Data> compareOrigin = (Data d1, Data d2) -> (int) (d1.getOrigin().compareTo(d2.getOrigin()));

    public MainForm() {
        initComponents();
        carregaArquivo();
        mostra();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        btnFiltro = new javax.swing.ButtonGroup();
        pnlHeader = new javax.swing.JPanel();
        lblProx = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        btnOrdNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDados = new javax.swing.JTable();
        cbOrdena = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rbLinear = new javax.swing.JRadioButton();
        rbBinaria = new javax.swing.JRadioButton();
        rbModel = new javax.swing.JRadioButton();
        rbOrigin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N

        pnlHeader.setBackground(new java.awt.Color(255, 102, 102));

        lblProx.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblProx.setForeground(new java.awt.Color(255, 255, 255));
        lblProx.setText("Sistema de Informações Sobre Carros");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addComponent(lblProx, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 127, Short.MAX_VALUE))
        );

        pnlBody.setBackground(new java.awt.Color(255, 255, 255));
        pnlBody.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Light", 0, 24))); // NOI18N

        btnOrdNome.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnOrdNome.setText("Ordenar");
        btnOrdNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdNomeActionPerformed(evt);
            }
        });

        tabelaDados.setAutoCreateRowSorter(true);
        tabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaDados);

        cbOrdena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOME", "HP", "PESO", "ANO", "ORIGEM" }));

        btnSearch.setText("BUSCAR");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnGroup.add(rbLinear);
        rbLinear.setText("Linear");

        btnGroup.add(rbBinaria);
        rbBinaria.setText("Binária");

        btnFiltro.add(rbModel);
        rbModel.setText("Nome");

        btnFiltro.add(rbOrigin);
        rbOrigin.setText("Origem");

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOrdena, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch)
                    .addComponent(btnOrdNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rbModel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbLinear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbBinaria, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(rbOrigin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(cbOrdena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOrdNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbLinear)
                            .addComponent(rbBinaria))
                        .addGap(13, 13, 13)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbModel)
                            .addComponent(rbOrigin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void carregaArquivo() {
        String csvFile = "automobile_data.csv";
        String line = "";
        String[] reader = null;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {

                Data d = new Data();

                reader = line.split(",");

                d.setName(reader[0]);

                if (!reader[1].isEmpty()) {
                    d.setHorsePower(Integer.parseInt(reader[1]));
                }

                if (!reader[2].isEmpty()) {
                    d.setWeigth(Integer.parseInt(reader[2]));
                }

                if (!reader[3].isEmpty()) {
                    d.setModelYear(Integer.parseInt(reader[3]));
                }

                d.setOrigin(reader[4]);

                System.out.println("Nome: " + d.getName());
                System.out.println("HP: " + d.getHorsePower());
                System.out.println("Peso: " + d.getWeigth());
                System.out.println("Ano: " + d.getModelYear());
                System.out.println("Origem: " + d.getOrigin());
                System.out.println("---------");

                dataList.add(d);
            }// fim percurso no arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void mostra() {
        tabelaDados.setModel(new DefaultTableModel(null, new String[]{"Modelo", "HP", "Peso", "Ano", "Origem"}));

        DefaultTableModel model = (DefaultTableModel) tabelaDados.getModel();

        Object rowData[] = new Object[5];
        for (Data d : dataList) {
            rowData[0] = d.getName();
            rowData[1] = d.getHorsePower();
            rowData[2] = d.getWeigth();
            rowData[3] = d.getModelYear();
            rowData[4] = d.getOrigin();
            model.addRow(rowData);
        }
    }

    private void btnOrdNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdNomeActionPerformed

        switch (cbOrdena.getSelectedIndex()) {
            case 0:
                dataList.sort(compareName);
                break;
            case 1:
                dataList.sort(compareHp);
                break;
            case 2:
                dataList.sort(compareWeigth);
                break;
            case 3:
                dataList.sort(compareModelYear);
                break;
            case 4:
                dataList.sort(compareOrigin);
                break;
        }

        mostra();
    }//GEN-LAST:event_btnOrdNomeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search = txtSearch.getText();
        int result = -1;
        ArrayList<Data> dataListCopy = new ArrayList<>(dataList);

        if (rbLinear.isSelected()) {
            if (rbModel.isSelected()) {
                result = Search.linearSearchModel(dataList, search);
            } else if (rbOrigin.isSelected()) {
                result = Search.linearSearchOrigin(dataList, search);
                if (result > -1) {
                    JOptionPane.showMessageDialog(null, "Encontrado!\nForam feitas " + result + " comparacações!");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um dado para buscar");
            }
        } else if (rbBinaria.isSelected()) {
            if (rbModel.isSelected()) {
                Collections.sort(dataListCopy, compareName);
                result = Search.binarySearchModel(dataListCopy, search);
            } else if (rbOrigin.isSelected()) {
                Collections.sort(dataListCopy, compareOrigin);
                result = Search.binarySearchOrigin(dataListCopy, search);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um método de busca");
        }

        if (result > -1) {
            JOptionPane.showMessageDialog(null, "Encontrado o primeiro registro com " + result + " comparações!");
        } else {
            JOptionPane.showMessageDialog(null, "Não Encontrado!");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnFiltro;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnOrdNome;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbOrdena;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProx;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JRadioButton rbBinaria;
    private javax.swing.JRadioButton rbLinear;
    private javax.swing.JRadioButton rbModel;
    private javax.swing.JRadioButton rbOrigin;
    private javax.swing.JTable tabelaDados;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
