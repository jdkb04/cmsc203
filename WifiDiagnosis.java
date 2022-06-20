/*
 * Class: CMSC203 
 * Instructor: Professor Grinberg
 * Description: This is the WiFiDiagnosis class. The program tells the user to follow the diagnosis.
 *  The program asks the user to try a diagnostic method and depending on if their answer is yes or no, different instructions will be outputted.
 * Due: 6/18/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Jay Desai
*/


import java.util.Scanner;

public class WifiDiagnosis {
    public static void WifiDiagnosis() {
        Scanner scan = new Scanner(System.in); //Creates a new scanner
        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work");
        System.out.println("Reboot the computer and try to connect"); //Asks question
        System.out.println("Did that fix the problem?");
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("no")) {
            System.out.println("Reboot the router and try to connect");
            System.out.println("Did that fix the problem?");

        }
        else if (input.equalsIgnoreCase("yes")){
            System.out.println("Rebooting the computer seemed to work");
            System.out.println("Jay Desai");
        }

        String second = scan.nextLine();
        if (second.equalsIgnoreCase("no")) {
            System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router ");
            System.out.println("Did that fix the problem?");        }
        else if (second.equalsIgnoreCase("yes")){
            System.out.println("Rebooting the router seemed to work");
            System.out.println("Jay Desai");
        }


        String third = scan.nextLine();
        if (third.equalsIgnoreCase("no")) {
            System.out.println("Move the computer closer to the router and try to connect");
            System.out.println("Did that fix the problem?");        }
        else if (third.equalsIgnoreCase("yes")){
            System.out.println("Making sure router cables were plugged in and that it was getting power seemed to work");
            System.out.println("Jay Desai");
        }

        String fourth = scan.nextLine();
        if (fourth.equalsIgnoreCase("no")) {
            System.out.println("Contact your ISP");
            System.out.println("Jay Desai");}
        else if (fourth.equalsIgnoreCase("yes")){
            System.out.println("Moving the computer seemed to work");
            System.out.println("Jay Desai");
        }



    }


    public static void main(String[] args) {
        WifiDiagnosis();
    }


}
