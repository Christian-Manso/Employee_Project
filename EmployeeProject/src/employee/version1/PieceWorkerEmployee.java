/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee{
    private int empID;
    private String empName;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    private Date empDateHired;
    private Date empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;
    
    public PieceWorkerEmployee(){
        
    }
    public PieceWorkerEmployee(String name, int id){
        this.empID = id;
        this.empName = name;
    }
    public PieceWorkerEmployee(String name, int id, String dateHired, String bdate) throws ParseException{
        this.empID = id;
        this.empName = name;
        this.empDateHired = format.parse(dateHired);
        this.empBirthDate = format.parse(bdate);
    }
    
    public PieceWorkerEmployee(String name, int id, String dateHired, String bdate, int totalPiecesFinished, float ratePerPiece) throws ParseException{
        this.empID = id;
        this.empName = name;
        this.empDateHired = format.parse(dateHired);
        this.empBirthDate = format.parse(bdate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
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
    
    public void setPiecesFinished(int totalPiecesFinished){
        this.totalPiecesFinished = totalPiecesFinished;
    }
    
    public void setRatePerPiece(float ratePerPiece){
        this.ratePerPiece = ratePerPiece;
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
    
    public int getTotalPiecesFinished(){
        return this.totalPiecesFinished;
    }
    
    public float getRatePerPiece(){
        return this.ratePerPiece;
    }
    
    
    public double computeSalary(){
        int pieces = getTotalPiecesFinished();
        double salary;
        float rate = getRatePerPiece();
        int bonuscount = pieces % 100;
    
        salary = (pieces*rate) + (bonuscount*rate*10); 
        return salary;
        
    }
    
    public void displayinfo(){
        System.out.println("Employee ID: " + getEmpID());
        System.out.println("Employee Name: " + getEmpName());
        System.out.println("Hired on: " + getEmpDateHired());
        System.out.println("Birthdate: " + getEmpBirthDate());
        System.out.println("Pieces finished: " + getTotalPiecesFinished());
        System.out.println("Price per piece: " + getRatePerPiece());
        System.out.println("Salary: " + computeSalary());
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(String.format("\nEmployee ID: " + getEmpID()));
        s.append(String.format("\nEmployee Name: " + getEmpName()));
        s.append(String.format("\nHired on: " + getEmpDateHired()));
        s.append(String.format("\nBirthdate: " + getEmpBirthDate()));
        s.append(String.format("\nPieces finished: " + getTotalPiecesFinished()));
        s.append(String.format("\nPrice per piece: " + getRatePerPiece()));
        s.append(String.format("\nSalary: " + computeSalary()));
        
        return s.toString();
    }
}
