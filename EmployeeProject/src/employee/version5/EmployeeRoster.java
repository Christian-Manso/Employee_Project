package employee.version5;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class EmployeeRoster extends Employee {
    
    private final ArrayList<Employee> Employees;
    
    public EmployeeRoster(){
        Employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return Employees;
    }

    
    public void addEmployee(Employee input){   
        Employees.addAll(Arrays.asList(input)); 
    }
    
    public Employee removeEmployee(int id) {
        for (Employee x : Employees) {
            if (x != null && x.getEmpID() == id) {
                Employees.remove(x);
                return x;
            }
        }
        return null;
    }
    
    public boolean updateEmployee(int id, Name name) {
        for (Employee x : Employees) {
            if (x != null && x.getEmpID() == id) {
                x.setEmpName(name);
                return true;
            }
        }

        return false;
    }
    
    public int countEmpType(String type) {
        int empCount = 0;
        for (Employee y : Employees) {
            if (isInstance(y, type)) {
                empCount++;
            }
        }
        return empCount;
    }
    
    private boolean isInstance(Employee y, String type) {
        boolean instance;
        type = type.toUpperCase();
        
        switch (type) {
            case "HE":
                instance = (y instanceof HourlyEmployee);
                break;
            case "PW":
                instance = (y instanceof PieceWorkerEmployee);
                break;
            case "BCE":
                instance = (y instanceof BasePlusCommissionEmployee);
                break;
            case "CE":
                instance = (y instanceof CommissionEmployee) && !(y instanceof BasePlusCommissionEmployee);
                break;
            default:
                instance = false;
        }
        
        return instance;
    }
    
    public void displayEmployeeType(String type) {
        int length = this.countEmpType(type);
        if (length == 0) {
            return;
        }
        ArrayList<Employee> searchArr = new ArrayList<>();
        System.out.println("Displaying Employees of Type " + type.toUpperCase());
        for (Employee x : Employees) {
            if (isInstance(x, type)) {
                searchArr.add(x);
            }
        }
        this.displayAllEmployees(searchArr);
    }
    
    private double getSalary(Employee x) {
        double salary = 0;
        
        if (x instanceof HourlyEmployee) {
        HourlyEmployee he = (HourlyEmployee) x;
        salary = he.computeSalary();
    } else if (x instanceof PieceWorkerEmployee) {
        PieceWorkerEmployee pwe = (PieceWorkerEmployee) x;
        salary = pwe.computeSalary();
    } else if (x instanceof BasePlusCommissionEmployee) {
        BasePlusCommissionEmployee bce = (BasePlusCommissionEmployee) x;
        salary = bce.computeSalary();
    } else if (x instanceof CommissionEmployee) {
        CommissionEmployee ce = (CommissionEmployee) x;
        salary = ce.computeSalary();
    } 
        
        return salary;
    }
    
    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster searchedRoster = new EmployeeRoster();

        for (Employee x : Employees) {
            if (x.getEmpName().toLowerCase().contains(keyword.toLowerCase())) {
                searchedRoster.addEmployee(x);
            }
        }

        System.out.println("Matches that contain keyword: `" + keyword + "`");
        displayAllEmployees(searchedRoster.getEmployees());
        return searchedRoster;
    }
    
    public void displayAllEmployees() {
        this.displayAllEmployees(Employees);
    }

    public void displayAllEmployees(ArrayList<Employee> EmpArr) {
        double salary;
        if (EmpArr.isEmpty()) {
            System.out.println("Employee Roster is Empty!\n");
            return;
        }
        System.out.println("\n");
        for (Employee x : EmpArr) {
            if (x != null) {
                salary = getSalary(x);
                
                System.out.println("\nName: " + x.getEmpName());
                System.out.println("\nID: " + x.getEmpID());
                System.out.println("\nClass: " + x.getClass().getSimpleName());
                System.out.println("\nSalary: " + salary);
            }
        }

        System.out.println("\n");
    }

    
}
