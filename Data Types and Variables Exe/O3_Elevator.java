package O4_DataTypesAndVariables_exe;

import java.util.Scanner;

public class O3_Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleNum = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int  courses = peopleNum / capacity;

        if (!(peopleNum % capacity == 0)){

            courses += 1;
        }
        System.out.println(courses);
    }
}
