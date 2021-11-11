import java.util.*;

public class Main{

    public static boolean prime[];  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        prime = new boolean[N + 1]; // 배열 생성
        get_prime();
        
        int sum =0;
        int min = Integer.MAX_VALUE;
        
        for(int i=M; i<=N; i++){
            if(prime[i] == false){
                sum += i;
                if(min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }
        if(sum == 0){
            System.out.println(-1); // 소수 없을때 출력
        }
        else{
            System.out.println(sum); // sum 출력
            System.out.println(min); // min 출력
        }
    }
    
    // 에라토스테네스 체 알고리즘 사용
    // 시간복잡도가 O(N㏒(㏒N)) 이라 매우 좋은 성능을 갖는다
    public static void get_prime(){
        prime[0] = true;
        prime[1] = true;
        
        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
    }
}
