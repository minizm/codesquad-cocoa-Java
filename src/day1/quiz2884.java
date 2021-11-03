package day1;

import java.util.Scanner;

public class quiz2884 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        int early_time = 45;

        sc.close();

        if ( hour == 0 ) {
            if ( min < 45 ) {
                hour = 23;
                min = (min-early_time)+60;
                System.out.printf("%d %d",hour, min);
            }
            else {
                min = min-(early_time);
                System.out.printf("%d %d",hour, min);
            }
        }
        else
            if ( min < 45 ) {
                hour = hour-1;
                min = (min-early_time)+60;
                System.out.printf("%d %d",hour, min);
            }
            else {
                min = min-(early_time);
                System.out.printf("%d %d",hour, min);
            }
    }
}
