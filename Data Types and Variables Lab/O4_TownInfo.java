package O3_DataTypesAndVariables_lab;

import java.util.Scanner;

public class O4_TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfTown = scanner.nextLine();
        int population =  Integer.parseInt(scanner.nextLine());
        short area = Short.parseShort(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", nameOfTown, population, area);
    }
}
