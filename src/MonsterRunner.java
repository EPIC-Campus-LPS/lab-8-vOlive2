import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
public class MonsterRunner {
	public static void main(String[] args) throws IOException {
		File file = new File("emails.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			Scanner lineScanner = new Scanner(line);
			String email = lineScanner.next();
			
			System.out.print(email.substring(0, email.indexOf("@")));
			System.out.print(", " + pass + "\n");
		}
		scan.close();

	}
}
