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
public class BasePlusCommissionEmployee{
    private int empID;
    private String empName;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    private double baseSalary;
    
    public BasePlusCommissionEmployee(){
        
    }
    public BasePlusCommissionEmployee(String name, int id){
        this.empID = id;
        this.empName = name;
    }
    public BasePlusCommissionEmployee(String name, int id, String dateHired, String bdate) throws ParseException{
        this.empID = id;
        this.empName = name;
        this.empDateHired = format.parse(dateHired);
        this.empBirthDate = format.parse(bdate);
    }
    
    public BasePlusCommissionEmployee(String name, int id, String dateHired, String bdate, double totalSales, double baseSalary) throws ParseException{
        this.empID = id;
        this.empName = name;
        this.empDateHired = format.parse(dateHired);
        this.empBirthDate = format.parse(bdate);
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
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
    
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
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
    
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    public double computeSalary(){
        double salary = getBaseSalary();        
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
    
        salary += sales*com; 
        return salary;  
    }
    
    public void displayinfo(){
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Hired on: " + getEmpDateHired());
        System.out.println("Birthdate: " + getEmpBirthDate());
        System.out.println("Total sales: " + getTotalSales());
        System.out.println("Base salary: " + getBaseSalary());
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
        s.append(String.format("\nBase salary: " + getBaseSalary()));
        s.append(String.format("\nSalary: " + computeSalary()));
        
        return s.toString();
    }
}
