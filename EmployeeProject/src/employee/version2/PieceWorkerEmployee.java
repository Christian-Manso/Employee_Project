package version2;

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
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private float ratePerPiece;
    
    
    public PieceWorkerEmployee(){
        super();
    }
    public PieceWorkerEmployee(String name, int id){
        super(name,id);
    }
    public PieceWorkerEmployee(String name, int id, String dateHired, String bdate) throws ParseException{
        super(name, id, dateHired, bdate);
    }
    
    public PieceWorkerEmployee(String name, int id, String dateHired, String bdate, int totalPiecesFinished, float ratePerPiece) throws ParseException{
        super(name, id, dateHired, bdate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public void setPiecesFinished(int totalPiecesFinished){
        this.totalPiecesFinished = totalPiecesFinished;
    }
    
    public void setRatePerPiece(float ratePerPiece){
        this.ratePerPiece = ratePerPiece;
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
    
    
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("Pieces finished: " + getTotalPiecesFinished());
        System.out.println("Price per piece: " + getRatePerPiece());
        System.out.println("Salary: " + computeSalary());
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(String.format(super.toString()));
        s.append(String.format("\nPieces finished: " + getTotalPiecesFinished()));
        s.append(String.format("\nPrice per piece: " + getRatePerPiece()));
        
        return s.toString();
    }
}
