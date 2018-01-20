/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emmastewartgui;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Emma
 */
public class ESTimer {

    private int intWorkoutDuration;
    private String printWorkoutDuration;
    static int interval;
    static Timer timer;

    //countdown in milliseconds 
    public String getPrintWorkoutDuration() {
        return printWorkoutDuration;
    }

//    public void setPrintWorkoutDuration(int workoutDuration) {
//        printWorkoutDuration = intToStringDuration(workoutDuration);
//    }
    public int getIntSongDuration() {
        return intWorkoutDuration;
    }

    public void setIntWorkoutDuration(int workoutDuration) {
        intWorkoutDuration = workoutDuration;
    }

    public void Duration(int workoutDuration) {
        setIntWorkoutDuration(workoutDuration);
    }

//    private String stringToIntDuration() throws SQLException {
//        String sql = "Select setTime FROM Workout";
//        PreparedStatement pst = new EmmaStewartGUI().connect().prepareStatement(sql);
//        
//        String result = "";
//
//        int hours = 0, minutes = 0, seconds = 0;
//
//        hours = aDuration / 3600;
//        minutes = (aDuration - hours * 3600) / 60;
//        seconds = (aDuration - (hours * 3600 + minutes * 60));
//
//        result = String.format("%02d:%02d:%02d", hours, minutes, seconds);
//        return result;
//    }
//
    public void runTimer(Class EmmaStewartGUI) throws SQLException {
//        String sql = "Select workoutID,numOfLaps,isPB,setTime FROM Workout";
//        PreparedStatement pst = new EmmaStewartGUI().connect().prepareStatement(sql);
        Scanner sc = new Scanner(System.in);
        System.out.print("Input seconds => : ");
        String secs = sc.nextLine();
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = Integer.parseInt(secs);
        System.out.println(secs);
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.println(setInterval());

            }
        }, delay, period);
    }

    private static int setInterval() {
        if (interval == 1) {
            timer.cancel();
        }
        return --interval;
    }
}

