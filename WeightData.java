import java.util.Scanner;

public class WeightData {
      public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Weight weight1 = new Weight();
      double inputPounds;
   
      inputPounds = scnr.nextDouble();
      weight1.setPounds(inputPounds);
   
      weight1.printInOunces();
   }
}