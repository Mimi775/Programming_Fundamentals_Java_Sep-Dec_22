package O4_DataTypesAndVariables_exe;

import java.util.Scanner;

public class O11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballsNum = Integer.parseInt(scanner.nextLine());
        int snow = 0;
        int maxSnow = Integer.MIN_VALUE;
        int time = 0;
        int maxTime = Integer.MIN_VALUE;
        int quality = 0;
        int maxQuality = Integer.MIN_VALUE;
        double maxValue = Double.MIN_VALUE;

        for (int i = 1; i <= snowballsNum; i++) {
            snow = Integer.parseInt(scanner.nextLine());
            time = Integer.parseInt(scanner.nextLine());
            quality = Integer.parseInt(scanner.nextLine());

            double value = Math.pow(snow * 1.00 / time, quality);

            if (value>maxValue){
                maxValue = value;
                maxSnow = snow;
                maxTime = time;
                maxQuality = quality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnow, maxTime, maxValue, maxQuality);
    }
}
