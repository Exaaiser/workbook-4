package com.pluralsight;

public class HotelMain {
    public static void main(String[] args) {
                    // Test 1: Room Class Testing
                    System.out.println("=== Room Class Testing ===");
                    Room room = new Room(2, 139.00); // 2 beds, $139/night
                    System.out.println("Room created: " + room.getNumberOfBeds() + " beds, $" + room.getPrice());
                    System.out.println("Initial status - Occupied: " + room.isOccupied() + ", Dirty: " + room.isDirty());
                    System.out.println("Available: " + room.isAvailable());

                    room.checkIn();
                    System.out.println("After check-in - Occupied: " + room.isOccupied() + ", Dirty: " + room.isDirty());
                    System.out.println("Available: " + room.isAvailable());

                    room.checkOut();
                    System.out.println("After check-out - Occupied: " + room.isOccupied() + ", Dirty: " + room.isDirty());
                    System.out.println("Available: " + room.isAvailable());

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

                    reservation.setIsWeekend(false);
                    System.out.println("After updating to weekday:");
                    System.out.println("Price per night: $" + reservation.getPrice());
                    System.out.println("Total cost: $" + reservation.getReservationTotal());

                    // Test 3: Employee Class Testing
                    System.out.println("\n=== Employee Class Testing ===");
                    Employee employee = new Employee("E123", "Ayşe Yılmaz", "Housekeeping", 20.0, 0.0);
                    System.out.println("Employee: " + employee.getName() + ", ID: " + employee.getEmployeeId());
                    System.out.println("Initial hours worked: " + employee.getHoursWorked());

                    // Test punchTimeCard with manual time
                    employee.punchTimeCard(10.0); // Punch in at 10:00 AM
                    System.out.println("Punched in at 10:00 AM");
                    employee.punchTimeCard(18.5); // Punch out at 6:30 PM
                    System.out.println("Punched out at 6:30 PM");
                    System.out.println("Hours worked: " + employee.getHoursWorked());
                    System.out.println("Total pay: $" + employee.getTotalPay());

                    // Test punchIn/punchOut with current time
                    employee.punchIn();
                    System.out.println("Punched in at current time");
                    try {
                        Thread.sleep(1000); // Wait 1 second to simulate time passing
                    } catch (InterruptedException e) {
                        System.out.println("Sleep interrupted");
                    }
                    employee.punchOut();
                    System.out.println("Punched out at current time");
                    System.out.println("Hours worked: " + employee.getHoursWorked());
                    System.out.println("Total pay: $" + employee.getTotalPay());

                    // Test 4: Hotel Class Testing
                    System.out.println("\n=== Hotel Class Testing ===");
                    Hotel hotel = new Hotel("Sunset Inn", 10, 20); // 10 suites, 20 basic rooms
                    System.out.println("Hotel: " + hotel.getName());
                    System.out.println("Total suites: " + hotel.getNumberOfSuites() + ", Available suites: " + hotel.getAvailableSuites());
                    System.out.println("Total basic rooms: " + hotel.getNumberOfRooms() + ", Available rooms: " + hotel.getAvailableRooms());

                    // Book rooms
                    boolean booked = hotel.bookRoom(3, true); // Book 3 suites
                    System.out.println("Booked 3 suites: " + (booked ? "Success" : "Failed"));
                    System.out.println("Available suites: " + hotel.getAvailableSuites());

                    booked = hotel.bookRoom(5, false); // Book 5 basic rooms
                    System.out.println("Booked 5 basic rooms: " + (booked ? "Success" : "Failed"));
                    System.out.println("Available rooms: " + hotel.getAvailableRooms());

                    // Test overbooking
                    booked = hotel.bookRoom(10, true); // Try to book 10 suites (only 7 left)
                    System.out.println("Booked 10 suites: " + (booked ? "Success" : "Failed"));
                    System.out.println("Available suites: " + hotel.getAvailableSuites());
                }
            }