/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmastewartgui;

/**
 *
 * @author Emma
 */
public class ESGuiPersonalInfo extends javax.swing.JDialog {

    /**
     * Creates new form ESGuiPersonalInfo
     */
    public ESGuiPersonalInfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        displayPersonalInfo();
    }
    
    EmmaStewartGUI manager;
    
    public void displayPersonalInfo(){
        String userName = manager.selectItem("PersonalInfo", "userName");
        System.out.println("Username: " + userName);
        txtfldName.setText(userName);
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPersonalBests = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbl200Back = new javax.swing.JPanel();
        lbl50Back = new javax.swing.JLabel();
        lbl50Fly = new javax.swing.JLabel();
        lbl50Free = new javax.swing.JLabel();
        lblNamePB4 = new javax.swing.JLabel();
        lbl200Fly = new javax.swing.JLabel();
        lbl100Back = new javax.swing.JLabel();
        lbl100Breast = new javax.swing.JLabel();
        lbl100Free = new javax.swing.JLabel();
        lbl100Fly = new javax.swing.JLabel();
        lblNamePB10 = new javax.swing.JLabel();
        lbl200Breast = new javax.swing.JLabel();
        lbl200Free = new javax.swing.JLabel();
        lbl200IM = new javax.swing.JLabel();
        lbl100IM = new javax.swing.JLabel();
        lbl400Free = new javax.swing.JLabel();
        lbl400IM = new javax.swing.JLabel();
        lbl1000Free = new javax.swing.JLabel();
        lbl800Free = new javax.swing.JLabel();
        lblColon4 = new javax.swing.JLabel();
        spnFL50Mins = new javax.swing.JSpinner();
        spnFL50Secs = new javax.swing.JSpinner();
        lblColon5 = new javax.swing.JLabel();
        spnBK50Mins = new javax.swing.JSpinner();
        spnBK50Secs = new javax.swing.JSpinner();
        lblColon6 = new javax.swing.JLabel();
        spnBR50Mins = new javax.swing.JSpinner();
        spnBR50Secs = new javax.swing.JSpinner();
        lblColon7 = new javax.swing.JLabel();
        spnFR50Mins = new javax.swing.JSpinner();
        spnFR50Secs = new javax.swing.JSpinner();
        lblColon8 = new javax.swing.JLabel();
        spnFL100Mins = new javax.swing.JSpinner();
        spnFL100Secs = new javax.swing.JSpinner();
        lblColon9 = new javax.swing.JLabel();
        spnBK100Mins = new javax.swing.JSpinner();
        spnBK100Secs = new javax.swing.JSpinner();
        lblColon10 = new javax.swing.JLabel();
        spnBR100Mins = new javax.swing.JSpinner();
        spnBR100Secs = new javax.swing.JSpinner();
        lblColon11 = new javax.swing.JLabel();
        spnFR100Mins = new javax.swing.JSpinner();
        spnFR100Secs = new javax.swing.JSpinner();
        lblColon12 = new javax.swing.JLabel();
        spnIM100Mins = new javax.swing.JSpinner();
        spIM100Secs = new javax.swing.JSpinner();
        lblColon13 = new javax.swing.JLabel();
        spnFL200Mins = new javax.swing.JSpinner();
        spnFL200Secs = new javax.swing.JSpinner();
        lblColon14 = new javax.swing.JLabel();
        spnBK200Mins = new javax.swing.JSpinner();
        spnBK200Secs = new javax.swing.JSpinner();
        lblColon15 = new javax.swing.JLabel();
        spnBR200Mins = new javax.swing.JSpinner();
        spnBR200Secs = new javax.swing.JSpinner();
        lblColon16 = new javax.swing.JLabel();
        spnFR200Mins = new javax.swing.JSpinner();
        spnFR200Secs = new javax.swing.JSpinner();
        lblColon17 = new javax.swing.JLabel();
        spnIM200Mins = new javax.swing.JSpinner();
        spnIM200Secs = new javax.swing.JSpinner();
        lblColon18 = new javax.swing.JLabel();
        spnFR400Secs = new javax.swing.JSpinner();
        spnFR400Mins = new javax.swing.JSpinner();
        lblColon19 = new javax.swing.JLabel();
        spnIM400Secs = new javax.swing.JSpinner();
        spnIM400Mins = new javax.swing.JSpinner();
        lblColon20 = new javax.swing.JLabel();
        spnFR800Secs = new javax.swing.JSpinner();
        spnFR800Mins = new javax.swing.JSpinner();
        spnFR1000Mins = new javax.swing.JSpinner();
        spnFR1000Secs = new javax.swing.JSpinner();
        lblColon21 = new javax.swing.JLabel();
        btnSavePB = new javax.swing.JButton();
        lblProfile = new javax.swing.JLabel();
        btnDonePB = new javax.swing.JButton();
        lblNamePB = new javax.swing.JLabel();
        txtfldName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPersonalBests.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblPersonalBests.setText("Personal Bests");

        lbl50Back.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl50Back.setText("50m Backstroke:");

        lbl50Fly.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl50Fly.setText("50m Butterfly:");

        lbl50Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl50Free.setText("50m Freestyle:");

        lblNamePB4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNamePB4.setText("50m Breaststroke:");

        lbl200Fly.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl200Fly.setText("200m Butterfly:");

        lbl100Back.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl100Back.setText("100m Backstroke:");

        lbl100Breast.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl100Breast.setText("100m Breaststroke:");

        lbl100Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl100Free.setText("100m Freestyle:");

        lbl100Fly.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl100Fly.setText("100m Butterfly:");

        lblNamePB10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNamePB10.setText("200m Backstroke:");

        lbl200Breast.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl200Breast.setText("200m Breaststroke:");

        lbl200Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl200Free.setText("200m Freestyle:");

        lbl200IM.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl200IM.setText("200m Individual Medley:");

        lbl100IM.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl100IM.setText("100m Individual Medley:");

        lbl400Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl400Free.setText("400m Freestyle:");

        lbl400IM.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl400IM.setText("400m Individual Medley:");

        lbl1000Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl1000Free.setText("1000m Freestyle:");

        lbl800Free.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl800Free.setText("800m Freestyle:");

        lblColon4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon4.setText(":");

        spnFL50Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL50Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFL50Mins.setToolTipText("00");

        spnFL50Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL50Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFL50Secs.setToolTipText("00");
        spnFL50Secs.setRequestFocusEnabled(false);

        lblColon5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon5.setText(":");

        spnBK50Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK50Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBK50Mins.setToolTipText("00");
        spnBK50Mins.setRequestFocusEnabled(false);

        spnBK50Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK50Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBK50Secs.setToolTipText("00");
        spnBK50Secs.setRequestFocusEnabled(false);

        lblColon6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon6.setText(":");

        spnBR50Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR50Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBR50Mins.setToolTipText("00");
        spnBR50Mins.setRequestFocusEnabled(false);

        spnBR50Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR50Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBR50Secs.setToolTipText("00");
        spnBR50Secs.setRequestFocusEnabled(false);

        lblColon7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon7.setText(":");

        spnFR50Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR50Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR50Mins.setToolTipText("00");
        spnFR50Mins.setRequestFocusEnabled(false);

        spnFR50Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR50Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR50Secs.setToolTipText("00");
        spnFR50Secs.setRequestFocusEnabled(false);

        lblColon8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon8.setText(":");

        spnFL100Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL100Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFL100Mins.setToolTipText("00");
        spnFL100Mins.setRequestFocusEnabled(false);

        spnFL100Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL100Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFL100Secs.setToolTipText("00");
        spnFL100Secs.setRequestFocusEnabled(false);

        lblColon9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon9.setText(":");

        spnBK100Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK100Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBK100Mins.setToolTipText("00");
        spnBK100Mins.setRequestFocusEnabled(false);

        spnBK100Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK100Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBK100Secs.setToolTipText("00");
        spnBK100Secs.setRequestFocusEnabled(false);

        lblColon10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon10.setText(":");

        spnBR100Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR100Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBR100Mins.setToolTipText("00");
        spnBR100Mins.setRequestFocusEnabled(false);

        spnBR100Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR100Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBR100Secs.setToolTipText("00");
        spnBR100Secs.setRequestFocusEnabled(false);

        lblColon11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon11.setText(":");

        spnFR100Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR100Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR100Mins.setToolTipText("00");
        spnFR100Mins.setRequestFocusEnabled(false);

        spnFR100Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR100Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR100Secs.setToolTipText("00");
        spnFR100Secs.setRequestFocusEnabled(false);

        lblColon12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon12.setText(":");

        spnIM100Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM100Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnIM100Mins.setToolTipText("00");
        spnIM100Mins.setRequestFocusEnabled(false);

        spIM100Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spIM100Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spIM100Secs.setToolTipText("00");
        spIM100Secs.setRequestFocusEnabled(false);

        lblColon13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon13.setText(":");

        spnFL200Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL200Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFL200Mins.setToolTipText("00");
        spnFL200Mins.setRequestFocusEnabled(false);

        spnFL200Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFL200Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFL200Secs.setToolTipText("00");
        spnFL200Secs.setRequestFocusEnabled(false);

        lblColon14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon14.setText(":");

        spnBK200Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK200Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBK200Mins.setToolTipText("00");
        spnBK200Mins.setRequestFocusEnabled(false);

        spnBK200Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBK200Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBK200Secs.setToolTipText("00");
        spnBK200Secs.setRequestFocusEnabled(false);

        lblColon15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon15.setText(":");

        spnBR200Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR200Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnBR200Mins.setToolTipText("00");
        spnBR200Mins.setRequestFocusEnabled(false);

        spnBR200Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnBR200Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnBR200Secs.setToolTipText("00");
        spnBR200Secs.setRequestFocusEnabled(false);

        lblColon16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon16.setText(":");

        spnFR200Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR200Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR200Mins.setToolTipText("00");
        spnFR200Mins.setRequestFocusEnabled(false);

        spnFR200Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR200Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR200Secs.setToolTipText("00");
        spnFR200Secs.setRequestFocusEnabled(false);

        lblColon17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon17.setText(":");

        spnIM200Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM200Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnIM200Mins.setToolTipText("00");
        spnIM200Mins.setRequestFocusEnabled(false);

        spnIM200Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM200Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnIM200Secs.setToolTipText("00");
        spnIM200Secs.setRequestFocusEnabled(false);

        lblColon18.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon18.setText(":");

        spnFR400Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR400Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR400Secs.setToolTipText("00");
        spnFR400Secs.setRequestFocusEnabled(false);

        spnFR400Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR400Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR400Mins.setToolTipText("00");
        spnFR400Mins.setRequestFocusEnabled(false);

        lblColon19.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon19.setText(":");

        spnIM400Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM400Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnIM400Secs.setToolTipText("00");
        spnIM400Secs.setRequestFocusEnabled(false);

        spnIM400Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnIM400Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnIM400Mins.setToolTipText("00");
        spnIM400Mins.setRequestFocusEnabled(false);

        lblColon20.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon20.setText(":");

        spnFR800Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR800Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR800Secs.setToolTipText("00");
        spnFR800Secs.setRequestFocusEnabled(false);

        spnFR800Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR800Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR800Mins.setToolTipText("00");
        spnFR800Mins.setRequestFocusEnabled(false);

        spnFR1000Mins.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR1000Mins.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        spnFR1000Mins.setToolTipText("00");
        spnFR1000Mins.setRequestFocusEnabled(false);

        spnFR1000Secs.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        spnFR1000Secs.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        spnFR1000Secs.setToolTipText("00");
        spnFR1000Secs.setRequestFocusEnabled(false);

        lblColon21.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblColon21.setText(":");

        javax.swing.GroupLayout lbl200BackLayout = new javax.swing.GroupLayout(lbl200Back);
        lbl200Back.setLayout(lbl200BackLayout);
        lbl200BackLayout.setHorizontalGroup(
            lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl200BackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl50Free)
                                .addComponent(lblNamePB4)
                                .addComponent(lbl50Back)
                                .addComponent(lbl50Fly)
                                .addComponent(lbl200Fly)
                                .addComponent(lblNamePB10))
                            .addGap(117, 117, 117)
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnBK200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnBK200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnFL200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnFL200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(lbl200BackLayout.createSequentialGroup()
                                            .addComponent(spnFL50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnFL50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(lbl200BackLayout.createSequentialGroup()
                                            .addComponent(spnBK50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnBK50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                            .addComponent(spnBR50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblColon6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spnBR50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(lbl200BackLayout.createSequentialGroup()
                                        .addComponent(spnFR50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblColon7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnFR50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(lbl200BackLayout.createSequentialGroup()
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl200Breast)
                                .addComponent(lbl200Free))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnFR200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnFR200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnBR200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnBR200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(lbl200BackLayout.createSequentialGroup()
                        .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl200IM)
                            .addComponent(lbl400Free))
                        .addGap(18, 18, 18)
                        .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnFR400Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnFR400Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnIM200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnIM200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                            .addComponent(lbl400IM)
                            .addGap(18, 18, 18)
                            .addComponent(spnIM400Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblColon19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(spnIM400Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(lbl200BackLayout.createSequentialGroup()
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl800Free)
                                .addComponent(lbl1000Free))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnFR1000Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnFR1000Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(lbl200BackLayout.createSequentialGroup()
                                    .addComponent(spnFR800Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblColon20)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnFR800Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(lbl200BackLayout.createSequentialGroup()
                        .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl100IM)
                            .addComponent(lbl100Free)
                            .addComponent(lbl100Breast)
                            .addComponent(lbl100Back)
                            .addComponent(lbl100Fly))
                        .addGap(18, 18, 18)
                        .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnFL100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnFL100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnBK100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnBK100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnBR100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnBR100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnFR100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnFR100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lbl200BackLayout.createSequentialGroup()
                                .addComponent(spnIM100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblColon12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spIM100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(670, Short.MAX_VALUE))
        );
        lbl200BackLayout.setVerticalGroup(
            lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl200BackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl50Fly, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon4)
                    .addComponent(spnFL50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFL50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl50Back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon5)
                    .addComponent(spnBK50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBK50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamePB4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon6)
                    .addComponent(spnBR50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBR50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl50Free, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon7)
                    .addComponent(spnFR50Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR50Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100Fly, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon8)
                    .addComponent(spnFL100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFL100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100Back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon9)
                    .addComponent(spnBK100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBK100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100Breast, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon10)
                    .addComponent(spnBR100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBR100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100Free, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon11)
                    .addComponent(spnFR100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl100IM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon12)
                    .addComponent(spnIM100Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spIM100Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl200Fly, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon13)
                    .addComponent(spnFL200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFL200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamePB10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon14)
                    .addComponent(spnBK200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBK200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl200Breast, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon15)
                    .addComponent(spnBR200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBR200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl200Free, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon16)
                    .addComponent(spnFR200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl200IM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon17)
                    .addComponent(spnIM200Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnIM200Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl400Free, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon18)
                    .addComponent(spnFR400Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR400Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl400IM, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColon19)
                    .addComponent(spnIM400Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnIM400Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl800Free)
                    .addComponent(lblColon20)
                    .addComponent(spnFR800Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR800Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lbl200BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColon21)
                    .addComponent(spnFR1000Mins, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnFR1000Secs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1000Free, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        spnFL50Mins.getAccessibleContext().setAccessibleName("");

        jScrollPane1.setViewportView(lbl200Back);

        btnSavePB.setText("SAVE");
        btnSavePB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePBActionPerformed(evt);
            }
        });

        lblProfile.setFont(new java.awt.Font("Tahoma", 0, 54)); // NOI18N
        lblProfile.setText("Profile");

        btnDonePB.setText("DONE");
        btnDonePB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonePBActionPerformed(evt);
            }
        });

        lblNamePB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblNamePB.setText("Name:");

        txtfldName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfldName.setText("[insert name]");
        txtfldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSavePB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDonePB, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPersonalBests, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(lblNamePB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtfldName, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblProfile))
                    .addContainerGap(231, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSavePB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDonePB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNamePB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfldName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(21, 21, 21)
                    .addComponent(lblPersonalBests, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(481, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSavePBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSavePBActionPerformed

    private void txtfldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldNameActionPerformed

    private void btnDonePBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonePBActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDonePBActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ESGuiPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ESGuiPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ESGuiPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ESGuiPersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ESGuiPersonalInfo dialog = new ESGuiPersonalInfo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDonePB;
    private javax.swing.JButton btnSavePB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1000Free;
    private javax.swing.JLabel lbl100Back;
    private javax.swing.JLabel lbl100Breast;
    private javax.swing.JLabel lbl100Fly;
    private javax.swing.JLabel lbl100Free;
    private javax.swing.JLabel lbl100IM;
    private javax.swing.JPanel lbl200Back;
    private javax.swing.JLabel lbl200Breast;
    private javax.swing.JLabel lbl200Fly;
    private javax.swing.JLabel lbl200Free;
    private javax.swing.JLabel lbl200IM;
    private javax.swing.JLabel lbl400Free;
    private javax.swing.JLabel lbl400IM;
    private javax.swing.JLabel lbl50Back;
    private javax.swing.JLabel lbl50Fly;
    private javax.swing.JLabel lbl50Free;
    private javax.swing.JLabel lbl800Free;
    private javax.swing.JLabel lblColon10;
    private javax.swing.JLabel lblColon11;
    private javax.swing.JLabel lblColon12;
    private javax.swing.JLabel lblColon13;
    private javax.swing.JLabel lblColon14;
    private javax.swing.JLabel lblColon15;
    private javax.swing.JLabel lblColon16;
    private javax.swing.JLabel lblColon17;
    private javax.swing.JLabel lblColon18;
    private javax.swing.JLabel lblColon19;
    private javax.swing.JLabel lblColon20;
    private javax.swing.JLabel lblColon21;
    private javax.swing.JLabel lblColon4;
    private javax.swing.JLabel lblColon5;
    private javax.swing.JLabel lblColon6;
    private javax.swing.JLabel lblColon7;
    private javax.swing.JLabel lblColon8;
    private javax.swing.JLabel lblColon9;
    private javax.swing.JLabel lblNamePB;
    private javax.swing.JLabel lblNamePB10;
    private javax.swing.JLabel lblNamePB4;
    private javax.swing.JLabel lblPersonalBests;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JSpinner spIM100Secs;
    private javax.swing.JSpinner spnBK100Mins;
    private javax.swing.JSpinner spnBK100Secs;
    private javax.swing.JSpinner spnBK200Mins;
    private javax.swing.JSpinner spnBK200Secs;
    private javax.swing.JSpinner spnBK50Mins;
    private javax.swing.JSpinner spnBK50Secs;
    private javax.swing.JSpinner spnBR100Mins;
    private javax.swing.JSpinner spnBR100Secs;
    private javax.swing.JSpinner spnBR200Mins;
    private javax.swing.JSpinner spnBR200Secs;
    private javax.swing.JSpinner spnBR50Mins;
    private javax.swing.JSpinner spnBR50Secs;
    private javax.swing.JSpinner spnFL100Mins;
    private javax.swing.JSpinner spnFL100Secs;
    private javax.swing.JSpinner spnFL200Mins;
    private javax.swing.JSpinner spnFL200Secs;
    private javax.swing.JSpinner spnFL50Mins;
    private javax.swing.JSpinner spnFL50Secs;
    private javax.swing.JSpinner spnFR1000Mins;
    private javax.swing.JSpinner spnFR1000Secs;
    private javax.swing.JSpinner spnFR100Mins;
    private javax.swing.JSpinner spnFR100Secs;
    private javax.swing.JSpinner spnFR200Mins;
    private javax.swing.JSpinner spnFR200Secs;
    private javax.swing.JSpinner spnFR400Mins;
    private javax.swing.JSpinner spnFR400Secs;
    private javax.swing.JSpinner spnFR50Mins;
    private javax.swing.JSpinner spnFR50Secs;
    private javax.swing.JSpinner spnFR800Mins;
    private javax.swing.JSpinner spnFR800Secs;
    private javax.swing.JSpinner spnIM100Mins;
    private javax.swing.JSpinner spnIM200Mins;
    private javax.swing.JSpinner spnIM200Secs;
    private javax.swing.JSpinner spnIM400Mins;
    private javax.swing.JSpinner spnIM400Secs;
    private javax.swing.JTextField txtfldName;
    // End of variables declaration//GEN-END:variables
}
