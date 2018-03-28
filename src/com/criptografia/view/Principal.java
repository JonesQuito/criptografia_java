package com.criptografia.view;

import com.criptografia.service.CifrasDeCesar;
import com.criptografia.service.CriptografiaPorSubstituicao;
import com.criptografia.service.Arquivo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.Document;

public class Principal extends javax.swing.JFrame {

    File arquivo = null;

    public Principal() {
        initComponents();

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        btCriptografarCifra = new javax.swing.JButton();
        btnDecriptografarCesar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCriptografarSubstituicao = new javax.swing.JButton();
        btnDescriptografarSubstituicao = new javax.swing.JButton();
        txtCaminhoArquivo = new javax.swing.JTextField();
        btnProcurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carregar Arquivo");

        jLabel2.setText("Arquivo");

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

        btnCriptografarSubstituicao.setText("Criptografia por Subst.");
        btnCriptografarSubstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriptografarSubstituicaoActionPerformed(evt);
            }
        });

        btnDescriptografarSubstituicao.setText("Decriptografar por Subst.");
        btnDescriptografarSubstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescriptografarSubstituicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCriptografarCifra, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDecriptografarCesar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCriptografarSubstituicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDescriptografarSubstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCriptografarCifra)
                            .addComponent(btnCriptografarSubstituicao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDecriptografarCesar)
                            .addComponent(btnDescriptografarSubstituicao)))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 245, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(255, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtCaminhoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCaminhoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCaminhoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaminhoArquivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaminhoArquivoActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        arquivo = Arquivo.abrirArquivo();
        txtCaminhoArquivo.setText(arquivo.getPath());
        txtCaminhoArquivo.setEditable(false);

        try {
            FileReader reader = new FileReader(arquivo);
            BufferedReader buffer = new BufferedReader(reader);

            String linha;
            String texto = new String();

            // Lê linha a linha e adiciona em uma variável chamada 'texto'
            while (buffer.ready()) {
                linha = buffer.readLine();
                texto += linha + "\n";
            }
            txtTexto.setText(texto);

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
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Desculpe, o valor informado é inválido!");
        }

    }//GEN-LAST:event_btCriptografarCifraActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (!txtTexto.getText().isEmpty()) {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            fc.setSelectedFile(arquivo);
            if(fc.showSaveDialog(null) == 1){
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
        }catch (NumberFormatException nfe) {
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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriptografarCifra;
    private javax.swing.JButton btnCriptografarSubstituicao;
    private javax.swing.JButton btnDecriptografarCesar;
    private javax.swing.JButton btnDescriptografarSubstituicao;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCaminhoArquivo;
    private javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables
}
