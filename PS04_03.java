// Title: PS04_03
// Author: Angelina Lu
// Period: 5a
// Date: 10/8/24

import java.util.Scanner;
import java.util.Random;

public class PS04_03 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
 
        int num = random.nextInt(99);

        System.out.print("Enter your lottery pick (two digits): ");
        int answer = input.nextInt();

        System.out.println("The lottery number is " + num);

        if (num == answer) {
            System.out.println("Exact match: you win $10,000");
        }
        else if (digits(answer, num)) {
            System.out.println("Match all digits: you win $3,000");
        }
        else if (digit1(answer, num)) {
            System.out.println("Match one digit: you win $1,000");
        }
        else {
            System.out.println("Sorry: no match");
        }
    }
    // Checks if it matches all digits
    static boolean digits(int answer, int num) {
        int user1 = answer / 10;
        int user2 = answer % 10;
        int lotNum1 = num / 10;
        int lotNum2 = num % 10;

        return(user1 == lotNum1 && user2 == lotNum2) || (user1 == lotNum2 && user2 == lotNum1);
    }
    // Checks if it matches one digit
    static boolean digit1(int answer, int num) {
        int user1 = answer / 10;
        int user2 = answer % 10;
        int lotNum1 = num / 10;
        int lotNum2 = num % 10;

        return(user1 == lotNum1 || user1 == lotNum2 || user2 == lotNum1 || user2 == lotNum2);
    }
}
