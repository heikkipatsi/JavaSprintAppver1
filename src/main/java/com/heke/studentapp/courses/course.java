package com.heke.studentapp.courses;

public class course {
    private String coursename;
    private String description;
    private long courseid;
    private static long courseidCounter = 0;

    public course(){
        this("");
    }
    public course(String coursename) {
        this.courseid = courseidCounter++;
        this.coursename = coursename;
    }

    public long getCourseid() {
        return this.courseid;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCoursename() {
        return this.coursename;
    }

    public void setCoursename(String coursename){
        this.coursename = coursename;
    }

}
