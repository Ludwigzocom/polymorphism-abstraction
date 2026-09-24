public class Apartment extends Property {

    private int floor;

    public Apartment(String address, int squareMeters, int yearBuilt, int floor) {
        super(address, squareMeters, yearBuilt);
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }


    @Override
    public void describe() {
        System.out.println(getAddress() + "(" + getYearBuilt() + ") - " + getSquareMeters() + "kvm. plan " + floor);
    }
}
