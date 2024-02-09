import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            double max = num1;

            if (num2 > max) {
                max = num2;
            }

            if (num3 > max) {
                max = num3;
            }

            System.out.println("The largest number is: " + max);
        }

        scanner.close();
    }
}
