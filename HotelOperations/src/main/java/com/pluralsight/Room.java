package com.pluralsight;

public class Room {
        private int numberOfBeds;
        private double price;
        private boolean occupied;
        private boolean dirty;

        // Constructor
        public Room(int numberOfBeds, double price) {
            this.numberOfBeds = numberOfBeds;
            this.price = price;
            this.occupied = false;
            this.dirty = false;
        }

        // Getters
        public int getNumberOfBeds() {
            return numberOfBeds;
        }

        public double getPrice() {
            return price;
        }

        public boolean isOccupied() {
            return occupied;
        }

        public boolean isDirty() {
            return dirty;
        }

        public boolean isAvailable() {
            return !occupied && !dirty;
        }

        // Optional: Methods to modify room status
        public void setOccupied(boolean occupied) {
            this.occupied = occupied;
        }

        public void setDirty(boolean dirty) {
            this.dirty = dirty;
        }
    public void checkIn() {
        this.occupied = true;
        this.dirty = true;
    }

    public void checkOut() {
        this.occupied = false;
        this.dirty = true; // Room remains dirty after checkout
    }

    public void cleanRoom() {
        this.dirty = false;
    }
}


