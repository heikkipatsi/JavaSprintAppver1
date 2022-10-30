package com.heke.studentapp.students;


public class student {
    private String name;
    private String lastname;
    private long studentid;
    private static long studentidCounter = 0;
    
    

    public student() {
        this("");
    }

    public student(String name) {
        this.studentid = studentidCounter++;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getStudentid() {
        return this.studentid;
    }

}
