
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Radio1 extends javax.swing.JFrame {

    /**
     * Creates new form Radio1
     */
    public Radio1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        RANIMAL = new javax.swing.JLabel();
        RBIRD = new javax.swing.JRadioButton();
        RCAT = new javax.swing.JRadioButton();
        RDOG = new javax.swing.JRadioButton();
        RRABBIT = new javax.swing.JRadioButton();
        RPIG = new javax.swing.JRadioButton();
        RDISPLAY = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RANIMAL.setText("CHOOSE ANIMAL");

        buttonGroup1.add(RBIRD);
        RBIRD.setText("BIRD");
        RBIRD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBIRDActionPerformed(evt);
            }
        });

        buttonGroup1.add(RCAT);
        RCAT.setText("CAT");
        RCAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RCATActionPerformed(evt);
            }
        });

        buttonGroup1.add(RDOG);
        RDOG.setText("DOG");
        RDOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDOGActionPerformed(evt);
            }
        });

        buttonGroup1.add(RRABBIT);
        RRABBIT.setText("RABBIT");
        RRABBIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RRABBITActionPerformed(evt);
            }
        });

        buttonGroup1.add(RPIG);
        RPIG.setText("PIG");
        RPIG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPIGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(RANIMAL))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RBIRD)
                            .addComponent(RCAT)
                            .addComponent(RDOG)
                            .addComponent(RRABBIT)
                            .addComponent(RPIG))
                        .addGap(18, 18, 18)
                        .addComponent(RDISPLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RANIMAL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RBIRD)
                        .addGap(39, 39, 39)
                        .addComponent(RCAT)
                        .addGap(48, 48, 48)
                        .addComponent(RDOG)
                        .addGap(57, 57, 57)
                        .addComponent(RRABBIT)
                        .addGap(45, 45, 45)
                        .addComponent(RPIG)
                        .addContainerGap(223, Short.MAX_VALUE))
                    .addComponent(RDISPLAY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBIRDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBIRDActionPerformed
       ImageIcon icon= new ImageIcon(getClass().getResource("/images/bird.jpg"));
       RDISPLAY.setIcon(icon);
       JOptionPane.showMessageDialog(this, "You selected: bird");
    }//GEN-LAST:event_RBIRDActionPerformed

    private void RCATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RCATActionPerformed
        ImageIcon icon= new ImageIcon(getClass().getResource("/images/cat.jpg"));
       RDISPLAY.setIcon(icon);
       JOptionPane.showMessageDialog(this, "You selected: cat");
    }//GEN-LAST:event_RCATActionPerformed

    private void RDOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDOGActionPerformed
        ImageIcon icon= new ImageIcon(getClass().getResource("/images/dog.jpg"));
       RDISPLAY.setIcon(icon);
       JOptionPane.showMessageDialog(this, "You selected: dog");
    }//GEN-LAST:event_RDOGActionPerformed

    private void RRABBITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RRABBITActionPerformed
        ImageIcon icon= new ImageIcon(getClass().getResource("/images/rabbit.jpg"));
       RDISPLAY.setIcon(icon);
       JOptionPane.showMessageDialog(this, "You selected: rabbit");
    }//GEN-LAST:event_RRABBITActionPerformed

    private void RPIGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPIGActionPerformed
        ImageIcon icon= new ImageIcon(getClass().getResource("/images/pig.jpg"));
       RDISPLAY.setIcon(icon);
       JOptionPane.showMessageDialog(this, "You selected: pig");
    }//GEN-LAST:event_RPIGActionPerformed
    
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
            java.util.logging.Logger.getLogger(Radio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Radio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Radio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Radio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Radio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RANIMAL;
    private javax.swing.JRadioButton RBIRD;
    private javax.swing.JRadioButton RCAT;
    private javax.swing.JLabel RDISPLAY;
    private javax.swing.JRadioButton RDOG;
    private javax.swing.JRadioButton RPIG;
    private javax.swing.JRadioButton RRABBIT;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
