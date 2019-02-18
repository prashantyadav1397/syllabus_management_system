
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author romi
 */
public class AddSyllabus extends javax.swing.JFrame {

      DefaultTableModel model;
      
    public AddSyllabus() {
        initComponents();
       
        model =(DefaultTableModel)opTable.getModel();
         
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        currentDate();
    
    }
    
    public void currentDate (){
        
        Calendar cal =new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        date_lbl.setText((month+1)+"/"+day+"/"+year);
        int hour=cal.get(Calendar.HOUR);
        int minute=cal.get(Calendar.MINUTE);
        int second=cal.get(Calendar.SECOND);
        time_lbl.setText(+hour+":"+minute+":"+second);
        }
    
     public void close()
    {
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addpannel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        sem = new javax.swing.JLabel();
        subjectcode = new javax.swing.JLabel();
        subjectname = new javax.swing.JLabel();
        syllabus = new javax.swing.JLabel();
        textbook = new javax.swing.JLabel();
        inSem = new javax.swing.JComboBox<>();
        inName = new javax.swing.JTextField();
        inCode = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        inSyllabus = new javax.swing.JTextArea();
        submit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        mainmenu = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        inTextbook = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tablepannel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        opTable = new javax.swing.JTable();
        Date_time = new javax.swing.JMenuBar();
        date_lbl = new javax.swing.JMenu();
        time_lbl = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 630));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1200, 630));
        getContentPane().setLayout(null);

        addpannel.setLayout(null);

        title.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        title.setText("              Add Syllabus");
        addpannel.add(title);
        title.setBounds(110, 10, 440, 50);

        sem.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        sem.setForeground(new java.awt.Color(255, 255, 255));
        sem.setText("Sem:");
        addpannel.add(sem);
        sem.setBounds(80, 90, 39, 22);

        subjectcode.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        subjectcode.setForeground(new java.awt.Color(255, 255, 255));
        subjectcode.setText("Subject Code:");
        addpannel.add(subjectcode);
        subjectcode.setBounds(80, 130, 104, 22);

        subjectname.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        subjectname.setForeground(new java.awt.Color(255, 255, 255));
        subjectname.setText("Subject Name:");
        addpannel.add(subjectname);
        subjectname.setBounds(80, 170, 111, 22);

        syllabus.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        syllabus.setForeground(new java.awt.Color(255, 255, 255));
        syllabus.setText("Syllabus:");
        addpannel.add(syllabus);
        syllabus.setBounds(80, 220, 69, 22);

        textbook.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        textbook.setForeground(new java.awt.Color(255, 255, 255));
        textbook.setText("Textbook ");
        addpannel.add(textbook);
        textbook.setBounds(80, 350, 90, 30);

        inSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        inSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inSemActionPerformed(evt);
            }
        });
        addpannel.add(inSem);
        inSem.setBounds(220, 90, 40, 22);
        addpannel.add(inName);
        inName.setBounds(220, 172, 190, 30);

        inCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inCodeActionPerformed(evt);
            }
        });
        addpannel.add(inCode);
        inCode.setBounds(220, 130, 190, 30);

        inSyllabus.setColumns(20);
        inSyllabus.setRows(5);
        jScrollPane2.setViewportView(inSyllabus);

        addpannel.add(jScrollPane2);
        jScrollPane2.setBounds(220, 220, 370, 110);

        submit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        addpannel.add(submit);
        submit.setBounds(220, 470, 100, 25);

        reset.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        addpannel.add(reset);
        reset.setBounds(360, 470, 90, 25);

        mainmenu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mainmenu.setText("Back");
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });
        addpannel.add(mainmenu);
        mainmenu.setBounds(220, 540, 110, 25);

        exit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        addpannel.add(exit);
        exit.setBounds(500, 540, 60, 25);

        logout.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        addpannel.add(logout);
        logout.setBounds(370, 540, 100, 25);

        inTextbook.setColumns(20);
        inTextbook.setRows(5);
        jScrollPane3.setViewportView(inTextbook);

        addpannel.add(jScrollPane3);
        jScrollPane3.setBounds(220, 350, 370, 110);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("and");
        addpannel.add(jLabel1);
        jLabel1.setBounds(100, 370, 40, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Refrences :");
        addpannel.add(jLabel2);
        jLabel2.setBounds(80, 400, 90, 22);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FTlFuTG.jpg"))); // NOI18N
        addpannel.add(background);
        background.setBounds(-10, -20, 1300, 770);

        getContentPane().add(addpannel);
        addpannel.setBounds(0, 0, 640, 720);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(640, -10, 20, 720);

        tablepannel.setBackground(new java.awt.Color(0, 51, 102));
        tablepannel.setForeground(new java.awt.Color(51, 0, 153));

        opTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sem", "Subject code", "Subject Name", "Syllabus", "Textbook"
            }
        ));
        jScrollPane1.setViewportView(opTable);

        javax.swing.GroupLayout tablepannelLayout = new javax.swing.GroupLayout(tablepannel);
        tablepannel.setLayout(tablepannelLayout);
        tablepannelLayout.setHorizontalGroup(
            tablepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablepannelLayout.setVerticalGroup(
            tablepannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );

        getContentPane().add(tablepannel);
        tablepannel.setBounds(650, 0, 550, 750);

        date_lbl.setText("Date");
        Date_time.add(date_lbl);

        time_lbl.setText("Time");
        Date_time.add(time_lbl);

        setJMenuBar(Date_time);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inCodeActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        model.setRowCount(0);
        String scode,sname,syllab,tbook;
//        semester=(String) inSem.getSelectedItem();
        scode=inCode.getText();
        sname=inName.getText();
        syllab=inSyllabus.getText();
        tbook=inTextbook.getText();
       
        if(scode.isEmpty())
                 {
                     JOptionPane.showMessageDialog(null, "Subject Code Missing", "Error Message", JOptionPane.WARNING_MESSAGE);
                   
                 }
        else if(sname.isEmpty())
                 {
                     JOptionPane.showMessageDialog(null, "Subject Name Missing", "Error Message", JOptionPane.WARNING_MESSAGE);
                   
                 }
        else if(syllab.isEmpty())
                 {
                     JOptionPane.showMessageDialog(null, "Syllabus Missing", "Error Message", JOptionPane.WARNING_MESSAGE);
                   
                 }
        else if(tbook.isEmpty())
                 {
                     JOptionPane.showMessageDialog(null, "Textook and Refrences Missing", "Error Message", JOptionPane.WARNING_MESSAGE);
                   
                 }
        
        else
        {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prashant?zeroDateTimeBehavior=convertToNull","root","");
            Statement stmt=con.createStatement();

            stmt.executeUpdate("insert into `subdetails` (`SEM`,`SUBJECT CODE`,`SUBJECT NAME`,`SYLLABUS`,`TEXTBOOK`) values('"+inSem.getSelectedItem()+"','"+scode+"','"+sname+"','"+syllab+"','"+tbook+"')");
               
            
            ResultSet rs=stmt.executeQuery("select * from `subdetails`");

            String rg[]=new String[5];
            while(rs.next()) {
                rg[0]=rs.getString(1);
                rg[1]=rs.getString(2);
                rg[2]=rs.getString(3);
                rg[3]=rs.getString(4);
                rg[4]=rs.getString(5);

                model.addRow(rg);
            }

        }catch(ClassNotFoundException | SQLException e){
                         System.out.println(e); 
                    JOptionPane.showMessageDialog(null,e);
        }
        }
 // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        inCode.setText("");
        inName.setText("");
        inTextbook.setText("");
        inSyllabus.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuActionPerformed
        close();
        new MainMenu().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_mainmenuActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(0);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
               close();
          new loginMenu().setVisible(true);
              
        
// TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void inSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inSemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inSemActionPerformed

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
            java.util.logging.Logger.getLogger(AddSyllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSyllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSyllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSyllabus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSyllabus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Date_time;
    private javax.swing.JPanel addpannel;
    private javax.swing.JLabel background;
    private javax.swing.JMenu date_lbl;
    private javax.swing.JButton exit;
    private javax.swing.JTextField inCode;
    private javax.swing.JTextField inName;
    private javax.swing.JComboBox<String> inSem;
    private javax.swing.JTextArea inSyllabus;
    private javax.swing.JTextArea inTextbook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton logout;
    private javax.swing.JButton mainmenu;
    private javax.swing.JTable opTable;
    private javax.swing.JButton reset;
    private javax.swing.JLabel sem;
    private javax.swing.JLabel subjectcode;
    private javax.swing.JLabel subjectname;
    private javax.swing.JButton submit;
    private javax.swing.JLabel syllabus;
    private javax.swing.JPanel tablepannel;
    private javax.swing.JLabel textbook;
    private javax.swing.JMenu time_lbl;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
