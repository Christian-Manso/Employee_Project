package employee.version3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
import java.text.ParseException;
/**
 *
 * @author User
 */
public class TestMain {
    public static void main(String[] args) throws ParseException {
        
        String[] suffix = {"Sr.","Jr.","III"};
        
        System.out.println("Hourly Employee");
        HourlyEmployee he = new HourlyEmployee();
        he.setFname("Christian");
        he.setMname("Barnido");
        he.setLname("Manso");
        he.setSuffix(suffix);
        he.setEmpID(22102773);
        he.setEmpBirthDate("08/11/2003");
        he.setEmpDateHired("30/6/2022");
        he.setRatePerHour(69);
        he.setTotalHoursWorked(50);
        he.displayinfo();
        String display = he.toString();
        System.out.println(display);
       
        System.out.println("\nPiece Worker Employee");
        PieceWorkerEmployee pe = new PieceWorkerEmployee();
        pe.setFname("Christian");
        pe.setMname("Barnido");
        pe.setLname("Manso");
        pe.setSuffix(suffix);
        pe.setEmpID(22102773);
        pe.setEmpBirthDate("08/11/2003");
        pe.setEmpDateHired("30/6/2022");
        pe.setRatePerPiece(50);
        pe.setPiecesFinished(69);
        pe.displayinfo();
        display = pe.toString();
        System.out.println(display);
        
        System.out.println("\nCommisision Employee");
        CommissionEmployee ce = new CommissionEmployee();
        ce.setFname("Christian");
        ce.setMname("Barnido");
        ce.setLname("Manso");
        ce.setSuffix(suffix);
        ce.setEmpID(22102773);
        ce.setEmpBirthDate("08/11/2003");
        ce.setEmpDateHired("30/6/2022");
        ce.setTotalSales(250000);
        ce.displayinfo();
        display = ce.toString();
        System.out.println(display);
        
        System.out.println("\nBase {lus Commisision Employee");
        BasePlusCommissionEmployee be = new BasePlusCommissionEmployee();
        be.setFname("Christian");
        be.setMname("Barnido");
        be.setLname("Manso");
        be.setSuffix(suffix);
        be.setEmpID(22102773);
        be.setEmpBirthDate("08/11/2003");
        be.setEmpDateHired("30/6/2022");
        be.setTotalSales(250000);
        be.setBaseSalary(20000);
        be.displayinfo();
        display = be.toString();
        System.out.println(display);
    }
}