package com.engeto.lekce2pj;

import java.time.LocalDate;
import java.util.List;

public class Booking {
    private int roomNumber;
    private List<HotelGuest> guests;
    private LocalDate bookedFrom;
    private LocalDate bookedTo;
    private String reasonOfStay;  // "relax", "business"

    public Booking(int roomNumber, List<HotelGuest> guests, LocalDate bookedFrom, LocalDate bookedTo, String reasonOfStay) {
        this.roomNumber = roomNumber;
        this.guests = guests;
        this.bookedFrom = bookedFrom;
        this.bookedTo = bookedTo;
        this.reasonOfStay = reasonOfStay;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<HotelGuest> getGuests() {
        return guests;
    }

    public void setGuests(List<HotelGuest> guests) {
        this.guests = guests;
    }

    public LocalDate getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(LocalDate bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public LocalDate getBookedTo() {
        return bookedTo;
    }

    public void setBookedTo(LocalDate bookedTo) {
        this.bookedTo = bookedTo;
    }

    public String getReasonOfStay() {
        return reasonOfStay;
    }

    public void setReasonOfStay(String reasonOfStay) {
        this.reasonOfStay = reasonOfStay;
    }

    public String getDescription() {
        String guestList = "\n   guests:";

        for(int i=1;i<=guests.size();i++){
            guestList = guestList+ guests.get(i-1).getDescription() + "\n          ";
        }

        return ("Room No." + roomNumber + ": stay from " + bookedFrom + " to " + bookedTo + ", type " + reasonOfStay + guestList);
    }
}
