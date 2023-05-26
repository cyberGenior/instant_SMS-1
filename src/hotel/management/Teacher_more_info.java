
package hotel.management;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.Thread.sleep;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Teacher_more_info extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pps, pps1, pps2, pps3, pps4, pps6, pps5, pps7, pps8, pps9, pps10, pps11, pps12, pps13 = null;
    ResultSet rs, rs1, rs2, rs3, rs4, rs5, rs6, rs7, rs8, rs9, rs10, rs11, rs12, rs13 = null;
    
    
    
    String resource = null;
    String Selected_Department_getID =null;
    
 
   
   String EmployeeID_resource= null;
      String Option_Department = null;
       String Employee_Given_ID_resource  = null;
       
     String   user_log_id  = null;

    private static String Recieved_user_id = null;
    private static String usertype = null;
    //passing user id
    private static Teacher_more_info Obj = null;
    private String passed_user_id;
    
    
            int xx = 0;
            int yy = 0;
    
     Teacher_more_info() {
        initComponents();
        ComboDisplay();
        
    }
    
     
     public void ComboDisplay(){
       // /---------------------------------------------------------------Departments-------------------------------  
        try {
             conn = DBConnection.getConnction();
             pps7 = conn.prepareStatement("SELECT * FROM department");
             rs7 = pps7.executeQuery();
             while(rs7.next()){
              txtDepartment.addItem(rs7.getString("name"));//Showdepaertmets pa combo on the create room--
            //  txtDepartment.addItem(rs.getString("name"));//Showdepaertmets pa combo on the employee form--
            }
        } catch (SQLException ex) {Logger.getLogger(Admin_Home.class.getName()).log(Level.SEVERE, null, ex); }
        
        try {
             conn = DBConnection.getConnction();
             pps8 = conn.prepareStatement("SELECT * FROM  designation");
             rs8 = pps8.executeQuery();
             while(rs8.next()){
              txtDesignation.addItem(rs8.getString("name"));//Show designation pa combo on the employyee form--
            //  txtDepartment.addItem(rs.getString("name"));//Showdepaertmets pa combo on the employee form--
            }
        } catch (SQLException ex) {Logger.getLogger(Admin_Home.class.getName()).log(Level.SEVERE, null, ex); }
        
     }
  
    
     //*********************************************************GETTING CURRENT USER ID
    public void setPassed_id(String Received_id) {
        passed_user_id = Received_id;
    }

    public String getPassed_id() {
        return passed_user_id;
    }

    public void printPassed_id() {
       Recieved_user_id =  getPassed_id();//setting the id of the user who logged in and set it to a global variable
       infoicon();
    }
    
    
    
      public void infoicon(){
       try {conn = DBConnection.getConnction();
            pps6 = conn.prepareStatement(" SELECT  * FROM  access WHERE name =?");
            pps6.setString(1,Recieved_user_id.trim()); 
            rs6 = pps6.executeQuery();
            byte[] image = null;
            while(rs6.next()){
            //     user_access_id  =  rs6.getString("access_id");

                 String fname=  rs6.getString("first_name");
                 String lname=  rs6.getString("last_name");
                 mode.setText("Hi !"+fname +"  "+lname + "  Welcome HR Manager");
                 model.setText(rs6.getString("user"));
                 
                 txtFname.setText(rs6.getString("first_name"));
                 txtLname.setText(rs6.getString("last_name"));
                 txtContact.setText(rs6.getString("email_phone"));
                
                 user_log_id =  rs6.getString("access_id");

                 image = rs6.getBytes("user_pic");
                 Image img = Toolkit.getDefaultToolkit().createImage(image);
                 ImageIcon icon = new ImageIcon(img);

                Image modifiedImaged = img.getScaledInstance(user_img.getWidth(), user_img.getHeight(), Image.SCALE_SMOOTH);
                icon = new ImageIcon(modifiedImaged);
                user_img.setIcon(icon);
                 
            
                }
            } catch (SQLException ex) {
            Logger.getLogger(Admin_Home.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Side_Panel = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        front_holder = new javax.swing.JPanel();
        hotel_ma = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        calender = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        report_panelBTN = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        center = new javax.swing.JPanel();
        Employee_entry = new javax.swing.JPanel();
        employee_Inner_panel = new javax.swing.JPanel();
        panel_forPersonal_info = new javax.swing.JPanel();
        Container_forGeneral = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        addreessLb = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lbEmail1 = new javax.swing.JLabel();
        lbSLname = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        lbContact1 = new javax.swing.JLabel();
        SaveTeacher_General_Info = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        lbFname = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        txtEmployee_id = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lBDATE = new javax.swing.JLabel();
        txtDOB = new com.toedter.calendar.JDateChooser();
        LBGENDER = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox();
        txtCountry = new javax.swing.JTextField();
        lb_Chooser_btn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        user_img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel_forQualifications = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        Save_Qualifications_info = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        txtQualification = new javax.swing.JComboBox();
        Major_One = new javax.swing.JTextField();
        Major_Two = new javax.swing.JTextField();
        Major3 = new javax.swing.JTextField();
        txtImployment_Date = new com.toedter.calendar.JDateChooser();
        txtSalary = new javax.swing.JComboBox();
        txtDepartment = new javax.swing.JComboBox();
        txtDesignation = new javax.swing.JComboBox();
        jLabel56 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Save_Qualifications_info1 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        lb_GeneralSettings_btn = new javax.swing.JLabel();
        lb_GlobalSettings_btn = new javax.swing.JLabel();
        main_BG = new javax.swing.JLabel();
        img_url = new javax.swing.JLabel();
        exit_lb = new javax.swing.JLabel();
        admin_btn = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        minize_lb = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        mode = new javax.swing.JLabel();
        BackGround_header = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Side_Panel.setBackground(new java.awt.Color(121, 119, 119));
        Side_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Copyright @ webTech software ");
        Side_Panel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 180, 30));

        front_holder.setBackground(new java.awt.Color(121, 119, 119));
        front_holder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                front_holderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                front_holderMouseExited(evt);
            }
        });
        front_holder.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hotel_ma.setBackground(new java.awt.Color(121, 119, 119));
        hotel_ma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotel_maMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hotel_maMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hotel_maMouseExited(evt);
            }
        });
        hotel_ma.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_verified_account_30px.png"))); // NOI18N
        jLabel20.setText("    Employees");
        hotel_ma.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 60));

        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_back_15px.png"))); // NOI18N
        hotel_ma.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 30, 60));

        front_holder.add(hotel_ma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 70));

        calender.setBackground(new java.awt.Color(121, 119, 119));
        calender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calenderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calenderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calenderMouseExited(evt);
            }
        });
        calender.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_handshake_heart_30px.png"))); // NOI18N
        jLabel23.setText("    Designation");
        calender.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 60));

        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_back_15px.png"))); // NOI18N
        calender.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 30, 60));

        front_holder.add(calender, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, 70));

        report_panelBTN.setBackground(new java.awt.Color(121, 119, 119));
        report_panelBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                report_panelBTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                report_panelBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                report_panelBTNMouseExited(evt);
            }
        });
        report_panelBTN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_autism_30px.png"))); // NOI18N
        jLabel21.setText("     Departments");
        report_panelBTN.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 60));

        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_back_15px.png"))); // NOI18N
        report_panelBTN.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 30, 60));

        front_holder.add(report_panelBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, 70));

        Side_Panel.add(front_holder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        jPanel1.add(Side_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, 660));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 60, 20, 750));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 1360, 50));

        center.setLayout(new java.awt.CardLayout());

        Employee_entry.setBackground(new java.awt.Color(252, 252, 252));
        Employee_entry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employee_Inner_panel.setLayout(new java.awt.CardLayout());

        panel_forPersonal_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Container_forGeneral.setBackground(new java.awt.Color(255, 255, 255));
        Container_forGeneral.setPreferredSize(new java.awt.Dimension(1010, 956));
        Container_forGeneral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_slack_35px.png"))); // NOI18N
        Container_forGeneral.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 50));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_profile_35px.png"))); // NOI18N
        Container_forGeneral.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, 50));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_home_address_35px.png"))); // NOI18N
        Container_forGeneral.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 60, 50));

        addreessLb.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        addreessLb.setForeground(new java.awt.Color(102, 102, 102));
        addreessLb.setText("Address");
        Container_forGeneral.add(addreessLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 120, 40));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        Container_forGeneral.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 300, 80));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_address_book_35px.png"))); // NOI18N
        Container_forGeneral.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 40));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_fax_35px.png"))); // NOI18N
        Container_forGeneral.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 70, 50));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_descending_sorting_35px.png"))); // NOI18N
        Container_forGeneral.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 70, 50));

        lbEmail1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbEmail1.setForeground(new java.awt.Color(102, 102, 102));
        lbEmail1.setText("Email");
        Container_forGeneral.add(lbEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 120, 40));

        lbSLname.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbSLname.setForeground(new java.awt.Color(102, 102, 102));
        lbSLname.setText("Surname");
        Container_forGeneral.add(lbSLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 80, 50));

        jLabel57.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_address_book_35px.png"))); // NOI18N
        Container_forGeneral.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, 50));

        lbContact1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbContact1.setForeground(new java.awt.Color(102, 102, 102));
        lbContact1.setText("Contact");
        Container_forGeneral.add(lbContact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, 30));

        SaveTeacher_General_Info.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        SaveTeacher_General_Info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_upload_to_cloud_30px.png"))); // NOI18N
        SaveTeacher_General_Info.setText("  Save");
        SaveTeacher_General_Info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveTeacher_General_InfoMouseClicked(evt);
            }
        });
        Container_forGeneral.add(SaveTeacher_General_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, 120, 60));

        jLabel98.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(102, 102, 102));
        jLabel98.setText("Country");
        Container_forGeneral.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 80, 40));

        jLabel99.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_address_book_35px.png"))); // NOI18N
        Container_forGeneral.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 70, 40));

        lbFname.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lbFname.setForeground(new java.awt.Color(102, 102, 102));
        lbFname.setText("First name");
        Container_forGeneral.add(lbFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 80, 50));
        Container_forGeneral.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 300, 36));
        Container_forGeneral.add(txtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 300, 36));

        jLabel100.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(102, 102, 102));
        jLabel100.setText("Employee ID");
        Container_forGeneral.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, 40));

        jLabel101.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_fax_35px.png"))); // NOI18N
        Container_forGeneral.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 40));
        Container_forGeneral.add(txtEmployee_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 300, 40));
        Container_forGeneral.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 300, 36));
        Container_forGeneral.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 300, 36));

        lBDATE.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lBDATE.setForeground(new java.awt.Color(102, 102, 102));
        lBDATE.setText("D.O.B");
        Container_forGeneral.add(lBDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 120, 40));
        Container_forGeneral.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 290, 40));

        LBGENDER.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        LBGENDER.setForeground(new java.awt.Color(102, 102, 102));
        LBGENDER.setText("Gender");
        Container_forGeneral.add(LBGENDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 120, 40));

        Gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        Container_forGeneral.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 290, 36));
        Container_forGeneral.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 280, 36));

        lb_Chooser_btn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lb_Chooser_btn.setForeground(new java.awt.Color(102, 102, 102));
        lb_Chooser_btn.setText("Profile");
        lb_Chooser_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_Chooser_btnMouseClicked(evt);
            }
        });
        Container_forGeneral.add(lb_Chooser_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 80, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/image.png"))); // NOI18N
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, 270, 210));
        jPanel2.add(user_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 120));

        Container_forGeneral.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 230, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_image_gallery_35px_2.png"))); // NOI18N
        Container_forGeneral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, 40));

        panel_forPersonal_info.add(Container_forGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        employee_Inner_panel.add(panel_forPersonal_info, "card3");

        panel_forQualifications.setBackground(new java.awt.Color(255, 255, 255));
        panel_forQualifications.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 1258));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel27.setText("Qualifications");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 210, 30));

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_invoice_35px.png"))); // NOI18N
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 60));

        jLabel43.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel43.setText("Major name");
        jPanel4.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 190, 30));

        Save_Qualifications_info.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Save_Qualifications_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_upload_to_cloud_30px.png"))); // NOI18N
        Save_Qualifications_info.setText("UPDATE");
        Save_Qualifications_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Save_Qualifications_infoMouseClicked(evt);
            }
        });
        jPanel4.add(Save_Qualifications_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 110, 50));

        jLabel61.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_closed_sign_35px.png"))); // NOI18N
        jPanel4.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 80, 50));

        jLabel70.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel70.setText("Salary");
        jPanel4.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 190, 30));

        jLabel72.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_no_chat_35px.png"))); // NOI18N
        jPanel4.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 90, 60));

        jLabel73.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel73.setText("Major name");
        jPanel4.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 190, 30));

        jLabel74.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_currency_exchange_35px.png"))); // NOI18N
        jLabel74.setText(" ");
        jPanel4.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 60));

        jLabel76.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_countdown_clock_35px.png"))); // NOI18N
        jPanel4.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 90, 60));

        jLabel78.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/language.png"))); // NOI18N
        jLabel78.setText(" ");
        jPanel4.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 90, 60));

        jLabel81.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel81.setText("Imployment date");
        jPanel4.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 190, 30));

        jLabel82.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_interior_35px.png"))); // NOI18N
        jPanel4.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 70, 50));

        jLabel84.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_africa_35px.png"))); // NOI18N
        jPanel4.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 90, 60));

        txtQualification.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masters", "Degree", "Diploma", "Certificate" }));
        txtQualification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQualificationActionPerformed(evt);
            }
        });
        jPanel4.add(txtQualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 300, 40));
        jPanel4.add(Major_One, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 300, 36));
        jPanel4.add(Major_Two, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 300, 36));
        jPanel4.add(Major3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 300, 36));
        jPanel4.add(txtImployment_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 310, 40));

        txtSalary.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 310, 40));

        jPanel4.add(txtDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 310, 36));

        jPanel4.add(txtDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 310, 36));

        jLabel56.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel56.setText("Designation");
        jPanel4.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 120, 40));

        jLabel66.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel66.setText("Department");
        jPanel4.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, 40));

        jLabel48.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel48.setText("Major name");
        jPanel4.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 190, 30));

        jLabel30.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/img_forward.png"))); // NOI18N
        jLabel30.setText("  Next");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 120, 50));

        Save_Qualifications_info1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        Save_Qualifications_info1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_upload_to_cloud_30px.png"))); // NOI18N
        Save_Qualifications_info1.setText("     SAVE");
        Save_Qualifications_info1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Save_Qualifications_info1MouseClicked(evt);
            }
        });
        jPanel4.add(Save_Qualifications_info1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 110, 50));

        panel_forQualifications.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        employee_Inner_panel.add(panel_forQualifications, "card4");

        Employee_entry.add(employee_Inner_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1050, 540));

        jLabel97.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(33, 173, 178));
        jLabel97.setText("SETTINGS");
        Employee_entry.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 50));

        lb_GeneralSettings_btn.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lb_GeneralSettings_btn.setText("Personal");
        lb_GeneralSettings_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_GeneralSettings_btnMouseClicked(evt);
            }
        });
        Employee_entry.add(lb_GeneralSettings_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 60));

        lb_GlobalSettings_btn.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        lb_GlobalSettings_btn.setForeground(new java.awt.Color(255, 255, 255));
        lb_GlobalSettings_btn.setText("Qualifications info");
        lb_GlobalSettings_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_GlobalSettings_btnMouseClicked(evt);
            }
        });
        Employee_entry.add(lb_GlobalSettings_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, 60));

        main_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/add_Room_typebg.png"))); // NOI18N
        Employee_entry.add(main_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1100, 670));
        Employee_entry.add(img_url, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 170, 30));

        center.add(Employee_entry, "card6");

        jPanel1.add(center, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 1110, 670));

        exit_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_delete_18px_1.png"))); // NOI18N
        exit_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_lbMouseClicked(evt);
            }
        });
        jPanel1.add(exit_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 10, 50, 40));

        admin_btn.setBackground(new java.awt.Color(121, 119, 119));
        admin_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admin_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admin_btnMouseExited(evt);
            }
        });
        admin_btn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_home_page_30px.png"))); // NOI18N
        jLabel42.setText("   Home");
        admin_btn.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 40));

        jPanel1.add(admin_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 190, 40));

        minize_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minize_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/icons8_minus_19px.png"))); // NOI18N
        minize_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minize_lbMouseClicked(evt);
            }
        });
        jPanel1.add(minize_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 40, 40));

        model.setForeground(new java.awt.Color(240, 240, 240));
        model.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        model.setText("jLabel2");
        jPanel1.add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, 110, 40));

        mode.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        mode.setForeground(new java.awt.Color(255, 255, 255));
        mode.setText("Hi Admin,  Welcome To Your School Management");
        jPanel1.add(mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, 30));

        BackGround_header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/header.png"))); // NOI18N
        BackGround_header.setText("jLabel18");
        BackGround_header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BackGround_headerMouseDragged(evt);
            }
        });
        BackGround_header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BackGround_headerMousePressed(evt);
            }
        });
        jPanel1.add(BackGround_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1370, 80));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/management/images/background_admi.png"))); // NOI18N
        jLabel18.setText("jLabel18");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 40, 1450, 820));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hotel_maMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotel_maMouseClicked
 
    }//GEN-LAST:event_hotel_maMouseClicked

    private void hotel_maMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotel_maMouseEntered
        hotel_ma.setBackground(new Color(33,173,178));
    }//GEN-LAST:event_hotel_maMouseEntered

    private void hotel_maMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotel_maMouseExited
        hotel_ma.setBackground(new Color(121,119,119));
    }//GEN-LAST:event_hotel_maMouseExited

    private void calenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calenderMouseClicked
       
    }//GEN-LAST:event_calenderMouseClicked

    private void calenderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calenderMouseEntered
        calender.setBackground(new Color(33,173,178));
    }//GEN-LAST:event_calenderMouseEntered

    private void calenderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calenderMouseExited
        calender.setBackground(new Color(121,119,119));
    }//GEN-LAST:event_calenderMouseExited

    private void report_panelBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_panelBTNMouseClicked
   
        
    }//GEN-LAST:event_report_panelBTNMouseClicked

    private void report_panelBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_panelBTNMouseEntered
        report_panelBTN.setBackground(new Color(33,173,178));
    }//GEN-LAST:event_report_panelBTNMouseEntered

    private void report_panelBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report_panelBTNMouseExited
        report_panelBTN.setBackground(new Color(121,119,119));
    }//GEN-LAST:event_report_panelBTNMouseExited

    private void admin_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_btnMouseClicked
                    Admin_Home.getObj().setVisible(true);
                    //passing user id 
                    Admin_Home.getObj().setUserID(Recieved_user_id);
                    Admin_Home.getObj().printUserID();

                    this.dispose();
    }//GEN-LAST:event_admin_btnMouseClicked

    private void admin_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_btnMouseEntered
                admin_btn.setBackground(new Color(82,120,152));

    }//GEN-LAST:event_admin_btnMouseEntered

    private void admin_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_btnMouseExited
        admin_btn.setBackground(new Color(121,119,119));
    }//GEN-LAST:event_admin_btnMouseExited

    private void front_holderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_front_holderMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_front_holderMouseEntered

    private void front_holderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_front_holderMouseExited
        // TODO add your handling code here:////////////eixt
        // if(evt.getSource()==MuiltpleOption1 ){
            //   top.setVisible(true);

            //   }
    }//GEN-LAST:event_front_holderMouseExited

    private void exit_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_lbMouseClicked
        Dialog frame = new Dialog();
        frame.setVisible(true);
    }//GEN-LAST:event_exit_lbMouseClicked

    private void minize_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minize_lbMouseClicked
        this.setExtendedState(Admin_Home.ICONIFIED);
    }//GEN-LAST:event_minize_lbMouseClicked

    public void updating_method(){
        
               InputStream inputSteam = null;
            String dir = img_url.getText();
            
            try {
                inputSteam = new FileInputStream(new File(dir));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Adminstrative.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
     try {
              String DOB_Selected_date= ((JTextField)txtDOB.getDateEditor().getUiComponent()).getText();
           
                conn = DBConnection.getConnction();
                String sql = "UPDATE   employee SET name =?,surname =?, employeeid =?,contact =?, email =?,address =?,dob =?, gender =?, country =?, image = ? WHERE employee_Id = ?";
                pps = conn.prepareStatement(sql);
                pps.setString(1 , txtFname.getText().trim());
                pps.setString(2 , txtLname.getText().trim());
                pps.setString(3 ,  txtEmployee_id.getText().trim());
                pps.setString(4 , txtContact.getText().trim());
                pps.setString(5 ,txtEmail.getText().trim());
                pps.setString(6 , txtAddress.getText().trim());
                pps.setString(7,  DOB_Selected_date.trim());
                pps.setString(8, Gender.getSelectedItem().toString().trim());
                pps.setString(9,   txtCountry.getText().trim());
                pps.setBlob(10,   inputSteam);

                 pps.setString(11,   EmployeeID_resource);
              
                pps.executeUpdate();
                 
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

    }
    
    private void lb_GeneralSettings_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_GeneralSettings_btnMouseClicked
        panel_forQualifications.hide();
      
        panel_forPersonal_info.setVisible(true);
    }//GEN-LAST:event_lb_GeneralSettings_btnMouseClicked

    private void lb_GlobalSettings_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_GlobalSettings_btnMouseClicked
        panel_forQualifications.setVisible(true);
      
        panel_forPersonal_info.hide();
    }//GEN-LAST:event_lb_GlobalSettings_btnMouseClicked

    private void SaveTeacher_General_InfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveTeacher_General_InfoMouseClicked
     
        panel_forPersonal_info.hide();
        panel_forQualifications.setVisible(true);
        
        
    }//GEN-LAST:event_SaveTeacher_General_InfoMouseClicked

    private void Save_Qualifications_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Qualifications_infoMouseClicked

        
        
        try {
                String Imployment_Date= ((JTextField)txtImployment_Date.getDateEditor().getUiComponent()).getText();
           
                conn = DBConnection.getConnction();
                String sql = "UPDATE   employee SET Joining_date =?,salary =?,department =?,designation=?,qualification =? WHERE employeeid = ?";
                pps = conn.prepareStatement(sql);
                pps.setString(1, Imployment_Date);
                pps.setString(2,   txtSalary.getSelectedItem().toString());
                pps.setString(3,   txtDepartment.getSelectedItem().toString());
                pps.setString(4,   txtDesignation.getSelectedItem().toString());
                pps.setString(5,   txtQualification.getSelectedItem().toString());
                pps.setString(6,   Employee_Given_ID_resource);
                
                pps.executeUpdate();
                 txtSalary.setSelectedIndex(0);
                  txtDepartment.setSelectedIndex(0);
                  txtDesignation  .setSelectedIndex(0);      
                  txtQualification  .setSelectedIndex(0);     
                         
                         
                         
                } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);}  
            
    }//GEN-LAST:event_Save_Qualifications_infoMouseClicked
    
    public void adding_majorSubjects_for_Teacher(){
              try {
                 conn = DBConnection.getConnction();
                String sql = "INSERT INTO   employee_qualifications_major (user_login_id,major_name) VALUES (?,?)";
                pps9 = conn.prepareStatement(sql);
                pps9.setString(1,     user_log_id);
                pps9.setString(2,   Major_One.getText().trim());
                pps9.executeUpdate();
                 Major_One.setText(null);
               } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);} 
      
              try {
                conn = DBConnection.getConnction();
                String sql = "INSERT INTO   employee_qualifications_major (user_login_id,major_name) VALUES (?,?)";
                pps10 = conn.prepareStatement(sql);
                pps10.setString(1,     user_log_id);
                pps10.setString(2,   Major_Two.getText().trim());

                pps10.executeUpdate();
                  Major_Two.setText(null);      
                } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);} 
      
              try {
                 conn = DBConnection.getConnction();
                String sql = "INSERT INTO   employee_qualifications_major (user_login_id,major_name) VALUES (?,?)";
                pps11 = conn.prepareStatement(sql);
                pps11.setString(1,     user_log_id);
                pps11.setString(2,      Major3.getText().trim());

                pps11.executeUpdate();
                 Major3.setText(null);      
                } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex);} 
              
               JOptionPane.showMessageDialog(null, "Registration successfully completed ");
                  Login my_log = new Login();
                  this.dispose();
                  my_log.setVisible(true);
    }
    
    
    
    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
      panel_forPersonal_info.hide();
      panel_forQualifications.hide();
     
    }//GEN-LAST:event_jLabel30MouseClicked

    private void Save_Qualifications_info1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_Qualifications_info1MouseClicked

         SaveTeacher_General_Info();
        
        
    }//GEN-LAST:event_Save_Qualifications_info1MouseClicked

    
    
    private void lb_Chooser_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_Chooser_btnMouseClicked
        user_img.setIcon(null);
        
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(true);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setFileHidingEnabled(false);
        if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
        java.io.File f = chooser.getSelectedFile();
        img_url.setText(f.getPath());
        
            try {
               ImageIcon icon= new ImageIcon(ImageIO.read(f));
               Image image = icon.getImage();
               Image modifiedImage = image.getScaledInstance(user_img.getWidth(), user_img.getHeight(), Image.SCALE_SMOOTH);
               icon = new ImageIcon(modifiedImage);
               user_img.setIcon(icon);
           } catch (IOException ex) {
                Logger.getLogger(Adminstrative.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lb_Chooser_btnMouseClicked

    private void txtQualificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQualificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQualificationActionPerformed

    private void BackGround_headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGround_headerMouseDragged
       int x=evt.getXOnScreen();
         int y=evt.getYOnScreen();
         this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_BackGround_headerMouseDragged

    private void BackGround_headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackGround_headerMousePressed
         xx = evt.getX();
          yy = evt.getY();
    }//GEN-LAST:event_BackGround_headerMousePressed
 
     public void  SaveTeacher_General_Info(){
         
     
         
         try {
                String DOB_Selected_date= ((JTextField)txtDOB.getDateEditor().getUiComponent()).getText();
                 conn = DBConnection.getConnction();
                String sql = "INSERT INTO  employee (user_login_id, name,surname,employeeid,contact, email,address,dob, gender, country,salary,department,designation,qualification) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                pps = conn.prepareStatement(sql); 
                 pps.setString(1 ,user_log_id );  

                pps.setString(2 ,txtFname.getText() );  
                pps.setString(3 , txtLname.getText());
                pps.setString(4 , txtEmployee_id.getText() );
                pps.setString(5 , txtContact.getText()); 
                pps.setString(6 ,txtEmail.getText());
                pps.setString(7 , txtAddress.getText());
                pps.setString(8,  DOB_Selected_date);
                pps.setString(9, Gender.getSelectedItem().toString());
                pps.setString(10, txtCountry.getText());
                
                pps.setString(11,   txtSalary.getSelectedItem().toString());
                pps.setString(12,   txtDepartment.getSelectedItem().toString());
                pps.setString(13,   txtDesignation.getSelectedItem().toString());
                pps.setString(14,   txtQualification.getSelectedItem().toString());
           
               
                  pps.executeUpdate();
                  
                 
                  adding_majorSubjects_for_Teacher();
                  
                
                } catch (SQLException ex) { JOptionPane.showMessageDialog(null, ex); }
       
       
    }
    


    

   
     
     
         public static Teacher_more_info getObj() {  //public method for instance Restriction
        if (Obj == null) {
            Obj = new Teacher_more_info();
        }
        return Obj;
    }
 
         
         
         
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
            java.util.logging.Logger.getLogger(Teacher_more_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher_more_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher_more_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher_more_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher_more_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround_header;
    private javax.swing.JPanel Container_forGeneral;
    private javax.swing.JPanel Employee_entry;
    private javax.swing.JComboBox Gender;
    private javax.swing.JLabel LBGENDER;
    private javax.swing.JTextField Major3;
    private javax.swing.JTextField Major_One;
    private javax.swing.JTextField Major_Two;
    private javax.swing.JLabel SaveTeacher_General_Info;
    private javax.swing.JLabel Save_Qualifications_info;
    private javax.swing.JLabel Save_Qualifications_info1;
    private javax.swing.JPanel Side_Panel;
    private javax.swing.JLabel addreessLb;
    private javax.swing.JPanel admin_btn;
    private javax.swing.JPanel calender;
    private javax.swing.JPanel center;
    private javax.swing.JPanel employee_Inner_panel;
    private javax.swing.JLabel exit_lb;
    private javax.swing.JPanel front_holder;
    private javax.swing.JPanel hotel_ma;
    private javax.swing.JLabel img_url;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lBDATE;
    private javax.swing.JLabel lbContact1;
    private javax.swing.JLabel lbEmail1;
    private javax.swing.JLabel lbFname;
    private javax.swing.JLabel lbSLname;
    private javax.swing.JLabel lb_Chooser_btn;
    private javax.swing.JLabel lb_GeneralSettings_btn;
    private javax.swing.JLabel lb_GlobalSettings_btn;
    private javax.swing.JLabel main_BG;
    private javax.swing.JLabel minize_lb;
    private javax.swing.JLabel mode;
    private javax.swing.JLabel model;
    private javax.swing.JPanel panel_forPersonal_info;
    private javax.swing.JPanel panel_forQualifications;
    private javax.swing.JPanel report_panelBTN;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtCountry;
    private com.toedter.calendar.JDateChooser txtDOB;
    private javax.swing.JComboBox txtDepartment;
    private javax.swing.JComboBox txtDesignation;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployee_id;
    private javax.swing.JTextField txtFname;
    private com.toedter.calendar.JDateChooser txtImployment_Date;
    private javax.swing.JTextField txtLname;
    private javax.swing.JComboBox txtQualification;
    private javax.swing.JComboBox txtSalary;
    private javax.swing.JLabel user_img;
    // End of variables declaration//GEN-END:variables
}
