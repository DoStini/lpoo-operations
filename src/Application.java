import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = 0;

        if(operation.equals("sum")) {
            result = a + b;
        } else if (operation.equals("mul")) {
            result = a*b;
        }

        System.out.printf("Result: %d", result);
    }
}