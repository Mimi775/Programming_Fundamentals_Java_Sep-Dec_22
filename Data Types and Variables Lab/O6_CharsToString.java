package O3_DataTypesAndVariables_lab;

import java.util.Scanner;

public class O6_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstCharacter = scanner.nextLine().charAt(0);
        char secondCharacter = scanner.nextLine().charAt(0);
        char thirdCharacter = scanner.nextLine().charAt(0);

        String format = String.format("%s%s%s",firstCharacter,secondCharacter,thirdCharacter);

        System.out.println(format);
    }
}
