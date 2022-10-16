package O3_DataTypesAndVariables_lab;

import java.util.Scanner;

public class O1_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double km = meters / 1000.00;

        System.out.printf("%.2f", km);
    }
}
