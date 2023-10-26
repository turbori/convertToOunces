public class Weight {
   private double pounds;

   public void setPounds(double inputPounds) {
      pounds = inputPounds;
   }
   
   public double getPounds() {
      return pounds;
   }

   /* Your code goes here */
   public double convertToOunces() {
	   
	   double ounces = pounds * 16;
	   return ounces;
	   
   }
   
   
   public void printInOunces() {
      System.out.printf("%.1f ounces\n", convertToOunces());
   }
}