package org.zadacha31;

/*
Напишите программу, в которой из строки  отбираются  цифры. Из этих цифр формируется массив.
 */
public class DigitExecuting2 {
    public static void main(String[] args) {
        String s1 = "I have 3 cats, 4 dogs, and 1 turtle";
        String[] s2_array = s1.split("\\D+");
        for (int i = 1; i < s2_array.length; i++) {
            System.out.println(s2_array[i]);
        }

    }
}

