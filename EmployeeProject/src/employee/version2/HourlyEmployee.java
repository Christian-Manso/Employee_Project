package version2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.ParseException;

/**
 *
 * @author Christian
 */
public class HourlyEmployee extends Employee {
    
    private float totalHoursWorked;
    private float ratePerHour;
    
    public HourlyEmployee(){
        super();
    }
    
    public HourlyEmployee(String name, int id){
        super(name, id);
    }
    public HourlyEmployee(String name, int id, String dateHired, String bdate) throws ParseException{
        super(name, id, dateHired, bdate);
    }
    
    public HourlyEmployee(String name, int id, String dateHired, String bdate, float totalHoursWorked, float ratePerHour) throws ParseException{
        super(name, id, dateHired, bdate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public void setTotalHoursWorked(float totalHoursWorked){
        this.totalHoursWorked = totalHoursWorked;
    }
    
    public void setRatePerHour(float ratePerHour){
        this.ratePerHour = ratePerHour;
    }
    
    public float getTotalHoursWorked(){
        return this.totalHoursWorked;
    }
    
    public float getRatePerHour(){
        return this.ratePerHour;
    }
    
    public double computeSalary(){
        double salary;
        float rate = getRatePerHour();
        float overtimehrs = getTotalHoursWorked() - 40;
        if(overtimehrs>0){
            salary = (40*rate) + (overtimehrs*rate*1.5); 
            return salary;
        }
        else{
            salary = getTotalHoursWorked()*rate;
            return salary;
        }
    }
    
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("Hours clocked in: " + getTotalHoursWorked());
        System.out.println("Hourly wage: " + getRatePerHour());
        System.out.println("Salary: " + computeSalary());      
    }
    
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append(String.format(super.toString()));
        s.append(String.format("\nHours clocked in: " + getTotalHoursWorked()));
        s.append(String.format("Hourly wage: " + getRatePerHour()));
        s.append(String.format("\nHourly wage: " + getRatePerHour()));
           
        return s.toString();
    }
}
