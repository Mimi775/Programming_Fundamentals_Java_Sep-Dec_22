package O4_DataTypesAndVariables_exe;

import java.util.Scanner;

public class O10_PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingPower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustion = Integer.parseInt(scanner.nextLine());

        int targetsCount = 0;
        int power = startingPower;

        while (power >= distance) {
            power -= distance;
            targetsCount++;

            if (power == startingPower /2) {
                power = power /exhaustion;
            }
        }
        System.out.println(power);
        System.out.println(targetsCount);
    }
}
