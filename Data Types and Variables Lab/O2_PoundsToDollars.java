package O3_DataTypesAndVariables_lab;

import java.util.Scanner;

public class O2_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pounds  = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * 1.36;

        System.out.printf("%.3f", dollars);
    }
}
