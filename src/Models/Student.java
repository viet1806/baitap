/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author vietk
 */
public class Student implements Serializable {
    private String EnrollID;
    private String FirstName;
    private String LastName;
    private int Age;

    public Student() {
    }

    public Student(String EnrollID, String FirstName, String LastName, int Age) {
        this.EnrollID = EnrollID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    public String getEnrollID() {
        return EnrollID;
    }

    public void setEnrollID(String EnrollID) {
        this.EnrollID = EnrollID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    public String getFullName()
    {
        return this.FirstName + " " + this.LastName;
    }
} 
