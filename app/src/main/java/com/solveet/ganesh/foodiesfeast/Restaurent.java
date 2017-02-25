package com.solveet.ganesh.foodiesfeast;

/**
 * Created by Ganesh on 24-02-2017.
 */

public class Restaurent {
    int numberOfitem;
    String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String workingDays ;
    int startWorkingTime ;
    int endWorkingTime ;

    public int getNumberOfitem() {
        return numberOfitem;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public void setNumberOfitem(int numberOfitem) {
        this.numberOfitem = numberOfitem;
    }

    public int getStartWorkingTime() {
        return startWorkingTime;
    }

    public int getEndWorkingTime() {
        return endWorkingTime;
    }

    public void setStartWorkingTime(int startWorkingTime) {
        this.startWorkingTime = startWorkingTime;
    }

    public void setEndWorkingTime(int endWorkingTime) {
        this.endWorkingTime = endWorkingTime;
    }

    public Restaurent(int numberOfitem, String name, String workingDays, int startWorkingTime, int endWorkingTime) {
        this.numberOfitem = numberOfitem;
        this.name = name;
        this.workingDays = workingDays;
        this.startWorkingTime = startWorkingTime;
        this.endWorkingTime = endWorkingTime;
    }
}

