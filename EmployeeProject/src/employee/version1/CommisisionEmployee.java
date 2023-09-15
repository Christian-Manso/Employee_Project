package employee.version1;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CommisisionEmployee {
    private int empID;
    private String empName;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    
    public CommisisionEmployee(){
        
    }
    public CommisisionEmployee(String name, int id){
        this.empID = id;
        this.empName = name;
    }
    public CommisisionEmployee(String name, int id, String dateHired, String bdate) throws ParseException{
        this.empID = id;
        this.empName = name;
        this.empDateHired = format.parse(dateHired);
        this.empBirthDate = format.parse(bdate);
    }
    
    public CommisisionEmployee(String name, int id, String dateHired, String bdate, double totalSales) throws ParseException{
        this.empID = id;
        this.empName = name;
        this.empDateHired = format.parse(dateHired);
        this.empBirthDate = format.parse(bdate);
        this.totalSales = totalSales;
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
    
    public void setTotalSales(double totalSales){
        this.totalSales = totalSales;
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
    
    public double getTotalSales(){
        return this.totalSales;
    }
    
    public double computeSalary(){
        double salary;
        double sales = getTotalSales();
        double com;
        
        if(sales<50000){
        com = 0.05;
        }
        else if(sales>=50000&&sales<100000){
        com = 0.2;
        }
        else if(sales>=100000&&sales<500000){
        com = 0.3;
        }
        else{
        com = 0.5;
        }
    
        salary = sales*com; 
        return salary;  
    }
    
    public void displayinfo(){
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Hired on: " + getEmpDateHired());
        System.out.println("Birthdate: " + getEmpBirthDate());
        System.out.println("Total sales: " + getTotalSales());
        System.out.println("Salary: " + computeSalary());
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(String.format("\nEmployee ID: " + getEmpID()));
        s.append(String.format("\nEmployee Name: " + getEmpName()));
        s.append(String.format("\nHired on: " + getEmpDateHired()));
        s.append(String.format("\nBirthdate: " + getEmpBirthDate()));
        s.append(String.format("\nTotal sales: " + getTotalSales()));
        s.append(String.format("\nSalary: " + computeSalary()));
        
        return s.toString();
    }
}
