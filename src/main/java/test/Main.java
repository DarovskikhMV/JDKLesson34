package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Введите слово: ");
        final String str = sc.next();
        final char[] ch = str.toCharArray();
        Arrays.sort(ch);

        final char[] temp = {0};
        final int[] counter = {0};
        for (final char c : ch) {
            if (temp[0] != c) {
                temp[0] = c;
                counter[0]++;
            }
        }
        System.out.println(counter[0]);

    }
}
