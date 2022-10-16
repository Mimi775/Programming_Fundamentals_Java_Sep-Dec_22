package O3_DataTypesAndVariables_lab;

import java.util.Scanner;

public class O11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
         double height = Double.parseDouble(scanner.nextLine());

        double V = (length * width * height) / 3;

        System.out.printf("Pyramid Volume: %.2f", V);

    }
}
