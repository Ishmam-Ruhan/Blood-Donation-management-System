
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruhan
 */
public class AddDonor extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    DatabaseConnection db;
    Statement st;

    public AddDonor() {
        db=new DatabaseConnection();
        st=db.getDbStatement();
        initComponents();
        this.setLocationRelativeTo(null);
        usericon();

    }
    
    public void usericon(){
        String s="";
        try{
                    ResultSet rs=st.executeQuery("select *from userselection");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("user");
                        s=s1;
               
                       
                    }
           
                }catch(Exception e){
            
                 }
        icon.setText("  Hello, "+s+"!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        contacttxt = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        agetxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        idtxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        bgbox = new javax.swing.JComboBox<>();
        genderbox = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        disid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1214, 712));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 20, 60, 50);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homex24.png"))); // NOI18N
        jButton2.setText("           Home");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 110, 270, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 150, 270, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 220, 270, 30);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(0, 290, 270, 30);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(0, 358, 270, 30);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(0, 430, 270, 30);
        getContentPane().add(jSeparator6);
        jSeparator6.setBounds(0, 500, 270, 20);
        getContentPane().add(jSeparator7);
        jSeparator7.setBounds(0, 570, 270, 30);
        getContentPane().add(jSeparator8);
        jSeparator8.setBounds(0, 640, 270, 30);
        getContentPane().add(jSeparator9);
        jSeparator9.setBounds(0, 710, 270, 10);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardx24.png"))); // NOI18N
        jButton3.setText("     Dashboard");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(0, 180, 270, 40);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/profilex24.png"))); // NOI18N
        jButton4.setText("           Profile");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 250, 270, 40);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/requestsx24.png"))); // NOI18N
        jButton5.setText("        Requests");
        jButton5.setContentAreaFilled(false);
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 320, 270, 40);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/donorlistx24.png"))); // NOI18N
        jButton6.setText("      Donor List");
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(0, 393, 270, 40);

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adddonorx24.png"))); // NOI18N
        jButton7.setText("     Add Donor");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(0, 460, 270, 40);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Requestforbloodgeneralx24.png"))); // NOI18N
        jButton8.setText(" Blood Request");
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(0, 530, 270, 40);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settingsx24.png"))); // NOI18N
        jButton9.setText("        Settings");
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(0, 600, 270, 40);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exitx24.png"))); // NOI18N
        jButton10.setText("        Exit");
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(0, 670, 270, 40);

        icon.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        icon.setForeground(new java.awt.Color(153, 153, 0));
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boy (1).png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(1044, 134, 160, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Donate blood and save life!");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(830, 140, 140, 13);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 27)); // NOI18N
        jLabel6.setText("Blood Donor Management System");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(560, 100, 400, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Daffodil International University");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 60, 260, 40);

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 460, 270, 460);

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 270, 480);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 0, 950, 180);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Create", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("* marked field is not mandatory ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(720, 380, 190, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Name            :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 130, 120, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Age               :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 200, 120, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Blood group  :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(370, 50, 120, 50);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Gender           :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(100, 270, 120, 50);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Address         :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(570, 200, 120, 50);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Contact No.  :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(570, 280, 130, 50);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("ID*              :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(570, 130, 120, 40);

        contacttxt.setBackground(new java.awt.Color(255, 204, 204));
        contacttxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        contacttxt.setForeground(new java.awt.Color(0, 0, 204));
        contacttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contacttxt.setBorder(null);
        contacttxt.setOpaque(false);
        contacttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttxtActionPerformed(evt);
            }
        });
        jPanel1.add(contacttxt);
        contacttxt.setBounds(690, 290, 230, 30);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(690, 320, 230, 10);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(230, 230, 230, 10);

        agetxt.setBackground(new java.awt.Color(255, 204, 204));
        agetxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        agetxt.setForeground(new java.awt.Color(0, 0, 204));
        agetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        agetxt.setBorder(null);
        agetxt.setOpaque(false);
        jPanel1.add(agetxt);
        agetxt.setBounds(230, 200, 230, 30);

        nametxt.setBackground(new java.awt.Color(255, 204, 204));
        nametxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 0, 204));
        nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nametxt.setBorder(null);
        nametxt.setOpaque(false);
        jPanel1.add(nametxt);
        nametxt.setBounds(230, 130, 230, 30);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(230, 162, 230, 10);
        jPanel1.add(jSeparator15);
        jSeparator15.setBounds(690, 160, 230, 10);

        idtxt.setBackground(new java.awt.Color(255, 204, 204));
        idtxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        idtxt.setForeground(new java.awt.Color(0, 0, 204));
        idtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        idtxt.setBorder(null);
        idtxt.setOpaque(false);
        jPanel1.add(idtxt);
        idtxt.setBounds(690, 130, 230, 30);

        addresstxt.setBackground(new java.awt.Color(255, 204, 204));
        addresstxt.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        addresstxt.setForeground(new java.awt.Color(0, 0, 204));
        addresstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        addresstxt.setBorder(null);
        addresstxt.setOpaque(false);
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });
        jPanel1.add(addresstxt);
        addresstxt.setBounds(690, 210, 230, 30);
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(690, 240, 230, 10);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(270, 440, 120, 50);

        bgbox.setBackground(new java.awt.Color(255, 204, 204));
        bgbox.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        bgbox.setForeground(new java.awt.Color(51, 0, 255));
        bgbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        bgbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bgbox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgbox.setOpaque(false);
        jPanel1.add(bgbox);
        bgbox.setBounds(500, 60, 220, 30);

        genderbox.setBackground(new java.awt.Color(255, 204, 204));
        genderbox.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        genderbox.setForeground(new java.awt.Color(0, 0, 255));
        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Male", "Female" }));
        genderbox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.add(genderbox);
        genderbox.setBounds(230, 280, 230, 30);

        jButton11.setBackground(new java.awt.Color(255, 204, 204));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-user.png"))); // NOI18N
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.setOpaque(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(530, 440, 120, 50);

        disid.setEditable(false);
        disid.setBackground(new java.awt.Color(255, 204, 204));
        disid.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        disid.setForeground(new java.awt.Color(0, 0, 204));
        disid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        disid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        disid.setOpaque(false);
        jPanel1.add(disid);
        disid.setBounds(410, 380, 230, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Your Donor ID is    :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(220, 370, 180, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 190, 930, 520);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1070, 0, 140, 180);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int check=JOptionPane.showConfirmDialog(null,"YES     for     Exit\nNO       for    ReLogin ","Choose one...",JOptionPane.YES_NO_OPTION);
        if(check==0){
            //code suru
            String update="UPDATE `settings` SET `sure`='1' WHERE 1";
            executeSQLQuery(update);
            
            String update2="UPDATE `userselection` SET `user`='Open' WHERE 1";
            executeSQLQuery(update2);
            
            //code sesh
            System.exit(0);
        }
        if(check==1){
            String update="UPDATE `settings` SET `sure`='1' WHERE 1";
            executeSQLQuery(update);
            
            String update2="UPDATE `userselection` SET `user`='Open' WHERE 1";
            executeSQLQuery(update2);
            
            login l=new login();
            close();
            l.setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

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
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Home h=new Home();
        close();
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Dashboard d=new Dashboard();
        close();
       d.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        close();
        Profile bg=new Profile();
        bg.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DonorList dl=new DonorList();
        close();
        dl.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        boolean b=false;
        
        //code suru
        try{

                    ResultSet rs=st.executeQuery("select *from settings");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("sure");
                        if(s1.equals("2")){
                            b=true;
                        }
               
                       
                    }
           
                }catch(Exception e){
            
                 }
        
        //code sesh
        
        if(b==true){
            BloodRequest br=new BloodRequest();
        
            br.setVisible(true);
            close();
        }else{
            JOptionPane.showMessageDialog(this,"This Option is Admin Property!\nPlease go to : Profile -> Make Request");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        boolean b=false;
        
        //code suru
        try{

                    ResultSet rs=st.executeQuery("select *from settings");
           
                    
           
                    while(rs.next()){
                        String s1=rs.getString("sure");
                        if(s1.equals("2")){
                            b=true;
                        }
               
                       
                    }
           
                }catch(Exception e){
            
                 }
        
        //code sesh
        
        if(b==true){
       Settings s=new Settings();
       
       s.setVisible(true);
       close(); 
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void contacttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttxtActionPerformed

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       bgbox.setSelectedIndex(0);
       nametxt.setText("");
       agetxt.setText("");
       genderbox.setSelectedIndex(0);
       idtxt.setText("");
       addresstxt.setText("");
       contacttxt.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String bg=bgbox.getSelectedItem().toString();
        String name=nametxt.getText();
        String age=agetxt.getText();
        String gender=genderbox.getSelectedItem().toString();
        String id=idtxt.getText();
        String address=addresstxt.getText();
        String contact=contacttxt.getText();
        
        if(bg.equals("-Select-") || name.equals("") || age.equals("") || gender.equals("-Select-") || address.equals("") || contact.equals("")){
            //AddDonor a=new AddDonor();
            JOptionPane.showMessageDialog(null,"Please fill up all Field.","Alert",JOptionPane.WARNING_MESSAGE);   
        }else{
            //try catch for donor id previous
            int did=0;
                try{

                        ResultSet rs=st.executeQuery("select *from donors");
                        String s="";
                        while(rs.next()){
                             String s1=rs.getString("DonorId"); 
                             s=s1;
                        }
                        did=Integer.parseInt(s);
           
                    }catch(Exception e){
            
                    }
                did++;
                String donorid=String.valueOf(did);
                disid.setText(donorid);
            //try catch done and get last donor id
            
            
            
            
            //Who added this person?? now we are working for it.
            String person="";
            
            try{

                        ResultSet rs=st.executeQuery("select *from userselection");
                        String s="";
                        while(rs.next()){
                             String s1=rs.getString("user"); 
                             person=s1;
                        }
                        
           
                    }catch(Exception e){
            
                    }
            
            
            //done.
            
            
            String insert="INSERT INTO `donors`(`DonorId`, `Name`, `Age`, `Gender`, `Bg`, `Id`, `Address`, `Contact`, `Added by`) VALUES ('"+disid.getText()+"','"+nametxt.getText()+"','"+agetxt.getText()+"','"+genderbox.getSelectedItem().toString()+"','"+bgbox.getSelectedItem().toString()+"','"+idtxt.getText()+"','"+addresstxt.getText()+"','"+contacttxt.getText()+"','"+person+"')";
            executeSQLQuery(insert,"Inserted");
        }
        
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void executeSQLQuery(String query,String message) {
       try{

          
           if(st.executeUpdate(query)==1){
               int check=JOptionPane.showConfirmDialog(null,"Your Profile Created Successfully!!\nWant to view your profile ?","Congrats",JOptionPane.YES_NO_OPTION);
               if(check==0){
                   ShowInsertedData1 s=new ShowInsertedData1();
                   s.setVisible(true);
                   
               }
               if(check==1){
                   AddDonor a=new AddDonor();
                   close();
                   a.setVisible(true);
                   
               }
//ys/no code hbe
           }else{
               JOptionPane.showMessageDialog(null,"Data not inserted\n\nPlease check and retry.","Alert",JOptionPane.WARNING_MESSAGE); 
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
                new AddDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstxt;
    private javax.swing.JTextField agetxt;
    private javax.swing.JComboBox<String> bgbox;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JTextField disid;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField idtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField nametxt;
    // End of variables declaration//GEN-END:variables

    
}
