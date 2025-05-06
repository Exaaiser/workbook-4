package com.pluralsight;

import java.time.LocalDateTime;


    // Constructor
    public class Employee {
        private String employeeId;
        private String name;
        private String department;
        private double payRate;
        private double hoursWorked;
        private boolean isPunchedIn; // Tracks if employee is punched in
        private double startTime; // Stores punch-in time

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

        // Getters
        public String getEmployeeId() {
            return employeeId;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getPayRate() {
            return payRate;
        }

        public double getHoursWorked() {
            return hoursWorked;
        }

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

        // Helper method to convert LocalDateTime to double (e.g., 14:45 -> 14.75)
        private double getCurrentTimeAsDouble() {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            return hour + (minute / 60.0);
        }

        // Time Card Methods
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

        public void punchTimeCard() {
            punchTimeCard(getCurrentTimeAsDouble());
        }

        public void punchIn() {
            if (!isPunchedIn) {
                this.startTime = getCurrentTimeAsDouble();
                this.isPunchedIn = true;
            }
        }

        public void punchOut() {
            if (isPunchedIn) {
                double hours = getCurrentTimeAsDouble() - startTime;
                if (hours >= 0) {
                    this.hoursWorked += hours;
                }
                this.isPunchedIn = false;
            }
        }
    }
