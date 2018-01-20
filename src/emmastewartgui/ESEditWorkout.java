package emmastewartgui;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Emma
 */
public class ESEditWorkout extends javax.swing.JDialog {

    EmmaStewartGUI manager;
    ESFrmMain ESFrmMain;

    public ESEditWorkout(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public ESEditWorkout(java.awt.Frame parent, boolean modal, String workoutName, String numOfLaps, String strokeType, String setDis, String isPB, String setDescription, String setTimeMins, String setTimeSecs) {
        //Constructor Parameters: public AddProjectForm(java.awt.Frame parent, boolean modal, String title, String type, String summary)
        super(parent, modal);
        initComponents();
//        try {
            txtfldWorkoutName.setText(workoutName);
            System.out.println(spnNumberofLaps2.getValue());
            spnNumberofLaps2.setValue(Integer.parseInt(numOfLaps)); //Not getting that from the database3 SYSTEM.OUT IT
            cmbxStroke2.setSelectedItem(strokeType);
            spnDis2.setValue(Integer.parseInt(setDis));
            cmbxTime2.setSelectedItem(isPB);
            txtfldDescription2.setText(setDescription);
            spnMinTime2.setValue(setTimeMins);
            spnSecTime2.setValue(setTimeSecs);

            spnNumberofLaps3.setValue(Integer.parseInt(numOfLaps));
            cmbxStroke3.setSelectedItem(strokeType);
            spnDis3.setValue(Integer.parseInt(setDis));
            cmbxTime3.setSelectedItem(isPB);
            txtfldDescription3.setText(setDescription);
            spnMinTime3.setValue(setTimeMins);
            spnSecTime3.setValue(setTimeSecs);

//        } catch (NumberFormatException e) {
//            System.out.println("This is not a number");
//            System.out.println(e.getMessage());
//        }
    }

    public void DisplaySavedWorkout(Class frmMain) {
        String sqlite;
        try {
            String sql = "SELECT workoutID FROM Workout WHERE workoutID = 43";
            PreparedStatement pst = new EmmaStewartGUI().connect().prepareStatement(sql);
            pst.setString(1, txtfldWorkoutName.getText());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String WN = rs.getString("workoutName");
                txtfldWorkoutName.setText(WN);
                String NO = rs.getString("numOrder");
                lblNumOrder2.setText(NO);
                int NL = rs.getInt("numOfLaps");
                spnNumberofLaps2.setValue(NL);
                String STRO = rs.getString("cmbxStroke4");
                cmbxStroke2.setSelectedItem(STRO);
                String SD = rs.getString("setDis");
                spnDis2.setValue(SD);
                String IP = rs.getString("isPB");
                cmbxTime2.setSelectedItem(SD);
                String STM = rs.getString("setTimeMins");
                spnMinTime2.setValue(STM);
                String STS = rs.getString("setTimeSecs");
                spnSecTime2.setValue(STS);
                String SDes = rs.getString("setDescription");
                txtfldDescription2.setText(SDes);
            }
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfldDescription2 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtfldWorkoutName = new javax.swing.JTextField();
        lblNumOrder2 = new javax.swing.JLabel();
        lblNumOrder3 = new javax.swing.JLabel();
        txtfldDescription3 = new javax.swing.JTextField();
        spnNumberofLaps2 = new javax.swing.JSpinner();
        spnDis2 = new javax.swing.JSpinner();
        cmbxTime2 = new javax.swing.JComboBox<>();
        cmbxStroke2 = new javax.swing.JComboBox<>();
        lblBy2 = new javax.swing.JLabel();
        lblMeterUnit2 = new javax.swing.JLabel();
        spnNumberofLaps3 = new javax.swing.JSpinner();
        spnDis3 = new javax.swing.JSpinner();
        cmbxTime3 = new javax.swing.JComboBox<>();
        cmbxStroke3 = new javax.swing.JComboBox<>();
        lblBy3 = new javax.swing.JLabel();
        lblMeterUnit3 = new javax.swing.JLabel();
        spnMinTime2 = new javax.swing.JSpinner();
        lblColon2 = new javax.swing.JLabel();
        spnSecTime2 = new javax.swing.JSpinner();
        lblUnitTime2 = new javax.swing.JLabel();
        spnMinTime3 = new javax.swing.JSpinner();
        lblColon3 = new javax.swing.JLabel();
        spnSecTime3 = new javax.swing.JSpinner();
        lblUnitTime4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtfldDescription2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription2.setText("Description");
        txtfldDescription2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldDescription2ActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtfldWorkoutName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldWorkoutName.setText("Workout Name");

        lblNumOrder2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder2.setText("1. ");

        lblNumOrder3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder3.setText("2. ");

        txtfldDescription3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription3.setText("Description");
        txtfldDescription3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldDescription3ActionPerformed(evt);
            }
        });

        spnNumberofLaps2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        cmbxTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));
        cmbxTime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxTime2ActionPerformed(evt);
            }
        });

        cmbxStroke2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL" }));
        cmbxStroke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxStroke2ActionPerformed(evt);
            }
        });

        lblBy2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy2.setText("x");

        lblMeterUnit2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit2.setText("m");

        spnNumberofLaps3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        cmbxTime3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));
        cmbxTime3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxTime3ActionPerformed(evt);
            }
        });

        cmbxStroke3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL" }));
        cmbxStroke3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxStroke3ActionPerformed(evt);
            }
        });

        lblBy3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy3.setText("x");

        lblMeterUnit3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit3.setText("m");

        spnMinTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime2.setToolTipText("00");
        spnMinTime2.setRequestFocusEnabled(false);

        lblColon2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon2.setText(":");

        spnSecTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime2.setToolTipText("00");
        spnSecTime2.setRequestFocusEnabled(false);

        lblUnitTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime2.setText("secs");

        spnMinTime3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime3.setToolTipText("00");
        spnMinTime3.setRequestFocusEnabled(false);

        lblColon3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon3.setText(":");

        spnSecTime3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime3.setToolTipText("00");
        spnSecTime3.setRequestFocusEnabled(false);

        lblUnitTime4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime4.setText("secs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtfldWorkoutName, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumOrder3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfldDescription3, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spnNumberofLaps3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBy3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnDis3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMeterUnit3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbxStroke3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbxTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnMinTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblColon3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnSecTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUnitTime4))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumOrder2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfldDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spnNumberofLaps2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBy2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnDis2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMeterUnit2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbxStroke2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbxTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnMinTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblColon2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnSecTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUnitTime2)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfldWorkoutName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMeterUnit2)
                        .addComponent(cmbxStroke2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbxTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnNumberofLaps2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy2)
                        .addComponent(spnDis2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(spnMinTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColon2)
                            .addComponent(spnSecTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblUnitTime2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMeterUnit3)
                                .addComponent(cmbxStroke3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbxTime3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spnNumberofLaps3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblBy3)
                                .addComponent(spnDis3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfldDescription3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(spnMinTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColon3)
                            .addComponent(spnSecTime3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblUnitTime4)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfldDescription2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDescription2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDescription2ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        try {
            String value1 = txtfldWorkoutName.getText();
            int value2 = (int) spnNumberofLaps2.getValue();
            String value3 = (String) cmbxStroke2.getSelectedItem().toString();
            int value4 = (int) spnDis2.getValue();
            String value5 = cmbxTime2.getSelectedItem().toString();
            String value6 = (String) spnMinTime2.getValue();
            String value7 = (String) spnSecTime2.getValue();
            String value8 = txtfldDescription2.getText();

            String sql = "update Sets set workoutName = '" + value1 + "', numOfLaps = '"
                    + value2 + "', strokeType = '" + value3 + "', setDis = '" + value4 + "',"
                    + " isPB = '" + value5 + "', setTime = '" + value6 + "', setDescription = '"
                    + value7 + "' where workoutName = '" + value1 + "'" + "' where setTimeMins = '"
                    + value6 + "'" + "' where setTimeSecs = '" + value7 + "'";
            PreparedStatement pst = new EmmaStewartGUI().connect().prepareStatement(sql);
            pst.executeUpdate();
            pst.close();
            manager.connect().close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Updated");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtfldDescription3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDescription3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDescription3ActionPerformed

    private void cmbxTime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxTime2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxTime2ActionPerformed

    private void cmbxStroke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxStroke2ActionPerformed

    }//GEN-LAST:event_cmbxStroke2ActionPerformed

    private void cmbxTime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxTime3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxTime3ActionPerformed

    private void cmbxStroke3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxStroke3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxStroke3ActionPerformed

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
            java.util.logging.Logger.getLogger(ESEditWorkout.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ESEditWorkout.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ESEditWorkout.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ESEditWorkout.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ESEditWorkout dialog = new ESEditWorkout(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbxStroke2;
    private javax.swing.JComboBox<String> cmbxStroke3;
    private javax.swing.JComboBox<String> cmbxTime2;
    private javax.swing.JComboBox<String> cmbxTime3;
    private javax.swing.JLabel lblBy2;
    private javax.swing.JLabel lblBy3;
    private javax.swing.JLabel lblColon2;
    private javax.swing.JLabel lblColon3;
    private javax.swing.JLabel lblMeterUnit2;
    private javax.swing.JLabel lblMeterUnit3;
    private javax.swing.JLabel lblNumOrder2;
    private javax.swing.JLabel lblNumOrder3;
    private javax.swing.JLabel lblUnitTime2;
    private javax.swing.JLabel lblUnitTime4;
    private javax.swing.JSpinner spnDis2;
    private javax.swing.JSpinner spnDis3;
    private javax.swing.JSpinner spnMinTime2;
    private javax.swing.JSpinner spnMinTime3;
    private javax.swing.JSpinner spnNumberofLaps2;
    private javax.swing.JSpinner spnNumberofLaps3;
    private javax.swing.JSpinner spnSecTime2;
    private javax.swing.JSpinner spnSecTime3;
    private javax.swing.JTextField txtfldDescription2;
    private javax.swing.JTextField txtfldDescription3;
    private javax.swing.JTextField txtfldWorkoutName;
    // End of variables declaration//GEN-END:variables
}
