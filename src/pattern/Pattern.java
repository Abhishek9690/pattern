package pattern;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int c=1;
            for (int i1 = 1; i1 <= a; i1++) {
                if(i<=i1) {
                    System.out.print(c+" ");
                    c=c+1;
                }
                 else{
                    System.out.print("");
                    }
                }
            System.out.println("");
        }
    }



}
