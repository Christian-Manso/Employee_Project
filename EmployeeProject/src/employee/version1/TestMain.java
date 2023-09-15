/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;
import java.text.ParseException;
/**
 *
 * @author User
 */
public class TestMain {
    public static void main(String[] args) throws ParseException {
        System.out.println("Hourly Employee");
        HourlyEmployee he = new HourlyEmployee();
        he.setEmpName("Christian");
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
        pe.setEmpName("Christian");
        pe.setEmpID(22102773);
        pe.setEmpBirthDate("08/11/2003");
        pe.setEmpDateHired("30/6/2022");
        pe.setRatePerPiece(50);
        pe.setPiecesFinished(69);
        pe.displayinfo();
        display = pe.toString();
        System.out.println(display);
        
        System.out.println("\nCommisision Employee");
        CommisisionEmployee ce = new CommisisionEmployee();
        ce.setEmpName("Christian");
        ce.setEmpID(22102773);
        ce.setEmpBirthDate("08/11/2003");
        ce.setEmpDateHired("30/6/2022");
        ce.setTotalSales(250000);
        ce.displayinfo();
        display = ce.toString();
        System.out.println(display);
        
        System.out.println("\nBase Plus Commission Employee");
        BasePlusCommissionEmployee be = new BasePlusCommissionEmployee();
        be.setEmpName("Christian");
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
