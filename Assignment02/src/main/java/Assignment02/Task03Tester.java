package Assignment02;
public class Task03Tester {
    public static void main(String[] args) {
        int x = (1069%34 + 1069%33) ;
        Object [] a  = {x+50 , x+4 , null , null , x , x+10 , x-10 , x-18} ;
        
        System.out.println("PrintArray");
        Task03 c = new Task03(a, 4,8);
        c.printArray();
        
        System.out.println("PrintForward");
        c.printForward();
        
        System.out.println("PrintBackward");
        c.printBackward();
        
        System.out.println("Linearize");
        c.linearize();
        c.printArray();
        
        System.out.println("Resize");
        c.resize((1069%5)+(69%3)+8);
        c.printArray();
        
        System.out.println("InsertElement01");
        c.insert(99, 69%6); 
        c.printArray();
        
        System.out.println("InsertElement02");
        c.insert(98, 69%5); 
        c.printArray();
        
        System.out.println("RemoveElement01");
        c.remove(69%6);
        c.printArray();
        
        System.out.println("RemoveElement02");
        c.remove(69%5);
        c.printArray();
        
        
       
    }
}
