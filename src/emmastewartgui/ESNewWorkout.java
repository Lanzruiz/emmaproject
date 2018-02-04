
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

        int totalIntDis = (int) spnDis1.getValue() * (int) spnNumberofLaps1.getValue() + (int) spnDis2.getValue() * (int) spnNumberofLaps2.getValue()
                + (int) spnDis03.getValue() * (int) spnNumberofLaps03.getValue() + (int) spnDis4.getValue() * (int) spnNumberofLaps4.getValue()
                + (int) spnDis5.getValue() * (int) spnNumberofLaps5.getValue() + (int) spnDis6.getValue() * (int) spnNumberofLaps6.getValue()
                + (int) spnDis7.getValue() * (int) spnNumberofLaps7.getValue() + (int) spnDis8.getValue() * (int) spnNumberofLaps8.getValue()
                + (int) spnDis9.getValue() * (int) spnNumberofLaps9.getValue() + (int) spnDis10.getValue() * (int) spnNumberofLaps10.getValue();
        String totalDis = Integer.toString(totalIntDis);

        return totalDis;
    }

    public String calcTotalTime() {

        int totalSeconds = (((((int) spnMinTime1.getValue() * 60) + (int) spnSecTime1.getValue()) * (int) spnNumberofLaps1.getValue())
                + ((((int) spnMinTime2.getValue() * 60) + (int) spnSecTime2.getValue()) * (int) spnNumberofLaps2.getValue()) +
                ((((int) spnMinTime03.getValue() * 60) + (int) spnSecTime03.getValue()) * (int) spnNumberofLaps03.getValue())
                + ((((int) spnMinTime4.getValue() * 60) + (int) spnSecTime4.getValue()) * (int) spnNumberofLaps4.getValue())
                + ((((int) spnMinTime5.getValue() * 60) + (int) spnSecTime5.getValue()) * (int) spnNumberofLaps5.getValue())
                + ((((int) spnMinTime6.getValue() * 60) + (int) spnSecTime6.getValue()) * (int) spnNumberofLaps6.getValue())
                + ((((int) spnMinTime7.getValue() * 60) + (int) spnSecTime7.getValue()) * (int) spnNumberofLaps7.getValue())
                + ((((int) spnMinTime8.getValue() * 60) + (int) spnSecTime8.getValue()) * (int) spnNumberofLaps8.getValue())
                + ((((int) spnMinTime9.getValue() * 60) + (int) spnSecTime9.getValue()) * (int) spnNumberofLaps9.getValue())
                + ((((int) spnMinTime10.getValue() * 60) + (int) spnSecTime10.getValue()) * (int) spnNumberofLaps10.getValue()));
        
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
        btnSave = new javax.swing.JButton();
        txtfldWorkoutName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
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
        btnSave1 = new javax.swing.JButton();

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

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtfldWorkoutName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldWorkoutName.setText("Workout Name");

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
        cmbxStroke7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FR", "BK", "BR", "FL", "Form", "ChoiceR", "FL" }));

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
                        .addGap(13, 13, 13)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlWorkoutLayout.createSequentialGroup()
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnSecTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUnitTime16)
                                        .addContainerGap(214, Short.MAX_VALUE))))
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnSecTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUnitTime15)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                        .addComponent(lblNumOrder03)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtfldDescription03, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnSecTime03, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblUnitTime17))))
                                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                        .addComponent(lblNumOrder4)
                                        .addGap(18, 18, 18)
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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnSecTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblUnitTime18))))
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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(spnSecTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblUnitTime19)))))
                                .addContainerGap())))
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
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
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
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnSecTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblUnitTime22)
                                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                                            .addComponent(spnDis7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblMeterUnit11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbxStroke7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cmbxTime7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnMinTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnSecTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblUnitTime21)))
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlWorkoutLayout.createSequentialGroup()
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblMeterUnit10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbxStroke6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbxTime6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnMinTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblColon9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnSecTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUnitTime20)
                                        .addContainerGap(266, Short.MAX_VALUE))))
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
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnSecTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblUnitTime23)))
                                .addContainerGap())))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnSecTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUnitTime24)
                                .addGap(1, 1, 1)))
                        .addContainerGap(267, Short.MAX_VALUE))))
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
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColon4)
                        .addComponent(spnMinTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUnitTime15)
                        .addComponent(spnSecTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(txtfldDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy6)
                        .addComponent(lblMeterUnit6)
                        .addComponent(cmbxStroke2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbxTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnDis2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColon5)
                            .addComponent(spnMinTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUnitTime16)
                            .addComponent(spnSecTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
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
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColon6)
                        .addComponent(spnMinTime03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUnitTime17)
                        .addComponent(spnSecTime03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(txtfldDescription03, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblColon7)
                        .addComponent(spnMinTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUnitTime18)
                        .addComponent(spnSecTime4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
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
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblColon8)
                                .addComponent(spnMinTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUnitTime19)
                                .addComponent(spnSecTime5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15)
                .addComponent(txtfldDescription5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy10)
                        .addComponent(lblMeterUnit10)
                        .addComponent(cmbxStroke6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbxTime6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnDis6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColon9)
                            .addComponent(spnMinTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUnitTime20)
                            .addComponent(spnSecTime6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumOrder7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMeterUnit11)
                            .addComponent(spnNumberofLaps7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBy11)
                            .addComponent(spnDis7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cmbxStroke7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbxTime7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColon10)
                            .addComponent(spnMinTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUnitTime21)
                            .addComponent(spnSecTime7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDescription7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy12)
                        .addComponent(spnDis8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMeterUnit12)
                                .addComponent(cmbxStroke8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbxTime8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblColon11)
                                .addComponent(spnMinTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUnitTime22)
                                .addComponent(spnSecTime8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
                .addGap(15, 15, 15)
                .addComponent(txtfldDescription8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumOrder9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(spnNumberofLaps9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBy13)
                        .addComponent(spnDis9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlWorkoutLayout.createSequentialGroup()
                        .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMeterUnit13)
                                .addComponent(cmbxStroke9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbxTime9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblColon12)
                                .addComponent(spnMinTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUnitTime23)
                                .addComponent(spnSecTime9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
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
                            .addGroup(pnlWorkoutLayout.createSequentialGroup()
                                .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblColon13)
                                    .addComponent(spnMinTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlWorkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblUnitTime24)
                                        .addComponent(spnSecTime10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfldDescription10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlWorkout);

        btnSave1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSave1.setText("CANCEL");
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtfldWorkoutName, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfldWorkoutName, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btnSave1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    
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
            PreparedStatement ps1 = c.prepareStatement(sql);
            ps1.setInt(1, id);
            ps1.setString(2, lblNumOrder1.getText());
            ps1.setString(3, spnNumberofLaps1.getValue().toString());
            ps1.setString(4, cmbxStroke1.getSelectedItem().toString());
            ps1.setString(5, spnDis1.getValue().toString());
            ps1.setString(6, cmbxTime1.getSelectedItem().toString());
            ps1.setString(7, spnMinTime1.getValue().toString());// How to make this dependent on when or not it's a PB (cmbxTime2)
            ps1.setString(8, spnSecTime1.getValue().toString());
            ps1.setString(9, txtfldDescription1.getText());
            ps1.executeUpdate();

            PreparedStatement ps2 = c.prepareStatement(sql);
            ps2.setInt(1, rs.getInt("seq"));
            ps2.setString(2, lblNumOrder2.getText());
            ps2.setString(3, spnNumberofLaps2.getValue().toString());
            ps2.setString(4, cmbxStroke2.getSelectedItem().toString());
            ps2.setString(5, spnDis2.getValue().toString());
            ps2.setString(6, cmbxTime2.getSelectedItem().toString());
            ps2.setString(7, spnMinTime2.getValue().toString());// How to make this dependant on when or not it's a PB (cmbxTime2)
            ps2.setString(8, spnSecTime2.getValue().toString());
            ps2.setString(9, txtfldDescription2.getText());
            ps2.executeUpdate();

            PreparedStatement ps3 = c.prepareStatement(sql);
            ps3.setInt(1, rs.getInt("seq"));
            ps3.setString(2, lblNumOrder03.getText());
            ps3.setString(3, spnNumberofLaps03.getValue().toString());
            ps3.setString(4, cmbxStroke03.getSelectedItem().toString());
            ps3.setString(5, spnDis03.getValue().toString());
            ps3.setString(6, cmbxTime03.getSelectedItem().toString());
            ps3.setString(7, spnMinTime03.getValue().toString());// How to make this dependant on when or not it's a PB (cmbxTime2)
            ps3.setString(8, spnSecTime03.getValue().toString());
            ps3.setString(9, txtfldDescription03.getText());
            ps3.executeUpdate();

            PreparedStatement ps4;
            ps4 = c.prepareStatement(sql);
            ps4.setInt(1, rs.getInt("seq"));
            ps4.setString(2, lblNumOrder4.getText());
            ps4.setString(3, spnNumberofLaps4.getValue().toString());
            ps4.setString(4, cmbxStroke4.getSelectedItem().toString());
            ps4.setString(5, spnDis4.getValue().toString());
            ps4.setString(6, cmbxTime4.getSelectedItem().toString());
            ps4.setString(7, spnMinTime4.getValue().toString());// How to make this dependant on when or not it's a PB (cmbxTime2)
            ps4.setString(8, spnSecTime4.getValue().toString());
            ps4.setString(9, txtfldDescription4.getText());
            ps4.executeUpdate();

            PreparedStatement ps5 = c.prepareStatement(sql);
            ps5.setInt(1, rs.getInt("seq"));
            ps5.setString(2, lblNumOrder5.getText());
            ps5.setString(3, spnNumberofLaps5.getValue().toString());
            ps5.setString(4, cmbxStroke5.getSelectedItem().toString());
            ps5.setString(5, spnDis5.getValue().toString());
            ps5.setString(6, cmbxTime5.getSelectedItem().toString());
            ps5.setString(7, spnMinTime5.getValue().toString());// How to make this dependant on when or not it's a PB (cmbxTime2)
            ps5.setString(8, spnSecTime5.getValue().toString());
            ps5.setString(9, txtfldDescription5.getText());
            ps5.executeUpdate();

            PreparedStatement ps6 = c.prepareStatement(sql);
            ps6.setInt(1, rs.getInt("seq"));
            ps6.setString(2, lblNumOrder6.getText());
            ps6.setString(3, spnNumberofLaps6.getValue().toString());
            ps6.setString(4, cmbxStroke6.getSelectedItem().toString());
            ps6.setString(5, spnDis6.getValue().toString());
            ps6.setString(6, cmbxTime6.getSelectedItem().toString());
            ps6.setString(7, spnMinTime6.getValue().toString());// How to make this dependant on when or not it's a PB (cmbxTime2)
            ps6.setString(8, spnSecTime6.getValue().toString());
            ps6.setString(9, txtfldDescription6.getText());
            ps6.executeUpdate();

            PreparedStatement ps7 = c.prepareStatement(sql);
            ps7.setInt(1, rs.getInt("seq"));
            ps7.setString(2, lblNumOrder7.getText());
            ps7.setString(3, spnNumberofLaps7.getValue().toString());
            ps7.setString(4, cmbxStroke7.getSelectedItem().toString());
            ps7.setString(5, spnDis7.getValue().toString());
            ps7.setString(6, cmbxTime7.getSelectedItem().toString());
            ps7.setString(7, spnMinTime7.getValue().toString());// How to make this dependant on when or not it's a PB (cmbxTime2)
            ps7.setString(8, spnSecTime7.getValue().toString());
            ps7.setString(9, txtfldDescription7.getText());
            ps7.executeUpdate();

            PreparedStatement ps8 = c.prepareStatement(sql);
            ps8.setInt(1, rs.getInt("seq"));
            ps8.setString(2, lblNumOrder8.getText());
            ps8.setString(3, spnNumberofLaps8.getValue().toString());
            ps8.setString(4, cmbxStroke8.getSelectedItem().toString());
            ps8.setString(5, spnDis8.getValue().toString());
            ps8.setString(6, cmbxTime8.getSelectedItem().toString());
            ps8.setString(7, spnMinTime8.getValue().toString());// How to make this dependant on when or not it's a PB (cmbxTime2)
            ps8.setString(8, spnSecTime8.getValue().toString());
            ps8.setString(9, txtfldDescription8.getText());
            ps8.executeUpdate();

            PreparedStatement ps9 = c.prepareStatement(sql);
            ps9.setInt(1, rs.getInt("seq"));
            ps9.setString(2, lblNumOrder9.getText());
            ps9.setString(3, spnNumberofLaps9.getValue().toString());
            ps9.setString(4, cmbxStroke9.getSelectedItem().toString());
            ps9.setString(5, spnDis9.getValue().toString());
            ps9.setString(6, cmbxTime9.getSelectedItem().toString());
            ps9.setString(7, spnMinTime9.getValue().toString());// How to make this dependant on when or not it's a PB (cmbxTime2)
            ps9.setString(8, spnSecTime9.getValue().toString());
            ps9.setString(9, txtfldDescription9.getText());
            ps9.executeUpdate();

            PreparedStatement ps10 = c.prepareStatement(sql);
            ps10.setInt(1, rs.getInt("seq"));
            ps10.setString(2, lblNumOrder10.getText());
            ps10.setString(3, spnNumberofLaps10.getValue().toString());
            ps10.setString(4, cmbxStroke10.getSelectedItem().toString());
            ps10.setString(5, spnDis10.getValue().toString());
            ps10.setString(6, cmbxTime10.getSelectedItem().toString());
            ps10.setString(7, spnMinTime10.getValue().toString());// How to make this dependant on when or not it's a PB (cmbxTime2)
            ps10.setString(8, spnSecTime10.getValue().toString());
            ps10.setString(9, txtfldDescription10.getText());
            ps10.executeUpdate();
            
            st.close();
            ps1.close();
            ps2.close();
            ps3.close();
            ps4.close();
            ps5.close();
            ps6.close();
            ps7.close();
            ps8.close();
            ps9.close();
            ps10.close();
            pdst.close();
            c.close();
            JOptionPane.showMessageDialog(null, "Workout saved!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtfldDis3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDis3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDis3ActionPerformed

    private void txtfldTime3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldTime3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldTime3ActionPerformed

    private void txtfldDescription03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDescription03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDescription03ActionPerformed

    private void txtfldDescription2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDescription2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDescription2ActionPerformed

    private void txtfldDescription1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDescription1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDescription1ActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSave1ActionPerformed

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
    private javax.swing.JButton btnSave1;
    private javax.swing.JComboBox<String> cmbxStroke03;
    private javax.swing.JComboBox<String> cmbxStroke1;
    private javax.swing.JComboBox<String> cmbxStroke10;
    private javax.swing.JComboBox<String> cmbxStroke2;
    private javax.swing.JComboBox<String> cmbxStroke3;
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
    private javax.swing.JComboBox<String> cmbxTime3;
    private javax.swing.JComboBox<String> cmbxTime4;
    private javax.swing.JComboBox<String> cmbxTime5;
    private javax.swing.JComboBox<String> cmbxTime6;
    private javax.swing.JComboBox<String> cmbxTime7;
    private javax.swing.JComboBox<String> cmbxTime8;
    private javax.swing.JComboBox<String> cmbxTime9;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblBy10;
    private javax.swing.JLabel lblBy11;
    private javax.swing.JLabel lblBy12;
    private javax.swing.JLabel lblBy13;
    private javax.swing.JLabel lblBy14;
    private javax.swing.JLabel lblBy3;
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
    private javax.swing.JLabel lblMeterUnit3;
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
    private javax.swing.JLabel lblOn2;
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
    private javax.swing.JLabel lblUnitTime3;
    private javax.swing.JPanel pnlWorkout;
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
    private javax.swing.JSpinner spnNumberofLaps3;
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
    private javax.swing.JTextField txtfldDescription3;
    private javax.swing.JTextField txtfldDescription4;
    private javax.swing.JTextField txtfldDescription5;
    private javax.swing.JTextField txtfldDescription6;
    private javax.swing.JTextField txtfldDescription7;
    private javax.swing.JTextField txtfldDescription8;
    private javax.swing.JTextField txtfldDescription9;
    private javax.swing.JTextField txtfldDis3;
    private javax.swing.JTextField txtfldTime3;
    private javax.swing.JTextField txtfldWorkoutName;
    // End of variables declaration//GEN-END:variables
}
