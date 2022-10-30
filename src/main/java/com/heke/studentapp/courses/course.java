package com.heke.studentapp.courses;




public class course {
    private String coursename;
    private String description;
    private static long courseidCounter = 0;
    private long courseid;

    public long getCourseid() {
        return this.courseid;
    }

    public void setCourseid(long courseid) {
        this.courseid = courseid;
    }
    
    public course() {
        this.courseid = courseidCounter++;
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

}
