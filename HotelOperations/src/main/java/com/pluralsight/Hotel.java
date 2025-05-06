package com.pluralsight;

public class Hotel {
        private String name;
        private int numberOfSuites;
        private int numberOfRooms;
        private int bookedSuites;
        private int bookedBasicRooms;

        // Constructors
        public Hotel(String name, int numberOfSuites, int numberOfRooms) {
            this.name = name;
            if (numberOfSuites > 0) {
                this.numberOfSuites = numberOfSuites;
            } else {
                this.numberOfSuites = 0;
            }
            if (numberOfRooms > 0) {
                this.numberOfRooms = numberOfRooms;
            } else {
                this.numberOfRooms = 0;
            }
            this.bookedSuites = 0;
            this.bookedBasicRooms = 0;
        }

        public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
            this.name = name;
            if (numberOfSuites > 0) {
                this.numberOfSuites = numberOfSuites;
            } else {
                this.numberOfSuites = 0;
            }
            if (numberOfRooms > 0) {
                this.numberOfRooms = numberOfRooms;
            } else {
                this.numberOfRooms = 0;
            }
            if (bookedSuites > 0) {
                this.bookedSuites = bookedSuites;
            } else {
                this.bookedSuites = 0;
            }
            if (bookedBasicRooms > 0) {
                this.bookedBasicRooms = bookedBasicRooms;
            } else {
                this.bookedBasicRooms = 0;
            }
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getNumberOfSuites() {
            return numberOfSuites;
        }

        public int getNumberOfRooms() {
            return numberOfRooms;
        }

        public int getBookedSuites() {
            return bookedSuites;
        }

        public int getBookedBasicRooms() {
            return bookedBasicRooms;
        }

        public int getAvailableSuites() {
            return numberOfSuites - bookedSuites;
        }

        public int getAvailableRooms() {
            return numberOfRooms - bookedBasicRooms;
        }

        // Methods
        public boolean bookRoom(int numberOfRooms, boolean isSuite) {
            if (isSuite) {
                if (numberOfRooms <= getAvailableSuites() && numberOfRooms > 0) {
                    bookedSuites += numberOfRooms;
                    return true;
                }
            } else {
                if (numberOfRooms <= getAvailableRooms() && numberOfRooms > 0) {
                    bookedBasicRooms += numberOfRooms;
                    return true;
                }
            }
            return false;
        }
    }