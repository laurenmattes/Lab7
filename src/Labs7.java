import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Labs7 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String name = validName(scnr, "Please enter a valid name: ");
		System.out.println(name);
		Scanner date = getDate(scnr, "Please enter a valid date: ");

		scnr.close();

	}

	private static String validName(Scanner scnr, String prompt) {
		String name;

		System.out.println(prompt);
		name = scnr.nextLine();
		if (!name.matches("[a-zA-Z_]+")) {
			System.out.println("Invalid name");

		} else
			scnr.nextLine();
		return name;

	}

	public static Date getDate(Scanner scnr, String prompt) {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		format.setLenient(false); // <-- date format must match
		boolean isValid = false;
		Date date = null;
		String input;
		do {
			// Step 1: get the raw string
			input = getString(scnr, prompt);
			// Step 2: convert it to a date
			try {
				// format.parse throws a ParseException, which is a checked exception and MUST
				// be caught.
				date = format.parse(input);
				// If exception doesn't occur, it's valid.
				isValid = true;
			} catch (ParseException ex) {
				// If exception occurs, it's invalid.
				isValid = false;
				System.out.println("Enter a valid date in format mm/dd/yyyy.");
			}

		} while (!isValid);
		return date;
	}

	private static String getString(Scanner scnr, String prompt) {
		// TODO Auto-generated method stub
		return null;
	}

}
