/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version2;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Employee {
    private int empID;
    private String empName;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private Date empDateHired;
    private Date empBirthDate;

    public Employee(){
        
    }
    
    public Employee(String name, int id){
        this.empID = id;
        this.empName = name;
    }
    public Employee(String name, int id, String dateHired, String bdate) throws ParseException{
        this.empID = id;
        this.empName = name;
        this.empDateHired = format.parse(dateHired);
        this.empBirthDate = format.parse(bdate);
    }
    
    public void setEmpID(int empID){
        this.empID = empID;
    }
    
    public void setEmpName(String empName){
        this.empName = empName;
    }
    
    public void setEmpDateHired(String empDateHired) throws ParseException{
        this.empDateHired = format.parse(empDateHired);
    }
    
    public void setEmpBirthDate(String empBirthDate) throws ParseException{
        this.empBirthDate = format.parse(empBirthDate);
    }
    
    
    public int getEmpID(){
        return this.empID;
    }
    
    public String getEmpName(){
        return this.empName;
    }
    
    public Date getEmpDateHired(){
        return this.empDateHired;
    }
    
    public Date getEmpBirthDate(){
        return this.empBirthDate;
    }
    
    
    
    public void displayinfo(){
        String display = toString();
        System.out.println(display);      
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(String.format("\nEmployee ID: " + getEmpID()));
        s.append(String.format("\nEmployee Name: " + getEmpName()));
        s.append(String.format("\nHired on: " + getEmpDateHired()));
        s.append(String.format("\nBirthdate: " + getEmpBirthDate()));
        
        return s.toString();
    }
}
