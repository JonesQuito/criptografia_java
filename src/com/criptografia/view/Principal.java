package com.criptografia.view;

import com.criptografia.service.CifrasDeCesar;
import com.criptografia.service.CriptografiaPorSubstituicao;
import com.criptografia.service.Arquivo;
import com.criptografia.service.CriptografiaAes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    File arquivo = null;
    CriptografiaAes cAes;
    byte[] bytes;

    public Principal() throws Exception {
        initComponents();
        cAes = new CriptografiaAes();
        txtTexto.setLineWrap(true);

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        btCriptografarCifra = new javax.swing.JButton();
        btnDecriptografarCesar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCriptografarSubstituicao = new javax.swing.JButton();
        btnDescriptografarSubstituicao = new javax.swing.JButton();
        btnCriptografarAES = new javax.swing.JButton();
        btnDescriptografarAES = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCaminhoArquivo = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmiSair = new javax.swing.JMenu();
        jmiAbrirArquivo = new javax.swing.JMenuItem();
        jmiSalvarArquivo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmCriptografia = new javax.swing.JMenu();
        jmiChaveAssimetrica = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));

        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        jScrollPane1.setViewportView(txtTexto);

        btCriptografarCifra.setText("Cifras de Cesar");
        btCriptografarCifra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriptografarCifraActionPerformed(evt);
            }
        });

        btnDecriptografarCesar.setText("Decriptografar pos Cifras");
        btnDecriptografarCesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecriptografarCesarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCriptografarSubstituicao.setText("Cript. por Subst.");
        btnCriptografarSubstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriptografarSubstituicaoActionPerformed(evt);
            }
        });

        btnDescriptografarSubstituicao.setText("Decript. por Subst.");
        btnDescriptografarSubstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescriptografarSubstituicaoActionPerformed(evt);
            }
        });

        btnCriptografarAES.setText("Criptografia AES");
        btnCriptografarAES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriptografarAESActionPerformed(evt);
            }
        });

        btnDescriptografarAES.setText("Decriptografar AES");
        btnDescriptografarAES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescriptografarAESActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCriptografarCifra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDecriptografarCesar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCriptografarAES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDescriptografarAES, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDescriptografarSubstituicao, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(btnCriptografarSubstituicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCriptografarCifra)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCriptografarAES)
                                .addComponent(btnCriptografarSubstituicao)))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDecriptografarCesar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDescriptografarSubstituicao)
                                .addComponent(btnDescriptografarAES)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carregar Arquivo");

        jLabel2.setText("Arquivo");

        txtCaminhoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaminhoArquivoActionPerformed(evt);
            }
        });

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtCaminhoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCaminhoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jmiSair.setText("Arquivo");

        jmiAbrirArquivo.setText("Abrir");
        jmiSair.add(jmiAbrirArquivo);

        jmiSalvarArquivo.setText("Salvar");
        jmiSair.add(jmiSalvarArquivo);

        jMenuItem1.setText("Sair");
        jmiSair.add(jMenuItem1);

        jMenuBar1.add(jmiSair);

        jmCriptografia.setText("Criptografia");

        jmiChaveAssimetrica.setText("Chave Assimétrica");
        jmiChaveAssimetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiChaveAssimetricaActionPerformed(evt);
            }
        });
        jmCriptografia.add(jmiChaveAssimetrica);

        jMenuBar1.add(jmCriptografia);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCaminhoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaminhoArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaminhoArquivoActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        arquivo = Arquivo.abrirArquivo();
        if (arquivo == null) {
            return;
        }
        txtCaminhoArquivo.setText(arquivo.getPath());
        txtCaminhoArquivo.setEditable(false);

        try {
            txtTexto.setText(Arquivo.lerArquivoTxt(arquivo));

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btCriptografarCifraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriptografarCifraActionPerformed
        int chave = 0;
        String textoCriptografado = "";

        try {
            chave = Integer.parseInt(JOptionPane.showInputDialog(this, "Informe a chave para criptografar o texto."));
            textoCriptografado = CifrasDeCesar.encriptaCesar(txtTexto.getText(), chave);
            txtTexto.setText(textoCriptografado);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Desculpe, o valor informado é inválido!");
        }

    }//GEN-LAST:event_btCriptografarCifraActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!txtTexto.getText().isEmpty()) {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            fc.setSelectedFile(arquivo);
            if (fc.showSaveDialog(null) == 1) {
                return;
            }
            File file = fc.getSelectedFile();

            try {
                if (file != null) {
                    String destino = file.getPath();
                    destino = destino;
                    Arquivo.gravarTxt(txtTexto.getText(), destino);
                    JOptionPane.showMessageDialog(this, "Texto salvo em: " + destino);
                }

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Não há conteúdo a ser salvo!");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDecriptografarCesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecriptografarCesarActionPerformed
        int chave = 0;
        String textoDecriptografado = "";
        try {
            chave = Integer.parseInt(JOptionPane.showInputDialog(this, "Informe a chave para decriptografar!"));
            textoDecriptografado = CifrasDeCesar.decriptografarCesar(txtTexto.getText(), chave);
            txtTexto.setText(textoDecriptografado);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Desculpe, o valor informado não é um número!");
        }
    }//GEN-LAST:event_btnDecriptografarCesarActionPerformed

    private void btnCriptografarSubstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriptografarSubstituicaoActionPerformed
        int chave = 0;
        String textoCriptografado = "";

        try {
            chave = Integer.parseInt(JOptionPane.showInputDialog(this, "Informe a chave para criptografar o texto."));
            textoCriptografado = CriptografiaPorSubstituicao.criptografar(txtTexto.getText(), chave);
            txtTexto.setText(textoCriptografado);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Desculpe, o valor informado não é um número!");
        }
    }//GEN-LAST:event_btnCriptografarSubstituicaoActionPerformed

    private void btnDescriptografarSubstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescriptografarSubstituicaoActionPerformed
        int chave = 0;
        String textoDecriptografado = "";
        try {
            chave = Integer.parseInt(JOptionPane.showInputDialog(this, "Informe a chave para decriptografar!"));
            textoDecriptografado = CriptografiaPorSubstituicao.decriptografar(txtTexto.getText(), chave);
            txtTexto.setText(textoDecriptografado);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Desculpe, o valor informado não é um número!");
        }
    }//GEN-LAST:event_btnDescriptografarSubstituicaoActionPerformed

    private void btnCriptografarAESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriptografarAESActionPerformed
        String textoCriptografado = "";

        try {
            //CriptografiaAes cAes = new CriptografiaAes();
            bytes = cAes.criptografarTexto(txtTexto.getText().getBytes());

            txtTexto.setText(new String(bytes));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao instanciar objeto CriptografiaAes!");
        }
    }//GEN-LAST:event_btnCriptografarAESActionPerformed

    private void btnDescriptografarAESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescriptografarAESActionPerformed

        try {
            //CriptografiaAes cAes = new CriptografiaAes();
            //bytes = cAes.descriptografarTexto(txtTexto.getText().getBytes());
            txtTexto.setText(new String(cAes.descriptografarTexto(bytes)));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao instanciar objeto CriptografiaAes!" + ex.getMessage());
        }
    }//GEN-LAST:event_btnDescriptografarAESActionPerformed

    private void jmiChaveAssimetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiChaveAssimetricaActionPerformed
        new CriptografiaChaveAssimetrica().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmiChaveAssimetricaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriptografarCifra;
    private javax.swing.JButton btnCriptografarAES;
    private javax.swing.JButton btnCriptografarSubstituicao;
    private javax.swing.JButton btnDecriptografarCesar;
    private javax.swing.JButton btnDescriptografarAES;
    private javax.swing.JButton btnDescriptografarSubstituicao;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jmCriptografia;
    private javax.swing.JMenuItem jmiAbrirArquivo;
    private javax.swing.JMenuItem jmiChaveAssimetrica;
    private javax.swing.JMenu jmiSair;
    private javax.swing.JMenuItem jmiSalvarArquivo;
    private javax.swing.JTextField txtCaminhoArquivo;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables
}
