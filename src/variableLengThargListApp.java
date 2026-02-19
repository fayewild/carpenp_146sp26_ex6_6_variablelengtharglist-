import java.util.Scanner;
/**
 * Should have added this sooner:
 * Credit to GeeksForGeeks for help with code!
 * @author patrickcarpenter
 */
public class variableLengThargListApp {
    // A litte confused on what this one entails, but I'll try!
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*Init. Phase*/
        // Create ArrayList with no characters that is composed of int values
        int[] arr = getIntArray(23, 69, 45, 92, 201);
        // Create Input variable 
        int input = 0;

        int intotal;
        int total;
        /*Processing Phase*/
        while (input !=-1) {
            
            System.out.print("Input next digit (input -1 to terminate: ");
            input = sc.nextInt();
            sc.nextLine();
            arr.location= input;
            
        }
        // While (user input != -1)
            // Solicit user input
            // Set Input = user input
            // Arraylist.add(Input)
            // ++InputAmmount

        // Product method
            // For (;InputAmmount != 0;)
                // Total *= ArrayList.get(0+InputAmmount)
                // --InputAmmount
    
        /*Termination Phase*/
        // Print result
    
    } // end main
    
    public static int[] getIntArray(int... arguments){
        
        return arguments;
        
    } // end getIntArray
    
} // end class
