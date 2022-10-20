package O4_DataTypesAndVariables_exe;

import java.util.Scanner;

public class O6_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int letterNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < letterNum; i++) {
                    char firstChar = (char) ('a' + i);

            for (int j = 0; j < letterNum; j++) {
                    char secondChar = (char) ('a' + j);

                for (int k = 0; k < letterNum; k++) {
                    char thirdChar = (char) ('a' + k);

                    System.out.printf("%c%c%c%n",firstChar,secondChar,thirdChar);
                }
            }
        }
    }
}
