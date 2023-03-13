import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inpuString = sc.nextLine();

        // extracting values
        String []stringArray = inpuString.split("#");
        
        int []array = Arrays.stream(stringArray[0].split(",")).mapToInt(Integer::parseInt).toArray();
        int index = Integer.parseInt(stringArray[1]);
        int element = Integer.parseInt(stringArray[2]);

        // printing new array
        System.out.println(Arrays.toString(InsertElementInArray.insertAtIndex(array, index, element)));
    
        // closing resource
        sc.close();
    }
}