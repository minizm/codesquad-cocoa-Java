package day1;

import java.util.Scanner;

public class quiz2440 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sc.close();

        for (int i=0; i<num; i++){
            for (int j=num; j>i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}