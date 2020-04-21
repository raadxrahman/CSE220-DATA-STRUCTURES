package Assignment03;

public class AssLinkedTest {

    public static void main(String[] args) {
        int x = (1069 % 4) + (69 % 6);
        int y = (1069 % 5) + (69 % 9);
        Object A = (x + 1) + "Raad" + (y + 10),
                B = (x + 2) + "Raad" + (y + 20),
                C = (x + 3) + "Raad" + (y + 30),
                D = (x + 4) + "Raad" + (y + 40),
                E = (x + 5) + "Raad" + (y + 50),
                F = (x + 6) + "Raad" + (y + 60);
        Object[] a1 = {A, B, C, D, E, F};
        System.out.println("PrintList-");
        LinkedList h1 = new LinkedList(a1);
        h1.printList();
        System.out.println("CountNode-");
        System.out.println(h1.countNode());
        System.out.println("Get-");
        Object val = h1.get(69%5);
        System.out.println(val);
        System.out.println("Set-");
        System.out.println(h1.set((69 % 4), "SET"));
        h1.printList();
        System.out.println("Search-");
        System.out.println(69%4);
        System.out.println("Insert-");
        h1.insert("FirstInsert", 0);
        h1.printList(); 
        h1.insert("LastInsert",h1.countNode());
        h1.printList();
        h1.insert("Random", 69%5);
        h1.printList();
        System.out.println("Remove-");
        h1.remove(0); //first
        h1.printList();
        h1.remove(69%5); //random
        h1.printList();
        h1.remove(h1.countNode()-1);  //last
        h1.printList();
        System.out.println("Reverse-");
        Node rev = h1.reverseList(); 
        LinkedList h2 = new LinkedList(rev); 
        h2.printList(); 
        System.out.println("Rotate-");
        h2.rotateLeft();
        h2.printList(); 
        h2.rotateLeft();
        h2.printList(); 

    }

}
