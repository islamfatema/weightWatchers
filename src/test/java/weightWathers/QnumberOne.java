package weightWathers;
import java.util.Scanner;

public class QnumberOne {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		s.append(scan.nextLine());
		reverseEverything(s);
		scan.close();
	}

	private static void reverseEverything(StringBuilder s) {
		System.out.println(s.reverse());
	}
}
