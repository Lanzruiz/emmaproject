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
public class ESSet {

    int setID;
    int numOrder;
    int numOfLaps;
    String strokeType;
    String setDis;
    boolean isPB;
    int addPB;
    int setTimeMins;
    int setTimeSecs;
    String setDescription;

    public int getSetID() {
        return this.setID;
    }
    public void setSetID(int setID) {
        this.setID = setID;
    }

    public int getNumOrder() {
        return this.setID;
    }
    public void setNumOrder(int numOrder) {
        this.numOrder = numOrder;
    }

    public int getNumOfLaps() {
        return this.numOfLaps;
    }
    public void setNumOfLaps(int numOfLaps) {
        this.numOfLaps = numOfLaps;
    }

    public String getStrokeType() {
        return this.strokeType;
    }
    public void setStrokeType(String strokeType) {
        this.strokeType = strokeType;
    }

    public String getSetDis() {
        return this.setDis;
    }
    public void setSetDis(String setDis) {
        this.setDis = setDis;
    }

    public boolean getIsPB() {
        return this.isPB;
    }
    public boolean setIsPB(boolean isPB) {
        return this.isPB = isPB;
    }

    public int getAddPB() {
        return this.addPB;
    }
    public int setAddPB(int addPB) {
        return this.addPB = addPB;
    }

    public int getSetTimeMins() {
        return this.setTimeMins;
    }
    public int setSetTimeMins(int setTimeMins) {
        return this.setTimeMins = setTimeMins;
    }
    
     public int getSetTimeSecs() {
        return this.setTimeSecs;
    }
    public int setSetTimeSecs(int setTimeSecs) {
        return this.setTimeSecs = setTimeSecs;
    }
    
    public String getSetDescription() {
        return this.setDescription;
    }

    public String setSetDescription(String setDescription) {
        return this.setDescription = setDescription;
    }
    
    
}
