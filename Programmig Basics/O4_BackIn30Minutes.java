package O1_ProgrammingBasicsEx_lab;

import java.util.Scanner;

public class O4_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int givenHour = Integer.parseInt(scanner.nextLine());
        int givenMin = Integer.parseInt(scanner.nextLine());

        int allMin = givenHour * 60 + givenMin + 30;

        int newHour = allMin / 60;
        int newMin = allMin % 60;

        if (newHour == 24) {
            newHour = 0;
        }

        System.out.printf("%d:%02d", newHour, newMin);
    }
}
