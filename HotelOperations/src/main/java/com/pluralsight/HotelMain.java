package com.pluralsight;

public class HotelMain {
        public static void main(String[] args) {
            // Test 1: Room Class Testing
            System.out.println("=== Room Class Testing ===");
            Room room = new Room(2, 139.00); // 2 beds, $139/night
            System.out.println("Room created: " + room.getNumberOfBeds() + " beds, $" + room.getPrice());
            System.out.println("Initial status - Occupied: " + room.isOccupied() + ", Dirty: " + room.isDirty());
            System.out.println("Available: " + room.isAvailable());

            // Check-in
            room.checkIn();
            System.out.println("After check-in - Occupied: " + room.isOccupied() + ", Dirty: " + room.isDirty());
            System.out.println("Available: " + room.isAvailable());

            // Check-out
            room.checkOut();
            System.out.println("After check-out - Occupied: " + room.isOccupied() + ", Dirty: " + room.isDirty());
            System.out.println("Available: " + room.isAvailable());

            // Clean room
            room.cleanRoom();
            System.out.println("After cleaning - Occupied: " + room.isOccupied() + ", Dirty: " + room.isDirty());
            System.out.println("Available: " + room.isAvailable());

            // Test 2: Reservation Class Testing
            System.out.println("\n=== Reservation Class Testing ===");
            Reservation reservation = new Reservation("king", 3, true); // King room, 3 nights, weekend
            System.out.println("Reservation: " + reservation.getRoomType() + ", " + reservation.getNumberOfNights() + " nights");
            System.out.println("Weekend: " + reservation.isWeekend());
            System.out.println("Price per night: $" + reservation.getPrice());
            System.out.println("Total cost: $" + reservation.getReservationTotal());

            // Update to weekday
            reservation.setIsWeekend(false);
            System.out.println("After updating to weekday:");
            System.out.println("Price per night: $" + reservation.getPrice());
            System.out.println("Total cost: $" + reservation.getReservationTotal());

            // Update number of nights
            reservation.setNumberOfNights(5);
            System.out.println("After updating to 5 nights - Total cost: $" + reservation.getReservationTotal());

            // Test 3: Employee Class Testing
            System.out.println("\n=== Employee Class Testing ===");
            Employee employee = new Employee("E123", "Ayşe Yılmaz", "Housekeeping", 20.0, 0.0);
            System.out.println("Employee: " + employee.getName() + ", ID: " + employee.getEmployeeId());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Hourly rate: $" + employee.getPayRate());
            System.out.println("Hours worked: " + employee.getHoursWorked());

            // Punch time card
            employee.punchTimeCard(10.0); // Punch in at 10:00 AM
            System.out.println("Punched in at 10:00 AM");
            employee.punchTimeCard(18.5); // Punch out at 6:30 PM
            System.out.println("Punched out at 6:30 PM");
            System.out.println("Hours worked: " + employee.getHoursWorked());
            System.out.println("Regular hours: " + employee.getRegularHours());
            System.out.println("Overtime hours: " + employee.getOvertimeHours());
            System.out.println("Total pay: $" + employee.getTotalPay());

            // Another punch cycle
            employee.punchTimeCard(9.0); // Punch in at 9:00 AM
            employee.punchTimeCard(17.75); // Punch out at 5:45 PM
            System.out.println("After another shift (9:00 AM to 5:45 PM):");
            System.out.println("Hours worked: " + employee.getHoursWorked());
            System.out.println("Regular hours: " + employee.getRegularHours());
            System.out.println("Overtime hours: " + employee.getOvertimeHours());
            System.out.println("Total pay: $" + employee.getTotalPay());
        }
}