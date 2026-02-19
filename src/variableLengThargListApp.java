/**
 * Should have added this sooner:
 * Credit to GeeksForGeeks for help with code!
 * https://www.geeksforgeeks.org/java/arrays-in-java/
 * @author patrickcarpenter
 */
public class variableLengThargListApp {
    // A litte confused on what this one entails, but I'll try!
    public static void main(String[] args){
        /*Init. Phase*/
        // Create ArrayList with no characters that is composed of int values
        
        int[] arr = getIntArray(23, 69, 45, 92, 201); 
        
        int result1= product(arr[0], arr[1]);
        int result2 = product(arr[2], arr[3]);
        int result3 = product(result2, arr[4]);
        int result4 = product(arr[0], arr[4]);
        int result5 = result1 * arr[2] * arr[3] * arr[4];

        // Product method usage
        
    
        /*Termination Phase*/
        System.out.println("The product of the Array value 0 and 1 is " + result1);
        System.out.println("The product of the Array value 2 and 3 is " + result2);
        System.out.println("The product of the Array value 2, 3, and 4 is " + result3);
        System.out.println("The product of the Array value 0 and 4 is " + result4);
        System.out.println("The product of all Array values is " + result5);
        
        
    
    } // end main
    
    public static int product(int a, int b){
        
        int c = a*b;
        return c;
        
    }
    
    public static int[] getIntArray(int... arguments){
        
        return arguments;
        
    } // end getIntArray
    
} // end class

// I honestly don't know what happened but my brain decided to forget how to include
// variables in System.out commands.
// I'm kinda just glad I got this one done. I struggled big-time with this.