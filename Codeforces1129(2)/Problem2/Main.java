import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            boolean check = false;
            int min = 1000000000;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) check = true;
                if (min > arr[i]) min = arr[i];
            }
            if (check) {
                System.out.println(n);
                continue;
            }
            if (n < min + 1) {
                System.out.println(0);
            } else {
                System.out.println(n);
            }
        }
    }
}
