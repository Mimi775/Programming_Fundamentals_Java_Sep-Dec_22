package O4_DataTypesAndVariables_exe;

import java.util.Scanner;

public class O7_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timesPouring = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int sum = 0;

        for (int i = 1; i <= timesPouring; i++) {

            int newLitters = Integer.parseInt(scanner.nextLine());

            if (sum + newLitters > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                sum += newLitters;
            }
        }
        System.out.println(sum);
    }
}
