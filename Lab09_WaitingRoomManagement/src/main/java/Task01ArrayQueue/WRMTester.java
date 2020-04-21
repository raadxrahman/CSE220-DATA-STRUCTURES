package Task01ArrayQueue;

import java.util.Scanner;

/**
 *
 * @author DOLPHIN-PC
 */
public class WRMTester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String menu = "Menu: \n 1.Register patient \n 2.Serve patient \n 3.Cancel all Appointments \n 4.Can doctor go home? \n 5.List of all patient \n 6.Exit";
        System.out.println(menu);
        int option = 0;

        WRM wrm = new WRM();
        
//        if(option <=5)

        while (option != 6) {
            
            try {
                System.out.println("Please choose an option between 1-6 ; maximum 100 patients per day");
                option = sc.nextInt();

                if (option == 1) {
//                    System.out.println("Patient Registered");
                    wrm.RegisterPatient();
                    System.out.println("=====\n" + menu);

                } else if (option == 2) {
                    wrm.ServePatient();
//                    System.out.println("Patient Served");
                    System.out.println("=====\n" + menu);

                } else if (option == 3) {
                    wrm.CancelAll();
//                    System.out.println("All Appointments cancelled");
                    System.out.println("=====\n" + menu);

                } else if (option == 4) {
                    wrm.CanDoctorGoHome();
                    System.out.println("=====\n" + menu);

                } else if (option == 5) {
                    System.out.println("Showing all patients, please wait...");
                    wrm.ShowAllPatient();
                    System.out.println("=====\n" + menu);

                } else if (option == 6) {
                    System.out.println("Exit");

                } else {
                    System.out.println(menu);
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between 1-6.\n" + menu);
                sc.next();
            }

        }
    }
}
