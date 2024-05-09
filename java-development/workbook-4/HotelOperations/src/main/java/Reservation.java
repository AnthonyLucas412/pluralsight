public class Reservation {

    private String RoomType;
    private double Price;
    private int NumberofNights;
    private boolean IsWeekend;

    public Reservation(String roomType, int numberofNights, boolean isWeekend) {
        this.RoomType = roomType;
        this.NumberofNights = numberofNights;
        this.IsWeekend = isWeekend;
        if (roomType.equals("king")) {
            this.Price = 139.00;
        } else if (roomType.equals("double")) {
            this.Price = 124.00;


        }

    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getNumberofNights() {
        return NumberofNights;
    }

    public void setNumberofNights(int numberofNights) {
        NumberofNights = numberofNights;
    }

    public boolean isWeekend() {
        return IsWeekend;
    }

    public void setWeekend(boolean weekend) {
        IsWeekend = weekend;
    }

    public double getReservationTotal() {
        double totalPrice = Price * NumberofNights;
        if (isWeekend()) {
            totalPrice *= 1.1;
        }
        return totalPrice;


    }
}

