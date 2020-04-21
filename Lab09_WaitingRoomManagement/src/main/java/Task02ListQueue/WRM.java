package Task02ListQueue;
/**
 *
 * @author DOLPHIN-PC
 */
import Task01ArrayQueue.*;
import java.util.Scanner;

public class WRM {

    Scanner sc = new Scanner(System.in);
    Queue q;
    public static int id = 0;

    public WRM() {
        
        q = new ListQueue();
        
    }

    public void RegisterPatient() {
        
        System.out.println("Please enter your Name");
        String nm = sc.next();
        System.out.println("Please enter your Age(Must be numbers)");
        int a = sc.nextInt();
        System.out.println("Please enter your Blood Group");
        String bg = sc.next();
        id++;
        
        Patient p = new Patient(nm, a, bg, id);
        try {
            q.enqueue(p);
            System.out.println("Congratulations! " +p.name + " , your appointment is confirmed! Your id is [ " + id + " ] please wait for your call!");
        } catch (QueueOverflowException e) {
            System.out.println("Appointment full for today, try tomorrow\n" + e);
        }

    }

    public void ServePatient() {
        
        try {
            Patient x = (Patient) q.dequeue();
            System.out.println(x.name + " served");
        } catch (QueueUnderflowException e) {
            System.out.println("No remaining patients");
        }
    }

    public void CancelAll() {
        if (q.size() > 0) {
            System.out.println("All Appointments canceled");
        }
        for (int i = 0; i <= q.size(); i++) {
            try {
                q.dequeue();
            } catch (QueueUnderflowException e) {
                System.out.println("No Appointment left to cancel");
            }

        }
    }

    public void CanDoctorGoHome() {
        if (q.isEmpty()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void ShowAllPatient() {
        Object[] temp = q.toArray();

        for (int i = 0; i < q.size(); i++) {
            for (int j = i + 1; j < q.size(); j++) {
                Patient a = (Patient) temp[i];
                Patient b = (Patient) temp[j];
                if (a.name.compareTo(b.name) > 0) {
                    Object x = temp[i];
                    temp[i] = temp[j];
                    temp[j] = x;
                }
            }
        }
        
        if (q.size() == 0) {
            System.out.println("No Appointment");
        } else {
            for (int i = 0; i < temp.length; i++) {
                System.out.println(temp[i]);
            }
        }

    }
}
