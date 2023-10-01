package employee.version4;


import java.text.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class BasePlusCommissionEmployee extends CommissionEmployee{
  
    private double baseSalary;
    
    public BasePlusCommissionEmployee(){
        super();
    }
    public BasePlusCommissionEmployee(String fname, int id){
        super(fname, id);
    }
    public BasePlusCommissionEmployee(String fname, String lname, int id, String dateHired, String bdate) throws ParseException{
        super(fname,lname, id, dateHired, bdate);
    }
    
    public BasePlusCommissionEmployee(String fname, String mname, String lname, String[] suffix, int id, String dateHired, String bdate, double totalSales, double baseSalary) throws ParseException{
        super(fname, mname, lname, suffix, id, dateHired, bdate, totalSales);
        this.baseSalary = baseSalary;
    }
    
    
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    
    
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    @Override
    public double computeSalary(){
        return super.computeSalary()+getBaseSalary();  
    }
    
    @Override
    public void displayinfo(){
        super.displayinfo();
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(String.format(super.toString()));
        s.append(String.format("\nBase salary: " + getBaseSalary()));
        
        return s.toString();
    }
}

