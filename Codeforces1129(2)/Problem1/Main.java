import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (arr[0] != 0) {
                System.out.println(0);
                continue;
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1);
                } else {
                    map.put(arr[i], 1);
                }
            }
            int count = 0;
            for (int i = 0; i <= n; i++) {
                if (map.containsKey(i)) {
                    if (map.get(i) < k) {
                        if (count + map.get(i) < k) {
                            System.out.println(i);
                            break;
                        } else {
                            count -= (k - map.get(i));
                        }
                    } else {
                        count += map.get(i) - k;
                    }
                } else {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
