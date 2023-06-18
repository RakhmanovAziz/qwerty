package org.zadacha31;
import java.util.Scanner;

/*
Разработайте программу, которая выводит в консоль все цифры, входящие в  натуральное число n.
К примеру, если дано число 2359, то в консоль выводятся отдельно числа  2, 3, 5, 9.
 */
public class IntExecuting3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println(str.charAt(i));
            }
        }
    }
}


