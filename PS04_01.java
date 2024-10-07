package problemSet4;

// Title: PS04_01
// Author: Angelina Lu
// Period: 5a
// Date: 10/4/24

import java.util.Scanner;
import java.util.Random;

public class PS04_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;

        System.out.println("What is " + num1 + " + " + num2 + "?: ");
        int answer = scanner.nextInt();

        int actualAnswer = num1 + num2;

        if (answer == actualAnswer) {
            System.out.println("Correct! " + num1 + " + " + num2 + " is equal to " + actualAnswer + "!");
            System.out.println("Good job!");
        }
        else {
            System.out.println("Oh No! " + num1 " + " + num2 + " is not equal to " + actualAnswer + "!");
            System.out.println("Keep Practicing!");
        }

    }
}
