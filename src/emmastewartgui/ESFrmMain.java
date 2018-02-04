package emmastewartgui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Emma
 */
public class ESFrmMain extends javax.swing.JFrame {

    EmmaStewartGUI manager;
    ESWorkout workoutDetails;
    ESSet setDetails;

    public ESFrmMain(EmmaStewartGUI someWorkout) {
        initComponents();
        manager = someWorkout;
        manager.selectAll("Workout", "workoutName", lstWorkouts);
        this.populateListWorkout();

        this.addWindowListener(new WindowAdapter() {
            public void windowActivated(WindowEvent we) {
                populateListWorkout();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSwimSavvy = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstWorkouts = new javax.swing.JList<>();
        btnEdit = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSwimSavvy.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        lblSwimSavvy.setText("SwimSavvy");

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lstWorkouts.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lstWorkouts.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstWorkouts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstWorkoutsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstWorkouts);

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnProfile.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnProfile.setText("PROFILE");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSwimSavvy)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1060, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lblSwimSavvy)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(694, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
//        String clicked = lstWorkouts.getSelectedValue();
//        String id = manager.selectItem("Workout", "workoutID", "workoutName", clicked);
        ESEditWorkout dlg = new ESEditWorkout(this, true, lstWorkouts.getSelectedValue(),
                manager.selectItem("Sets", "numOfLaps", "workoutID", lstWorkouts.getSelectedValue()),
                manager.selectItem("Sets", "strokeType", "workoutID", lstWorkouts.getSelectedValue()),
                manager.selectItem("Sets", "setDis", "workoutID", lstWorkouts.getSelectedValue()),
                manager.selectItem("Sets", "isPB", "workoutID", lstWorkouts.getSelectedValue()),
                manager.selectItem("Sets", "setDescription", "workoutID", lstWorkouts.getSelectedValue()),
                manager.selectItem("Sets", "setTimeMins", "workoutID", lstWorkouts.getSelectedValue()),
                manager.selectItem("Sets", "setTimeSecs", "workoutID", lstWorkouts.getSelectedValue()));

        //BACKEND.selectItem(TABLENAME, COLUMNWHERETHINGIS, COLUMNFORFILTERING, WHATYOUARELOOKINGFORINCOLUMNFORFILTERINGSOTHATITFILTERS)
        dlg.setVisible(true);
        //projectList.getSelectedValue(), storyboard.selectItem("Projects", "Type", "Title", projectList.getSelectedValue()), storyboard.selectItem("Projects", "Summary", "Title", projectList.getSelectedValue()));
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        String clicked = lstWorkouts.getSelectedValue();
        String setID = manager.selectItem("Workout", "workoutID", "workoutName", clicked);
        String sMins = manager.selectItem("Sets", "setTimeMins", "workoutID", setID);
        String sSecs = manager.selectItem("Sets", "setTimeSecs", "workoutID", setID);

        //Set the Workout Name Label to be what is saved in the database
        String workoutName = manager.selectItem("Workout", "workoutName", "workoutID", setID);
        
        //Get the rest of the setDetails 
        String numOrder = manager.selectItem("Sets", "numOrder", "workoutID", setID);
        String numOfLaps = manager.selectItem("Sets", "numOfLaps", "workoutID", setID);
        String setDis = manager.selectItem("Sets", "setDis", "workoutID", setID);
        String strokeType = manager.selectItem("Sets", "strokeType", "workoutID", setID);
        String setDescription = manager.selectItem("Sets", "setDescription", "workoutID", setID);

        //Now take the stuff you just got from the database and set it to the values in your object
        ESSet setDetails = new ESSet();
        ESWorkout workoutDetails = new ESWorkout();
        setDetails.setTimeMins = Integer.parseInt(sMins);
        setDetails.setTimeSecs = Integer.parseInt(sSecs);
        setDetails.setID = Integer.parseInt(setID);

        workoutDetails.workoutName = workoutName;
        setDetails.numOrder = Integer.parseInt(numOrder);
        setDetails.numOfLaps = Integer.parseInt(numOfLaps);
        setDetails.setDis = setDis;
        setDetails.strokeType = strokeType;
        setDetails.setDescription = setDescription;
               
        System.out.println("setID: " + setDetails.setID);
        System.out.println("numOfLaps: " + setDetails.numOfLaps);
        System.out.println("Instructions: " + (numOfLaps) + " x " + String.valueOf(setDis) + "m "
                + strokeType + " on " + String.valueOf(sMins) + ":" + String.valueOf(sSecs));
        System.out.println("Description: " + setDescription);

        ESGuiRunWorkout dlg = new ESGuiRunWorkout(this, setDetails, true);
        dlg.setVisible(true);        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        ESGuiPersonalInfo dlg = new ESGuiPersonalInfo(this, true);
        dlg.setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        ESNewWorkout dlg = new ESNewWorkout(this, true);
        dlg.setVisible(true);
        //int workoutID = workoutID + 1;

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String clicked = lstWorkouts.getSelectedValue();
        String id = manager.selectItem("Workout", "workoutID", "workoutName", clicked);
        manager.deleteItem("Workout", "workoutName", "workoutID", clicked, id);
        manager.deleteItem("Sets", "workoutID", id);
        JOptionPane.showMessageDialog(null, "Workout deleted!");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lstWorkoutsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstWorkoutsMouseClicked
        try {
            String clicked = lstWorkouts.getSelectedValue();
            String sqlite = "select * from Workout where workoutID = '" + clicked + "'";
            PreparedStatement pst = new EmmaStewartGUI().connect().prepareStatement(sqlite);
            ResultSet rs = pst.executeQuery();
            pst.close();
            manager.connect().close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_lstWorkoutsMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked

    }//GEN-LAST:event_btnEditMouseClicked

    public void populateListWorkout() {
        try {
            DefaultListModel DLM = new DefaultListModel();
            String sql = "select * from Workout";
            PreparedStatement pst = new EmmaStewartGUI().connect().prepareStatement(sql);
            //Prepared statement is equal to the called method of connecting to the database 
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                //this will loop through the whole list                
                String workoutName = rs.getString("workoutName");
                //Make a variable called workoutName. Get and assign the real value of workoutName to it 
                String totalDis = rs.getString("totalDis");
                String totalTime = rs.getString("totalTime");
                ESWorkout workout = new ESWorkout();
                //Instantiate a new workout       
                workout.setWorkoutName(/*"TD: " + rs.getString("totalDis") + "  TT: " +  rs.getString("totalTime") + "          " + */rs.getString("workoutName"));
                //Get the name of said workout
                DLM.addElement(workout.getWorkoutName());
                //Add it to the Default List Model 
            }
            lstWorkouts.setModel(DLM);
            //Set the DLM to the JList in the GUI
            pst.close();
            manager.connect().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
            java.util.logging.Logger.getLogger(ESFrmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ESFrmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ESFrmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ESFrmMain.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ESFrmMain(new EmmaStewartGUI()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnStart;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSwimSavvy;
    private javax.swing.JList<String> lstWorkouts;
    // End of variables declaration//GEN-END:variables
}
