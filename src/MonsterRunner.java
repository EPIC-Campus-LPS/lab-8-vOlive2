import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class MonsterRunner {
	public static void main(String[] args) throws IOException {
		File file = new File("monsters.txt");
		Scanner scan = new Scanner(file);
		Monster m = new Monster("POOP", "Earth", 0);

		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Scanner lineScanner = new Scanner(line);
			String pickup1 = lineScanner.next();
			pickup1 = pickup1.substring(0, pickup1.length()-1);
			String pickup2 = lineScanner.next();
			pickup2 = pickup2.substring(0, pickup2.length()-1);
			int pickup3 = lineScanner.nextInt();
			Monster m1 = new Monster(pickup1, pickup2, pickup3);
			m = Monster.basicBattle(m, m1);
		}
		scan.close();
		System.out.println(m);
	}
}
