package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private boolean isPunchedIn;
    private double startTime;

    // Constructor
    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate > 0 ? payRate : 0.0;
        this.hoursWorked = hoursWorked >= 0 ? hoursWorked : 0.0;
        this.isPunchedIn = false;
        this.startTime = 0.0;
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
    public void punchTimeCard(double time) {
        if (!isPunchedIn) {
            // Punch in
            this.startTime = time;
            this.isPunchedIn = true;
        } else {
            // Punch out
            double hours = time - startTime;
            if (hours >= 0) {
                this.hoursWorked += hours;
            }
            this.isPunchedIn = false;
        }
    }
}
