package emmastewartgui;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Emma
 */
public class ESEditWorkout extends javax.swing.JDialog {

    EmmaStewartGUI manager;
    ESFrmMain ESFrmMain;
    String Clicked;

    public ESEditWorkout(java.awt.Frame parent, boolean modal, String clickedvalue) {
        super(parent, modal);
        initComponents();
        Clicked = clickedvalue;
        Integer Id;
        Integer setID;
        Integer laps;
        Integer dist;
        String stroke;
        String pb;
        Integer minute;
        Integer seconds;
        String description;
        
        EmmaStewartGUI main = new EmmaStewartGUI();
        System.out.println("Id to be sent" +main.getId(Clicked));
        Id = main.getId(Clicked);
        System.out.println("Id to be lapse" +main.getsetId(Id));
        setID = main.getsetId(Id);
        System.out.println("Lapse" + main.getLapse(setID));
        
        
        //set1    
        
        laps = main.getLapse(setID);
        dist = main.getDist(setID);
        stroke = main.getStroke(setID);
        pb = main.getPB(setID);
        minute = main.getMinute(setID);
        seconds = main.getSeconds(setID);
        description = main.getDescription(setID);
     
        
        txtfldWorkoutName.setText(clickedvalue);
        spnNumberofLaps2.setValue(new Integer(laps));
        spnDis2.setValue(new Integer(dist));
        cmbxStroke2.setSelectedItem(stroke);
        cmbxTime2.setSelectedItem(pb);
        spnMinTime2.setValue(minute);
        spnSecTime2.setValue(seconds);
        txtfldDescription2.setText(description);
        
        // Set2
        int ID_next = setID+1;
        
        laps = main.getLapse(ID_next);
        dist = main.getDist(ID_next);
        stroke = main.getStroke(ID_next);
        pb = main.getPB(ID_next);
        minute = main.getMinute(ID_next);
        seconds = main.getSeconds(ID_next);
        description = main.getDescription(ID_next);
        
        spnNumberofLaps03.setValue(new Integer(laps));
        spnDis03.setValue(new Integer(dist));
        cmbxStroke03.setSelectedItem(stroke);
        cmbxTime03.setSelectedItem(pb);
        spnMinTime03.setValue(minute);
        spnSecTime03.setValue(seconds);
        txtfldDescription03.setText(description);
        
        
        System.out.println(ID_next);
        
        
        System.out.println("Title for Edit Workout: " +Clicked);
    }

