import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int z=0;z<t;z++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();
            if(x+r>10){
                x = x-r;
            }else{
                x = x+r;
            }
            System.out.println(x+" "+y);
        }
    }
}
