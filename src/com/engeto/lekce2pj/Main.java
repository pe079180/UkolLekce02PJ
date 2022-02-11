package com.engeto.lekce2pj;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("UkolLekce02PJ - hotel - start");

        // hotel guests
        System.out.println("-- hotel guests");
        HotelGuest guest1;
        guest1 = new HotelGuest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        System.out.println(guest1.getDescription());

        HotelGuest guest2;
        guest2 = new HotelGuest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        System.out.println(guest2.getDescription());

        System.out.println("");

        //rooms setting
        System.out.println("-- hotel rooms");
        HotelRoom room01 = new HotelRoom(1, 1, BigDecimal.valueOf(1000), "yes", "yes");
        HotelRoom room02 = new HotelRoom(2, 1, BigDecimal.valueOf(1000), "yes", "yes");
        HotelRoom room03 = new HotelRoom(3, 3, BigDecimal.valueOf(2400), "no", "yes");
        System.out.println(room01.getDescription());
        System.out.println(room02.getDescription());
        System.out.println(room03.getDescription());
        System.out.println("");

        // booking list initialization
        BookingList bookingList = new BookingList(); //empty booking list is created

        // guests setting

        // first reservation
        List<HotelGuest> guests = new ArrayList<>();
        guests.add(guest1);
        Booking booking = new Booking(1,guests,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),"business");
        bookingList.addBooking(booking);
        //System.out.println( booking.getDescription());

        //second reservation
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);
        booking = new Booking(3,guests,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),"relax");
        bookingList.addBooking(booking);
        //System.out.println( booking.getDescription());

        System.out.println("-- booking list");
        System.out.println(bookingList.getDescription());

        System.out.println("UkolLekce02PJ - hotel - end");
    }
}
