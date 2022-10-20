package O4_DataTypesAndVariables_exe;

import java.util.Scanner;

public class O9_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int totalYield = 0;
        int leftoversOfSpices = 0;
        int dayCount = 0;

        while (startingYield > 99) {

            dayCount++;
            leftoversOfSpices = startingYield - 26;
            totalYield += leftoversOfSpices;
            startingYield -= 10;

        }

        if (totalYield >= 26) {
            totalYield -= 26;
        } else {
            totalYield = 0;
        }

        System.out.println(dayCount);
        System.out.println(totalYield);

    }
}
