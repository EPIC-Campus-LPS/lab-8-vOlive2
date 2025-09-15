import java.util.Scanner;
public class capitalCityRunner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 countries with thier name, capital city's name and their capitls city's population!");
		Country Country1 = new Country(scan.next(), (new CapitalCity (scan.next(), scan.nextInt())));
		Country Country2 = new Country(scan.next(), (new CapitalCity (scan.next(), scan.nextInt())));
		Country Country3 = new Country(scan.next(), (new CapitalCity (scan.next(), scan.nextInt())));
		System.out.println(Country1.toString());
		System.out.println(Country2.toString());
		System.out.println(Country3.toString());
		scan.close();
	}
}
