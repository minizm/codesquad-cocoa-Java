package day1;
import java.util.Scanner;

public class quiz9498 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int score = in.nextInt();

        in.close();

        if(score >= 90) {
            System.out.print("A");
        }
        else if(score >= 80) {
            System.out.print("B");
        }
        else if(score >= 70) {
            System.out.print("C");
        }
        else if(score >= 60) {
            System.out.print("D");
        }
        else {
            System.out.print("F");
        }
    }
}