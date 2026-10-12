import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int z=0;z<t;z++){
		    int n = sc.nextInt();
		    sc.nextLine();
		    String str = sc.nextLine();
		    Stack<Integer> st = new Stack<>();
		    int arr[] = new int[n];
		    int count = n;
		    for(int i=0;i<n;i++){
		        if(str.charAt(i)=='1'){
		            st.push(i);
		        }else if(str.charAt(i)=='2'){
		            if(st.empty()){
		                arr[i] = -1;
		                count-=1;
		            }else{
		                arr[st.pop()] = -1;
		                count-=1;
		            }
		        }else{
		            arr[i] = -1;
		            count-=1;
		        }
		    }
		    System.out.println(count);
		    for(int i=0;i<n;i++){
		        if(arr[i]!=-1){
		            System.out.print((i+1)+" ");
		        }
		    }
		    System.out.println();
		}
	}
}
