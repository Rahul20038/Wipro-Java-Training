package Day5;


abstract class Property {
    int amount;
    Property(int amount) {
        this.amount = amount;
    }

    abstract void calculateRent();
}

class House extends Property {
    House(int amount) {
        super(amount);
    }

    @Override
    void calculateRent() {
        System.out.println("House Rent is ₹" + amount);
    }
}

class Apartment extends Property {
    Apartment(int amount) {
        super(amount);
    }

    @Override
    void calculateRent() {
        System.out.println("Apartment Rent is ₹" + amount);
    }
}

public class Realestate {
    public static void main(String[] args) {
        Property myHouse = new House(12000);
        Property myApartment = new Apartment(9000);

        myHouse.calculateRent();    
        myApartment.calculateRent();  
    }
}
