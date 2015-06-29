
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
public class ScanBarcode extends javax.swing.JFrame {
 
 static String str[]=new String[50];
 static int i=0;
 static int index=0;
 static  int Finalize[]=new int[1000];
  static  int SaveFinalize[]=new int[1000];
 ItemEntry items=new ItemEntry();
 LinkLists stock=new LinkLists();
    /**
     * Creates new form ScanBarcode
     */
    public ScanBarcode() {
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

        barcode = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        set = new javax.swing.JLabel();
        set1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Scan Barcode");

        Enter.setText("Add to Cart");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        set.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        set.setForeground(new java.awt.Color(0, 153, 0));
        set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        set1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        set1.setForeground(new java.awt.Color(204, 0, 0));
        set1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jDesktopPane1.setBackground(new java.awt.Color(102, 0, 0));
        jDesktopPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDesktopPane1.setForeground(new java.awt.Color(102, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("SCAN BARCODE");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(set1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(211, 211, 211)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(barcode, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 148, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(set, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(set1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        if(CheckFirst(barcode.getText())){
             barcode.setText("");
                 set.setText("Successfully Added to your Cart");
                 set1.setText("");
             }
        else{
             barcode.setText("");
             set.setText("");
             set1.setText("Out Of Stock ");
        }
    }//GEN-LAST:event_EnterActionPerformed
public boolean CheckFirst(String bar) 
{
    for(int a=0;a<1000;a++){
        if(ItemEntry.StoreB[a].equals(bar))
        {
            System.out.println("Check Here");
            if(ItemEntry.Storeqty[a]>0)
            {
                Finalize[index]=a;
                System.out.println(""+Finalize[index]);
                index++;
            return true; 
            }
        }
    }
        return false;
}

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
          
        for(int k=0;k<1000;k++)
        {
            if(Finalize[k]>-1){
                System.out.println(""+Finalize[k]);
            }
            if(SaveFinalize[k]>-1){
                System.out.println(""+SaveFinalize[k]);
            }
        }
             try {
                 
                 done(evt);
             } catch (IOException ex) {
                 Logger.getLogger(ScanBarcode.class.getName()).log(Level.SEVERE, null, ex);
            
         }
            
            
        
    }//GEN-LAST:event_SubmitActionPerformed
    public void LoadBC() throws IOException
   {
       DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
       Date date = new Date();
       String s=dateFormat.format(date);
       
       FileReader fr=new FileReader("InstantSold.txt");
       BufferedReader br=new BufferedReader(fr);
       FileWriter fw=new FileWriter("InstantSold.txt",true);
       BufferedWriter bw=new BufferedWriter(fw);
       String line=null;
      line=br.readLine();
      if(line!=null)
      {
       if(line.equals(s))
       {
       bw.write(barcode.getText());
       bw.newLine();
       bw.close();
       }
      }
       else{
           FileWriter fw1=new FileWriter("InstantSold.txt",true);
           BufferedWriter bw1=new BufferedWriter(fw1);
           bw1.write(s);
           bw1.newLine();
           bw1.write(barcode.getText());
           bw1.newLine();
           bw1.close();
       }   
   }
        public void Load() throws IOException
   {
        FileReader fr=new FileReader("RecentSold.txt");
       BufferedReader br=new BufferedReader(fr);
       FileWriter fw=new FileWriter("RecentSold.txt",true);
              BufferedWriter bw=new BufferedWriter(fw);
       String line=null;
      line=br.readLine();
      if(line!=null)
      {
          if(line.equals("**"))
          {
              bw.write(barcode.getText());
              bw.newLine();
              bw.close();
          }
      }
      else{
           FileWriter fw1=new FileWriter("RecentSold.txt",true);
              BufferedWriter bw1=new BufferedWriter(fw1);
              bw1.write("**");
              bw1.newLine();
              bw1.write(barcode.getText());
              bw1.newLine();
              bw1.close();
      }
       
   }
    private void done(java.awt.event.ActionEvent evt) throws IOException{

 dispose();//To close the current windo

 pointofsale closeCurrentWindow = new pointofsale();
 closeCurrentWindow.setVisible(true);//Open the new window

}
    public void filing(String FirstToWrite,String fileName1,String fileName2)
{
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	   //get current date time with Date()
	   Date date = new Date();
        DateFormat dateF = new SimpleDateFormat("HH:mm:ss");
           
           
           String s=dateFormat.format(date);
           String l=dateF.format(date);
           String k=null;
         try {
             FileReader fr=new FileReader(fileName1);
             BufferedReader br=new BufferedReader(fr);
            FileWriter fileWriter1 =
                new FileWriter(fileName1,true);            
                String line=null;
                BufferedWriter bufferedWriter2;
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter1);
            
            
                if(br.readLine() == null){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
                }
                else{
                    
                    {
                         bufferedWriter.write(s);
                            bufferedWriter.newLine();
                    }
                }
            bufferedWriter.write(l);
            bufferedWriter.write(FirstToWrite);
            bufferedWriter.newLine();
            
            
            
            
            FileWriter fileWriter2 =
                    new FileWriter(fileName2,true);
            bufferedWriter2 = new BufferedWriter(fileWriter2);
            bufferedWriter2.write(s);
            bufferedWriter2.newLine();
            bufferedWriter2.write(FirstToWrite);
            bufferedWriter2.newLine();
           
            
            
            
            bufferedWriter.close();
        
             
            bufferedWriter2.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + fileName1 + "'");
            // Or we could just do this:
            // ex.printStackTrace();
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
            java.util.logging.Logger.getLogger(ScanBarcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScanBarcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScanBarcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScanBarcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                    new ScanBarcode().setVisible(true);
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    private javax.swing.JButton Submit;
    public javax.swing.JTextField barcode;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel set;
    private javax.swing.JLabel set1;
    // End of variables declaration//GEN-END:variables
}
