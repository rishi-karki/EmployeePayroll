
package employeepayroll;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Login extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    

    public Login() {
        initComponents();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2); 
        conn=MysqlConnect.ConnectDB();
        currentDate();
    }
    
    public void currentDate(){
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        menuDate.setText((month+1)+"/"+day+"/"+year);
        
        int second=cal.get(Calendar.SECOND);
        int minute=cal.get(Calendar.MINUTE);
        int hour=cal.get(Calendar.HOUR);
        menuTime.setText(hour+":"+minute+":"+second);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuDate = new javax.swing.JMenu();
        menuTime = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Sales" }));
        txtCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComboActionPerformed(evt);
            }
        });
        getContentPane().add(txtCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 120, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 70, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please enter your username and password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 310, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 70, 30));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select Division:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 30));
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 120, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 520, 0, 9));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 120, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/background.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setDoubleBuffered(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 770, 510));

        menuFile.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/Exit.png"))); // NOI18N
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuFile.add(jMenuItem1);

        jMenuBar1.add(menuFile);

        menuDate.setText("Date");
        jMenuBar1.add(menuDate);

        menuTime.setText("Time");
        jMenuBar1.add(menuTime);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Username field is empty");
        } 
        else if (txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Password field is empty");
        }else {
            String sql = "select ID,Username,Password,Division from employee Where (Username =? and Password =? and Division =?)";
                
            //"select * from Employeeinfo where username=? and password=? and division=? and id=?";
            try{
                int count =0;
                pst=conn.prepareStatement(sql);
                pst.setString(1,txtUsername.getText());
                pst.setString(2,txtPassword.getText());
                pst.setString(3, txtCombo.getSelectedItem().toString());           
                rs=pst.executeQuery();
                while(rs.next()){
                    int id = rs.getInt(1);
                    String name=rs.getString(2);
                    Emp.empId = id;
                    Emp.empName = name;
                    count =count+1;
                }
                String access=(txtCombo.getSelectedItem().toString());          
                if(access=="Admin") {
                    if(count==1){
                        JOptionPane.showMessageDialog(null,"Sucess" );
                        MainMenu j = new MainMenu();
                        j.setVisible(true);
                        this.dispose();                   
                       
                        Date currentDate = GregorianCalendar.getInstance().getTime();
                        DateFormat df = DateFormat.getDateInstance();
                        String dateString = df.format(currentDate);

                        Date d = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        String timeString = sdf.format(d);

                        String value0 = timeString;
                        String values = dateString;
                   
                   
                        int value = Emp.empId;
                        String reg = "insert into audit (Employee_ID,Date,Status) values ('"+value+"','"+value0+" / "+values+"','Logged in')";
                        pst=conn.prepareStatement(reg);
                        pst.execute();
                        this.dispose();
                    }
                    else if(count>1){
                        JOptionPane.showMessageDialog(null,"Duplicate Username or Password, Access denied");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Username/Password is incorrect");
                    }   
                }
                else if(access=="Sales"){
                    if(count ==1){
                        JOptionPane.showMessageDialog(null,"Sucess");
                        MainMenu j = new MainMenu();
                        j.setVisible (true); 

                        Date currentDate = GregorianCalendar.getInstance().getTime();
                        DateFormat df = DateFormat.getDateInstance();
                        String dateString = df.format(currentDate);

                        Date d = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        String timeString = sdf.format(d);

                        String value0 = timeString;
                        String values = dateString;


                        int value = Emp.empId;
                        String reg = "insert into audit (Employee_ID,Date,Status) values ('"+value+"','"+value0+" / "+values+"','Logged in')";
                        pst=conn.prepareStatement(reg);
                        pst.execute();
                        this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Username/Password is incorrect"); 
                    }     
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            finally {
                try{
                    rs.close();
                    pst.close();  
                }
                catch(Exception e){
                
                }
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComboActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu menuDate;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuTime;
    private javax.swing.JComboBox<String> txtCombo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
