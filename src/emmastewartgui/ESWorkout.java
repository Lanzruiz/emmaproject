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

public class ESWorkout {

    String workoutName;
    int totalDis;
    int totalTime;


    public String getWorkoutName() {
        return this.workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public int getTotalTime() {
        return this.totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getTotalDis() {
        return this.totalDis;
    }

    public void setTotalDis(int totalDis) {
        this.totalDis = totalDis;
    }

//    public void runWorkout() throws SQLException {
//        
//        //preparedStatement and SQL request here for the setTime, numOfLaps, workoutID, numOrder, isPB, setTime 
//        
//        String sql = "Select isPB FROM Workout WHERE workoutID = ?";
//        //select the sets with this workout ID
//        PreparedStatement pst = new EmmaStewartGUI().connect().prepareStatement(sql);
//        try {
//            while ("workoutID" = ?) {
//                if ("isPB" == "on") {
//                    //of one set
//                    String sqlite = "Select setTime, numOfLaps FROM Workout WHERE workoutID = ?";
//                    for ("numOfLaps"){
//                        //call the timer here and make the duration equal to setTimer
//                    }
//                } else {
//                    String sQL = "Select setDis, strokeType FROM Workout WHERE pbID = ?";
//                    
//                    //get the values from setDis and strokeType and look in PersonalBests for the time (might have to 
//                    //recreate the database for this, or make an algorithm that combined the two to make pb names 
//                    //int comboTime = setTime.getInt() + PB found in DB 
//                    // run the comboTime * numOfLaps (which is the # of reps)
//                    //all the way through the workout
//                }
//
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//
//    }
}
