package O4_DataTypesAndVariables_exe;

import java.util.Scanner;

public class O4_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lettersNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= lettersNum; i++) {
            char symbol = scanner.nextLine().charAt(0);
            //int valueOfSymbol = (int) symbol;
            sum += (int) symbol;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
