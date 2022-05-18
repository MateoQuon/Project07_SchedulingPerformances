package edu.miracosta.cs112.mquon.project07_schedulingperformances.model;

public class Performance implements Comparable<Performance>{
    private String mName;
    private int mDate;
    private String mDuration;
    private int mVolunteers;
    private double mDonationsRecieved = -1.0;

    public Performance(String name, int date, String duration, int volunteers, double donations) {
        mName = name;
        mDate = date;
        mDuration = duration;
        mVolunteers = volunteers;
        if (donations != -1)
            mDonationsRecieved = donations;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getDate() {
        return mDate;
    }

    public void setDate(int date) {
        mDate = date;
    }

    public String getDuration() {
        return mDuration;
    }

    public void setDuration(String duration) {
        mDuration = duration;
    }

    public int getVolunteers() {
        return mVolunteers;
    }

    public void setVolunteers(int volunteers) {
        mVolunteers = volunteers;
    }

    public double getDonationsRecieved() {
        if (mDonationsRecieved <= 0)
            return 0;
        return mDonationsRecieved;
    }

    public void setDonationsRecieved(double donationsRecieved) {
        mDonationsRecieved = donationsRecieved;
    }

    public int[] splitDate(int date) {
        int [] arr = new int[3];
        // input format: "MMDDYYYY"
        // TODO: Complete splitDate to separate month, day, and year
        return arr;
    }

    @Override
    public int compareTo(Performance o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Performance[Name: " + mName +
                ", Date: " + mDate +
                ", Time: " + mDuration + // TODO: FORMAT=7:00-9:00 WITH SCROLL BAR
                ", Volunteers: " + mVolunteers +
                ", Donations Received: " + mDonationsRecieved + ']';
    }
}
