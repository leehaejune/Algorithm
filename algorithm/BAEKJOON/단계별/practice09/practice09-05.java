import java.util.*;

public class Main{

    public static boolean[] prime = new boolean[246913];
    // 1 ≤ n ≤ 123,456
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        get_prime();
        
        while(true) {
            int n = sc.nextInt();
            if(n == 0) break;
            
            int count = 0;
            
            for(int i = n + 1; n <= 2 * n; i++){
                if(!prime[i]) count++;
            }
            System.out.println(count);
        }
    }
    public static void get_prime() {
        prime[0] = prime[1] = true;
        // 0 과 1
        for(int i = 2; i<= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i){
                prime[j] = true;
            }
        }
    }
}


// 	런타임 에러 (ArrayIndexOutOfBounds) 해결해야함
