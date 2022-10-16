package O1_ProgrammingBasicsEx_lab;

import java.util.Scanner;

public class O12_EvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean isEven = false;

        while (!isEven) {

            if (num % 2 == 0) {

                int absoluteValue = Math.abs(num);
                System.out.printf("The number is: %d", absoluteValue);
                isEven = true;

            } else {
                System.out.println("Please write an even number.");
                num = Integer.parseInt(scanner.nextLine());
            }


        }

    }
}
