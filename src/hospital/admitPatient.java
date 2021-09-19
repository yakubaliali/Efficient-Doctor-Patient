/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import firstPage.Locker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class admitPatient extends javax.swing.JFrame implements Runnable {

    int hour, seconds, minutes;

    /**
     * Creates new form admitPatient
     */
    public admitPatient() {
        initComponents();
        setLocationRelativeTo(null);
        showDate();
        Thread t = new Thread(this);
        t.start();

    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        pad.setText(sd.format(d));

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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pi = new javax.swing.JTextField();
        pn = new javax.swing.JTextField();
        pd = new javax.swing.JTextField();
        pad = new javax.swing.JTextField();
        pat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel1.setText("ADMIT PATIENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 24, 225, -1));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel2.setText("Enter Patient's ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 75, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel3.setText("Enter Patients Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 114, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel4.setText("Enter Patient's Disease:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 153, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel5.setText("Enter Admit Date:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 192, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jLabel6.setText("Enter Admit Time:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 231, -1, -1));

        pi.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        getContentPane().add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 72, 215, -1));

        pn.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        getContentPane().add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 111, 215, -1));

        pd.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        getContentPane().add(pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 150, 215, -1));

        pad.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        getContentPane().add(pad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 215, -1));

        pat.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        pat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patActionPerformed(evt);
            }
        });
        getContentPane().add(pat, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 228, 215, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ADMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 267, -1, -1));

        jButton2.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/rsz_back.jpg"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 325, -1, -1));

        jButton3.setFont(new java.awt.Font("Century Schoolbook", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/rsz_lootur.jpg"))); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 325, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/solid-light-blue-background.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setPreferredSize(new java.awt.Dimension(500, 600));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 670, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        String pid=pi.getText();
//        String pname=pn.getText();
//        String pdis=pd.getText();
//        String paddate=pad.getText();
//        String padtime=pat.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor", "root", "123456");

            String sql = "insert into paitient_record values (?,?,?,?,?)";
            PreparedStatement ptstmt = conn.prepareStatement(sql);// It is used to execute parameterized query.
            //we are passing parameter (?) for the values.
            //Its value will be set by calling the setter methods of PreparedStatement.

            ptstmt.setString(1, pi.getText());
            ptstmt.setString(2, pn.getText());
            ptstmt.setString(3, pd.getText());
            ptstmt.setString(4, pad.getText());
            ptstmt.setString(5, pat.getText());
            ptstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "data inserted successfully");
            conn.close();
            pi.setText("");
            pn.setText("");
            pd.setText("");
            pat.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PATIENT obj = new PATIENT();
        obj.setVisible(true);
        dispose();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Locker obj = new Locker();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void patActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patActionPerformed

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
            java.util.logging.Logger.getLogger(admitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admitPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admitPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField pad;
    private javax.swing.JTextField pat;
    private javax.swing.JTextField pd;
    private javax.swing.JTextField pi;
    private javax.swing.JTextField pn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (true) {
            Calendar cal = Calendar.getInstance();//Java Calendar class is an abstract class that provides methods for converting date
                                                    //between a specific instant in time and a set of calendar fields such as MONTH, YEAR, HOUR, etc.
            hour = cal.get(Calendar.HOUR_OF_DAY);
            minutes = cal.get(Calendar.MINUTE);
            seconds = cal.get(Calendar.SECOND);

            SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm:ss:aa");
            Date dat = cal.getTime();
            String time24 = sdf24.format(dat);
            pat.setText(time24);

        }

    }
}

//Calendar class is a Static method. This method is used with calendar object
// to get the instance of calendar according to current time zone set by java Runtime environment.