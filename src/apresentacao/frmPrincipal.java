/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class frmPrincipal extends javax.swing.JFrame
{

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal()
    {
        initComponents();
    }
    
    private void Terminou() throws IOException
    {
        if(bntSoma.getBackground() == Color.GREEN &&
           btnSubtracao.getBackground() == Color.GREEN &&
           btnDivisao.getBackground() == Color.GREEN &&
           btnMultiplicacao.getBackground() == Color.GREEN)
        {
            JOptionPane.showMessageDialog(null, "PARABENS VOCÊ TERMINOU AGORA VOCÊ PODE JOGAR", "PARABENS", JOptionPane.PLAIN_MESSAGE);
            
            if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
            {
                Process process = Runtime.getRuntime().exec("cmd /c start explorer.exe");
            }
            
            
            
        }
                   
    }
    
    private void abrirForm(String formulario)
    {
        
        
        switch (formulario)
        {
            
            case "+":
                if(bntSoma.getBackground() != Color.GREEN)
                {   
                    frmSSoma frmS = new frmSSoma(this,true);
                    frmS.setVisible(true);
                    if(frmS.getTerminou())  bntSoma.setBackground(Color.GREEN);
                }
                else JOptionPane.showMessageDialog(null, "VOCÊ JÁ RESPONDEU ESSAS QUESTÕES", "Aviso", JOptionPane.PLAIN_MESSAGE);
                
                
                break;
                
            case "-":
                if(btnSubtracao.getBackground() != Color.GREEN)
                {
                    frmSubtracao frmSu = new frmSubtracao(this,true);
                    frmSu.setVisible(true);
                    if (frmSu.getTerminou()) btnSubtracao.setBackground(Color.GREEN);
                } else  JOptionPane.showMessageDialog(null, "VOCÊ JÁ RESPONDEU ESSAS QUESTÕES", "Aviso", JOptionPane.PLAIN_MESSAGE);
                
                break;
                
            case "/":
                
                if(btnDivisao.getBackground() != Color.GREEN)
                {
                    frmDivisao frmD = new frmDivisao(this, true);
                    frmD.setVisible(true);
                    if (frmD.getTerminou()) btnDivisao.setBackground(Color.GREEN);
                }else JOptionPane.showMessageDialog(null, "VOCÊ JÁ RESPONDEU ESSAS QUESTÕES", "Aviso", JOptionPane.PLAIN_MESSAGE);
                break;
                
            case "*":
                
                if(btnMultiplicacao.getBackground() != Color.GREEN)
                {
                    frmMultiplicacao frmM = new frmMultiplicacao(this, true);
                    frmM.setVisible(true);
                    if (frmM.getTerminou()) btnMultiplicacao.setBackground(Color.GREEN);
                }else JOptionPane.showMessageDialog(null, "VOCÊ JÁ RESPONDEU ESSAS QUESTÕES", "Aviso", JOptionPane.PLAIN_MESSAGE);
                
                
                break;
        }
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        bntSoma = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bntSoma.setText("Soma");
        bntSoma.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bntSomaActionPerformed(evt);
            }
        });

        btnSubtracao.setText("Subtração");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubtracaoActionPerformed(evt);
            }
        });

        btnDivisao.setText("Divisão");
        btnDivisao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnMultiplicacao.setText("Multiplicação");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lição de Casa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntSoma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDivisao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubtracao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMultiplicacao)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntSomaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bntSomaActionPerformed
    {//GEN-HEADEREND:event_bntSomaActionPerformed
        abrirForm("+");
        try
        {
            Terminou();
        } catch (IOException ex)
        {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bntSomaActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDivisaoActionPerformed
    {//GEN-HEADEREND:event_btnDivisaoActionPerformed
        abrirForm("/");
        try
        {
            Terminou();
        } catch (IOException ex)
        {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubtracaoActionPerformed
    {//GEN-HEADEREND:event_btnSubtracaoActionPerformed
        abrirForm("-");
        try
        {
            Terminou();
        } catch (IOException ex)
        {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnMultiplicacaoActionPerformed
    {//GEN-HEADEREND:event_btnMultiplicacaoActionPerformed
        abrirForm("*");
        try
        {
            Terminou();
        } catch (IOException ex)
        {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSoma;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
