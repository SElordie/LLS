package Account_App;

import java.util.Scanner;

public class Login extends App {

    Scanner sc = new Scanner(System.in);
    String username, password, code;
    int codeRdmPart, i, j, tries = 0;
    boolean logged = false, vr, firstTime = true, correct = false;

    public void infoCheck() {
        System.out.println("Hello! To access your account, please fill in the information!");
        do {
            verifyName();
        } while (!logged);
    }

    public void verifyName() {
        if (firstTime) {
            System.out.println("NOTICE - Username must be min. 5 and max. 7 letters!");
            System.out.print("Enter your username: ");
            username = sc.next();
            correctUsername(username);
            if (correct == true && firstTime == false) {
                firstTime = true;
                correct = false;
                verifyPassword();
            }
        } else {
            System.out.print("Enter your username: ");
            username = sc.next();
            correctUsername(username);
        }
    }

    public void correctUsername(String UN) {
        do {
            if (UN.length() >= 5 && UN.length() <= 7) {
                correct = true;
                firstTime = false;
                break;
            } else {
                System.out.println("ERROR - Username must be min. 5 and max. 7 letters!");
                firstTime = false;
                verifyName();
            }
        } while (!correct);
    }

    public void checkUsername(String un) {
        //incoming code soon...
    }

    public void verifyPassword() {
        if (firstTime) {
            System.out.println("NOTICE - Password must be min. 4 and max. 6 characters!");
            System.out.print("Enter your password: ");
            password = sc.next();
            correctPassword(password);
        } else {
            System.out.print("Enter your password: ");
            password = sc.next();
            correctUsername(password);
        }
    }

    public void correctPassword(String PW) {
        do {
            if (PW.length() >= 4 && PW.length() <= 6) {
                correct = true;
                firstTime = false;
                break;
            } else {
                System.out.println("ERROR - Password must be min. 4 and max. 6 characters!");
                firstTime = false;
                verifyPassword();
            }
        } while (!correct);
    }

}
