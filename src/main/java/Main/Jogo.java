package Main;

import java.awt.Color;
import java.util.Random;

public class Jogo extends javax.swing.JFrame {
    
    public static boolean boolJogando = false;
    public static int dificuldade, qntRepetir, qntDica, tamanhoCaminho, jogada;
    public static String[] caminho;
    public static String[] cores = {"verde", "vermelho", "amarelo", "azul"};
    
    public Jogo() {
        initComponents();
        liberaCores();
        jB_Reiniciar.setEnabled(false);
        jB_Jogar.setEnabled(false);
        jB_Repetir.setEnabled(false);
        jB_Dica.setEnabled(false);
        jL_qntRepetir.setText("?");
        jL_qntDica.setText("?");
        jL_Mensagem.setText("Bem Vindo!");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jL_Instrucoes = new javax.swing.JLabel();
        jL_Jogada = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jB_Verde = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jB_Vermelho = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jB_Amarelo = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jB_Azul = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jB_Repetir = new javax.swing.JButton();
        jB_Dica = new javax.swing.JButton();
        jL_qntRepetir = new javax.swing.JLabel();
        jL_qntDica = new javax.swing.JLabel();
        jL_Mensagem = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jB_Normal = new javax.swing.JButton();
        jB_Facil = new javax.swing.JButton();
        jB_Dificil = new javax.swing.JButton();
        jB_Jogar = new javax.swing.JButton();
        jB_Reiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Genius");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gênius");
        jLabel1.setToolTipText("https://github.com/RafaelEtec/Genius");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("por Rafael Ferreira Goulart");
        jLabel2.setToolTipText("https://github.com/RafaelEtec");

        jL_Instrucoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jL_Instrucoes.setText("?");
        jL_Instrucoes.setToolTipText("");

