public class Property {


    //3 private fält för gemensamma
    private String address;
    private int squareMeters;
    private int yearBuilt;

    public Property(String address, int squareMeters, int yearBuilt) {
        this.address = address;
        this.squareMeters = squareMeters;
        this.yearBuilt = yearBuilt;
    }

    public String getAddress() {
        return address;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }


    public boolean isHistoric() {
        return yearBuilt < 1950;
    }


    public void describe() {
        System.out.println(address + "(" + yearBuilt + ") -" + squareMeters + "kvm");
    }


}
