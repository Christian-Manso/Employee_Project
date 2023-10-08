/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;

/**
 *
 * @author User
 */
import employee.version4.*;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Employee extends Name{
    private Name empName = new Name();
    private int empID;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private Date empDateHired;
    private Date empBirthDate;

    public Employee(){
        
    }
    public Employee(String fname, String mname, String lname, String[] suffix){
        empName.setFname(fname);
        empName.setMname(mname);
        empName.setLname(lname);
        empName.setSuffix(suffix);
    }
    
    public Employee(String fname, String mname, String lname){
        empName.setFname(fname);
        empName.setMname(mname);
        empName.setLname(lname);
    }
    
    public Employee(String fname, String lname){
        empName.setFname(fname);
        empName.setLname(lname);
    }
    public Employee(String fname){
        empName.setFname(fname);
    }
    public Employee(String fname, int id){
        empName.setFname(fname);
        this.empID = id;
    }
    
    public Employee(String fname, String lname, int id){
        empName.setFname(fname);
        empName.setLname(lname);
        this.empID = id;
    }
    public Employee(String fname, String mname, String lname, String[] suffix, int id, String dateHired, String bdate) throws ParseException{
        empName.setFname(fname);
        empName.setMname(mname);
        empName.setLname(lname);
        empName.setSuffix(suffix);
        this.empID = id;
        this.empDateHired = format.parse(dateHired);
        this.empBirthDate = format.parse(bdate);
    }
    
    public Employee(String fname, String lname, int id, String dateHired, String bdate) throws ParseException{
        super(fname, lname);
        this.empID = id;
        this.empDateHired = format.parse(dateHired);
        this.empBirthDate = format.parse(bdate);
    }
    
    public void setEmpID(int empID){
        this.empID = empID;
    }
    
    public void setEmpName(Name empName) {
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
        return empName.toString();
    }
    
    public Date getEmpDateHired(){
        return this.empDateHired;
    }
    
    public Date getEmpBirthDate(){
        return this.empBirthDate;
    }
    
    public void displayinfo(){
        String info = toString();
        System.out.println(info);
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
