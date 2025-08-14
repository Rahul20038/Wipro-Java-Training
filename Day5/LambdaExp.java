package Day5;
interface Addition{
	double add(double a, double b);
}
public class LambdaExp {
	public static void main(String[] args) {
		Addition addition = (a, b) -> a+b;
		double result = addition.add(100, 850);
		System.out.println("Addition: "+ result);
		Addition subraction = (a,b) -> a-b;
		double subresult = subraction.add(5200, 3000);
		System.out.println("Subraction: "+ subresult);
		Addition multiplication = (a,b) -> a*b;
		double mulresult = multiplication.add(5, 6);
		System.out.println("Multiplication: "+ mulresult);
		Addition division = (a,b) -> a/b;
		double divres = division.add(100,5);
		System.out.println("Division: "+ divres);
	}

}
