package com.pluralsight;

public class HotelMain {
        public static void main(String[] args) {
            // Test 1: Room
            System.out.println("=== Room Class Testing ===");
            Room room = new Room(2, 139.00); // 2 beds, $139/night
            System.out.println("Room created: " + room.getNumberOfBeds() + " beds, $" + room.getPrice());
            System.out.println("Initial status - Occupied: " + room.isOccupied() + ", Dirty: " + room.isDirty());
            System.out.println("Available: " + room.isAvailable());

            // Simulate check-in
            room.setOccupied(true);
            room.setDirty(true);
            System.out.println("After check-in - Available: " + room.isAvailable());

            // Simulate cleaning
            room.setDirty(false);
            room.setOccupied(false);
            System.out.println("After cleaning - Available: " + room.isAvailable());

            // Test 2: Reservation Class Testing
            System.out.println("\n=== Reservation Class Testing ===");
            Reservation reservation = new Reservation("king", 3, true); // King room, 3 nights, weekend
            System.out.println("Reservation: " + reservation.getRoomType() + ", " + reservation.getNumberOfNights() + " nights");
            System.out.println("Weekend: " + reservation.isWeekend());
            System.out.println("Price per night: $" + reservation.getPrice());
            System.out.println("Total cost: $" + reservation.getReservationTotal());

            // Test weekday pricing
            reservation.setIsWeekend(false);
            System.out.println("After updating to weekday:");
            System.out.println("Price per night: $" + reservation.getPrice());
            System.out.println("Total cost: $" + reservation.getReservationTotal());

            // Update number of nights
            reservation.setNumberOfNights(5);
            System.out.println("After updating to 5 nights - Total cost: $" + reservation.getReservationTotal());

            // Test 3: Employee Class Testing
            System.out.println("\n=== Employee Class Testing ===");
            Employee employee = new Employee("E123", "Ayşe Yılmaz", "Housekeeping", 20.0, 45.0);
            System.out.println("Employee: " + employee.getName() + ", ID: " + employee.getEmployeeId());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Hourly rate: $" + employee.getPayRate());
            System.out.println("Hours worked: " + employee.getHoursWorked());
            System.out.println("Regular hours: " + employee.getRegularHours());
            System.out.println("Overtime hours: " + employee.getOvertimeHours());
            System.out.println("Total pay: $" + employee.getTotalPay());

            // Update pay rate and hours
            employee.setPayRate(22.0);
            employee.setHoursWorked(50.0);
            System.out.println("After updates:");
            System.out.println("New hourly rate: $" + employee.getPayRate());
            System.out.println("New hours worked: " + employee.getHoursWorked());
            System.out.println("New total pay: $" + employee.getTotalPay());
        }
}