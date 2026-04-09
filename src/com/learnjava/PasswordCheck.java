import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String password = "";

		while (!password.equals("java123")) {
			System.out.println("Enter password:");
			password = sc.nextLine();
		}

		System.out.println("Login successful");

	}
}