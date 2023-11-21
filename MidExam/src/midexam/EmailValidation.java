package midexam;

import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");

        String emailAddress = scanner.nextLine();

        if (isValidEmail(emailAddress)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        scanner.close();
    }

    private static boolean isValidEmail(String email) {

        return email.contains("@");
//        return email.contains("." );

    }
}




