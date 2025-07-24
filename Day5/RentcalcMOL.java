package Day5;

public class RentcalcMOL {
	public void calcRent(double rent, double maintenance, double electricity) {
		double total = rent + maintenance + electricity;
		System.out.println("Total rent of house was: "+total);
	}
	public void calcRent(double rent, double waterbill, int gasbill) {
		double total = rent + waterbill + gasbill;
		System.out.println("Total rent of house was: "+total);
	}
	public static void main(String[] args) {
        RentcalcMOL rentCalc = new RentcalcMOL();

                            
        rentCalc.calcRent(15000.0, 500.0, 1000.0);   
        rentCalc.calcRent(25000.0, 1000.0, 800); 
    }
}
