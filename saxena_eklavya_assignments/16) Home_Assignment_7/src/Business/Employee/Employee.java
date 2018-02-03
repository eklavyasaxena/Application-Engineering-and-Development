/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author eklav
 */
public class Employee {
    
    private String employeeName;
    private int employeeID;
    private static int count = 1;

    public Employee() {
        employeeID = count;
        count++;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    @Override
    public String toString() {
        return employeeName;
    }
}
