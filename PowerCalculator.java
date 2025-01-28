import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for the base
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();
        
        // Input  for the exponent
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        
        // Calculating the power value using Math.pow()
        double result = Math.pow(base, exponent);
        
        System.out.println("The " + base + " raised to the power of " + exponent + "is" +result); 
        
        scanner.close();
    }
}