package armstrong;
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int upp=sc.nextInt();
        int low=sc.nextInt();
        int a;

        for (int i = upp; i <= low; i++) {
            int w=i;
            double b=0;
            int length = String.valueOf(w).length();
            while (w > 0) {
                a = w % 10;
                b = b + Math.pow(a, length);
                w = w / 10;
            }
            if(b==i) {
                System.out.println(b);
            }

        }
        }
}
