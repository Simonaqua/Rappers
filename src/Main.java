import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long K = input.nextLong();
        long J = input.nextLong();

        long min = Math.min(K,J);
        long max = Math.max(K,J);

        if (min == 0 || max == 0 || min + max < 3)
            System.out.println(0);
        else if (min == 1 || max == 1)
            System.out.println(1);
        else if (max / min >= 2) {
            System.out.println(min);
        }
        else {
            System.out.println((int)Math.floor((min+max)/3));
        }
    }
}