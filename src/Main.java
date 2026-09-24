import java.util.ArrayList;

public class Main {


    public static void countHistoric(ArrayList<Property> portfolio) {
        int historicCount = 0;
        for (Property p : portfolio) {
            if (p.isHistoric()) {
                historicCount++;
            }

        }
        System.out.println("Amount of historic properties: " + historicCount);
    }

    static void main(String[] args) {

        ArrayList<Property> portfolio = new ArrayList<>();


        portfolio.add(new Property("Ödetomt", 52, 1990));
        portfolio.add(new Apartment("Sommargatan 25", 75, 1932, 4));
        portfolio.add(new House("vidervägen 12", 192, 1999, 8));
        portfolio.add(new Cabin("Cabin in the woods 12", 12, 1876, true));

        for (Property p : portfolio) {
            p.describe();


            if (p instanceof House a) {
                System.out.println(" Number of floors: " + a.getNumberOfFloors());
            }
        }

        countHistoric(portfolio);


        System.out.println("================");
        System.out.println("================");
        System.out.println("================");


        House house = new House("Björkvägen 13", 123, 1995, 3) {
        };

        System.out.println( house.calculateMonthlyRent()+ "-..-" + house.getSquareMeters());





    }
}
