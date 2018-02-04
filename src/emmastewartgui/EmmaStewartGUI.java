
package emmastewartgui;

//import javax.swing.BoxLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author Emma
 */
public class EmmaStewartGUI {

    public static void main(String[] args) throws Exception {
        ESFrmMain gui = new ESFrmMain(new EmmaStewartGUI());
        gui.setVisible(true);
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
    
    public void updateItem(String workoutName, Integer ID, Integer numLaps, Integer numDist, String stroke, String pB, Integer minutes, Integer seconds, String description, Integer setID){
        
        String sql = "UPDATE Workout SET workoutName = ? WHERE workoutID = ?";
        
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setString(1, workoutName);
            pstmt.setInt(2, ID);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Laps to be updated" +numLaps);
        String sqlsets = "UPDATE Sets SET numofLaps = ?, setDis = ?, strokeType = ?, isPB = ?, setTimeMins = ?, setTimeSecs = ?, setDescription = ?  WHERE setID = ?";
        
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt2 = conn.prepareStatement(sqlsets)) {
 
            // set the corresponding param
            pstmt2.setInt(1, numLaps);
            pstmt2.setInt(2, numDist);
            pstmt2.setString(3, stroke);
            pstmt2.setString(4, pB);
            pstmt2.setInt(5, minutes);
            pstmt2.setInt(6, seconds);
            pstmt2.setString(7, description);
            pstmt2.setInt(8, setID);
            // update 
            pstmt2.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
    }

    public int getsetId(Integer workoutID) {
        int setID;
        
        String sql = "SELECT setID From Sets Where workoutID = '"+workoutID+"'";
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            ResultSet rs;
            try (Statement stmt = c.createStatement()) {
                rs = stmt.executeQuery(sql);
                setID = rs.getInt("setID");
                return setID;
                //System.out.println(rs.getInt("numofLaps"));
             
               
            }
           
                    
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        } 
        return 0;
    }
    
    public int getLapse(Integer SetId){
        
        String sql = "SELECT numofLaps From Sets Where setID = '"+SetId+"'";
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            ResultSet rs;
            try (Statement stmt = c.createStatement()) {
                rs = stmt.executeQuery(sql);
                
               return rs.getInt("numofLaps");
                //System.out.println(rs.getInt("numofLaps"));
             
               
            }
           
                    
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        } 
        return 0;
        
    }
    
    public int getDist(Integer SetId){
        
        String sql = "SELECT setDis From Sets Where setID = '"+SetId+"'";
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            ResultSet rs;
            try (Statement stmt = c.createStatement()) {
                rs = stmt.executeQuery(sql);
                
               return rs.getInt("setDis");
                //System.out.println(rs.getInt("numofLaps"));
             
               
            }
           
                    
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        } 
        return 0;
        
    }
    
    public String getStroke(Integer SetId){
        
        String sql = "SELECT strokeType From Sets Where setID = '"+SetId+"'";
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            ResultSet rs;
            try (Statement stmt = c.createStatement()) {
                rs = stmt.executeQuery(sql);
                
               return rs.getString("strokeType");
                //System.out.println(rs.getInt("numofLaps"));
             
               
            }
           
                    
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        } 
        return null;
     
        
    }
    
    public String getPB(Integer SetId){
        
        String sql = "SELECT isPB From Sets Where setID = '"+SetId+"'";
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            ResultSet rs;
            try (Statement stmt = c.createStatement()) {
                rs = stmt.executeQuery(sql);
                
               return rs.getString("isPB");
                //System.out.println(rs.getInt("numofLaps"));
             
               
            }
           
                    
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        } 
        return null;
     
        
    }
    
    public int getMinute(Integer SetId){
        
        String sql = "SELECT setTimeMins From Sets Where setID = '"+SetId+"'";
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            ResultSet rs;
            try (Statement stmt = c.createStatement()) {
                rs = stmt.executeQuery(sql);
                
               return rs.getInt("setTimeMins");
                //System.out.println(rs.getInt("numofLaps"));
             
               
            }
           
                    
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        } 
        return 0;
     
        
    }
    
    
    public int getSeconds(Integer SetId){
        
        String sql = "SELECT setTimeSecs From Sets Where setID = '"+SetId+"'";
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            ResultSet rs;
            try (Statement stmt = c.createStatement()) {
                rs = stmt.executeQuery(sql);
                
               return rs.getInt("setTimeSecs");
                //System.out.println(rs.getInt("numofLaps"));
             
               
            }
           
                    
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        } 
        return 0;
     
        
    }
    
    
    public String getDescription(Integer SetId){
        
        String sql = "SELECT setDescription From Sets Where setID = '"+SetId+"'";
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            ResultSet rs;
            try (Statement stmt = c.createStatement()) {
                rs = stmt.executeQuery(sql);
                
               return rs.getString("setDescription");
                //System.out.println(rs.getInt("numofLaps"));
             
               
            }
           
                    
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        
        } 
        return null;
     
        
    }
    
    public int getId(String Title){
        String sql = "SELECT workoutID From Workout Where workoutName = '"+Title+"'";
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            ResultSet rs;
            try (Statement stmt = c.createStatement()) {
                rs = stmt.executeQuery(sql);
                
                return rs.getInt("workoutID");
                
                
               
            }
           
                    
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        
        } 
        
        return 0;
    }
    
    public void selectAll(String table, String variable, JList list) {
        String[] workoutNames = new String[20];
        int itemCount = 0;
        String sql = "SELECT " + variable + " FROM " + table;
        try {
            Connection c = this.connect();
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                for (int i = 0; i < 20; i++) {
                    workoutNames[i] = rs.getString(variable);
                }
                itemCount++;
            }
            workoutNames = new String[itemCount];
            list.setListData(workoutNames);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    public String selectItem(String table, String column, String filterColumn, String name){
        String sql = "SELECT " + column + " FROM " + table + " WHERE " + filterColumn
                + "=\"" + name + "\"";
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next()){
                if(rs.getString(column) != null){
                    String s = rs.getString(column);
                    c.close();
                    return s;
                }
                else{
                    c.close();
                    return null;
                }
            }
            else {
                c.close();
                return null;
            }           
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }  
    }
    
   public String selectItem(String table, String column){
        String sql = "SELECT " + column + " FROM " + table;
        //System.out.println(sql);
        try {
            Connection c = this.connect();
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next()){
                if(rs.getString(column) != null){
                    String s = rs.getString(column);
                    c.close();
                    return s;
                }
                else{
                    c.close();
                    return null;
                }
            }
            else {
                c.close();
                return null;
            }           
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }  
    } 
    
    public void deleteItem(String table, String filterColumn1, String filterColumn2, String name1, String name2){
    try {
            String sql = "DELETE FROM " + table + " WHERE " + filterColumn1 + " = ? AND " + filterColumn2 + " = ?";
            
            Connection c = this.connect();
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, name1);
            pst.setString(2, name2);
            
            pst.executeUpdate();
            c.close();
        }
        catch(Exception e){
            JLabel failLabel = new JLabel("Error: " + e.toString());
            failLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
            JOptionPane.showMessageDialog(null, failLabel);
        }
    }
    
    public void deleteItem(String table, String filterColumn1, String name1){
    try {
            String sql = "DELETE FROM " + table + " WHERE " + filterColumn1 + " = ?";
            
            Connection c = this.connect();
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, name1);
            
            pst.executeUpdate();
            c.close();
        }
        catch(Exception e){
            JLabel failLabel = new JLabel("Error: " + e.toString());
            failLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
            JOptionPane.showMessageDialog(null, failLabel);
        }
    }
    
}
