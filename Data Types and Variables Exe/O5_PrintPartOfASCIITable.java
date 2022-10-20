package O4_DataTypesAndVariables_exe;

import java.util.Scanner;

public class O5_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingIndex = Integer.parseInt(scanner.nextLine());
        int endingIndex = Integer.parseInt(scanner.nextLine());

        for (int i = startingIndex; i <= endingIndex; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " ");
        }
    }
}
