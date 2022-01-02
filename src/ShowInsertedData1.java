
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruhan
 */
public class ShowInsertedData1 extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    DatabaseConnection db;
    Statement st;

    public ShowInsertedData1() {
        db=new DatabaseConnection();
        st=db.getDbStatement();

        initComponents();
        this.setLocationRelativeTo(null);
        call();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reg = new javax.swing.JPanel();
        nametxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gendertxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        contacttxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        agetxt1 = new javax.swing.JTextField();
        donoridtxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        bgtxt = new javax.swing.JTextField();
        profilename = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(832, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        reg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Congratulation", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        reg.setOpaque(false);
        reg.setLayout(null);

        nametxt.setEditable(false);
        nametxt.setBackground(new java.awt.Color(234, 4, 4));
        nametxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        nametxt.setForeground(new java.awt.Color(51, 51, 0));
        nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nametxt.setBorder(null);
        nametxt.setOpaque(false);
        reg.add(nametxt);
        nametxt.setBounds(170, 180, 190, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Name            :");
        reg.add(jLabel9);
        jLabel9.setBounds(30, 170, 120, 50);

        gendertxt.setEditable(false);
        gendertxt.setBackground(new java.awt.Color(234, 4, 4));
        gendertxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        gendertxt.setForeground(new java.awt.Color(51, 51, 0));
        gendertxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gendertxt.setBorder(null);
        gendertxt.setOpaque(false);
        reg.add(gendertxt);
        gendertxt.setBounds(170, 330, 190, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Age               :");
        reg.add(jLabel10);
        jLabel10.setBounds(30, 240, 120, 50);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Gender           :");
        reg.add(jLabel12);
        jLabel12.setBounds(20, 310, 120, 70);

        idtxt.setEditable(false);
        idtxt.setBackground(new java.awt.Color(234, 4, 4));
        idtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        idtxt.setForeground(new java.awt.Color(51, 51, 0));
        idtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idtxt.setBorder(null);
        idtxt.setOpaque(false);
        reg.add(idtxt);
        idtxt.setBounds(580, 190, 180, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("ID*                :");
        reg.add(jLabel15);
        jLabel15.setBounds(430, 190, 120, 30);

        addresstxt.setEditable(false);
        addresstxt.setBackground(new java.awt.Color(234, 4, 4));
        addresstxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        addresstxt.setForeground(new java.awt.Color(51, 51, 0));
        addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addresstxt.setBorder(null);
        addresstxt.setOpaque(false);
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });
        reg.add(addresstxt);
        addresstxt.setBounds(580, 260, 180, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Address         :");
        reg.add(jLabel13);
        jLabel13.setBounds(430, 250, 120, 50);

        contacttxt.setEditable(false);
        contacttxt.setBackground(new java.awt.Color(234, 4, 4));
        contacttxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        contacttxt.setForeground(new java.awt.Color(51, 51, 0));
        contacttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contacttxt.setBorder(null);
        contacttxt.setOpaque(false);
        contacttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxtActionPerformed(evt);
            }
        });
        reg.add(contacttxt);
        contacttxt.setBounds(580, 330, 180, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Contact No.   :");
        reg.add(jLabel14);
        jLabel14.setBounds(430, 310, 130, 70);

        agetxt1.setEditable(false);
        agetxt1.setBackground(new java.awt.Color(234, 4, 4));
        agetxt1.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        agetxt1.setForeground(new java.awt.Color(51, 51, 0));
        agetxt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agetxt1.setBorder(null);
        agetxt1.setOpaque(false);
        reg.add(agetxt1);
        agetxt1.setBounds(170, 250, 190, 30);

        donoridtxt.setEditable(false);
        donoridtxt.setBackground(new java.awt.Color(234, 4, 4));
        donoridtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        donoridtxt.setForeground(new java.awt.Color(51, 51, 0));
        donoridtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        donoridtxt.setBorder(null);
        donoridtxt.setOpaque(false);
        reg.add(donoridtxt);
        donoridtxt.setBounds(170, 110, 190, 30);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Donor ID      :");
        reg.add(jLabel11);
        jLabel11.setBounds(30, 100, 120, 50);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Blood Group :");
        reg.add(jLabel16);
        jLabel16.setBounds(430, 100, 130, 50);

        bgtxt.setEditable(false);
        bgtxt.setBackground(new java.awt.Color(234, 4, 4));
        bgtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        bgtxt.setForeground(new java.awt.Color(51, 51, 0));
        bgtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bgtxt.setBorder(null);
        bgtxt.setOpaque(false);
        bgtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgtxtActionPerformed(evt);
            }
        });
        reg.add(bgtxt);
        bgtxt.setBounds(580, 110, 180, 30);

        profilename.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        profilename.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reg.add(profilename);
        profilename.setBounds(240, 40, 380, 40);

        getContentPane().add(reg);
        reg.setBounds(10, 140, 810, 450);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel8.setText("Blood Donor Management System");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 70, 530, 27);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Daffodil International University");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 40, 280, 20);

        jButton7.setBackground(new java.awt.Color(255, 102, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 10, 80, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RP-liveevents-1920-bg.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 830, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void contacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxtActionPerformed

    private void bgtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bgtxtActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        try{

            //ResultSet rs=st.executeQuery("select *from donors");

        }catch(Exception e){

        }

        AddDonor l=new AddDonor();
        close();
        l.setVisible(true);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    
    
    private void executeSQLQuery(String query) {
       try{

          
           if(st.executeUpdate(query)==1){
               //JOptionPane.showMessageDialog(null,"Registration Successful!!","Congrats..",JOptionPane.INFORMATION_MESSAGE);
               
//ys/no code hbe
           }else{
               //JOptionPane.showMessageDialog(null,"Registration Unsuccessful!!","Sorry!",JOptionPane.WARNING_MESSAGE); 
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    
    String sample="";
    
    public void call(){
        
        try{

           ResultSet rs=st.executeQuery("select *from donors");
           
           
           
           while(rs.next()){
               sample=rs.getString("DonorId");
           }
           
           

           
       }catch(Exception e){
            
       }
        
        
        //1st level
        
        
        recall();
        
    }
    
    
    public void recall(){
        
        //1st level
        
        
        try{

           ResultSet rs=st.executeQuery("select *from donors");
           
           
           
           
           while(rs.next()){
               String s=rs.getString("DonorId");
               if(s.equalsIgnoreCase(sample)){
                    
                    
                    String s2=rs.getString("Name");
                    String s3=rs.getString("Age");
                    String s4=rs.getString("Gender");
                    String s5=rs.getString("Bg");
                    String s6=rs.getString("Id");
                    String s7=rs.getString("Address");
                    String s8=rs.getString("Contact");
                    
                    ShowInsertedData x=new ShowInsertedData();
                    profilename.setText(s2+"'s Profile");
                    
                    donoridtxt.setText(s);
                    nametxt.setText(s2);
                    agetxt1.setText(s3);
                    gendertxt.setText(s4);
                    bgtxt.setText(s5);
                    idtxt.setText(s6);
                    addresstxt.setText(s7);
                    contacttxt.setText(s8);
                    
                    break;
               }
           }
           
           
           
       }catch(Exception e){
            
       }
    }
    
    
    
    
    
    public void close(){
        WindowEvent winclose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowInsertedData1 ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField agetxt1;
    private javax.swing.JTextField bgtxt;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JTextField donoridtxt;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel profilename;
    private javax.swing.JPanel reg;
    // End of variables declaration//GEN-END:variables
}
