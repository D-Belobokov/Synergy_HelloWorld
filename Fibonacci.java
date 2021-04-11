
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        System.out.println("введите номер члена ряда фибоначчи");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        int[] f=new int[n+1];
        f[0]=0;
        f[1]=1;
        for( i=2;i<=n;++i){
            f[i]=f[i-1]+f[i-2];

        }
        System.out.println( f[n]);
    }
}
