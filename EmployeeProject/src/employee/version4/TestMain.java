package employee.version4;

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
        String[] suffixes = {"Sr","Jr","III"};
        
        HourlyEmployee hr = new HourlyEmployee("Christian", "Barnido", "Manso", suffixes, 22102773, "30/6/2022", "08/11/2003", 50, 10);
        hr.displayinfo();
        
        PieceWorkerEmployee pw = new PieceWorkerEmployee("Joselito", "Vsmth", "Yap", suffixes, 22102774, "30/6/2022", "09/11/2003", 200, 30);
        pw.displayinfo();
         
        CommissionEmployee ce = new CommissionEmployee("Rey", "Laurence", "Capoy", suffixes, 22102775, "30/6/2022", "10/11/2003", 250000);
        ce.displayinfo();
        
        BasePlusCommissionEmployee bce = new BasePlusCommissionEmployee("Matthew", "Cedric", "Caingcoy", suffixes, 22102776, "30/6/2022", "10/11/2003", 250000, 20000);
        bce.displayinfo();
        
        EmployeeRoster er = new EmployeeRoster();

        er.addEmployee(bce, hr, pw, ce);
        er.displayAllEmployees();
        System.out.println("Removed: " + er.removeEmployee(0));
        er.displayAllEmployees();
        er.searchEmployee("Montanez");
        er.updateEmployee(22102775, new Name("Simone", "Mikaela", "Montanez"));
        er.searchEmployee("Montanez");
        er.displayAllEmployees();
        er.displayEmployeeType("pw");
    }
}