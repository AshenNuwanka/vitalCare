package gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import customDesigns.panelRounded;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import panels.Patients;
import panels.ReceptionDashboard;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();

        setDesign(panelRounded_dashboard, jLabel_dashboard);
        resetDesign(panelRounded_Patients, jLabel_Patients);
        resetDesign(panelRounded_Doctors, jLabel_Doctors);
        resetDesign(panelRounded_BloodDonation, jLabel_BloodDonation);
    }

    private void setDesign(panelRounded panel, JLabel label) {
        panel.setBackground(new Color(243, 244, 255));
        label.setForeground(new Color(77, 68, 181));
    }

    private void resetDesign(panelRounded panel, JLabel label) {
        panel.setBackground(new Color(77, 68, 181));
        label.setForeground(new Color(255, 255, 255));
    }

    public void swithchPanel(JPanel panel) {
        jLayeredPanel.removeAll();
        jLayeredPanel.add(panel);
        jLayeredPanel.repaint();
        jLayeredPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_logo = new javax.swing.JLabel();
        panelRounded_dashboard = new customDesigns.panelRounded();
        jLabel_dashboard = new javax.swing.JLabel();
        panelRounded_Patients = new customDesigns.panelRounded();
        jLabel_Patients = new javax.swing.JLabel();
        panelRounded_Doctors = new customDesigns.panelRounded();
        jLabel_Doctors = new javax.swing.JLabel();
        panelRounded_BloodDonation = new customDesigns.panelRounded();
        jLabel_BloodDonation = new javax.swing.JLabel();
        jLayeredPanel = new javax.swing.JLayeredPane();
        receptionDashboard2 = new panels.ReceptionDashboard();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(77, 68, 181));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 600));

        jLabel_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assests/Logo01.png"))); // NOI18N

        panelRounded_dashboard.setBackground(new java.awt.Color(77, 68, 181));
        panelRounded_dashboard.setRoundBottomLeft(50);
        panelRounded_dashboard.setRoundTopLeft(50);
        panelRounded_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRounded_dashboardMouseClicked(evt);
            }
        });

        jLabel_dashboard.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_dashboard.setText("Dashboard");

        javax.swing.GroupLayout panelRounded_dashboardLayout = new javax.swing.GroupLayout(panelRounded_dashboard);
        panelRounded_dashboard.setLayout(panelRounded_dashboardLayout);
        panelRounded_dashboardLayout.setHorizontalGroup(
            panelRounded_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded_dashboardLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRounded_dashboardLayout.setVerticalGroup(
            panelRounded_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded_dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRounded_Patients.setBackground(new java.awt.Color(77, 68, 181));
        panelRounded_Patients.setRoundBottomLeft(50);
        panelRounded_Patients.setRoundTopLeft(50);
        panelRounded_Patients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRounded_PatientsMouseClicked(evt);
            }
        });

        jLabel_Patients.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Patients.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Patients.setText("Patients");

        javax.swing.GroupLayout panelRounded_PatientsLayout = new javax.swing.GroupLayout(panelRounded_Patients);
        panelRounded_Patients.setLayout(panelRounded_PatientsLayout);
        panelRounded_PatientsLayout.setHorizontalGroup(
            panelRounded_PatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded_PatientsLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel_Patients, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRounded_PatientsLayout.setVerticalGroup(
            panelRounded_PatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded_PatientsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Patients, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRounded_Doctors.setBackground(new java.awt.Color(77, 68, 181));
        panelRounded_Doctors.setRoundBottomLeft(50);
        panelRounded_Doctors.setRoundTopLeft(50);
        panelRounded_Doctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRounded_DoctorsMouseClicked(evt);
            }
        });

        jLabel_Doctors.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_Doctors.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Doctors.setText("Doctors");

        javax.swing.GroupLayout panelRounded_DoctorsLayout = new javax.swing.GroupLayout(panelRounded_Doctors);
        panelRounded_Doctors.setLayout(panelRounded_DoctorsLayout);
        panelRounded_DoctorsLayout.setHorizontalGroup(
            panelRounded_DoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded_DoctorsLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel_Doctors, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRounded_DoctorsLayout.setVerticalGroup(
            panelRounded_DoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded_DoctorsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Doctors, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRounded_BloodDonation.setBackground(new java.awt.Color(77, 68, 181));
        panelRounded_BloodDonation.setRoundBottomLeft(50);
        panelRounded_BloodDonation.setRoundTopLeft(50);
        panelRounded_BloodDonation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRounded_BloodDonationMouseClicked(evt);
            }
        });

        jLabel_BloodDonation.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel_BloodDonation.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BloodDonation.setText("Blood Donation");

        javax.swing.GroupLayout panelRounded_BloodDonationLayout = new javax.swing.GroupLayout(panelRounded_BloodDonation);
        panelRounded_BloodDonation.setLayout(panelRounded_BloodDonationLayout);
        panelRounded_BloodDonationLayout.setHorizontalGroup(
            panelRounded_BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded_BloodDonationLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel_BloodDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRounded_BloodDonationLayout.setVerticalGroup(
            panelRounded_BloodDonationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded_BloodDonationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_BloodDonation, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelRounded_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRounded_Patients, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRounded_Doctors, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRounded_BloodDonation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRounded_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRounded_Patients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRounded_Doctors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRounded_BloodDonation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jLayeredPanel.setLayout(new java.awt.CardLayout());
        jLayeredPanel.add(receptionDashboard2, "card2");

        getContentPane().add(jLayeredPanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelRounded_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRounded_dashboardMouseClicked
        setDesign(panelRounded_dashboard, jLabel_dashboard);
        resetDesign(panelRounded_Patients, jLabel_Patients);
        resetDesign(panelRounded_Doctors, jLabel_Doctors);
        resetDesign(panelRounded_BloodDonation, jLabel_BloodDonation);

        ReceptionDashboard receptionDashboard = new ReceptionDashboard();
        swithchPanel(receptionDashboard);


    }//GEN-LAST:event_panelRounded_dashboardMouseClicked

    private void panelRounded_PatientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRounded_PatientsMouseClicked
        
        resetDesign(panelRounded_dashboard, jLabel_dashboard);
        setDesign(panelRounded_Patients, jLabel_Patients);
        resetDesign(panelRounded_Doctors, jLabel_Doctors);
        resetDesign(panelRounded_BloodDonation, jLabel_BloodDonation);
        
        Patients patients = new Patients();
        swithchPanel(patients);
    }//GEN-LAST:event_panelRounded_PatientsMouseClicked

    private void panelRounded_DoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRounded_DoctorsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelRounded_DoctorsMouseClicked

    private void panelRounded_BloodDonationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRounded_BloodDonationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelRounded_BloodDonationMouseClicked

    public static void main(String args[]) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("sample.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_BloodDonation;
    private javax.swing.JLabel jLabel_Doctors;
    private javax.swing.JLabel jLabel_Patients;
    private javax.swing.JLabel jLabel_dashboard;
    private javax.swing.JLabel jLabel_logo;
    private javax.swing.JLayeredPane jLayeredPanel;
    private javax.swing.JPanel jPanel1;
    private customDesigns.panelRounded panelRounded_BloodDonation;
    private customDesigns.panelRounded panelRounded_Doctors;
    private customDesigns.panelRounded panelRounded_Patients;
    private customDesigns.panelRounded panelRounded_dashboard;
    private panels.ReceptionDashboard receptionDashboard2;
    // End of variables declaration//GEN-END:variables
}
