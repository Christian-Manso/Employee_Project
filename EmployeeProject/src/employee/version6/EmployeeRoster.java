package version6;

import employee.version4.*;

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
    
    private Employee[] Roster;
    private int count;
    private int max = 10;
    
    public EmployeeRoster() {
        Roster = new Employee[max];
        count = 0;
    }

    public EmployeeRoster(int max) {
        this();
        this.max = max;
    }

    public Employee[] getEmployees() {
        return Roster;
    }

    public int getCount() {
        return count;
    }
    
    public void addEmployee(Employee... input) {
        for (Employee e : input) {
            Roster[count] = e;
            count++;
        }
    }
    
    public Employee removeEmployee(int id) {
        Employee removed = null;
        
        for (int x = 0; x < count; x++) {
            if (id == Roster[x].getEmpID()) {
                this.count--;
                removed = Roster[x];
                for (int y = x; y < count; y++) {
                    Roster[y] = Roster[y + 1];
                }
            }
        }

        return removed;
    }
    
    public boolean updateEmployee(int id, Name name) {
        for (Employee x : Roster) {
            if (x != null && x.getEmpID() == id) {
                x.setEmpName(name);
                return true;
            }
        }

        return false;
    }
    
    public int countEmpType(String type) {
        int count = 0;
        for (int x = 0; Roster[x]!= null; x++) {
            Employee y = Roster[x];
            if (isInstance(y, type)) {
                count++;
            }
        }

        return count;
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
            case "CE":
                instance = (y instanceof CommissionEmployee);
                break;
            case "BPC":
                instance = (y instanceof BasePlusCommissionEmployee);
                break;
            default:
                instance = false;
        }

        return instance;
    }
    
    public void displayEmployeeType(String type) {
        int length = this.countEmpType(type), idx = 0;

        if (length == 0) {
            return;
        }
        Employee[] searchArr = new Employee[length];
        System.out.println("Displaying Employees of Type " + type.toUpperCase());
        for (int y = 0; y < count; y++) {
            Employee x = Roster[y];
            if (isInstance(x, type)) {
                searchArr[idx++] = x;
            }
        }
        this.displayAllEmployees(searchArr, length);
    }
    
    
    public EmployeeRoster searchEmployee(String keyword) {
        EmployeeRoster searchedRoster = new EmployeeRoster(this.count);

        for (int i = 0; i < count; i++) {
            Employee x = Roster[i];
            if (x.getEmpName().toString().toLowerCase().contains(keyword.toLowerCase())) {
                searchedRoster.addEmployee(x);
            }
        }
        System.out.println("Matches that contain keyword: `" + keyword + "`");
        displayAllEmployees(searchedRoster.getEmployees(), searchedRoster.count);
        return searchedRoster;
    }
    
    public void displayAllEmployees() {
        this.displayAllEmployees(Roster, count);
    }

    public void displayAllEmployees(Employee[] EmpArr, int length) {
        double salary;
        if (length == 0) {
            System.out.println("Employee Roster is Empty!\n");
            return;
        }
        
        for (int y = 0; y < length; y++) {
            Employee x = Roster[y];
            if (x != null) {
                
                
                System.out.println("\nName: " + x.getEmpName());
                System.out.println("\nID: " + x.getEmpID());
                System.out.println("\nClass: " + x.getClass().getSimpleName());
                System.out.println("\nSalary: " + x.computeSalary());
            }

        }
        System.out.println("\n");
    }

    @Override
    public double computeSalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
