import java.io.*;
//add up all the intefers that the user enters.
//After the last integer to be added, the user will enter a 0.

public class addUpNumbers {
    public static void main (String[] args) throws IOException {
        BufferedReader userin = new BufferedReader (new InputStreamReader(System.in));
        String inputData;
        String suffix;
        int value;  //data entered by the user 
        int count = 0;  //how many integers have gone into sum so far
        int sum = 0;    //intialize the sum

        //get the first value
        System.out.println("Enter first integer (enter 0 to quit):");
        inputData = userin.readLine();
        value = Integer.parseInt(inputData);

        while(value != 0){
            //add value to sum
            sum = sum + value;  //add current value to sum
            count = count +1;   //one more integer has gone into the sum

            //prompt for the next value
            if(count + 1 ==2) suffix = "nd";
            else if (count + 1 == 3) suffix = "rd";
            else suffix = "th";

            System.out.println("Enter the " + (count+1) + suffix + " integer (enter 0 to quit): ");

            //get the next value from the user 
            inputData = userin.readLine();
            value = Integer.parseInt(inputData);
        }
        System.out.println("Sum of the integers: " + sum);
    }  
}
