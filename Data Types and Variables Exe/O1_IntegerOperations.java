package O4_DataTypesAndVariables_exe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class O1_IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());

        int calc = (firstNum + secondNum) / thirdNum * fourthNum;

        System.out.println(calc);
    }
}
