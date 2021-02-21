import java.util.List;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Calculator calculator = new Calculator();


      while(true) {
         System.out.println("Enter a command: ");
         Scanner scanner = new Scanner(System.in);
         String command = scanner.nextLine();
         String[] commands = command.split(" ");
         String command1;
         int num1 = 0;
         int num2 = 0;
         if (commands.length == 3) {
            command1 = commands[0];
            num1 = Integer.parseInt(commands[1]);
            num2 = Integer.parseInt(commands[2]);
         } else {
            command1 = commands[0];
            num1 = Integer.parseInt(commands[1]);
         }

         int ans =0;

         switch (command1) {
            case "add":
               ans = calculator.add(num1, num2);
               break;
            case "subtract":
               ans = calculator.subtract(num1, num2);
               break;
            case "multi":
               ans = calculator.multiply(num1, num2);
               break;
            case "divide":
               ans = calculator.divide(num1, num2);
               break;
            case "fib":
               ans = calculator.fibonacciNumberFinder(num1);
               break;
            case "bin":
               ans = calculator.fibonacciNumberFinder(num1);
               break;
         }

         System.out.println(ans);
      }

   }

}
