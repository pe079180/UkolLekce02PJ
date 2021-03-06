package com.engeto.lekce2pj;

import java.math.BigDecimal;

public class HotelRoom {
    private int roomNumber;
    private int bedCount;
    private BigDecimal price;
    private YesNo balcony;
    private YesNo seaView;

    public HotelRoom(int roomNumber, int bedCount, BigDecimal price, YesNo balcony, YesNo seaView) {
        this.roomNumber = roomNumber;
        this.bedCount = bedCount;
        this.price = price;
        this.balcony = balcony;
        this.seaView = seaView;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public YesNo getBalcony() {
        return balcony;
    }

    public void setBalcony(YesNo balcony) {
        this.balcony = balcony;
    }

    public YesNo getSeaView() {
        return seaView;
    }

    public void setSeaView(YesNo seaView) {
        this.seaView = seaView;
    }

    public String getDescription() {
        return ("room No." + roomNumber + ": " + " beds count: " + bedCount +
                ", price: " + price + ", balcony :" + balcony + ", sea view: " + seaView);
    }
}
