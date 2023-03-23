import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float firstNumberKuresb = scanner.nextFloat();
        System.out.print("Enter the second number: ");
        float secondNumberKuresb = scanner.nextFloat();
        float sum = firstNumberKuresb + secondNumberKuresb;
        float difference = firstNumberKuresb - secondNumberKuresb;
        float product = firstNumberKuresb * secondNumberKuresb;
        float quotient = firstNumberKuresb / secondNumberKuresb;
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);
        System.out.printf("Quotient: %.2f\n", quotient);
        scanner.close();
    }
}
