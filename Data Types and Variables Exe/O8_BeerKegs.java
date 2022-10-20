package O4_DataTypesAndVariables_exe;

import java.util.Scanner;

public class O8_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numKeg = Integer.parseInt(scanner.nextLine());
        double volume = 0;
        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = "";

        for (int i = 1; i <= numKeg; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            volume = Math.PI * Math.pow(radius,2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                maxModelKeg = model;
            }
        }
        System.out.println(maxModelKeg);
    }
}
