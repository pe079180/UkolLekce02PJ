package com.engeto.lekce2pj;

import java.util.ArrayList;
import java.util.List;

public class BookingList {
    private List<Booking> bookings;

    public BookingList() {
        //this.bookings = bookings;
        this.bookings = new ArrayList<>();  //empty  booking list os created
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }
    public String getDescription() {
        String bookingList = "";//""booking list:\n";

        for(int i=1;i<=bookings.size();i++){
            bookingList = bookingList+ bookings.get(i-1).getDescription()+"\n";
        }

        return (bookingList);
    }
}
