package O1_ProgrammingBasicsEx_lab;

import java.util.Scanner;

public class O10_MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int product = 1;

        for (int i = 1; i <= 10; i++) {
            product = num * i;
            System.out.printf("%d X %d = %d%n", num, i, product);
        }
    }
}
