package problemSet4;

// Title: PS04_02
// Author: Angelina Lu
// Period: 5a
// Date: 10/7/24

import java.util.Scanner;

public class PS04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c (separated by spaces): ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = (Math.pow(b, 2)) - 4 * a * c;

        double quadraticAdd = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        double quadraticSub = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);

        if (discriminant > 0) {
            System.out.print("The equation has two roots: " + quadraticAdd + ", " + quadraticSub);
        }
        else if (discriminant == 0) {
            System.out.print("The equation has one root: " + quadraticSub);
        }
        else {
            System.out.println("The equation has no real roots.");
        }
    }
}
