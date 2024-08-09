import java.util.Scanner;




/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */
public class Main {
    private String UserInput;
    private String Alice = "Alice";
    private String Bob = "Bob";

    
    public static void main(String[] args ){
        // create a new object of class Main
        Main main = new Main();
        main.compute();
        
        // call the compute() method on that new object
    }

    public void compute() {
        // Get input string of name from user
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        UserInput = newScanner.nextLine();
        // Create conditional to check name against Alice and Bob
        if (UserInput.equalsIgnoreCase(Alice)) {    
            System.out.println("you are Alice");   
        }else if(UserInput.equalsIgnoreCase(Bob)){
            System.out.println("you are Bob");
        }else{
            System.out.println("you are not Alice or Bob");
        }

        newScanner.close();
        
        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise

    }
}
