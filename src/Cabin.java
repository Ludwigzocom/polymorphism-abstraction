public class Cabin extends Property implements Owner {
    private boolean hasElectricity;

    public Cabin(String address, int squareMeters, int yearBuilt, boolean hasElectricity) {
        super(address, squareMeters, yearBuilt);
        this.hasElectricity = hasElectricity;
    }


    @Override
    public void describe() {
        System.out.println(getAddress() + "(" + getYearBuilt() + ") - " + getSquareMeters() + "kvm. Have electricity?: " + hasElectricity);
    }

    @Override
    public void doesHaveOwner() {

    }

    @Override
    public int ageOfOwner() {
        return 0;
    }
}
