import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //I couldn't make these methods work for some reason. it would always return the last number entered.
    public static float Max(float m){
        float max = 0;
        if (max < m) {
            max = m;
        }
        return max;
    }
    public static float Min(float n){
        float min = 9999999;
        if(min > n){
            min = n;
        }
        return min;
    }
    public static void main(String[] args) {
        float total = 0;
        float average = 0;
        float max = 0;
        float min = 9999999;
        float interest = 0;
        float d = 0;
        int i = 5;


       while (i > 0)// while loop counting down from i=5
       {
           Scanner myObj = new Scanner(System.in);  // Create a Scanner object
           System.out.println("Please enter "+ i + " numbers.");
           String number = myObj.nextLine();  // Read user input
           try {
               d = Float.parseFloat(number); // convert string to float
               i--; // only decrement loop if no error thrown
               total += d;
               if(min > d){
                   min = d;
               }
               if(max < d){
                   max = d;
               }
               //max = Max(d);
               //min = Min(d);
           } catch (NumberFormatException nfe) { //catching error from user entering non number
               System.out.println("Please enter only numbers.");
           }
            average = total/5;
            interest = (float) (total * 0.20);
       }
        System.out.println("The sum of all numbers is: " + total + " .");
        System.out.println("The highest of all numbers is: " + max + " .");
        System.out.println("The lowest of all numbers is: " + min + " .");
        System.out.println("The average of all numbers is: " + average + " .");
        System.out.println("The interest is: " + interest + " .");
    }
    }
