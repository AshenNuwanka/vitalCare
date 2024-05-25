
package panels;

import com.formdev.flatlaf.FlatClientProperties;
import customDesigns.CheckBoxTableHeaderRenderer;
import customDesigns.TableHeaderAlignment;
import java.awt.Color;
import java.awt.Font;
import java.io.File;

public class ReceptionDashboard extends javax.swing.JPanel {

    public ReceptionDashboard() {
        initComponents();
        
        FontDesign();
        init();
    }

      public void FontDesign() {
        try {
            File fontStyle = new File("src/Resources/Poppins-SemiBold.ttf");
            Font header = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(30f);
            jLabel_Dashboard.setFont(header);

            Font header3 = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(20f);
            jLabel_RecentRegistered.setFont(header3);
            jLabel_RecentDischarged.setFont(header3);
            jLabel_ODP.setFont(header3);

            Font header4 = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(14f);
            jLabel_NewPatients.setFont(header4);
            button_View.setFont(header4);
            button_View2.setFont(header4);
            
            jLabel_Title01.setFont(header4);
            jLabel_Title02.setFont(header4);
            jLabel_Title03.setFont(header4);
            jLabel_Title04.setFont(header4);
            jLabel_Title05.setFont(header4);
            jLabel_Title06.setFont(header4);
            jLabel_Title07.setFont(header4);
            jLabel_Title08.setFont(header4);
            
            

            File subHeader = new File("src/Resources/Poppins-Regular.ttf");
            Font header2 = Font.createFont(Font.TRUETYPE_FONT, subHeader).deriveFont(12f);
            jLabel_YouHave.setFont(header2);
            jLabel_havePatients.setFont(header2);
            
            jLabel_Title12.setFont(header2);
            jLabel_Title13.setFont(header2);
            jLabel_Title14.setFont(header2);
            jLabel_Title19.setFont(header2);
            jLabel_Title16.setFont(header2);
            jLabel_Title17.setFont(header2);
            jLabel_Title18.setFont(header2);

            File num = new File("src/Resources/Poppins-SemiBold.ttf");
            Font num1 = Font.createFont(Font.TRUETYPE_FONT, num).deriveFont(12f);
            jLabel_patient.setFont(num1);
            jLabel_Doctors.setFont(num1);
            jLabel_Clients.setFont(num1);
            jLabel_Clients.setFont(num1);
            jLabel_Clients.setFont(num1);
            jLabel_Clients.setFont(num1);
            jLabel_num.setFont(num1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
      private void init() {

        Jtable.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "height:30;"
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background;"
                + "font:bold;");

        Jtable.putClientProperty(FlatClientProperties.STYLE, ""
                + "rowHeight:30;"
                + "showHorizontalLines:true;"
                + "intercellSpacing:0,1;"
                + "cellFocusColor:$TableHeader.hoverBackground;"
                + "selectionBackground:$TableHeader.hoverBackground;"
                + "selectionForeground:$Table.foreground;");

        Scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "trackArc:999;"
                + "trackInsets:3,3,3,3;"
                + "thumbInsets:3,3,3,3;"
                + "background:$Table.background;");


        Jtable.getColumnModel().getColumn(0).setHeaderRenderer(new CheckBoxTableHeaderRenderer(Jtable, 0));
        Jtable.getTableHeader().setDefaultRenderer(new TableHeaderAlignment(Jtable));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_Dashboard = new javax.swing.JLabel();
        panelRounded4 = new customDesigns.panelRounded();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        panelRounded1 = new customDesigns.panelRounded();
        jPanel7 = new javax.swing.JPanel();
        panelRounded2 = new customDesigns.panelRounded();
        jLabel_patient = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panelRounded5 = new customDesigns.panelRounded();
        jLabel_Doctors = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panelRounded6 = new customDesigns.panelRounded();
        jLabel_Clients = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelRounded3 = new customDesigns.panelRounded();
        jLabel_RecentRegistered = new javax.swing.JLabel();
        panelRounded_NewPatients = new customDesigns.panelRounded();
        jLabel_NewPatients = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        Jtable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel_ODP = new javax.swing.JLabel();
        button_View2 = new customDesigns.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel16 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        panelRounded13 = new customDesigns.panelRounded();
        jLabel_Title01 = new javax.swing.JLabel();
        jLabel_Title12 = new javax.swing.JLabel();
        jLabel_title6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        panelRounded14 = new customDesigns.panelRounded();
        jLabel_Title02 = new javax.swing.JLabel();
        jLabel_Title13 = new javax.swing.JLabel();
        jLabel_title8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        panelRounded15 = new customDesigns.panelRounded();
        jLabel_Title03 = new javax.swing.JLabel();
        jLabel_Title14 = new javax.swing.JLabel();
        jLabel_title10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        panelRounded16 = new customDesigns.panelRounded();
        jLabel_Title04 = new javax.swing.JLabel();
        jLabel_Title16 = new javax.swing.JLabel();
        jLabel_title11 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel_YouHave = new javax.swing.JLabel();
        jLabel_RecentDischarged = new javax.swing.JLabel();
        jLabel_num = new javax.swing.JLabel();
        jLabel_havePatients = new javax.swing.JLabel();
        panelRounded7 = new customDesigns.panelRounded();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        panelRounded8 = new customDesigns.panelRounded();
        jLabel_Title05 = new javax.swing.JLabel();
        jLabel_Title17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        panelRounded9 = new customDesigns.panelRounded();
        jLabel_Title06 = new javax.swing.JLabel();
        jLabel_Title18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        panelRounded11 = new customDesigns.panelRounded();
        jLabel_Title07 = new javax.swing.JLabel();
        jLabel_Title19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        panelRounded12 = new customDesigns.panelRounded();
        jLabel_Title08 = new javax.swing.JLabel();
        jLabel_Title20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        button_View = new customDesigns.Button();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(243, 244, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 600));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(243, 244, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(750, 60));

        jLabel_Dashboard.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel_Dashboard.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_Dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Dashboard.setText("Dashboard");

        panelRounded4.setBackground(new java.awt.Color(255, 255, 255));
        panelRounded4.setPreferredSize(new java.awt.Dimension(290, 40));
        panelRounded4.setRoundBottomLeft(40);
        panelRounded4.setRoundBottomRight(40);
        panelRounded4.setRoundTopLeft(40);
        panelRounded4.setRoundTopRight(40);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/search.png"))); // NOI18N

        jTextField_Search.setBackground(new java.awt.Color(255, 255, 255));
        jTextField_Search.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(204, 204, 204));
        jTextField_Search.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_Search.setText("Search here...");
        jTextField_Search.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField_Search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_SearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_SearchFocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelRounded4Layout = new javax.swing.GroupLayout(panelRounded4);
        panelRounded4.setLayout(panelRounded4Layout);
        panelRounded4Layout.setHorizontalGroup(
            panelRounded4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        panelRounded4Layout.setVerticalGroup(
            panelRounded4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRounded4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Search, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(panelRounded4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRounded4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(243, 244, 255));

        panelRounded1.setBackground(new java.awt.Color(255, 255, 255));
        panelRounded1.setPreferredSize(new java.awt.Dimension(157, 90));
        panelRounded1.setRoundBottomLeft(40);
        panelRounded1.setRoundBottomRight(40);
        panelRounded1.setRoundTopLeft(40);
        panelRounded1.setRoundTopRight(40);
        panelRounded1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setBackground(new java.awt.Color(243, 244, 255));
        jPanel7.setOpaque(false);

        panelRounded2.setBackground(new java.awt.Color(77, 68, 181));
        panelRounded2.setPreferredSize(new java.awt.Dimension(50, 50));
        panelRounded2.setRoundBottomLeft(50);
        panelRounded2.setRoundBottomRight(50);
        panelRounded2.setRoundTopLeft(50);
        panelRounded2.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded2Layout = new javax.swing.GroupLayout(panelRounded2);
        panelRounded2.setLayout(panelRounded2Layout);
        panelRounded2Layout.setHorizontalGroup(
            panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panelRounded2Layout.setVerticalGroup(
            panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel_patient.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_patient.setText("Patients");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("932");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(panelRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel_patient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelRounded1.add(jPanel7);

        jPanel6.setBackground(new java.awt.Color(243, 244, 255));
        jPanel6.setOpaque(false);

        panelRounded5.setBackground(new java.awt.Color(76, 188, 154));
        panelRounded5.setPreferredSize(new java.awt.Dimension(50, 50));
        panelRounded5.setRoundBottomLeft(50);
        panelRounded5.setRoundBottomRight(50);
        panelRounded5.setRoundTopLeft(50);
        panelRounded5.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded5Layout = new javax.swing.GroupLayout(panelRounded5);
        panelRounded5.setLayout(panelRounded5Layout);
        panelRounded5Layout.setHorizontalGroup(
            panelRounded5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panelRounded5Layout.setVerticalGroup(
            panelRounded5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel_Doctors.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Doctors.setText("Doctors");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("75");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(panelRounded5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Doctors, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel_Doctors)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRounded5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelRounded1.add(jPanel6);

        jPanel5.setBackground(new java.awt.Color(243, 244, 255));
        jPanel5.setOpaque(false);

        panelRounded6.setBackground(new java.awt.Color(230, 179, 57));
        panelRounded6.setPreferredSize(new java.awt.Dimension(50, 50));
        panelRounded6.setRoundBottomLeft(50);
        panelRounded6.setRoundBottomRight(50);
        panelRounded6.setRoundTopLeft(50);
        panelRounded6.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded6Layout = new javax.swing.GroupLayout(panelRounded6);
        panelRounded6.setLayout(panelRounded6Layout);
        panelRounded6Layout.setHorizontalGroup(
            panelRounded6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        panelRounded6Layout.setVerticalGroup(
            panelRounded6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jLabel_Clients.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Clients.setText("Clients");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("40");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRounded6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Clients, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRounded6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel_Clients)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelRounded1.add(jPanel5);

        panelRounded3.setBackground(new java.awt.Color(255, 255, 255));
        panelRounded3.setRoundBottomLeft(40);
        panelRounded3.setRoundBottomRight(40);
        panelRounded3.setRoundTopLeft(40);
        panelRounded3.setRoundTopRight(40);

        jLabel_RecentRegistered.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_RecentRegistered.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_RecentRegistered.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_RecentRegistered.setText("Recent Registered");

        panelRounded_NewPatients.setBackground(new java.awt.Color(48, 57, 114));
        panelRounded_NewPatients.setRoundBottomLeft(40);
        panelRounded_NewPatients.setRoundBottomRight(40);
        panelRounded_NewPatients.setRoundTopLeft(40);
        panelRounded_NewPatients.setRoundTopRight(40);
        panelRounded_NewPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRounded_NewPatientsMouseClicked(evt);
            }
        });

        jLabel_NewPatients.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_NewPatients.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NewPatients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_NewPatients.setText("+  New Patients");
        jLabel_NewPatients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelRounded_NewPatientsLayout = new javax.swing.GroupLayout(panelRounded_NewPatients);
        panelRounded_NewPatients.setLayout(panelRounded_NewPatientsLayout);
        panelRounded_NewPatientsLayout.setHorizontalGroup(
            panelRounded_NewPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded_NewPatientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_NewPatients, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRounded_NewPatientsLayout.setVerticalGroup(
            panelRounded_NewPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded_NewPatientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_NewPatients, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        Scroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "ID", "Name", "", "wate", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Jtable.getTableHeader().setReorderingAllowed(false);
        Scroll.setViewportView(Jtable);
        if (Jtable.getColumnModel().getColumnCount() > 0) {
            Jtable.getColumnModel().getColumn(0).setMaxWidth(50);
            Jtable.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        javax.swing.GroupLayout panelRounded3Layout = new javax.swing.GroupLayout(panelRounded3);
        panelRounded3.setLayout(panelRounded3Layout);
        panelRounded3Layout.setHorizontalGroup(
            panelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
                    .addGroup(panelRounded3Layout.createSequentialGroup()
                        .addComponent(jLabel_RecentRegistered, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRounded_NewPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        panelRounded3Layout.setVerticalGroup(
            panelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRounded_NewPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_RecentRegistered, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRounded3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRounded1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRounded3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(300, 280));

        jLabel_ODP.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_ODP.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_ODP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_ODP.setText("ODP Que");

        button_View2.setBackground(new java.awt.Color(237, 236, 248));
        button_View2.setForeground(new java.awt.Color(77, 68, 181));
        button_View2.setText("View More");
        button_View2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button_View2.setRound(40);
        button_View2.setSelected(true);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(286, 194));
        jPanel11.setLayout(new java.awt.GridLayout(4, 0));

        jPanel12.setOpaque(false);

        panelRounded13.setBackground(new java.awt.Color(193, 187, 235));
        panelRounded13.setPreferredSize(new java.awt.Dimension(40, 40));
        panelRounded13.setRoundBottomLeft(50);
        panelRounded13.setRoundBottomRight(50);
        panelRounded13.setRoundTopLeft(50);
        panelRounded13.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded13Layout = new javax.swing.GroupLayout(panelRounded13);
        panelRounded13.setLayout(panelRounded13Layout);
        panelRounded13Layout.setHorizontalGroup(
            panelRounded13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        panelRounded13Layout.setVerticalGroup(
            panelRounded13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jLabel_Title01.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Title01.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_Title01.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Title01.setText("Samantha William");

        jLabel_Title12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Title12.setText("Lorem ipsum dolor sit amet...");

        jLabel_title6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_title6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_title6.setText("12:45 PM");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRounded13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Title12, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel_Title01, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_title6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelRounded13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Title01)
                            .addComponent(jLabel_title6))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel_Title12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel12);

        jPanel13.setOpaque(false);

        panelRounded14.setBackground(new java.awt.Color(193, 187, 235));
        panelRounded14.setPreferredSize(new java.awt.Dimension(40, 40));
        panelRounded14.setRoundBottomLeft(50);
        panelRounded14.setRoundBottomRight(50);
        panelRounded14.setRoundTopLeft(50);
        panelRounded14.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded14Layout = new javax.swing.GroupLayout(panelRounded14);
        panelRounded14.setLayout(panelRounded14Layout);
        panelRounded14Layout.setHorizontalGroup(
            panelRounded14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        panelRounded14Layout.setVerticalGroup(
            panelRounded14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jLabel_Title02.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Title02.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_Title02.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Title02.setText("Samantha William");

        jLabel_Title13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Title13.setText("Lorem ipsum dolor sit amet...");

        jLabel_title8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_title8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_title8.setText("12:45 PM");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRounded14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel_Title02, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_title8))
                    .addComponent(jLabel_Title13, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelRounded14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Title02)
                            .addComponent(jLabel_title8))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel_Title13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel13);

        jPanel10.setOpaque(false);

        panelRounded15.setBackground(new java.awt.Color(193, 187, 235));
        panelRounded15.setPreferredSize(new java.awt.Dimension(40, 40));
        panelRounded15.setRoundBottomLeft(50);
        panelRounded15.setRoundBottomRight(50);
        panelRounded15.setRoundTopLeft(50);
        panelRounded15.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded15Layout = new javax.swing.GroupLayout(panelRounded15);
        panelRounded15.setLayout(panelRounded15Layout);
        panelRounded15Layout.setHorizontalGroup(
            panelRounded15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        panelRounded15Layout.setVerticalGroup(
            panelRounded15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jLabel_Title03.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Title03.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_Title03.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Title03.setText("Samantha William");

        jLabel_Title14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Title14.setText("Lorem ipsum dolor sit amet...");

        jLabel_title10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_title10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_title10.setText("12:45 PM");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRounded15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel_Title03, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_title10))
                    .addComponent(jLabel_Title14, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelRounded15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Title03)
                            .addComponent(jLabel_title10))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel_Title14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel10);

        jPanel15.setOpaque(false);

        panelRounded16.setBackground(new java.awt.Color(193, 187, 235));
        panelRounded16.setPreferredSize(new java.awt.Dimension(40, 40));
        panelRounded16.setRoundBottomLeft(50);
        panelRounded16.setRoundBottomRight(50);
        panelRounded16.setRoundTopLeft(50);
        panelRounded16.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded16Layout = new javax.swing.GroupLayout(panelRounded16);
        panelRounded16.setLayout(panelRounded16Layout);
        panelRounded16Layout.setHorizontalGroup(
            panelRounded16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        panelRounded16Layout.setVerticalGroup(
            panelRounded16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jLabel_Title04.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Title04.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_Title04.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Title04.setText("Samantha William");

        jLabel_Title16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Title16.setText("Lorem ipsum dolor sit amet...");

        jLabel_title11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_title11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_title11.setText("12:45 PM");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRounded16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel_Title04, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_title11))
                    .addComponent(jLabel_Title16, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelRounded16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_Title04)
                            .addComponent(jLabel_title11))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel_Title16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel15);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        jScrollPane2.setViewportView(jPanel16);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel_ODP, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button_View2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_ODP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_View2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_YouHave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_YouHave.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_YouHave.setText("You have");

        jLabel_RecentDischarged.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel_RecentDischarged.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_RecentDischarged.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_RecentDischarged.setText("Recent Discharged");

        jLabel_num.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_num.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_num.setText("456");

        jLabel_havePatients.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_havePatients.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_havePatients.setText(" Patients");

        panelRounded7.setBackground(new java.awt.Color(77, 68, 181));
        panelRounded7.setPreferredSize(new java.awt.Dimension(40, 40));
        panelRounded7.setRoundBottomLeft(50);
        panelRounded7.setRoundBottomRight(50);
        panelRounded7.setRoundTopLeft(50);
        panelRounded7.setRoundTopRight(50);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("+");

        javax.swing.GroupLayout panelRounded7Layout = new javax.swing.GroupLayout(panelRounded7);
        panelRounded7.setLayout(panelRounded7Layout);
        panelRounded7Layout.setHorizontalGroup(
            panelRounded7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        panelRounded7Layout.setVerticalGroup(
            panelRounded7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.GridLayout(4, 0));

        jPanel18.setOpaque(false);

        panelRounded8.setBackground(new java.awt.Color(252, 196, 62));
        panelRounded8.setPreferredSize(new java.awt.Dimension(40, 40));
        panelRounded8.setRoundBottomLeft(50);
        panelRounded8.setRoundBottomRight(50);
        panelRounded8.setRoundTopLeft(50);
        panelRounded8.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded8Layout = new javax.swing.GroupLayout(panelRounded8);
        panelRounded8.setLayout(panelRounded8Layout);
        panelRounded8Layout.setHorizontalGroup(
            panelRounded8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        panelRounded8Layout.setVerticalGroup(
            panelRounded8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jLabel_Title05.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Title05.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_Title05.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Title05.setText("Samantha William");

        jLabel_Title17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Title17.setText("Class VII A");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/patient.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelRounded8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_Title17, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Title05, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelRounded8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(jLabel_Title05)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel_Title17)))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jPanel17.add(jPanel18);

        jPanel19.setOpaque(false);

        panelRounded9.setBackground(new java.awt.Color(251, 125, 91));
        panelRounded9.setPreferredSize(new java.awt.Dimension(40, 40));
        panelRounded9.setRoundBottomLeft(50);
        panelRounded9.setRoundBottomRight(50);
        panelRounded9.setRoundTopLeft(50);
        panelRounded9.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded9Layout = new javax.swing.GroupLayout(panelRounded9);
        panelRounded9.setLayout(panelRounded9Layout);
        panelRounded9Layout.setHorizontalGroup(
            panelRounded9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        panelRounded9Layout.setVerticalGroup(
            panelRounded9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jLabel_Title06.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Title06.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_Title06.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Title06.setText("Samantha William");

        jLabel_Title18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Title18.setText("Class VII A");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/patient.png"))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelRounded9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_Title18, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Title06, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelRounded9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(jLabel_Title06)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel_Title18)))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jPanel17.add(jPanel19);

        jPanel21.setOpaque(false);

        panelRounded11.setBackground(new java.awt.Color(255, 69, 80));
        panelRounded11.setPreferredSize(new java.awt.Dimension(40, 40));
        panelRounded11.setRoundBottomLeft(50);
        panelRounded11.setRoundBottomRight(50);
        panelRounded11.setRoundTopLeft(50);
        panelRounded11.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded11Layout = new javax.swing.GroupLayout(panelRounded11);
        panelRounded11.setLayout(panelRounded11Layout);
        panelRounded11Layout.setHorizontalGroup(
            panelRounded11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        panelRounded11Layout.setVerticalGroup(
            panelRounded11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jLabel_Title07.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Title07.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_Title07.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Title07.setText("Samantha William");

        jLabel_Title19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Title19.setText("Class VII A");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/patient.png"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelRounded11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_Title19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Title07, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelRounded11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addComponent(jLabel_Title07)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel_Title19)))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jPanel17.add(jPanel21);

        jPanel22.setOpaque(false);

        panelRounded12.setBackground(new java.awt.Color(252, 196, 62));
        panelRounded12.setPreferredSize(new java.awt.Dimension(40, 40));
        panelRounded12.setRoundBottomLeft(50);
        panelRounded12.setRoundBottomRight(50);
        panelRounded12.setRoundTopLeft(50);
        panelRounded12.setRoundTopRight(50);

        javax.swing.GroupLayout panelRounded12Layout = new javax.swing.GroupLayout(panelRounded12);
        panelRounded12.setLayout(panelRounded12Layout);
        panelRounded12Layout.setHorizontalGroup(
            panelRounded12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        panelRounded12Layout.setVerticalGroup(
            panelRounded12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jLabel_Title08.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Title08.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_Title08.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_Title08.setText("Samantha William");

        jLabel_Title20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_Title20.setText("Class VII A");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/patient.png"))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelRounded12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel_Title20, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Title08, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelRounded12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(jLabel_Title08)
                            .addGap(0, 0, 0)
                            .addComponent(jLabel_Title20)))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        jPanel17.add(jPanel22);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 120, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel14);

        button_View.setBackground(new java.awt.Color(237, 236, 248));
        button_View.setForeground(new java.awt.Color(77, 68, 181));
        button_View.setText("View More");
        button_View.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        button_View.setRound(30);
        button_View.setSelected(true);
        button_View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_ViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(button_View, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel_YouHave, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel_num, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel_havePatients))
                    .addComponent(jLabel_RecentDischarged, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRounded7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRounded7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel_RecentDischarged)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_YouHave)
                            .addComponent(jLabel_num)
                            .addComponent(jLabel_havePatients))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(button_View, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel9, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_SearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_SearchFocusGained
        if (jTextField_Search.getText().equals("Search here...")) {
            jTextField_Search.setText("");
            jTextField_Search.setForeground(new Color(0, 0, 0));
            jTextField_Search.setFont(new Font("Dialog", Font.PLAIN, 13));
        }
    }//GEN-LAST:event_jTextField_SearchFocusGained

    private void jTextField_SearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_SearchFocusLost
        if (jTextField_Search.getText().equals("")) {
            jTextField_Search.setText("Search here...");
            jTextField_Search.setForeground(new Color(153, 153, 153));
            jTextField_Search.setFont(new Font("Dialog", Font.PLAIN, 13));
        }
    }//GEN-LAST:event_jTextField_SearchFocusLost

    private void panelRounded_NewPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRounded_NewPatientsMouseClicked

        //        this.removeAll();
        //        AddNewPatient addNewPatient = new AddNewPatient();
        //        this.add(addNewPatient, BorderLayout.CENTER);
        //        SwingUtilities.updateComponentTreeUI(addNewPatient);
    }//GEN-LAST:event_panelRounded_NewPatientsMouseClicked

    private void button_ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_ViewActionPerformed

    }//GEN-LAST:event_button_ViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable;
    private javax.swing.JScrollPane Scroll;
    private customDesigns.Button button_View;
    private customDesigns.Button button_View2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Clients;
    private javax.swing.JLabel jLabel_Dashboard;
    private javax.swing.JLabel jLabel_Doctors;
    private javax.swing.JLabel jLabel_NewPatients;
    private javax.swing.JLabel jLabel_ODP;
    private javax.swing.JLabel jLabel_RecentDischarged;
    private javax.swing.JLabel jLabel_RecentRegistered;
    private javax.swing.JLabel jLabel_Title01;
    private javax.swing.JLabel jLabel_Title02;
    private javax.swing.JLabel jLabel_Title03;
    private javax.swing.JLabel jLabel_Title04;
    private javax.swing.JLabel jLabel_Title05;
    private javax.swing.JLabel jLabel_Title06;
    private javax.swing.JLabel jLabel_Title07;
    private javax.swing.JLabel jLabel_Title08;
    private javax.swing.JLabel jLabel_Title12;
    private javax.swing.JLabel jLabel_Title13;
    private javax.swing.JLabel jLabel_Title14;
    private javax.swing.JLabel jLabel_Title16;
    private javax.swing.JLabel jLabel_Title17;
    private javax.swing.JLabel jLabel_Title18;
    private javax.swing.JLabel jLabel_Title19;
    private javax.swing.JLabel jLabel_Title20;
    private javax.swing.JLabel jLabel_YouHave;
    private javax.swing.JLabel jLabel_havePatients;
    private javax.swing.JLabel jLabel_num;
    private javax.swing.JLabel jLabel_patient;
    private javax.swing.JLabel jLabel_title10;
    private javax.swing.JLabel jLabel_title11;
    private javax.swing.JLabel jLabel_title6;
    private javax.swing.JLabel jLabel_title8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField_Search;
    private customDesigns.panelRounded panelRounded1;
    private customDesigns.panelRounded panelRounded10;
    private customDesigns.panelRounded panelRounded11;
    private customDesigns.panelRounded panelRounded12;
    private customDesigns.panelRounded panelRounded13;
    private customDesigns.panelRounded panelRounded14;
    private customDesigns.panelRounded panelRounded15;
    private customDesigns.panelRounded panelRounded16;
    private customDesigns.panelRounded panelRounded2;
    private customDesigns.panelRounded panelRounded3;
    private customDesigns.panelRounded panelRounded4;
    private customDesigns.panelRounded panelRounded5;
    private customDesigns.panelRounded panelRounded6;
    private customDesigns.panelRounded panelRounded7;
    private customDesigns.panelRounded panelRounded8;
    private customDesigns.panelRounded panelRounded9;
    private customDesigns.panelRounded panelRounded_NewPatients;
    // End of variables declaration//GEN-END:variables
}
