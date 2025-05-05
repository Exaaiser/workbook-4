package com.pluralsight;

public class Reservation {
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;

    // Constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        setRoomType(roomType);
    }

    // Getters
    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return pricePerNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public double getReservationTotal() {
        return pricePerNight * numberOfNights;
    }

    // Setters
    public void setRoomType(String roomType) {
        this.roomType = roomType;
        this.pricePerNight = roomType.equals("king") ? 139.00 : 124.00;
        if (isWeekend) {
            this.pricePerNight *= 1.10;
        }
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights > 0 ? numberOfNights : this.numberOfNights;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
        this.pricePerNight = roomType.equals("king") ? 139.00 : 124.00;
        if (isWeekend) {
            this.pricePerNight *= 1.10;
        }
    }
}

