
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class monthly extends javax.swing.JFrame {

    /**
     * Creates new form monthly
     */
    public monthly() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        dayt = new javax.swing.JTextField();
        montht = new javax.swing.JTextField();
        yeart = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dayf = new javax.swing.JTextField();
        monthf = new javax.swing.JTextField();
        yearf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Sale Report");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 226, 65);

        jLabel2.setText("To     :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(169, 190, 76, 33);

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(230, 310, 175, 34);

        dayt.setText("00");
        getContentPane().add(dayt);
        dayt.setBounds(270, 200, 39, 30);

        montht.setText("00");
        getContentPane().add(montht);
        montht.setBounds(310, 200, 31, 30);

        yeart.setText("2015");
        getContentPane().add(yeart);
        yeart.setBounds(340, 200, 50, 30);

        jLabel3.setText("From  :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(169, 120, 76, 52);

        dayf.setText("00");
        getContentPane().add(dayf);
        dayf.setBounds(270, 140, 40, 30);

        monthf.setText("00");
        getContentPane().add(monthf);
        monthf.setBounds(310, 140, 30, 30);

        yearf.setText("2015");
        getContentPane().add(yearf);
        yearf.setBounds(340, 140, 50, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
       String datet=""+yeart.getText()+"/"+""+montht.getText()+"/"+""+dayt.getText();
       String datef=""+yearf.getText()+"/"+""+monthf.getText()+"/"+""+dayf.getText(); 
        
        System.out.println(""+datet);
        System.out.println(""+datef);
        FileReader fileReader=null;
        try {
          
            String item=null;
          
            String fileName="SoldItemswithItem+Price.txt";
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
           try {
               while((item = bufferedReader.readLine()) != null) {
                   if(item.equals(datef))
                   {
                       
                       
                   }
               }   
           } catch (IOException ex) {
               Logger.getLogger(monthly.class.getName()).log(Level.SEVERE, null, ex);
           }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(monthly.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                Logger.getLogger(monthly.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_SubmitActionPerformed

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
            java.util.logging.Logger.getLogger(monthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(monthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(monthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(monthly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new monthly().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JTextField dayf;
    private javax.swing.JTextField dayt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField monthf;
    private javax.swing.JTextField montht;
    private javax.swing.JTextField yearf;
    private javax.swing.JTextField yeart;
    // End of variables declaration//GEN-END:variables
}