package pattern2;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rev, flag,c=0;

        for (int i = a; i <= b; i++) {
            int d = a;
            rev = 0;
            while (a > 0) {
                flag = a % 10;
                rev = rev * 10 + flag;
                a  = a / 10;
            }
            a=i+1;
            if(rev==d) {
                System.out.println(rev);
            }
        }
    }
    }
