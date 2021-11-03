package day1;

import java.util.Scanner;


public class quiz11720 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num_count = sc.nextInt();
        String num = sc.next();
        int sum = 0;

        sc.close();

        for ( int i=0; i<num_count; i++) {
            sum += num.charAt(i)-48;
        }
        System.out.println(sum);
    }
}