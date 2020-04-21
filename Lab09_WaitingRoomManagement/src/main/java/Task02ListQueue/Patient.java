package Task02ListQueue;

import Task01ArrayQueue.*;
/**
 *
 * @author DOLPHIN-PC
 */
public class Patient {

    public String name;
    public int age;
    public String blood;
    public int id;

    public Patient(String nm, int a, String bg, int i) {
        
        name = nm;
        age = a;
        blood = bg;
        id = i;
    }

    @Override
    public String toString() {
        
        return "ID:" + id + "\nName: " + name + "\nAge: " + age + "\nBlood: " + blood + "\n";
    }
}
