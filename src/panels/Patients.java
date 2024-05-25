
package panels;

import com.formdev.flatlaf.FlatClientProperties;
import customDesigns.CheckBoxTableHeaderRenderer;
import customDesigns.TableHeaderAlignment;
import java.awt.Color;
import java.awt.Font;

public class Patients extends javax.swing.JPanel {

    public Patients() {
        initComponents();
        init();
    }
    
     private void init() {

        jTable2.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
                + "height:30;"
                + "hoverBackground:null;"
                + "pressedBackground:null;"
                + "separatorColor:$TableHeader.background;"
                + "font:bold;");

        jTable2.putClientProperty(FlatClientProperties.STYLE, ""
                + "rowHeight:30;"
                + "showHorizontalLines:true;"
                + "intercellSpacing:0,1;"
                + "cellFocusColor:$TableHeader.hoverBackground;"
                + "selectionBackground:$TableHeader.hoverBackground;"
                + "selectionForeground:$Table.foreground;");

        jScrollPane1.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "trackArc:999;"
                + "trackInsets:3,3,3,3;"
                + "thumbInsets:3,3,3,3;"
                + "background:$Table.background;");


        jTable2.getColumnModel().getColumn(0).setHeaderRenderer(new CheckBoxTableHeaderRenderer(jTable2, 0));
        jTable2.getTableHeader().setDefaultRenderer(new TableHeaderAlignment(jTable2));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_header = new javax.swing.JPanel();
        jLabel_Patients = new javax.swing.JLabel();
        jPanel_controlPanel = new javax.swing.JPanel();
        panelRounded_NewPatients = new customDesigns.panelRounded();
        jLabel_NewPatients = new javax.swing.JLabel();
        panelRounded3 = new customDesigns.panelRounded();
        jComboBox_Newest = new javax.swing.JComboBox<>();
        panelRounded4 = new customDesigns.panelRounded();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Search = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panelRounded5 = new customDesigns.panelRounded();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel_header.setBackground(new java.awt.Color(243, 244, 255));
        jPanel_header.setPreferredSize(new java.awt.Dimension(1050, 120));

        jLabel_Patients.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        jLabel_Patients.setForeground(new java.awt.Color(48, 57, 114));
        jLabel_Patients.setText("   Patients");

        jPanel_controlPanel.setBackground(new java.awt.Color(243, 244, 255));

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
                .addComponent(jLabel_NewPatients, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRounded_NewPatientsLayout.setVerticalGroup(
            panelRounded_NewPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded_NewPatientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_NewPatients, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRounded3.setBackground(new java.awt.Color(48, 57, 114));
        panelRounded3.setRoundBottomLeft(40);
        panelRounded3.setRoundBottomRight(40);
        panelRounded3.setRoundTopLeft(40);
        panelRounded3.setRoundTopRight(40);

        jComboBox_Newest.setBackground(new java.awt.Color(48, 57, 114));
        jComboBox_Newest.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox_Newest.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox_Newest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Newest" }));
        jComboBox_Newest.setBorder(null);
        jComboBox_Newest.setFocusable(false);

        javax.swing.GroupLayout panelRounded3Layout = new javax.swing.GroupLayout(panelRounded3);
        panelRounded3.setLayout(panelRounded3Layout);
        panelRounded3Layout.setHorizontalGroup(
            panelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jComboBox_Newest, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelRounded3Layout.setVerticalGroup(
            panelRounded3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox_Newest, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel_controlPanelLayout = new javax.swing.GroupLayout(jPanel_controlPanel);
        jPanel_controlPanel.setLayout(jPanel_controlPanelLayout);
        jPanel_controlPanelLayout.setHorizontalGroup(
            jPanel_controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_controlPanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel_controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelRounded4, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addGroup(jPanel_controlPanelLayout.createSequentialGroup()
                        .addComponent(panelRounded3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelRounded_NewPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        jPanel_controlPanelLayout.setVerticalGroup(
            jPanel_controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_controlPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel_controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRounded_NewPatients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRounded3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRounded4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_headerLayout = new javax.swing.GroupLayout(jPanel_header);
        jPanel_header.setLayout(jPanel_headerLayout);
        jPanel_headerLayout.setHorizontalGroup(
            jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_headerLayout.createSequentialGroup()
                .addComponent(jLabel_Patients, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 549, Short.MAX_VALUE)
                .addComponent(jPanel_controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel_headerLayout.setVerticalGroup(
            jPanel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_headerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel_Patients, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel_header, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(243, 244, 255));

        panelRounded5.setBackground(new java.awt.Color(255, 255, 255));
        panelRounded5.setRoundBottomLeft(50);
        panelRounded5.setRoundBottomRight(50);
        panelRounded5.setRoundTopLeft(50);
        panelRounded5.setRoundTopRight(50);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Name", "ID", "Date", "Attending ID", "Word", "Contact", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        javax.swing.GroupLayout panelRounded5Layout = new javax.swing.GroupLayout(panelRounded5);
        panelRounded5.setLayout(panelRounded5Layout);
        panelRounded5Layout.setHorizontalGroup(
            panelRounded5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        panelRounded5Layout.setVerticalGroup(
            panelRounded5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelRounded5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelRounded5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void panelRounded_NewPatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRounded_NewPatientsMouseClicked

            

    }//GEN-LAST:event_panelRounded_NewPatientsMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox_Newest;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_NewPatients;
    private javax.swing.JLabel jLabel_Patients;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_controlPanel;
    private javax.swing.JPanel jPanel_header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField_Search;
    private customDesigns.panelRounded panelRounded3;
    private customDesigns.panelRounded panelRounded4;
    private customDesigns.panelRounded panelRounded5;
    private customDesigns.panelRounded panelRounded_NewPatients;
    // End of variables declaration//GEN-END:variables
}
