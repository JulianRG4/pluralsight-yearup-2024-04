package com.pluralsight;

public class Employee
{
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularPay() {
        if (hoursWorked <= 40) {
            return payRate * hoursWorked;
        } else {
            return payRate * 40;
        }
    }
    public double getOvertimePay()
    {
        if (hoursWorked > 40) {
            return payRate * (hoursWorked - 40) * 1.5; // Overtime pay rate is 1.5 times the regular pay rate
        } else {
            return 0; // No overtime pay if worked hours are less than or equal to 40
        }
    }

    public double getTotalPay()
    {
        return getRegularPay() + getOvertimePay();
    }

}