        jL_Jogada.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Jogada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(jL_Instrucoes)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(jL_Jogada))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jL_Instrucoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jB_Verde.setBackground(new java.awt.Color(102, 255, 102));
        jB_Verde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_VerdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Verde, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Verde, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jB_Vermelho.setBackground(new java.awt.Color(255, 102, 102));
        jB_Vermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_VermelhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Vermelho, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Vermelho, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jB_Amarelo.setBackground(new java.awt.Color(255, 255, 102));
        jB_Amarelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AmareloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Amarelo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Amarelo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jB_Azul.setBackground(new java.awt.Color(102, 102, 255));
        jB_Azul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AzulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Azul, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Azul, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jB_Repetir.setBackground(new java.awt.Color(204, 204, 255));
        jB_Repetir.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N
        jB_Repetir.setText("Repetir");
        jB_Repetir.setToolTipText("");

        jB_Dica.setBackground(new java.awt.Color(204, 204, 255));
        jB_Dica.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N
        jB_Dica.setText("Dica");

        jL_qntRepetir.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N
        jL_qntRepetir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_qntRepetir.setText("Repetir");

        jL_qntDica.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N
        jL_qntDica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_qntDica.setText("Dicas");

        jL_Mensagem.setFont(new java.awt.Font("Perpetua", 1, 12)); // NOI18N
        jL_Mensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Mensagem.setText("mensagem");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jL_qntRepetir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_Repetir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jB_Dica, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jL_qntDica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Mensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jB_Repetir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_Dica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_qntRepetir)
                            .addComponent(jL_qntDica))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jL_Mensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jB_Normal.setBackground(new java.awt.Color(204, 204, 255));
        jB_Normal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jB_Normal.setText("Normal");
        jB_Normal.setToolTipText("Repetir: 1 - Dica: 2");
        jB_Normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_NormalActionPerformed(evt);
            }
        });

        jB_Facil.setBackground(new java.awt.Color(204, 204, 255));
        jB_Facil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jB_Facil.setText("Fácil");
        jB_Facil.setToolTipText("Repetir: 2 - Dica: 3");
        jB_Facil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_FacilActionPerformed(evt);
            }
        });

        jB_Dificil.setBackground(new java.awt.Color(204, 204, 255));
        jB_Dificil.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jB_Dificil.setText("Difícil");
        jB_Dificil.setToolTipText("Repetir: 0 - Dica: 0");
        jB_Dificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_DificilActionPerformed(evt);
            }
        });

        jB_Jogar.setBackground(new java.awt.Color(204, 204, 255));
        jB_Jogar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jB_Jogar.setText("Jogar");
        jB_Jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_JogarActionPerformed(evt);
            }
        });

        jB_Reiniciar.setBackground(new java.awt.Color(204, 204, 255));
        jB_Reiniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jB_Reiniciar.setText("Reiniciar");
        jB_Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_Jogar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Reiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_Facil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Normal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_Dificil)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_Normal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_Facil, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jB_Dificil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jB_Jogar)
                    .addComponent(jB_Reiniciar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jB_FacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_FacilActionPerformed
        dificuldade = 0;
        tamanhoCaminho = 8;
        highlightBotao(dificuldade);
        mudaMensagemDificuldade();
    }//GEN-LAST:event_jB_FacilActionPerformed

    private void jB_NormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_NormalActionPerformed
        dificuldade = 1;
        tamanhoCaminho = 16;
        highlightBotao(dificuldade);
        mudaMensagemDificuldade();
    }//GEN-LAST:event_jB_NormalActionPerformed

    private void jB_DificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_DificilActionPerformed
        dificuldade = 2;
        tamanhoCaminho = 24;
        highlightBotao(dificuldade);
        mudaMensagemDificuldade();
    }//GEN-LAST:event_jB_DificilActionPerformed

    private void jB_JogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_JogarActionPerformed
        boolJogando = true;
        jB_Jogar.setEnabled(false);
        jB_Reiniciar.setEnabled(true);
        liberaDificuldades();
        liberaAjudas();
        liberaCores();
        mudaMensagemDificuldade();
        jogar();
    }//GEN-LAST:event_jB_JogarActionPerformed

    private void jB_ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ReiniciarActionPerformed
        jogarReiniciar(0);
        liberaDificuldades();
        liberaCores();
    }//GEN-LAST:event_jB_ReiniciarActionPerformed

    private void jB_VerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_VerdeActionPerformed
        String corEscolhida = "verde";
        confereJogada(caminho, corEscolhida);
    }//GEN-LAST:event_jB_VerdeActionPerformed

    private void jB_VermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_VermelhoActionPerformed
        String corEscolhida = "vermelho";
        confereJogada(caminho, corEscolhida);
    }//GEN-LAST:event_jB_VermelhoActionPerformed

    private void jB_AmareloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AmareloActionPerformed
        String corEscolhida = "amarelo";
        confereJogada(caminho, corEscolhida);
    }//GEN-LAST:event_jB_AmareloActionPerformed

    private void jB_AzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AzulActionPerformed
        String corEscolhida = "azul";
        confereJogada(caminho, corEscolhida);
    }//GEN-LAST:event_jB_AzulActionPerformed
    
    private void delayJogar(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException ex) {
            System.out.println("Erro");
        }
    }
    
    private static void delay(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException ex) {
            System.out.println("Erro");
        }
    }
    
    // 102,255,0
    // 255,0,0
    // 255,255,0
    // 0,0,255
    
    private void jogar() {
        jogada = 0;
        caminho = new String[tamanhoCaminho];
        criaCaminho(caminho);
        
        delayJogar(1000);
        jL_Mensagem.setText("O jogo começou, Boa Sorte!");
        delay(100);
        piscaCor(caminho, jogada);
    }
    
    private void confereJogada(String[] caminho, String corEscolhida) {
        if (confereVitoria(caminho, jogada, corEscolhida)) {
            boolJogando = false;
            jogarReiniciar(1);
            liberaDificuldades();
            liberaCores();
            jL_Jogada.setText("0");
        } else if (caminho[jogada].equals(corEscolhida)) {
            jogada++;
            jL_Mensagem.setText("Acertou ! ! !");
            jL_Jogada.setText(Integer.toString(jogada));
        } else {
            jL_Jogada.setText("0");
            boolJogando = false;
            jogarReiniciar(-1);
            liberaDificuldades();
            liberaCores();
        }
    }
    
    private boolean confereVitoria(String[] caminho, int jogada, String corEscolhida) {
        boolean boolGanhou = false;
        if (jogada == (tamanhoCaminho - 1)) {
            if (caminho[jogada].equals(corEscolhida)) {
                boolGanhou = true;
            }
        }
        return boolGanhou;
    }
    
    private String[] criaCaminho(String[] caminho) {
        Random ran = new Random();
        
        for (int pos = 0; pos < caminho.length; pos++) {
            int proxCor = ran.nextInt(4);
            switch (proxCor) {
                case 0:
                    caminho[pos] = "verde";
                    break;
                case 1:
                    caminho[pos] = "vermelho";
                    break;
                case 2:
                    caminho[pos] = "amarelo";
                    break;
                case 3:
                    caminho[pos] = "azul";
                    break;
            }
            System.out.print(caminho[pos] + " ");
        }
        System.out.println();
        return caminho;
    }
    
    private void piscaCor(String[] caminho, int jogada) {
        switch(caminho[jogada]) {
            case "verde":
                jB_Verde.setBackground(new Color(102,255,0));
                delay(200);
                jB_Verde.setBackground(new Color(102,255,102));
                break;
            case "vermelho":
                jB_Vermelho.setBackground(new Color(255,0,0));
                delay(200);
                jB_Vermelho.setBackground(new Color(255,102,102));
                break;
            case "amarelo":
                jB_Amarelo.setBackground(new Color(255,255,0));
                delay(20);
                jB_Amarelo.setBackground(new Color(255,255,102));
                break;
            case "azul":
                jB_Azul.setBackground(new Color(0,0,255));
                delay(200);
                jB_Azul.setBackground(new Color(102,102,255));
                break;
        }
        
    }
    
    private void mudaMensagemDificuldade() {
        if (boolJogando == false) {
            switch (dificuldade) {
                case 0:
                    jL_Mensagem.setText("Repetir: 2 - Dica: 3 - Ganha com 08 acertos");
                    break;
                case 1:
                    jL_Mensagem.setText("Repetir: 1 - Dica: 2 - Ganha com 16 acertos");
                    break;
                case 2:
                    jL_Mensagem.setText("Repetir: 0 - Dica: 0 - Ganha com 24 acertos");
                    break;
            }
        } else {
            jL_Mensagem.setText("");
        }
    }
    
    private void jogarReiniciar(int status) {
        boolJogando = false;
        jB_Jogar.setEnabled(true);
        jB_Reiniciar.setEnabled(false);
        if (status == -1) {
            jL_Mensagem.setText("Derrota ! ! !");
        } else if (status == 0){
            jL_Mensagem.setText("");
        } else if (status == 1) {
            jL_Mensagem.setText("Você ganhou ! ! !");
        }
        liberaDificuldades();
        liberaAjudas();
        status = 0;
    }
    
    private void highlightBotao(int dificuldade) {
        jB_Jogar.setEnabled(true);
        jB_Facil.setBackground(new java.awt.Color(204, 204, 255));
        jB_Normal.setBackground(new java.awt.Color(204, 204, 255));
        jB_Dificil.setBackground(new java.awt.Color(204, 204, 255));
        switch (dificuldade) {
            case 0:
                jB_Facil.setBackground(Color.white);
                break;
            case 1:
                jB_Normal.setBackground(Color.white);
                break;
            case 2:
                jB_Dificil.setBackground(Color.white);
                break;
        }
    }
    
    private void liberaDificuldades() {
        if (boolJogando == false) {
            jB_Facil.setEnabled(true);
            jB_Normal.setEnabled(true);
            jB_Dificil.setEnabled(true);
        } else {
            jB_Facil.setEnabled(false);
            jB_Normal.setEnabled(false);
            jB_Dificil.setEnabled(false);
        }
    }
    
    public void liberaCores() {
        if (boolJogando == true) {
            jB_Verde.setEnabled(true);
            jB_Vermelho.setEnabled(true);
            jB_Amarelo.setEnabled(true);
            jB_Azul.setEnabled(true);
        } else {
            jB_Verde.setEnabled(false);
            jB_Vermelho.setEnabled(false);
            jB_Amarelo.setEnabled(false);
            jB_Azul.setEnabled(false);
        }
    }
    
    private void liberaAjudas() {
        if (boolJogando == true) {
            switch (dificuldade) {
                case 0:
                    qntRepetir = 2;
                    qntDica = 3;
                    jB_Repetir.setEnabled(true);
                    jB_Dica.setEnabled(true);
                    break;
                case 1:
                    qntRepetir = 1;
                    qntDica = 2;
                    jB_Repetir.setEnabled(true);
                    jB_Dica.setEnabled(true);
                    break;
                case 2:
                    qntRepetir = 0;
                    qntDica = 0;
                    jB_Repetir.setEnabled(false);
                    jB_Dica.setEnabled(false);
                    break;
            }
            jL_qntRepetir.setText(Integer.toString(qntRepetir));
            jL_qntDica.setText(Integer.toString(qntDica));
        } else {
            jB_Repetir.setEnabled(false);
            jB_Dica.setEnabled(false);
            jL_qntRepetir.setText("?");
            jL_qntDica.setText("?");
        }
    }
    
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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Amarelo;
    private javax.swing.JButton jB_Azul;
    private javax.swing.JButton jB_Dica;
    private javax.swing.JButton jB_Dificil;
    private javax.swing.JButton jB_Facil;
    private javax.swing.JButton jB_Jogar;
    private javax.swing.JButton jB_Normal;
    private javax.swing.JButton jB_Reiniciar;
    private javax.swing.JButton jB_Repetir;
    private javax.swing.JButton jB_Verde;
    private javax.swing.JButton jB_Vermelho;
    private javax.swing.JLabel jL_Instrucoes;
    private javax.swing.JLabel jL_Jogada;
    private javax.swing.JLabel jL_Mensagem;
    private javax.swing.JLabel jL_qntDica;
    private javax.swing.JLabel jL_qntRepetir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}