    public ESEditWorkout(java.awt.Frame parent, boolean modal, String workoutName, String numOfLaps, String strokeType, String setDis, String isPB, String setDescription, String setTimeMins, String setTimeSecs) {
        //Constructor Parameters: public AddProjectForm(java.awt.Frame parent, boolean modal, String title, String type, String summary)
        super(parent, modal);
        initComponents();
//        try {
            txtfldWorkoutName.setText(workoutName);
//            System.out.println(spnNumberofLaps1.getValue());
            spnNumberofLaps1.setValue(Integer.parseInt(numOfLaps)); //Not getting that from the database3 SYSTEM.OUT IT
            cmbxStroke1.setSelectedItem(strokeType);
            spnDis1.setValue(Integer.parseInt(setDis));
            cmbxTime1.setSelectedItem(isPB);
            txtfldDescription1.setText(setDescription);
            spnMinTime1.setValue(setTimeMins);
            spnSecTime1.setValue(setTimeSecs);

            spnNumberofLaps2.setValue(Integer.parseInt(numOfLaps));
            cmbxStroke2.setSelectedItem(strokeType);
            spnDis2.setValue(Integer.parseInt(setDis));
            cmbxTime2.setSelectedItem(isPB);
            txtfldDescription2.setText(setDescription);
            spnMinTime2.setValue(setTimeMins);
            spnSecTime2.setValue(setTimeSecs);

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

        btnUpdate = new javax.swing.JButton();
        txtfldWorkoutName = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        scrllWorkout = new javax.swing.JScrollPane();
        pnlWorkout = new javax.swing.JPanel();
        cmbxTime1 = new javax.swing.JComboBox<>();
        cmbxStroke1 = new javax.swing.JComboBox<>();
        lblNumOrder1 = new javax.swing.JLabel();
        txtfldDescription1 = new javax.swing.JTextField();
        lblBy5 = new javax.swing.JLabel();
        lblMeterUnit5 = new javax.swing.JLabel();
        spnNumberofLaps1 = new javax.swing.JSpinner();
        lblBy6 = new javax.swing.JLabel();
        spnNumberofLaps2 = new javax.swing.JSpinner();
        lblMeterUnit6 = new javax.swing.JLabel();
        lblNumOrder2 = new javax.swing.JLabel();
        cmbxStroke2 = new javax.swing.JComboBox<>();
        cmbxTime2 = new javax.swing.JComboBox<>();
        txtfldDescription2 = new javax.swing.JTextField();
        cmbxStroke03 = new javax.swing.JComboBox<>();
        lblBy7 = new javax.swing.JLabel();
        lblMeterUnit7 = new javax.swing.JLabel();
        lblNumOrder03 = new javax.swing.JLabel();
        cmbxTime03 = new javax.swing.JComboBox<>();
        spnNumberofLaps03 = new javax.swing.JSpinner();
        txtfldDescription03 = new javax.swing.JTextField();
        lblMeterUnit8 = new javax.swing.JLabel();
        lblBy8 = new javax.swing.JLabel();
        txtfldDescription4 = new javax.swing.JTextField();
        spnNumberofLaps4 = new javax.swing.JSpinner();
        cmbxTime4 = new javax.swing.JComboBox<>();
        lblNumOrder4 = new javax.swing.JLabel();
        cmbxStroke4 = new javax.swing.JComboBox<>();
        lblBy9 = new javax.swing.JLabel();
        spnNumberofLaps5 = new javax.swing.JSpinner();
        lblMeterUnit9 = new javax.swing.JLabel();
        lblNumOrder5 = new javax.swing.JLabel();
        cmbxStroke5 = new javax.swing.JComboBox<>();
        cmbxTime5 = new javax.swing.JComboBox<>();
        txtfldDescription5 = new javax.swing.JTextField();
        lblBy10 = new javax.swing.JLabel();
        spnNumberofLaps6 = new javax.swing.JSpinner();
        lblMeterUnit10 = new javax.swing.JLabel();
        lblNumOrder6 = new javax.swing.JLabel();
        cmbxStroke6 = new javax.swing.JComboBox<>();
        cmbxTime6 = new javax.swing.JComboBox<>();
        txtfldDescription6 = new javax.swing.JTextField();
        lblBy11 = new javax.swing.JLabel();
        spnNumberofLaps7 = new javax.swing.JSpinner();
        lblMeterUnit11 = new javax.swing.JLabel();
        lblNumOrder7 = new javax.swing.JLabel();
        cmbxStroke7 = new javax.swing.JComboBox<>();
        cmbxTime7 = new javax.swing.JComboBox<>();
        txtfldDescription7 = new javax.swing.JTextField();
        lblBy12 = new javax.swing.JLabel();
        spnNumberofLaps8 = new javax.swing.JSpinner();
        lblMeterUnit12 = new javax.swing.JLabel();
        lblNumOrder8 = new javax.swing.JLabel();
        cmbxStroke8 = new javax.swing.JComboBox<>();
        cmbxTime8 = new javax.swing.JComboBox<>();
        txtfldDescription8 = new javax.swing.JTextField();
        lblBy13 = new javax.swing.JLabel();
        spnNumberofLaps9 = new javax.swing.JSpinner();
        lblMeterUnit13 = new javax.swing.JLabel();
        lblNumOrder9 = new javax.swing.JLabel();
        cmbxStroke9 = new javax.swing.JComboBox<>();
        cmbxTime9 = new javax.swing.JComboBox<>();
        txtfldDescription9 = new javax.swing.JTextField();
        lblBy14 = new javax.swing.JLabel();
        lblNumOrder10 = new javax.swing.JLabel();
        cmbxTime10 = new javax.swing.JComboBox<>();
        txtfldDescription10 = new javax.swing.JTextField();
        spnNumberofLaps10 = new javax.swing.JSpinner();
        lblMeterUnit14 = new javax.swing.JLabel();
        cmbxStroke10 = new javax.swing.JComboBox<>();
        lblColon4 = new javax.swing.JLabel();
        spnMinTime1 = new javax.swing.JSpinner();
        spnSecTime1 = new javax.swing.JSpinner();
        lblUnitTime15 = new javax.swing.JLabel();
        lblColon5 = new javax.swing.JLabel();
        spnMinTime2 = new javax.swing.JSpinner();
        spnSecTime2 = new javax.swing.JSpinner();
        lblUnitTime16 = new javax.swing.JLabel();
        lblColon6 = new javax.swing.JLabel();
        spnMinTime03 = new javax.swing.JSpinner();
        spnSecTime03 = new javax.swing.JSpinner();
        lblUnitTime17 = new javax.swing.JLabel();
        lblColon7 = new javax.swing.JLabel();
        spnMinTime4 = new javax.swing.JSpinner();
        spnSecTime4 = new javax.swing.JSpinner();
        lblUnitTime18 = new javax.swing.JLabel();
        lblColon8 = new javax.swing.JLabel();
        spnMinTime5 = new javax.swing.JSpinner();
        spnSecTime5 = new javax.swing.JSpinner();
        lblUnitTime19 = new javax.swing.JLabel();
        lblColon9 = new javax.swing.JLabel();
        spnMinTime6 = new javax.swing.JSpinner();
        spnSecTime6 = new javax.swing.JSpinner();
        lblUnitTime20 = new javax.swing.JLabel();
        lblColon10 = new javax.swing.JLabel();
        spnMinTime7 = new javax.swing.JSpinner();
        spnSecTime7 = new javax.swing.JSpinner();
        lblUnitTime21 = new javax.swing.JLabel();
        lblColon11 = new javax.swing.JLabel();
        spnMinTime8 = new javax.swing.JSpinner();
        spnSecTime8 = new javax.swing.JSpinner();
        lblUnitTime22 = new javax.swing.JLabel();
        lblColon12 = new javax.swing.JLabel();
        spnMinTime9 = new javax.swing.JSpinner();
        spnSecTime9 = new javax.swing.JSpinner();
        lblUnitTime23 = new javax.swing.JLabel();
        lblColon13 = new javax.swing.JLabel();
        spnMinTime10 = new javax.swing.JSpinner();
        spnSecTime10 = new javax.swing.JSpinner();
        lblUnitTime24 = new javax.swing.JLabel();
        spnDis1 = new javax.swing.JSpinner();
        spnDis10 = new javax.swing.JSpinner();
        spnDis9 = new javax.swing.JSpinner();
        spnDis8 = new javax.swing.JSpinner();
        spnDis6 = new javax.swing.JSpinner();
        spnDis7 = new javax.swing.JSpinner();
        spnDis5 = new javax.swing.JSpinner();
        spnDis03 = new javax.swing.JSpinner();
        spnDis2 = new javax.swing.JSpinner();
        spnDis4 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtfldWorkoutName.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        txtfldWorkoutName.setText("Name");
        txtfldWorkoutName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldWorkoutNameActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cmbxTime1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));

        cmbxStroke1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "Choice" }));

        lblNumOrder1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder1.setText("1. ");

        txtfldDescription1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription1.setText("Description");
        txtfldDescription1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldDescription1ActionPerformed(evt);
            }
        });

        lblBy5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy5.setText("x");

        lblMeterUnit5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit5.setText("m");

        spnNumberofLaps1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblBy6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy6.setText("x");

        spnNumberofLaps2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblMeterUnit6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit6.setText("m");

        lblNumOrder2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder2.setText("2. ");

        cmbxStroke2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "Choice" }));

        cmbxTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));

        txtfldDescription2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription2.setText("Description");
        txtfldDescription2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldDescription2ActionPerformed(evt);
            }
        });

        cmbxStroke03.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke03.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "Choice" }));

        lblBy7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy7.setText("x");

        lblMeterUnit7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit7.setText("m");

        lblNumOrder03.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder03.setText("3. ");

        cmbxTime03.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime03.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));

        spnNumberofLaps03.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        txtfldDescription03.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription03.setText("Description");
        txtfldDescription03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldDescription03ActionPerformed(evt);
            }
        });

        lblMeterUnit8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit8.setText("m");

        lblBy8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy8.setText("x");

        txtfldDescription4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription4.setText("Description");

        spnNumberofLaps4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        cmbxTime4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));

        lblNumOrder4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder4.setText("4. ");

        cmbxStroke4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "Choice" }));

        lblBy9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy9.setText("x");

        spnNumberofLaps5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblMeterUnit9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit9.setText("m");

        lblNumOrder5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder5.setText("5. ");

        cmbxStroke5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "Choice" }));

        cmbxTime5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));

        txtfldDescription5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription5.setText("Description");

        lblBy10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy10.setText("x");

        spnNumberofLaps6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblMeterUnit10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit10.setText("m");

        lblNumOrder6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder6.setText("6. ");

        cmbxStroke6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "Choice" }));

        cmbxTime6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));

        txtfldDescription6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription6.setText("Description");

        lblBy11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy11.setText("x");

        spnNumberofLaps7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblMeterUnit11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit11.setText("m");

        lblNumOrder7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder7.setText("7. ");

        cmbxStroke7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "Choice" }));

        cmbxTime7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));

        txtfldDescription7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription7.setText("Description");

        lblBy12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy12.setText("x");

        spnNumberofLaps8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblMeterUnit12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit12.setText("m");

        lblNumOrder8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder8.setText("8. ");

        cmbxStroke8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "Choice" }));

        cmbxTime8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));

        txtfldDescription8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription8.setText("Description");

        lblBy13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy13.setText("x");

        spnNumberofLaps9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblMeterUnit13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit13.setText("m");

        lblNumOrder9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder9.setText("9. ");

        cmbxStroke9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "Choice" }));

        cmbxTime9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));

        txtfldDescription9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription9.setText("Description");

        lblBy14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblBy14.setText("x");

        lblNumOrder10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNumOrder10.setText("10. ");

        cmbxTime10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxTime10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "on", "PB +" }));

        txtfldDescription10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldDescription10.setText("Description");

        spnNumberofLaps10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        lblMeterUnit14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblMeterUnit14.setText("m");

        cmbxStroke10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmbxStroke10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "Choice" }));

        lblColon4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon4.setText(":");

        spnMinTime1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime1.setToolTipText("00");
        spnMinTime1.setRequestFocusEnabled(false);

        spnSecTime1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime1.setToolTipText("00");
        spnSecTime1.setRequestFocusEnabled(false);

        lblUnitTime15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime15.setText("secs");

        lblColon5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon5.setText(":");

        spnMinTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime2.setToolTipText("00");
        spnMinTime2.setRequestFocusEnabled(false);

        spnSecTime2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime2.setToolTipText("00");
        spnSecTime2.setRequestFocusEnabled(false);

        lblUnitTime16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime16.setText("secs");

        lblColon6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon6.setText(":");

        spnMinTime03.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime03.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime03.setToolTipText("00");
        spnMinTime03.setRequestFocusEnabled(false);

        spnSecTime03.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime03.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime03.setToolTipText("00");
        spnSecTime03.setRequestFocusEnabled(false);

        lblUnitTime17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime17.setText("secs");

        lblColon7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon7.setText(":");

        spnMinTime4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime4.setToolTipText("00");
        spnMinTime4.setRequestFocusEnabled(false);

        spnSecTime4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime4.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime4.setToolTipText("00");
        spnSecTime4.setRequestFocusEnabled(false);

        lblUnitTime18.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime18.setText("secs");

        lblColon8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon8.setText(":");

        spnMinTime5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime5.setToolTipText("00");
        spnMinTime5.setRequestFocusEnabled(false);

        spnSecTime5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime5.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime5.setToolTipText("00");
        spnSecTime5.setRequestFocusEnabled(false);

        lblUnitTime19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime19.setText("secs");

        lblColon9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon9.setText(":");

        spnMinTime6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime6.setToolTipText("00");
        spnMinTime6.setRequestFocusEnabled(false);

        spnSecTime6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime6.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime6.setToolTipText("00");
        spnSecTime6.setRequestFocusEnabled(false);

        lblUnitTime20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime20.setText("secs");

        lblColon10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon10.setText(":");

        spnMinTime7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime7.setToolTipText("00");
        spnMinTime7.setRequestFocusEnabled(false);

        spnSecTime7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime7.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime7.setToolTipText("00");
        spnSecTime7.setRequestFocusEnabled(false);

        lblUnitTime21.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime21.setText("secs");

        lblColon11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon11.setText(":");

        spnMinTime8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime8.setToolTipText("00");
        spnMinTime8.setRequestFocusEnabled(false);

        spnSecTime8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime8.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime8.setToolTipText("00");
        spnSecTime8.setRequestFocusEnabled(false);

        lblUnitTime22.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime22.setText("secs");

        lblColon12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon12.setText(":");

        spnMinTime9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime9.setToolTipText("00");
        spnMinTime9.setRequestFocusEnabled(false);

        spnSecTime9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime9.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime9.setToolTipText("00");
        spnSecTime9.setRequestFocusEnabled(false);

        lblUnitTime23.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime23.setText("secs");

        lblColon13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon13.setText(":");

        spnMinTime10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnMinTime10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnMinTime10.setToolTipText("00");
        spnMinTime10.setRequestFocusEnabled(false);

        spnSecTime10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnSecTime10.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnSecTime10.setToolTipText("00");
        spnSecTime10.setRequestFocusEnabled(false);

        lblUnitTime24.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblUnitTime24.setText("secs");

        spnDis1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis03.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        spnDis4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        javax.swing.GroupLayout pnlWorkoutLayout = new javax.swing.GroupLayout(pnlWorkout);
        pnlWorkout.setLayout(pnlWorkoutLayout);
        pnlWorkoutLayout.setHorizontalGroup(
            pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWorkoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addComponent(lblNumOrder10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfldDescription10, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                .addComponent(spnNumberofLaps10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBy14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnDis10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMeterUnit14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbxStroke10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbxTime10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnMinTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon13)
                                .addGap(10, 10, 10)
                                .addComponent(spnSecTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUnitTime24))))
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                    .addComponent(lblNumOrder8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtfldDescription8, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                            .addComponent(spnNumberofLaps8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBy12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spnDis8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMeterUnit12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbxStroke8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbxTime8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnMinTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon11)
                                            .addGap(10, 10, 10)
                                            .addComponent(spnSecTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblUnitTime22))))
                                .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                    .addComponent(lblNumOrder7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtfldDescription7, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                            .addComponent(spnNumberofLaps7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBy11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnDis7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                    .addComponent(lblMeterUnit11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbxStroke7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbxTime7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnMinTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon10)
                                    .addGap(10, 10, 10)
                                    .addComponent(spnSecTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblUnitTime21))
                                .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                    .addComponent(lblNumOrder6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtfldDescription6, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                            .addComponent(spnNumberofLaps6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBy10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnDis6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblMeterUnit10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbxStroke6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbxTime6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnMinTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon9)
                                            .addGap(10, 10, 10)
                                            .addComponent(spnSecTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblUnitTime20))))
                                .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                    .addComponent(lblNumOrder5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtfldDescription5, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                            .addComponent(spnNumberofLaps5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBy9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnDis5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMeterUnit9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbxStroke5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbxTime5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnMinTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon8)
                                            .addGap(10, 10, 10)
                                            .addComponent(spnSecTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblUnitTime19)))))
                            .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                .addComponent(lblNumOrder9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfldDescription9, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                        .addComponent(spnNumberofLaps9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBy13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnDis9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMeterUnit13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbxStroke9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbxTime9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnMinTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblColon12)
                                        .addGap(10, 10, 10)
                                        .addComponent(spnSecTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUnitTime23))))
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWorkoutLayout.createSequentialGroup()
                                    .addComponent(lblNumOrder2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtfldDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                            .addComponent(spnNumberofLaps2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBy6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spnDis2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMeterUnit6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbxStroke2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbxTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnMinTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon5)
                                            .addGap(18, 18, 18)
                                            .addComponent(spnSecTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(lblUnitTime16)))
                                    .addGap(10, 10, 10))
                                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWorkoutLayout.createSequentialGroup()
                                        .addComponent(lblNumOrder4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtfldDescription4, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                                .addComponent(spnNumberofLaps4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBy8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnDis4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblMeterUnit8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbxStroke4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbxTime4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnMinTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblColon7)
                                                .addGap(10, 10, 10)
                                                .addComponent(spnSecTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblUnitTime18)))
                                        .addGap(10, 10, 10))
                                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                                .addComponent(lblNumOrder03)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                                        .addComponent(spnNumberofLaps03, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblBy7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(spnDis03, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblMeterUnit7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmbxStroke03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmbxTime03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(spnMinTime03, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblColon6)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(spnSecTime03, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lblUnitTime17))
                                                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(txtfldDescription03, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                                .addComponent(lblNumOrder1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtfldDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWorkoutLayout.createSequentialGroup()
                                                        .addComponent(spnNumberofLaps1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblBy5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(spnDis1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblMeterUnit5)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmbxStroke1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmbxTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(spnMinTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblColon4)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(spnSecTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lblUnitTime15)))))))))))
                .addContainerGap(558, Short.MAX_VALUE))
        );
        pnlWorkoutLayout.setVerticalGroup(
            pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWorkoutLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy5)
                        .addComponent(lblMeterUnit5)
                        .addComponent(cmbxStroke1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbxTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnDis1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUnitTime15)
                            .addComponent(spnSecTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColon4)
                        .addComponent(spnMinTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy6)
                        .addComponent(lblMeterUnit6)
                        .addComponent(cmbxStroke2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbxTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnDis2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlWorkoutLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUnitTime16)
                                .addComponent(spnSecTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColon5)
                            .addComponent(spnMinTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder03, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy7))
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMeterUnit7)
                        .addComponent(cmbxStroke03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbxTime03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnDis03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUnitTime17)
                            .addComponent(spnSecTime03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColon6)
                        .addComponent(spnMinTime03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription03, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy8))
                    .addComponent(spnDis4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMeterUnit8)
                        .addComponent(cmbxStroke4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbxTime4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUnitTime18)
                            .addComponent(spnSecTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColon7)
                        .addComponent(spnMinTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy9)
                        .addComponent(spnNumberofLaps5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbxStroke5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbxTime5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMeterUnit9)
                                .addComponent(spnDis5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUnitTime19)
                                    .addComponent(spnSecTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblColon8)
                                .addComponent(spnMinTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy10)
                        .addComponent(lblMeterUnit10)
                        .addComponent(cmbxStroke6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbxTime6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnDis6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlWorkoutLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUnitTime20)
                                .addComponent(spnSecTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColon9)
                            .addComponent(spnMinTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy11)
                        .addComponent(lblMeterUnit11)
                        .addComponent(cmbxStroke7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbxTime7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnDis7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUnitTime21)
                            .addComponent(spnSecTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColon10)
                        .addComponent(spnMinTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy12)
                        .addComponent(spnDis8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMeterUnit12)
                            .addComponent(cmbxStroke8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbxTime8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlWorkoutLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUnitTime22)
                                .addComponent(spnSecTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColon11)
                            .addComponent(spnMinTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(txtfldDescription8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy13)
                        .addComponent(spnDis9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMeterUnit13)
                            .addComponent(cmbxStroke9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbxTime9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlWorkoutLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUnitTime23)
                                .addComponent(spnSecTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColon12)
                            .addComponent(spnMinTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(txtfldDescription9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblNumOrder10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spnNumberofLaps10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblBy14)
                                .addComponent(lblMeterUnit14)
                                .addComponent(cmbxStroke10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbxTime10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spnDis10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblUnitTime24)
                                        .addComponent(spnSecTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblColon13)
                                    .addComponent(spnMinTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfldDescription10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrllWorkout.setViewportView(pnlWorkout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrllWorkout, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfldWorkoutName, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfldWorkoutName, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrllWorkout, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        System.out.println("Update:" +Clicked);
        EmmaStewartGUI mainClass = new EmmaStewartGUI();
        System.out.println(mainClass.getId(Clicked));
        System.out.println("Id to the workout to update: " +mainClass.getId(Clicked));
        
        Integer laps = Integer.parseInt(spnNumberofLaps2.getValue().toString());
        Integer dis = Integer.parseInt(spnDis2.getValue().toString());
        Integer setId = mainClass.getsetId(mainClass.getId(Clicked));
        String stroke = (String)cmbxStroke2.getSelectedItem();
        String pb = (String)cmbxTime2.getSelectedItem();
        Integer minutes = Integer.parseInt(spnMinTime2.getValue().toString());
        Integer seconds = Integer.parseInt(spnSecTime2.getValue().toString());
        String description = (String)txtfldDescription2.getText();
        
        System.out.println("This is pb:" +pb);
        
        mainClass.updateItem(txtfldWorkoutName.getText(), mainClass.getId(Clicked), laps, dis, stroke, pb, minutes, seconds, description, setId);
        
        //Set 2
        
        laps = Integer.parseInt(spnNumberofLaps03.getValue().toString());
        dis = Integer.parseInt(spnDis03.getValue().toString());
        setId = mainClass.getsetId(mainClass.getId(Clicked));
        stroke = (String)cmbxStroke03.getSelectedItem();
        pb = (String)cmbxTime03.getSelectedItem();
        minutes = Integer.parseInt(spnMinTime03.getValue().toString());
        seconds = Integer.parseInt(spnSecTime03.getValue().toString());
        description = (String)txtfldDescription03.getText();
        
        System.out.println("This is pb:" +pb);
        
        mainClass.updateItem(txtfldWorkoutName.getText(), mainClass.getId(Clicked), laps, dis, stroke, pb, minutes, seconds, description, setId+1);
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtfldWorkoutNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldWorkoutNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldWorkoutNameActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtfldDescription1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDescription1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDescription1ActionPerformed

    private void txtfldDescription2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDescription2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDescription2ActionPerformed

    private void txtfldDescription03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDescription03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDescription03ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbxStroke03;
    private javax.swing.JComboBox<String> cmbxStroke1;
    private javax.swing.JComboBox<String> cmbxStroke10;
    private javax.swing.JComboBox<String> cmbxStroke2;
    private javax.swing.JComboBox<String> cmbxStroke4;
    private javax.swing.JComboBox<String> cmbxStroke5;
    private javax.swing.JComboBox<String> cmbxStroke6;
    private javax.swing.JComboBox<String> cmbxStroke7;
    private javax.swing.JComboBox<String> cmbxStroke8;
    private javax.swing.JComboBox<String> cmbxStroke9;
    private javax.swing.JComboBox<String> cmbxTime03;
    private javax.swing.JComboBox<String> cmbxTime1;
    private javax.swing.JComboBox<String> cmbxTime10;
    private javax.swing.JComboBox<String> cmbxTime2;
    private javax.swing.JComboBox<String> cmbxTime4;
    private javax.swing.JComboBox<String> cmbxTime5;
    private javax.swing.JComboBox<String> cmbxTime6;
    private javax.swing.JComboBox<String> cmbxTime7;
    private javax.swing.JComboBox<String> cmbxTime8;
    private javax.swing.JComboBox<String> cmbxTime9;
    private javax.swing.JLabel lblBy10;
    private javax.swing.JLabel lblBy11;
    private javax.swing.JLabel lblBy12;
    private javax.swing.JLabel lblBy13;
    private javax.swing.JLabel lblBy14;
    private javax.swing.JLabel lblBy5;
    private javax.swing.JLabel lblBy6;
    private javax.swing.JLabel lblBy7;
    private javax.swing.JLabel lblBy8;
    private javax.swing.JLabel lblBy9;
    private javax.swing.JLabel lblColon10;
    private javax.swing.JLabel lblColon11;
    private javax.swing.JLabel lblColon12;
    private javax.swing.JLabel lblColon13;
    private javax.swing.JLabel lblColon4;
    private javax.swing.JLabel lblColon5;
    private javax.swing.JLabel lblColon6;
    private javax.swing.JLabel lblColon7;
    private javax.swing.JLabel lblColon8;
    private javax.swing.JLabel lblColon9;
    private javax.swing.JLabel lblMeterUnit10;
    private javax.swing.JLabel lblMeterUnit11;
    private javax.swing.JLabel lblMeterUnit12;
    private javax.swing.JLabel lblMeterUnit13;
    private javax.swing.JLabel lblMeterUnit14;
    private javax.swing.JLabel lblMeterUnit5;
    private javax.swing.JLabel lblMeterUnit6;
    private javax.swing.JLabel lblMeterUnit7;
    private javax.swing.JLabel lblMeterUnit8;
    private javax.swing.JLabel lblMeterUnit9;
    private javax.swing.JLabel lblNumOrder03;
    private javax.swing.JLabel lblNumOrder1;
    private javax.swing.JLabel lblNumOrder10;
    private javax.swing.JLabel lblNumOrder2;
    private javax.swing.JLabel lblNumOrder4;
    private javax.swing.JLabel lblNumOrder5;
    private javax.swing.JLabel lblNumOrder6;
    private javax.swing.JLabel lblNumOrder7;
    private javax.swing.JLabel lblNumOrder8;
    private javax.swing.JLabel lblNumOrder9;
    private javax.swing.JLabel lblUnitTime15;
    private javax.swing.JLabel lblUnitTime16;
    private javax.swing.JLabel lblUnitTime17;
    private javax.swing.JLabel lblUnitTime18;
    private javax.swing.JLabel lblUnitTime19;
    private javax.swing.JLabel lblUnitTime20;
    private javax.swing.JLabel lblUnitTime21;
    private javax.swing.JLabel lblUnitTime22;
    private javax.swing.JLabel lblUnitTime23;
    private javax.swing.JLabel lblUnitTime24;
    private javax.swing.JPanel pnlWorkout;
    private javax.swing.JScrollPane scrllWorkout;
    private javax.swing.JSpinner spnDis03;
    private javax.swing.JSpinner spnDis1;
    private javax.swing.JSpinner spnDis10;
    private javax.swing.JSpinner spnDis2;
    private javax.swing.JSpinner spnDis4;
    private javax.swing.JSpinner spnDis5;
    private javax.swing.JSpinner spnDis6;
    private javax.swing.JSpinner spnDis7;
    private javax.swing.JSpinner spnDis8;
    private javax.swing.JSpinner spnDis9;
    private javax.swing.JSpinner spnMinTime03;
    private javax.swing.JSpinner spnMinTime1;
    private javax.swing.JSpinner spnMinTime10;
    private javax.swing.JSpinner spnMinTime2;
    private javax.swing.JSpinner spnMinTime4;
    private javax.swing.JSpinner spnMinTime5;
    private javax.swing.JSpinner spnMinTime6;
    private javax.swing.JSpinner spnMinTime7;
    private javax.swing.JSpinner spnMinTime8;
    private javax.swing.JSpinner spnMinTime9;
    private javax.swing.JSpinner spnNumberofLaps03;
    private javax.swing.JSpinner spnNumberofLaps1;
    private javax.swing.JSpinner spnNumberofLaps10;
    private javax.swing.JSpinner spnNumberofLaps2;
    private javax.swing.JSpinner spnNumberofLaps4;
    private javax.swing.JSpinner spnNumberofLaps5;
    private javax.swing.JSpinner spnNumberofLaps6;
    private javax.swing.JSpinner spnNumberofLaps7;
    private javax.swing.JSpinner spnNumberofLaps8;
    private javax.swing.JSpinner spnNumberofLaps9;
    private javax.swing.JSpinner spnSecTime03;
    private javax.swing.JSpinner spnSecTime1;
    private javax.swing.JSpinner spnSecTime10;
    private javax.swing.JSpinner spnSecTime2;
    private javax.swing.JSpinner spnSecTime4;
    private javax.swing.JSpinner spnSecTime5;
    private javax.swing.JSpinner spnSecTime6;
    private javax.swing.JSpinner spnSecTime7;
    private javax.swing.JSpinner spnSecTime8;
    private javax.swing.JSpinner spnSecTime9;
    private javax.swing.JTextField txtfldDescription03;
    private javax.swing.JTextField txtfldDescription1;
    private javax.swing.JTextField txtfldDescription10;
    private javax.swing.JTextField txtfldDescription2;
    private javax.swing.JTextField txtfldDescription4;
    private javax.swing.JTextField txtfldDescription5;
    private javax.swing.JTextField txtfldDescription6;
    private javax.swing.JTextField txtfldDescription7;
    private javax.swing.JTextField txtfldDescription8;
    private javax.swing.JTextField txtfldDescription9;
    private javax.swing.JTextField txtfldWorkoutName;
    // End of variables declaration//GEN-END:variables
}
