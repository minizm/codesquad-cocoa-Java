package day1;

import java.util.Scanner;

public class quiz1468 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.close();

        if ( x>0 ) {
            if ( y>0 ) {
                System.out.print(1);
            }
            else {
                System.out.print(4);
            }
        }
        else {
            if (y >0 ) {
                System.out.print(2);
            }
            else {
                System.out.print(3);
            }
        }
    }
}