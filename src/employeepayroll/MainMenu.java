
package employeepayroll;
import java.awt.Dimension;
import java.awt.Toolkit;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.GregorianCalendar;
public class MainMenu extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rst=null;
    PreparedStatement pst=null;

    public MainMenu() {
        initComponents();
        conn=MysqlConnect.ConnectDB();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);       
        lblEmpID.setText(String.valueOf(Emp.empId).toString());
        lblEmpUsername.setText(String.valueOf(Emp.empName).toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();
        lblEmpUsername = new javax.swing.JLabel();
        btnEmployeeManager = new javax.swing.JButton();
        btnAllowance = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnUpdateSalary = new javax.swing.JButton();
        btnDeduction = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemEmpReg = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemEmpRP = new javax.swing.JMenuItem();
        menuItemEmpTotAllowRP = new javax.swing.JMenuItem();
        menuItemEmpTotDedRP = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuItemAuditTrail = new javax.swing.JMenuItem();
        menuItemAddUser = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/logout.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogout);
        btnLogout.setBounds(740, 0, 53, 29);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logged In As:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 500, 80, 14);

        lblEmpID.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpID.setText("Emp");
        jPanel1.add(lblEmpID);
        lblEmpID.setBounds(90, 500, 30, 14);

        lblEmpUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpUsername.setText("Username");
        jPanel1.add(lblEmpUsername);
        lblEmpUsername.setBounds(130, 500, 70, 14);

        btnEmployeeManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/Add_Employee.png"))); // NOI18N
        btnEmployeeManager.setText("Employee Manager");
        btnEmployeeManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeManagerActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmployeeManager);
        btnEmployeeManager.setBounds(450, 340, 180, 50);

        btnAllowance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/Allowance.png"))); // NOI18N
        btnAllowance.setText("Allowance");
        btnAllowance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllowanceActionPerformed(evt);
            }
        });
        jPanel1.add(btnAllowance);
        btnAllowance.setBounds(450, 400, 180, 50);

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/Search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(450, 460, 180, 50);

        btnUpdateSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/Update.png"))); // NOI18N
        btnUpdateSalary.setText("Update Salary");
        btnUpdateSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateSalary);
        btnUpdateSalary.setBounds(640, 340, 160, 50);

        btnDeduction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/Deduction.png"))); // NOI18N
        btnDeduction.setText("Deduction");
        btnDeduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeductionActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeduction);
        btnDeduction.setBounds(640, 400, 160, 50);

        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/Payment.png"))); // NOI18N
        btnPayment.setText("Payment");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        jPanel1.add(btnPayment);
        btnPayment.setBounds(640, 460, 160, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeepayroll/images/bk3.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 820, 540);

        jMenu1.setText("Employee");

        menuItemEmpReg.setText("Employee Registration");
        menuItemEmpReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmpRegActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemEmpReg);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reports");

        menuItemEmpRP.setText("Employee RP");
        menuItemEmpRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmpRPActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemEmpRP);

        menuItemEmpTotAllowRP.setText("Emplyee Total Allowance RP");
        menuItemEmpTotAllowRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmpTotAllowRPActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemEmpTotAllowRP);

        menuItemEmpTotDedRP.setText("Employee Total Deduction RP");
        menuItemEmpTotDedRP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmpTotDedRPActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemEmpTotDedRP);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Audit");

        menuItemAuditTrail.setText("Audit Trail");
        menuItemAuditTrail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAuditTrailActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemAuditTrail);

        menuItemAddUser.setText("Add User");
        menuItemAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAddUserActionPerformed(evt);
            }
        });
        jMenu3.add(menuItemAddUser);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("About");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmployeeManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeManagerActionPerformed
        AddEmployee addemp=new AddEmployee();
        addemp.setVisible(true);
    }//GEN-LAST:event_btnEmployeeManagerActionPerformed

    private void menuItemEmpTotAllowRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmpTotAllowRPActionPerformed
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employee Allowance Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();

        try {
                String sql ="select * from allowance";
                pst=conn.prepareStatement(sql);
                rst=pst.executeQuery();
       
                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
                PdfPTable table = new PdfPTable(11);
                myDocument.open();
   
                float[] columnWidths = new float[] { 3,7,7,5,5,9,6,5,8,8,8};
                table.setWidths(columnWidths);
                table.setWidthPercentage(100); //set table width to 100%

                myDocument.add(new Paragraph("Employees Allowance List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                myDocument.add(new Paragraph(new Date().toString()));
                myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
                table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Overtime",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Medical",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Bonus",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Other",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Employee ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Rate",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Allowance",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                table.addCell(new PdfPCell(new Paragraph("Surname",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
                    while(rst.next()){             
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(9),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rst.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                    }
                myDocument.add(table);
                myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
                myDocument.close();  
                JOptionPane.showMessageDialog(null,"Report was successfully generated");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);       
            }
            finally {    
                try{
                    rst.close();
                    pst.close();
                
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                }
            }
        }

    }//GEN-LAST:event_menuItemEmpTotAllowRPActionPerformed

    private void btnUpdateSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSalaryActionPerformed
        UpdateSalary update=new UpdateSalary();
        update.setVisible(true);
    }//GEN-LAST:event_btnUpdateSalaryActionPerformed

    private void btnAllowanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllowanceActionPerformed
         Allowance allow = new Allowance();
        allow.setVisible(true);
    }//GEN-LAST:event_btnAllowanceActionPerformed

    private void btnDeductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeductionActionPerformed
        Deduction deduct = new Deduction();
        deduct.setVisible(true);
    }//GEN-LAST:event_btnDeductionActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        SalarySlip sal=new SalarySlip();
        sal.setVisible(true);
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        AddEmployee addemp=new AddEmployee();
        addemp.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void menuItemEmpRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmpRegActionPerformed
        AddEmployee addEmp = new AddEmployee();
        addEmp.setVisible(true);
    }//GEN-LAST:event_menuItemEmpRegActionPerformed

    private void menuItemEmpRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmpRPActionPerformed
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employees Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();

        try {          
            String sql ="select * from employee_info";
            pst=conn.prepareStatement(sql);
            rst=pst.executeQuery();
            

            Document myDocument = new Document();
            PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
            PdfPTable table = new PdfPTable(13);
            myDocument.open();
           
   
            float[] columnWidths = new float[] {3,8,7,5,5,9,8,9,6,6,6,8,8};
            table.setWidths(columnWidths);

            table.setWidthPercentage(100); //set table width to 100%
           
          
            myDocument.add(new Paragraph("Employees List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
            myDocument.add(new Paragraph(new Date().toString()));
            myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
            table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Surname",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Date of Birth",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Email",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Telephone",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Address",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Department",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Gender",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Date Hired",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Job Title",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));

            while(rst.next()){
                table.addCell(new PdfPCell(new Paragraph(rst.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(16),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(17),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(18),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));

            }
           
           myDocument.add(table);
           myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
           myDocument.close();  
           JOptionPane.showMessageDialog(null,"Report was successfully generated");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);    
        }
        finally {   
            try{
                rst.close();
                pst.close();
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
         
            }
        }
    }
    }//GEN-LAST:event_menuItemEmpRPActionPerformed

    private void menuItemEmpTotDedRPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmpTotDedRPActionPerformed
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File("Employee Deduction Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
        String filePath = dialog.getSelectedFile().getPath();
        try {          
            String sql ="select * from deduction";
            pst=conn.prepareStatement(sql);
            rst=pst.executeQuery();
            
            Document myDocument = new Document();
            PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
            PdfPTable table = new PdfPTable(8);
            myDocument.open();

            float[] columnWidths = new float[] { 3,7,7,5,5,9,6,5};
            table.setWidths(columnWidths);
            table.setWidthPercentage(100); //set table width to 100%
           
          
            myDocument.add(new Paragraph("Employees Deduction List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
            myDocument.add(new Paragraph(new Date().toString()));
            myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
            table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Surname",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Deduction Amount",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Deduction Reason",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Employee ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Created By",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
            
            while(rst.next()){
                table.addCell(new PdfPCell(new Paragraph(rst.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rst.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
            }
            myDocument.add(table);
            myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
            myDocument.close();  
            JOptionPane.showMessageDialog(null,"Report was successfully generated");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);        
        }
        finally { 
            try{
                rst.close();
                pst.close();
            }
            catch(Exception e){
               JOptionPane.showMessageDialog(null,e);            }
            }
        }

    }//GEN-LAST:event_menuItemEmpTotDedRPActionPerformed

    private void menuItemAuditTrailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAuditTrailActionPerformed
       Audit aud = new Audit();
        aud.setVisible(true);
    }//GEN-LAST:event_menuItemAuditTrailActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login x = new Login();
        x.setVisible(true);
        this.dispose();
        
            try{
                Date currentDate = GregorianCalendar.getInstance().getTime();
                DateFormat df = DateFormat.getDateInstance();
                String dateString = df.format(currentDate);

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String timeString = sdf.format(d);

                String value0 = timeString;
                String values = dateString;


                 int value = Emp.empId;
                 String reg = "insert into Audit (Employee_ID,date,status) values ('"+value+"','"+value0+" / "+values+"','Logged out')";
                 pst=conn.prepareStatement(reg);
                 pst.execute();
                 this.dispose();
            }catch (Exception e){
                     JOptionPane.showMessageDialog(null, e);
            }
            finally {
            
                try{
                    rst.close();
                    pst.close();
                
                }
            catch(Exception e){
                
            }
              
          }  

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void menuItemAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAddUserActionPerformed
        AddUser adu=new AddUser();
        adu.setVisible(true);
    }//GEN-LAST:event_menuItemAddUserActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllowance;
    private javax.swing.JButton btnDeduction;
    private javax.swing.JButton btnEmployeeManager;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblEmpUsername;
    private javax.swing.JMenuItem menuItemAddUser;
    private javax.swing.JMenuItem menuItemAuditTrail;
    private javax.swing.JMenuItem menuItemEmpRP;
    private javax.swing.JMenuItem menuItemEmpReg;
    private javax.swing.JMenuItem menuItemEmpTotAllowRP;
    private javax.swing.JMenuItem menuItemEmpTotDedRP;
    // End of variables declaration//GEN-END:variables
}
