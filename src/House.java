public class House extends Property implements Rentable, Owner {
    private int numberOfFloors;



    public House(String address, int squareMeters, int yearBuilt, int numberOfFloors) {
        super(address, squareMeters, yearBuilt);
        this.numberOfFloors = numberOfFloors;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    @Override
    public void describe() {
        System.out.println(getAddress() + "(" + getYearBuilt() + ") - " + getSquareMeters() + "kvm. number of floors: " + numberOfFloors);
    }

    @Override
    public double calculateMonthlyRent() {
        return getSquareMeters() * 130.0 + numberOfFloors *500;
    }

    @Override
    public void doesHaveOwner() {

    }

    @Override
    public int ageOfOwner() {
        return 0;
    }
}
