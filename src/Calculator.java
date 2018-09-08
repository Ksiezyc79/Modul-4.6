
public class Calculator {

   public double add(double a, double b) {
       return a + b;
   }

   public double subtraction(double a, double b) {
       return a - b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(8,4.2));
        System.out.println(calculator.subtraction(16, 4));
   }
}
