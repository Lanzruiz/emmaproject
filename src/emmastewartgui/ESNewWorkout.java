package emmastewartgui;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 

/**
 *
 * @author Emma
 */
public class ESNewWorkout extends javax.swing.JDialog {

    EmmaStewartGUI manager;

    public ESNewWorkout(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }

    public Connection connect() {
        Connection c = null; // instantiation of the connection b/w DB and prgram
        try {
            String url = "jdbc:sqlite:WorkoutDB2.db";
            c = DriverManager.getConnection(url); // get connection
            //Insert label that says "successful".
            System.out.println("SQLite BD connected");
        } catch (SQLException e) {
            //Insert label that prints e.toString(); 
        }
        return c;
    }

    public String calcTotalDis() {

        int totalIntDis = (int) spnDis2.getValue() * (int) spnNumberofLaps2.getValue() + (int) spnDis4.getValue() * (int) spnNumberofLaps4.getValue();
        String totalDis = Integer.toString(totalIntDis);

        return totalDis;
    }

    public String calcTotalTime() {

        int totalSeconds = (((((int) spnMinTime2.getValue() * 60) + (int) spnSecTime2.getValue()) * (int) spnNumberofLaps2.getValue())
                + ((((int) spnMinTime4.getValue() * 60) + (int) spnSecTime4.getValue()) * (int) spnNumberofLaps4.getValue()));
        int hours = totalSeconds / 3600; // forward slash than back slash, not taking hours?? Dunno why. 
        int secAfterHours = totalSeconds % 3600;
        int minutes = secAfterHours / 60;
        int seconds = secAfterHours % 60;
        String totalTime = Integer.toString(hours) + ":" + Integer.toString(minutes) + "." + Integer.toString(seconds);
        System.out.println(minutes);
        System.out.println(totalTime);

        return totalTime;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfldDis3 = new javax.swing.JTextField();
        lblBy3 = new javax.swing.JLabel();
        spnNumberofLaps3 = new javax.swing.JSpinner();
        lblMeterUnit3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbxStroke3 = new javax.swing.JComboBox<>();
        cmbxTime3 = new javax.swing.JComboBox<>();
        txtfldTime3 = new javax.swing.JTextField();
        lblUnitTime3 = new javax.swing.JLabel();
        txtfldDescription3 = new javax.swing.JTextField();
        lblOn2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        cmbxTime2 = new javax.swing.JComboBox<>();
        lblUnitTime2 = new javax.swing.JLabel();
        cmbxStroke2 = new javax.swing.JComboBox<>();
        txtfldDescription2 = new javax.swing.JTextField();
        lblBy2 = new javax.swing.JLabel();
        lblMeterUnit2 = new javax.swing.JLabel();
        spnNumberofLaps2 = new javax.swing.JSpinner();
        btnSave = new javax.swing.JButton();
        txtfldWorkoutName = new javax.swing.JTextField();
        lblNumOrder2 = new javax.swing.JLabel();
        spnNumberofLaps4 = new javax.swing.JSpinner();
        cmbxTime4 = new javax.swing.JComboBox<>();
        lblUnitTime4 = new javax.swing.JLabel();
        cmbxStroke4 = new javax.swing.JComboBox<>();
        txtfldDescription4 = new javax.swing.JTextField();
        lblBy4 = new javax.swing.JLabel();
        lblNumOrder3 = new javax.swing.JLabel();
        lblMeterUnit4 = new javax.swing.JLabel();
        spnDis2 = new javax.swing.JSpinner();
        spnDis4 = new javax.swing.JSpinner();
        spnMinTime2 = new javax.swing.JSpinner();
        lblColon2 = new javax.swing.JLabel();
        lblColon3 = new javax.swing.JLabel();
        spnSecTime2 = new javax.swing.JSpinner();
        spnMinTime4 = new javax.swing.JSpinner();
        spnSecTime4 = new javax.swing.JSpinner();

        txtfldDis3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtfldDis3.setText("0000");
        txtfldDis3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldDis3ActionPerformed(evt);
            }
        });

        lblBy3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy3.setText("x");

        spnNumberofLaps3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblMeterUnit3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit3.setText("m");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("2. ");

        cmbxStroke3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbxTime3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtfldTime3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtfldTime3.setText("00:00");
        txtfldTime3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldTime3ActionPerformed(evt);
            }
        });

        lblUnitTime3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime3.setText("secs");

        txtfldDescription3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription3.setText("Description");

        lblOn2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblOn2.setText("on");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cmbxTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));
        cmbxTime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxTime2ActionPerformed(evt);
            }
        });

        lblUnitTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime2.setText("secs");

        cmbxStroke2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL" }));
        cmbxStroke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxStroke2ActionPerformed(evt);
            }
        });

        txtfldDescription2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription2.setText("Description");
        txtfldDescription2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldDescription2ActionPerformed(evt);
            }
        });

        lblBy2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy2.setText("x");

        lblMeterUnit2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit2.setText("m");

        spnNumberofLaps2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtfldWorkoutName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldWorkoutName.setText("Workout Name");

        lblNumOrder2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder2.setText("1. ");

        spnNumberofLaps4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        cmbxTime4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));
        cmbxTime4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxTime4ActionPerformed(evt);
            }
        });

        lblUnitTime4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime4.setText("secs");

        cmbxStroke4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL" }));
        cmbxStroke4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxStroke4ActionPerformed(evt);
            }
        });

        txtfldDescription4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription4.setText("Description");
        txtfldDescription4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldDescription4ActionPerformed(evt);
            }
        });

        lblBy4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy4.setText("x");

        lblNumOrder3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder3.setText("2. ");

        lblMeterUnit4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit4.setText("m");

        spnDis2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnMinTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime2.setToolTipText("00");
        spnMinTime2.setRequestFocusEnabled(false);

        lblColon2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon2.setText(":");

        lblColon3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon3.setText(":");

        spnSecTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime2.setToolTipText("00");
        spnSecTime2.setRequestFocusEnabled(false);

        spnMinTime4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime4.setToolTipText("00");
        spnMinTime4.setRequestFocusEnabled(false);

        spnSecTime4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime4.setToolTipText("00");
        spnSecTime4.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave)
                    .addComponent(lblNumOrder3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfldDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfldWorkoutName, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spnNumberofLaps4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBy4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnDis4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(lblMeterUnit4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbxStroke4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbxTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnMinTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColon3)
                        .addGap(10, 10, 10)
                        .addComponent(spnSecTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUnitTime4))
                    .addComponent(txtfldDescription4, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(lblUnitTime2)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(lblNumOrder2)
                    .addContainerGap(813, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfldWorkoutName, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMeterUnit2)
                            .addComponent(cmbxStroke2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbxTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnNumberofLaps2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBy2)
                            .addComponent(spnDis2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(spnMinTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColon2)
                        .addComponent(spnSecTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUnitTime2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumOrder3)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUnitTime4)
                                    .addComponent(spnSecTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spnNumberofLaps4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblBy4)
                                .addComponent(lblMeterUnit4)
                                .addComponent(cmbxStroke4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbxTime4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spnDis4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblColon3)
                                .addComponent(spnMinTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addComponent(txtfldDescription4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(lblNumOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(296, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfldDescription2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDescription2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDescription2ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        System.out.println(spnNumberofLaps2.getValue());
        
        int id;

        try {
            Connection c = new EmmaStewartGUI().connect();
            String sqlite = "INSERT into Workout (workoutName, totalDis, totalTime) values (?,?,?)";
            PreparedStatement pdst = new EmmaStewartGUI().connect().prepareStatement(sqlite);
            pdst.setString(1, txtfldWorkoutName.getText());
            pdst.setString(2, calcTotalDis());
            pdst.setString(3, calcTotalTime());
            pdst.executeUpdate();

            String sqlt = "SELECT seq FROM sqlite_sequence WHERE name = 'Workout'";
            PreparedStatement st = c.prepareStatement(sqlt);
            ResultSet rs = st.executeQuery();
            id = rs.getInt("seq");
            System.out.println(rs.getInt("seq"));

            String sql = "INSERT INTO Sets (workoutID, numOrder,numOfLaps,strokeType,setDis,isPB,setTimeMins,setTimeSecs,setDescription) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, lblNumOrder2.getText());
            ps.setString(3, spnNumberofLaps2.getValue().toString());
            ps.setString(4, cmbxStroke2.getSelectedItem().toString());
            ps.setString(5, spnDis2.getValue().toString());
            ps.setString(6, cmbxTime2.getSelectedItem().toString());
            ps.setString(7, spnMinTime2.getValue().toString());// How to make this dependent on when or not it's a PB (cmbxTime2)
            ps.setString(8, spnSecTime2.getValue().toString());
            ps.setString(9, txtfldDescription2.getText());
            ps.executeUpdate();

            PreparedStatement pst;
            pst = c.prepareStatement(sql);
            pst.setInt(1, rs.getInt("seq"));
            pst.setString(2, lblNumOrder3.getText());
            pst.setString(3, spnNumberofLaps4.getValue().toString());
            pst.setString(4, cmbxStroke4.getSelectedItem().toString());
            pst.setString(5, spnDis4.getValue().toString());
            pst.setString(6, cmbxTime4.getSelectedItem().toString());
            pst.setString(7, spnSecTime4.getValue().toString());// How to make this dependant on when or not it's a PB (cmbxTime2)
            pst.setString(8, spnSecTime4.getValue().toString());
            pst.setString(9, txtfldDescription4.getText());
            pst.executeUpdate();

            
            st.close();
            ps.close();
            pst.close();
            pdst.close();
            c.close();
            JOptionPane.showMessageDialog(null, "Saved");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbxStroke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxStroke2ActionPerformed

    }//GEN-LAST:event_cmbxStroke2ActionPerformed

    private void cmbxTime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxTime2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxTime2ActionPerformed

    private void txtfldDis3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDis3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDis3ActionPerformed

    private void txtfldTime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldTime3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldTime3ActionPerformed

    private void cmbxTime4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxTime4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxTime4ActionPerformed

    private void cmbxStroke4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxStroke4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxStroke4ActionPerformed

    private void txtfldDescription4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDescription4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDescription4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void maisn(String args[]) {
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
            java.util.logging.Logger.getLogger(ESNewWorkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ESNewWorkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ESNewWorkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ESNewWorkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbxStroke2;
    private javax.swing.JComboBox<String> cmbxStroke3;
    private javax.swing.JComboBox<String> cmbxStroke4;
    private javax.swing.JComboBox<String> cmbxTime2;
    private javax.swing.JComboBox<String> cmbxTime3;
    private javax.swing.JComboBox<String> cmbxTime4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblBy2;
    private javax.swing.JLabel lblBy3;
    private javax.swing.JLabel lblBy4;
    private javax.swing.JLabel lblColon2;
    private javax.swing.JLabel lblColon3;
    private javax.swing.JLabel lblMeterUnit2;
    private javax.swing.JLabel lblMeterUnit3;
    private javax.swing.JLabel lblMeterUnit4;
    private javax.swing.JLabel lblNumOrder2;
    private javax.swing.JLabel lblNumOrder3;
    private javax.swing.JLabel lblOn2;
    private javax.swing.JLabel lblUnitTime2;
    private javax.swing.JLabel lblUnitTime3;
    private javax.swing.JLabel lblUnitTime4;
    private javax.swing.JSpinner spnDis2;
    private javax.swing.JSpinner spnDis4;
    private javax.swing.JSpinner spnMinTime2;
    private javax.swing.JSpinner spnMinTime4;
    private javax.swing.JSpinner spnNumberofLaps2;
    private javax.swing.JSpinner spnNumberofLaps3;
    private javax.swing.JSpinner spnNumberofLaps4;
    private javax.swing.JSpinner spnSecTime2;
    private javax.swing.JSpinner spnSecTime4;
    private javax.swing.JTextField txtfldDescription2;
    private javax.swing.JTextField txtfldDescription3;
    private javax.swing.JTextField txtfldDescription4;
    private javax.swing.JTextField txtfldDis3;
    private javax.swing.JTextField txtfldTime3;
    private javax.swing.JTextField txtfldWorkoutName;
    // End of variables declaration//GEN-END:variables
}
