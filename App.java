import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        run();
    }
    private static String getString(String prompt) {
        System.out.println(prompt);
        final Scanner inputScanner = new Scanner(System.in);
        String x = inputScanner.nextLine();
        return x;
    }   

    private static double getDouble(String prompt) {
        
        System.out.println(prompt);
        final Scanner inputScanner = new Scanner(System.in);
        double x = inputScanner.nextDouble();
        return x;
    }  
     
        private static void run() {
        
        double num1,num2;
        boolean check = true;
        String str;
        
        while(check == true) {
            try {
        num1 = getDouble("Enter a number");
        num2=  getDouble("Enter another number");
        Calculator calculator = new Calculator();
        System.out.println("Added >");
        System.out.println(calculator.add(num1,num2));
        System.out.println("Subtracted >");
        System.out.println(calculator.subtract(num1,num2));
        System.out.println("Multiplied >");
        System.out.println(calculator.multiply(num1,num2));
        System.out.println("Divided >");
        System.out.println(calculator.divide(num1,num2));

        str = getString("Would you like to continue? (Y/N)");
        
        if (str.equals("n")) {
            System.out.println("Goodbye");
            break;
        }
        else if(str.equals("N")) {
            System.out.println("Goodbye");
            break;
        }
            }
            catch (Exception e) {
                System.out.println("Try again.");
            }
          }
        } 
    }
