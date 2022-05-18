package edu.miracosta.cs112.mquon.project07_schedulingperformances.model;

import java.io.Serializable;

public class User implements Serializable, Comparable<User>{
    protected String mName;
    protected String mUserType;

    public User(String name, String userType) {
        mName = name;
        mUserType = userType;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getUserType() {
        return mUserType;
    }

    public void setUserType(String userType) {
        mUserType = userType;
    }

    @Override
    public int compareTo(User o) {
        int nameComp = mName.compareToIgnoreCase(o.mName);
        if (nameComp != 0) return nameComp;

        return mUserType.compareToIgnoreCase(o.mUserType);
    }
    // TODO: Maybe log every user?
}
