import java.util.*;

public class Main {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = search(arr, n, m);
        System.out.println(result);
    }
    
    public static int search(int[] arr, int n, int m){
        int result = 0;
        //3개 카드 픽,1번째 n-2
        for(int i=0; i<n-2; i++) {
            //2번째 n-1
            for(int j=i+1; j<n-1; j++){
                //3번째 n
                for(int k=j+1; k<n; k++){
                    int temp = arr[i] + arr[j] + arr[k];
                    
                    if(m == temp) {
                        return temp;
                    }
                    if(result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
    
}