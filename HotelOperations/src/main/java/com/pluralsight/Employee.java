package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Constructor
    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked)
    {if (employeeId == null || employeeId.trim().isEmpty()) {
        new IllegalArgumentException("Employee ID cannot be null or empty");
    }
        if (name == null || name.trim().isEmpty()) {
        new IllegalArgumentException("Name cannot be null or empty");
    }
        if (department == null || department.trim().isEmpty()) {
        new IllegalArgumentException("Department cannot be null or empty");
    }
        if (payRate <= 0) {
        new IllegalArgumentException("Pay rate must be positive");
    }
        if (hoursWorked < 0) {
        new IllegalArgumentException("Hours worked cannot be negative");
    }
        {
            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
            this.payRate = payRate;
            this.hoursWorked = hoursWorked;

        }
    }

    public String getName() {
        return name;
    }

    public double getPayRate() {
        return payRate;
    }

    public String getDepartment() {
        return department;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    public  String getEmployeeId() {
        return employeeId;
    }

    // Derived getters
    public double getRegularHours() {
        return Math.min(hoursWorked, 40.0);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40.0);
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * (payRate * 1.5);
        return regularPay + overtimePay;
    }

    // Setters
    public void setPayRate(double payRate) {
        this.payRate = payRate > 0 ? payRate : this.payRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked >= 0 ? hoursWorked : this.hoursWorked;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}